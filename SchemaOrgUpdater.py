#!/usr/bin/env python3
"""
Schema.org Java Code Generator and Updater
Updates the Java client library to match the latest Schema.org specification.
"""

import json
import re
import os
import sys
from collections import defaultdict, OrderedDict
from typing import Dict, List, Set, Optional, Any

class SchemaOrgUpdater:
    def __init__(self, jsonld_file: str = "schemaorg-current-https.jsonld"):
        self.jsonld_file = jsonld_file
        self.namespace = "https://schema.org/"
        self.java_core_package = "com.google.schemaorg.core"
        self.java_impl_package = "com.google.schemaorg.core.impl"
        self.core_constants_class = "CoreConstants"
        self.core_factory_class = "CoreFactory"
        
        # Schema.org data structures
        self.types: Dict[str, Dict] = {}
        self.properties: Dict[str, Dict] = {}
        self.enumerations: Dict[str, Dict] = {}
        self.enum_values: Dict[str, List[str]] = defaultdict(list)
        
        # Track existing files to avoid overwriting
        self.existing_types: Set[str] = set()
        self.existing_enums: Set[str] = set()
        
    def load_schema_data(self):
        """Load and parse the Schema.org JSON-LD file."""
        print(f"Loading Schema.org data from {self.jsonld_file}...")
        
        try:
            with open(self.jsonld_file, 'r', encoding='utf-8') as f:
                data = json.load(f)
        except Exception as e:
            print(f"Error loading JSON-LD file: {e}")
            return False
            
        # Parse the JSON-LD graph
        graph = data.get("@graph", [])
        
        for item in graph:
            item_id = item.get("@id", "")
            item_type = item.get("@type", "")
            
            # Skip non-schema.org items
            if not item_id.startswith("schema:"):
                continue
                
            name = item_id.replace("schema:", "")
            
            if item_type == "rdfs:Class":
                self.types[name] = {
                    "id": item_id,
                    "label": item.get("rdfs:label", name),
                    "comment": item.get("rdfs:comment", ""),
                    "subClassOf": self._extract_references(item.get("rdfs:subClassOf", [])),
                    "isPartOf": self._extract_single_reference(item.get("schema:isPartOf", {})),
                    "supersededBy": self._extract_references(item.get("schema:supersededBy", [])),
                    "source": self._extract_single_reference(item.get("schema:source", {}))
                }
                
                # Check if this is an enumeration
                if self._is_enumeration(name, item):
                    self.enumerations[name] = self.types[name]
                    
            elif item_type == "rdf:Property":
                self.properties[name] = {
                    "id": item_id,
                    "label": item.get("rdfs:label", name),
                    "comment": item.get("rdfs:comment", ""),
                    "domainIncludes": self._extract_references(item.get("schema:domainIncludes", [])),
                    "rangeIncludes": self._extract_references(item.get("schema:rangeIncludes", [])),
                    "isPartOf": self._extract_single_reference(item.get("schema:isPartOf", {})),
                    "supersededBy": self._extract_references(item.get("schema:supersededBy", [])),
                    "source": self._extract_single_reference(item.get("schema:source", {}))
                }
                
            elif item_type in ["schema:Enumeration", "rdfs:Class"] and self._is_enum_value(name, item):
                # This is an enumeration value
                enum_type = self._get_enum_type_for_value(name, item)
                if enum_type:
                    self.enum_values[enum_type].append(name)
                    
        print(f"Loaded {len(self.types)} types, {len(self.properties)} properties, {len(self.enumerations)} enumerations")
        return True
        
    def _extract_references(self, refs) -> List[str]:
        """Extract references from JSON-LD format."""
        if not refs:
            return []
        if isinstance(refs, dict):
            refs = [refs]
        return [ref.get("@id", "").replace("schema:", "") for ref in refs if ref.get("@id", "").startswith("schema:")]
        
    def _extract_single_reference(self, ref) -> str:
        """Extract a single reference from JSON-LD format."""
        if not ref:
            return ""
        if isinstance(ref, list):
            ref = ref[0] if ref else {}
        return ref.get("@id", "").replace("schema:", "") if ref.get("@id", "").startswith("schema:") else ""
        
    def _is_enumeration(self, name: str, item: Dict) -> bool:
        """Check if a type is an enumeration."""
        sub_classes = self._extract_references(item.get("rdfs:subClassOf", []))
        return "Enumeration" in sub_classes or any("Enumeration" in sc for sc in sub_classes)
        
    def _is_enum_value(self, name: str, item: Dict) -> bool:
        """Check if this is an enumeration value."""
        # Enumeration values are typically instances of enumeration types
        item_type = item.get("@type", "")
        return item_type == "rdfs:Class" and any(
            ref.endswith("Enumeration") for ref in self._extract_references(item.get("rdfs:subClassOf", []))
        )
        
    def _get_enum_type_for_value(self, value_name: str, item: Dict) -> Optional[str]:
        """Get the enumeration type for a given value."""
        # Try to infer from subClassOf
        sub_classes = self._extract_references(item.get("rdfs:subClassOf", []))
        for sc in sub_classes:
            if sc in self.enumerations:
                return sc
        return None
        
    def scan_existing_files(self):
        """Scan existing Java files to determine what's already implemented."""
        core_dir = "src/main/java/com/google/schemaorg/core"
        if os.path.exists(core_dir):
            for filename in os.listdir(core_dir):
                if filename.endswith('.java') and not filename.startswith('impl'):
                    type_name = filename[:-5]  # Remove .java extension
                    self.existing_types.add(type_name)
                    if filename.endswith('Enum.java'):
                        self.existing_enums.add(type_name[:-4])  # Remove 'Enum' suffix
                        
    def generate_java_interface(self, type_name: str, type_info: Dict) -> str:
        """Generate a Java interface for a Schema.org type."""
        if type_name in self.enumerations:
            return self.generate_enum_interface(type_name, type_info)
            
        # Find parent types
        parents = type_info.get("subClassOf", [])
        if not parents:
            parents = ["Thing"]
            
        # Generate the interface
        interface_content = f'''/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package {self.java_core_package};

import com.google.common.collect.ImmutableList;
import com.google.schemaorg.JsonLdContext;
import com.google.schemaorg.SchemaOrgType;
import com.google.schemaorg.core.datatype.Text;
import com.google.schemaorg.core.datatype.URL;
import com.google.schemaorg.goog.PopularityScoreSpecification;
import javax.annotation.Nullable;

/** Interface of <a href="http://schema.org/{type_name}">http://schema.org/{type_name}</a>. */
public interface {type_name} extends {", ".join(parents)} {{

  /** Builder interface of <a href="http://schema.org/{type_name}">http://schema.org/{type_name}</a>. */
  public interface Builder extends {".Builder, ".join(parents)}.Builder {{

    @Override
    Builder addJsonLdContext(@Nullable JsonLdContext context);

    @Override
    Builder addJsonLdContext(@Nullable JsonLdContext.Builder context);

    @Override
    Builder setJsonLdId(@Nullable String value);

    @Override
    Builder setJsonLdReverse(String property, Thing obj);

    @Override
    Builder setJsonLdReverse(String property, Thing.Builder builder);

{self.generate_builder_methods(type_name)}

    /**
     * Add a value to property.
     *
     * @param name The property name.
     * @param value The value of the property.
     */
    Builder addProperty(String name, SchemaOrgType value);

    /**
     * Add a value to property.
     *
     * @param name The property name.
     * @param builder The schema.org object builder for the property value.
     */
    Builder addProperty(String name, Thing.Builder builder);

    /**
     * Add a value to property.
     *
     * @param name The property name.
     * @param value The string value of the property.
     */
    Builder addProperty(String name, String value);

         /** Build a {{type_name}} object. */
     {{type_name}} build();
  }}

{self.generate_getter_methods(type_name)}
}}
'''
        return interface_content
        
    def generate_enum_interface(self, enum_name: str, enum_info: Dict) -> str:
        """Generate a Java interface for an enumeration type."""
        parents = enum_info.get("subClassOf", ["Enumeration"])
        
        interface_content = f'''/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package {self.java_core_package};

/**
 * Interface of <a
 * href="http://schema.org/{enum_name}">http://schema.org/{enum_name}</a>.
 */
public interface {enum_name} extends {", ".join(parents)} {{}}
'''
        return interface_content
        
    def generate_enum_class(self, enum_name: str, enum_values: List[str]) -> str:
        """Generate a Java enum class for an enumeration type."""
                 # Convert enum values to Java constant names
         java_values = []
         for value in enum_values:
             java_name = self.to_java_constant(value)
             java_values.append(f'  {java_name}(CoreConstants.NAMESPACE + "{value}")')
             
         values_str = ",\n\n".join(java_values)
         methods_str = self.generate_enum_getter_methods(enum_name)
         constant_name = self.to_java_constant(enum_name)
         
         enum_content = f'''/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package {self.java_core_package};

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMultimap;
import com.google.schemaorg.SchemaOrgException;
import com.google.schemaorg.SchemaOrgType;
import com.google.schemaorg.ValueType;
import javax.annotation.Nullable;

/*
 * Enum values of <a href="http://schema.org/{enum_name}">http://schema.org/{enum_name}</a>.
 */
public enum {enum_name}Enum implements {enum_name} {{
{values_str};

  private final String enumValue;

  {enum_name}Enum(String enumValue) {{
    this.enumValue = enumValue;
  }}

  @Override
  public String getFullEnumValue() {{
    return enumValue;
  }}

  @Override
  public boolean containsJsonLdId() {{
    return false;
  }}

  @Override
  public ImmutableList<ValueType> getJsonLdContextList() {{
    return ImmutableList.of();
  }}

  @Override
  @Nullable
  public String getJsonLdId() throws SchemaOrgException {{
    return null;
  }}

  @Override
  public ImmutableMultimap<String, Thing> getJsonLdReverseMap() {{
    return ImmutableMultimap.of();
  }}

  @Override
  public String getFullTypeName() {{
    return CoreConstants.TYPE_{constant_name};
  }}

  @Override
  public boolean includesProperty(String property) {{
    return false;
  }}

  @Override
  public boolean contentEquals(ValueType o) {{
    return (o == this);
  }}

{methods_str}
}}
'''
         return enum_content
        
    def generate_builder_methods(self, type_name: str) -> str:
        """Generate builder methods for properties relevant to this type."""
        methods = []
        
        # Find properties that can be used with this type
        for prop_name, prop_info in self.properties.items():
            domain_includes = prop_info.get("domainIncludes", [])
            if type_name in domain_includes or not domain_includes:
                range_includes = prop_info.get("rangeIncludes", [])
                
                # Generate methods for each range type
                for range_type in range_includes:
                    if range_type in ["Text", "URL", "Number", "Integer", "Float", "Boolean", "Date", "DateTime", "Time"]:
                        methods.append(f"    /** Add a value to property {prop_name}. */")
                        methods.append(f"    Builder add{self.capitalize(prop_name)}({range_type} value);")
                        methods.append("")
                        methods.append(f"    /** Add a value to property {prop_name}. */")
                        methods.append(f"    Builder add{self.capitalize(prop_name)}(String value);")
                        methods.append("")
                    else:
                        methods.append(f"    /** Add a value to property {prop_name}. */")
                        methods.append(f"    Builder add{self.capitalize(prop_name)}({range_type} value);")
                        methods.append("")
                        methods.append(f"    /** Add a value to property {prop_name}. */")
                        methods.append(f"    Builder add{self.capitalize(prop_name)}({range_type}.Builder value);")
                        methods.append("")
                        
        return "\n".join(methods)
        
    def generate_getter_methods(self, type_name: str) -> str:
        """Generate getter methods for properties relevant to this type."""
        methods = []
        
        # Find properties that can be used with this type
        for prop_name, prop_info in self.properties.items():
            domain_includes = prop_info.get("domainIncludes", [])
            if type_name in domain_includes or not domain_includes:
                methods.append(f"  /**")
                methods.append(f"   * Returns the value list of property {prop_name}. Empty list is returned if the property not set")
                methods.append(f"   * in current object.")
                methods.append(f"   */")
                methods.append(f"  ImmutableList<SchemaOrgType> get{self.capitalize(prop_name)}List();")
                methods.append("")
                
        return "\n".join(methods)
        
    def generate_enum_getter_methods(self, enum_name: str) -> str:
        """Generate getter methods for enum types."""
        # Standard methods for all schema.org types
        methods = [
            "  @Override",
            "  public ImmutableList<SchemaOrgType> getAdditionalTypeList() {",
            "    return ImmutableList.of();",
            "  }",
            "",
            "  @Override",
            "  public ImmutableList<SchemaOrgType> getAlternateNameList() {",
            "    return ImmutableList.of();",
            "  }",
            "",
            "  @Override",
            "  public ImmutableList<SchemaOrgType> getDescriptionList() {",
            "    return ImmutableList.of();",
            "  }",
            "",
            "  @Override",
            "  public ImmutableList<SchemaOrgType> getImageList() {",
            "    return ImmutableList.of();",
            "  }",
            "",
            "  @Override",
            "  public ImmutableList<SchemaOrgType> getMainEntityOfPageList() {",
            "    return ImmutableList.of();",
            "  }",
            "",
            "  @Override",
            "  public ImmutableList<SchemaOrgType> getNameList() {",
            "    return ImmutableList.of();",
            "  }",
            "",
            "  @Override",
            "  public ImmutableList<SchemaOrgType> getPotentialActionList() {",
            "    return ImmutableList.of();",
            "  }",
            "",
            "  @Override",
            "  public ImmutableList<SchemaOrgType> getSameAsList() {",
            "    return ImmutableList.of();",
            "  }",
            "",
            "  @Override",
            "  public ImmutableList<SchemaOrgType> getSupersededByList() {",
            "    return ImmutableList.of();",
            "  }",
            "",
            "  @Override",
            "  public ImmutableList<SchemaOrgType> getUrlList() {",
            "    return ImmutableList.of();",
            "  }",
            "",
            "  @Override",
            "  public ImmutableList<SchemaOrgType> getProperty(String name) {",
            "    return ImmutableList.of();",
            "  }"
        ]
        
        return "\\n".join(methods)
        
    def to_java_constant(self, name: str) -> str:
        """Convert a name to Java constant format."""
        # Convert camelCase to UPPER_SNAKE_CASE
        result = re.sub('([a-z0-9])([A-Z])', r'\\1_\\2', name)
        return result.upper()
        
    def capitalize(self, name: str) -> str:
        """Capitalize the first letter of a name."""
        return name[0].upper() + name[1:] if name else ""
        
    def update_core_constants(self):
        """Update the CoreConstants class with new types and properties."""
        constants_file = "src/main/java/com/google/schemaorg/core/CoreConstants.java"
        
        # Read existing constants
        try:
            with open(constants_file, 'r') as f:
                content = f.read()
        except FileNotFoundError:
            print(f"CoreConstants file not found: {constants_file}")
            return
            
        # Extract existing constants
        type_constants = set()
        property_constants = set()
        
        for line in content.split('\\n'):
            if 'public static final String TYPE_' in line:
                match = re.search(r'TYPE_([A-Z_]+)', line)
                if match:
                    type_constants.add(match.group(1))
            elif 'public static final String PROPERTY_' in line:
                match = re.search(r'PROPERTY_([A-Z_]+)', line)
                if match:
                    property_constants.add(match.group(1))
                    
        # Add new constants
        new_type_constants = []
        new_property_constants = []
        
        for type_name in self.types:
            constant_name = self.to_java_constant(type_name)
            if constant_name not in type_constants:
                new_type_constants.append(f'  public static final String TYPE_{constant_name} = NAMESPACE + "{type_name}";')
                
        for prop_name in self.properties:
            constant_name = self.to_java_constant(prop_name)
            if constant_name not in property_constants:
                new_property_constants.append(f'  public static final String PROPERTY_{constant_name} = NAMESPACE + "{prop_name}";')
                
        # Update the file
        if new_type_constants or new_property_constants:
            # Find insertion points
            type_insert_point = content.rfind('public static final String TYPE_')
            property_insert_point = content.rfind('public static final String PROPERTY_')
            
            if type_insert_point != -1 and new_type_constants:
                # Find the end of the line
                line_end = content.find('\\n', type_insert_point)
                content = content[:line_end] + '\\n\\n' + '\\n'.join(new_type_constants) + content[line_end:]
                
            if property_insert_point != -1 and new_property_constants:
                # Find the end of the line
                line_end = content.find('\\n', property_insert_point)
                content = content[:line_end] + '\\n\\n' + '\\n'.join(new_property_constants) + content[line_end:]
                
            # Write back
            with open(constants_file, 'w') as f:
                f.write(content)
            print(f"Updated CoreConstants with {len(new_type_constants)} new types and {len(new_property_constants)} new properties")
            
    def update_core_factory(self):
        """Update the CoreFactory class with new builder methods."""
        factory_file = "src/main/java/com/google/schemaorg/core/CoreFactory.java"
        
        # Read existing factory
        try:
            with open(factory_file, 'r') as f:
                content = f.read()
        except FileNotFoundError:
            print(f"CoreFactory file not found: {factory_file}")
            return
            
        # Extract existing methods
        existing_methods = set()
        for line in content.split('\\n'):
            if 'public static' in line and 'Builder new' in line:
                match = re.search(r'new([A-Za-z]+)Builder', line)
                if match:
                    existing_methods.add(match.group(1))
                    
        # Add new methods
        new_methods = []
        for type_name in self.types:
            if type_name not in existing_methods and type_name not in self.enumerations:
                new_methods.append(f'  public static {type_name}.Builder new{type_name}Builder() {{')
                new_methods.append(f'    return new {type_name}Impl.BuilderImpl();')
                new_methods.append(f'  }}')
                new_methods.append('')
                
        # Update the file
        if new_methods:
            # Find insertion point (before the closing brace)
            closing_brace = content.rfind('}')
            content = content[:closing_brace] + '\\n' + '\\n'.join(new_methods) + content[closing_brace:]
            
            with open(factory_file, 'w') as f:
                f.write(content)
            print(f"Updated CoreFactory with {len(new_methods)//3} new builder methods")
            
    def generate_all_files(self):
        """Generate all Java files for new types and enumerations."""
        # Create directories if they don't exist
        core_dir = "src/main/java/com/google/schemaorg/core"
        impl_dir = "src/main/java/com/google/schemaorg/core/impl"
        os.makedirs(core_dir, exist_ok=True)
        os.makedirs(impl_dir, exist_ok=True)
        
        # Generate interfaces for new types
        for type_name, type_info in self.types.items():
            if type_name not in self.existing_types:
                if type_name not in self.enumerations:
                    # Generate regular interface
                    interface_content = self.generate_java_interface(type_name, type_info)
                    with open(f"{core_dir}/{type_name}.java", 'w') as f:
                        f.write(interface_content)
                else:
                    # Generate enum interface
                    enum_interface = self.generate_enum_interface(type_name, type_info)
                    with open(f"{core_dir}/{type_name}.java", 'w') as f:
                        f.write(enum_interface)
                        
                    # Generate enum class
                    if type_name in self.enum_values:
                        enum_class = self.generate_enum_class(type_name, self.enum_values[type_name])
                        with open(f"{core_dir}/{type_name}Enum.java", 'w') as f:
                            f.write(enum_class)
                            
        print(f"Generated {len([t for t in self.types if t not in self.existing_types])} new type files")
        
    def run(self):
        """Run the complete update process."""
        print("Starting Schema.org Java library update...")
        
        # Load the schema data
        if not self.load_schema_data():
            print("Failed to load schema data")
            return False
            
        # Scan existing files
        self.scan_existing_files()
        
        # Generate new files
        self.generate_all_files()
        
        # Update existing files
        self.update_core_constants()
        self.update_core_factory()
        
        print("Schema.org Java library update complete!")
        return True

if __name__ == "__main__":
    updater = SchemaOrgUpdater()
    updater.run()
package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class Text extends AbstractSchema {
    {
        setId("schema:Text");
        setType("['rdfs:Class', 'schema:DataType']");
    }
    // No fields, placeholder for schema.org Text

    @JsonProperty("@type")
    private List<String> customType;

    public List<String> getCustomType() {
        return customType;
    }

    public void setCustomType(List<String> customType) {
        this.customType = customType;
    }
}
package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class QuantitativeValue extends StructuredValue {
    public QuantitativeValue() {
}
    /** The value of a [[QuantitativeValue]] (including [[Observation]]) or property value node.\n\n* For [[QuantitativeValue]] and [[MonetaryAmount]], the recommended type for values is 'Number'.\n* For [[PropertyValue]], it can be 'Text', 'Number', 'Boolean', or 'StructuredValue'.\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator. */
    @JsonProperty("value")
    private String value;
    /** A property-value pair representing an additional characteristic of the entity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.\n\nNote: Publishers should be aware that applications designed to use specific schema.org properties (e.g. https://schema.org/width, https://schema.org/color, https://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
 */
    @JsonProperty("additionalProperty")
    private PropertyValue additionalProperty;
    /** The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon. */
    @JsonProperty("unitCode")
    private String unitCode;
    /** The lower value of some characteristic or property. */
    @JsonProperty("minValue")
    private Double minValue;
    /** The upper value of some characteristic or property. */
    @JsonProperty("maxValue")
    private Double maxValue;
    /** A string or text indicating the unit of measurement. Useful if you cannot provide a standard unit code for
<a href='unitCode'>unitCode</a>. */
    @JsonProperty("unitText")
    private String unitText;
    /** A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement. */
    @JsonProperty("valueReference")
    private String valueReference;

    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }
    public PropertyValue getAdditionalProperty() { return additionalProperty; }
    public void setAdditionalProperty(PropertyValue additionalProperty) { this.additionalProperty = additionalProperty; }
    public String getUnitCode() { return unitCode; }
    public void setUnitCode(String unitCode) { this.unitCode = unitCode; }
    public Double getMinValue() { return minValue; }
    public void setMinValue(Double minValue) { this.minValue = minValue; }
    public Double getMaxValue() { return maxValue; }
    public void setMaxValue(Double maxValue) { this.maxValue = maxValue; }
    public String getUnitText() { return unitText; }
    public void setUnitText(String unitText) { this.unitText = unitText; }
    public String getValueReference() { return valueReference; }
    public void setValueReference(String valueReference) { this.valueReference = valueReference; }
}
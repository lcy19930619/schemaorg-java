package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class PropertyValueSpecification extends Intangible {
    {
        setId("schema:PropertyValueSpecification");
        setType("rdfs:Class");

    }

    /**
     * Specifies the allowed range for number of characters in a literal value.
     */
    @JsonProperty("valueMaxLength")
    private Double valueMaxLength;
    /**
     * The stepValue attribute indicates the granularity that is expected (and required) of the value in a PropertyValueSpecification.
     */
    @JsonProperty("stepValue")
    private Double stepValue;
    /**
     * Whether multiple values are allowed for the property.  Default is false.
     */
    @JsonProperty("multipleValues")
    private Boolean multipleValues;
    /**
     * The lower value of some characteristic or property.
     */
    @JsonProperty("minValue")
    private Double minValue;
    /**
     * Whether the property must be filled in to complete the action.  Default is false.
     */
    @JsonProperty("valueRequired")
    private Boolean valueRequired;
    /**
     * The upper value of some characteristic or property.
     */
    @JsonProperty("maxValue")
    private Double maxValue;
    /**
     * Specifies the minimum allowed range for number of characters in a literal value.
     */
    @JsonProperty("valueMinLength")
    private Double valueMinLength;
    /**
     * Whether or not a property is mutable.  Default is false. Specifying this for a property that also has a value makes it act similar to a "hidden" input in an HTML form.
     */
    @JsonProperty("readonlyValue")
    private Boolean readonlyValue;
    /**
     * The default value of the input.  For properties that expect a literal, the default is a literal value, for properties that expect an object, it's an ID reference to one of the current values.
     */
    @JsonProperty("defaultValue")
    private String defaultValue;
    /**
     * Specifies a regular expression for testing literal values according to the HTML spec.
     */
    @JsonProperty("valuePattern")
    private String valuePattern;
    /**
     * Indicates the name of the PropertyValueSpecification to be used in URL templates and form encoding in a manner analogous to HTML's input@name.
     */
    @JsonProperty("valueName")
    private String valueName;

    public Double getValueMaxLength() {
        return valueMaxLength;
    }

    public void setValueMaxLength(Double valueMaxLength) {
        this.valueMaxLength = valueMaxLength;
    }

    public Double getStepValue() {
        return stepValue;
    }

    public void setStepValue(Double stepValue) {
        this.stepValue = stepValue;
    }

    public Boolean getMultipleValues() {
        return multipleValues;
    }

    public void setMultipleValues(Boolean multipleValues) {
        this.multipleValues = multipleValues;
    }

    public Double getMinValue() {
        return minValue;
    }

    public void setMinValue(Double minValue) {
        this.minValue = minValue;
    }

    public Boolean getValueRequired() {
        return valueRequired;
    }

    public void setValueRequired(Boolean valueRequired) {
        this.valueRequired = valueRequired;
    }

    public Double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Double maxValue) {
        this.maxValue = maxValue;
    }

    public Double getValueMinLength() {
        return valueMinLength;
    }

    public void setValueMinLength(Double valueMinLength) {
        this.valueMinLength = valueMinLength;
    }

    public Boolean getReadonlyValue() {
        return readonlyValue;
    }

    public void setReadonlyValue(Boolean readonlyValue) {
        this.readonlyValue = readonlyValue;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getValuePattern() {
        return valuePattern;
    }

    public void setValuePattern(String valuePattern) {
        this.valuePattern = valuePattern;
    }

    public String getValueName() {
        return valueName;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName;
    }
}
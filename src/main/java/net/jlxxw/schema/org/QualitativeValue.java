package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class QualitativeValue extends Enumeration {
    {
        setId("schema:QualitativeValue");
        setType("rdfs:Class");

    }

    /**
     * This ordering relation for qualitative values indicates that the subject is lesser than or equal to the object.
     */
    @JsonProperty("lesserOrEqual")
    private QualitativeValue lesserOrEqual;
    /**
     * A property-value pair representing an additional characteristic of the entity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.\n\nNote: Publishers should be aware that applications designed to use specific schema.org properties (e.g. https://schema.org/width, https://schema.org/color, https://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
     */
    @JsonProperty("additionalProperty")
    private PropertyValue additionalProperty;
    /**
     * This ordering relation for qualitative values indicates that the subject is equal to the object.
     */
    @JsonProperty("equal")
    private QualitativeValue equal;
    /**
     * This ordering relation for qualitative values indicates that the subject is greater than the object.
     */
    @JsonProperty("greater")
    private QualitativeValue greater;
    /**
     * This ordering relation for qualitative values indicates that the subject is lesser than the object.
     */
    @JsonProperty("lesser")
    private QualitativeValue lesser;
    /**
     * This ordering relation for qualitative values indicates that the subject is greater than or equal to the object.
     */
    @JsonProperty("greaterOrEqual")
    private QualitativeValue greaterOrEqual;
    /**
     * This ordering relation for qualitative values indicates that the subject is not equal to the object.
     */
    @JsonProperty("nonEqual")
    private QualitativeValue nonEqual;
    /**
     * A secondary value that provides additional information on the original value, e.g. a reference temperature or a type of measurement.
     */
    @JsonProperty("valueReference")
    private String valueReference;

    public QualitativeValue getLesserOrEqual() {
        return lesserOrEqual;
    }

    public void setLesserOrEqual(QualitativeValue lesserOrEqual) {
        this.lesserOrEqual = lesserOrEqual;
    }

    public PropertyValue getAdditionalProperty() {
        return additionalProperty;
    }

    public void setAdditionalProperty(PropertyValue additionalProperty) {
        this.additionalProperty = additionalProperty;
    }

    public QualitativeValue getEqual() {
        return equal;
    }

    public void setEqual(QualitativeValue equal) {
        this.equal = equal;
    }

    public QualitativeValue getGreater() {
        return greater;
    }

    public void setGreater(QualitativeValue greater) {
        this.greater = greater;
    }

    public QualitativeValue getLesser() {
        return lesser;
    }

    public void setLesser(QualitativeValue lesser) {
        this.lesser = lesser;
    }

    public QualitativeValue getGreaterOrEqual() {
        return greaterOrEqual;
    }

    public void setGreaterOrEqual(QualitativeValue greaterOrEqual) {
        this.greaterOrEqual = greaterOrEqual;
    }

    public QualitativeValue getNonEqual() {
        return nonEqual;
    }

    public void setNonEqual(QualitativeValue nonEqual) {
        this.nonEqual = nonEqual;
    }

    public String getValueReference() {
        return valueReference;
    }

    public void setValueReference(String valueReference) {
        this.valueReference = valueReference;
    }
}
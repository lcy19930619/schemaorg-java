package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SizeSpecification extends QualitativeValue {
    public SizeSpecification() {
        setId("schema:SizeSpecification");
        setType("rdfs:Class");

    }

    /**
     * The suggested gender of the intended person or audience, for example "male", "female", or "unisex".
     */
    @JsonProperty("suggestedGender")
    private String suggestedGender;
    /**
     * A suggested range of body measurements for the intended audience or person, for example inseam between 32 and 34 inches or height between 170 and 190 cm. Typically found on a size chart for wearable products.
     */
    @JsonProperty("suggestedMeasurement")
    private QuantitativeValue suggestedMeasurement;
    /**
     * The size system used to identify a product's size. Typically either a standard (for example, "GS1" or "ISO-EN13402"), country code (for example "US" or "JP"), or a measuring system (for example "Metric" or "Imperial").
     */
    @JsonProperty("sizeSystem")
    private String sizeSystem;
    /**
     * The age or age range for the intended audience or person, for example 3-12 months for infants, 1-5 years for toddlers.
     */
    @JsonProperty("suggestedAge")
    private QuantitativeValue suggestedAge;
    /**
     * A measurement of an item, For example, the inseam of pants, the wheel size of a bicycle, the gauge of a screw, or the carbon footprint measured for certification by an authority. Usually an exact measurement, but can also be a range of measurements for adjustable products, for example belts and ski bindings.
     */
    @JsonProperty("hasMeasurement")
    private QuantitativeValue hasMeasurement;
    /**
     * The size group (also known as "size type") for a product's size. Size groups are common in the fashion industry to define size segments and suggested audiences for wearable products. Multiple values can be combined, for example "men's big and tall", "petite maternity" or "regular".
     */
    @JsonProperty("sizeGroup")
    private String sizeGroup;

    public String getSuggestedGender() {
        return suggestedGender;
    }

    public void setSuggestedGender(String suggestedGender) {
        this.suggestedGender = suggestedGender;
    }

    public QuantitativeValue getSuggestedMeasurement() {
        return suggestedMeasurement;
    }

    public void setSuggestedMeasurement(QuantitativeValue suggestedMeasurement) {
        this.suggestedMeasurement = suggestedMeasurement;
    }

    public String getSizeSystem() {
        return sizeSystem;
    }

    public void setSizeSystem(String sizeSystem) {
        this.sizeSystem = sizeSystem;
    }

    public QuantitativeValue getSuggestedAge() {
        return suggestedAge;
    }

    public void setSuggestedAge(QuantitativeValue suggestedAge) {
        this.suggestedAge = suggestedAge;
    }

    public QuantitativeValue getHasMeasurement() {
        return hasMeasurement;
    }

    public void setHasMeasurement(QuantitativeValue hasMeasurement) {
        this.hasMeasurement = hasMeasurement;
    }

    public String getSizeGroup() {
        return sizeGroup;
    }

    public void setSizeGroup(String sizeGroup) {
        this.sizeGroup = sizeGroup;
    }
}
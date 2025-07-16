package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PeopleAudience extends Audience {
    public PeopleAudience() {
        setId("schema:PeopleAudience");
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
     * Minimum recommended age in years for the audience or user.
     */
    @JsonProperty("suggestedMinAge")
    private Double suggestedMinAge;
    /**
     * The age or age range for the intended audience or person, for example 3-12 months for infants, 1-5 years for toddlers.
     */
    @JsonProperty("suggestedAge")
    private QuantitativeValue suggestedAge;
    /**
     * Audiences defined by a person's maximum age.
     */
    @JsonProperty("requiredMaxAge")
    private Integer requiredMaxAge;
    /**
     * Audiences defined by a person's minimum age.
     */
    @JsonProperty("requiredMinAge")
    private Integer requiredMinAge;
    /**
     * Maximum recommended age in years for the audience or user.
     */
    @JsonProperty("suggestedMaxAge")
    private Double suggestedMaxAge;
    /**
     * Specifying the health condition(s) of a patient, medical study, or other target audience.
     */
    @JsonProperty("healthCondition")
    private MedicalCondition healthCondition;
    /**
     * Audiences defined by a person's gender.
     */
    @JsonProperty("requiredGender")
    private String requiredGender;

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

    public Double getSuggestedMinAge() {
        return suggestedMinAge;
    }

    public void setSuggestedMinAge(Double suggestedMinAge) {
        this.suggestedMinAge = suggestedMinAge;
    }

    public QuantitativeValue getSuggestedAge() {
        return suggestedAge;
    }

    public void setSuggestedAge(QuantitativeValue suggestedAge) {
        this.suggestedAge = suggestedAge;
    }

    public Integer getRequiredMaxAge() {
        return requiredMaxAge;
    }

    public void setRequiredMaxAge(Integer requiredMaxAge) {
        this.requiredMaxAge = requiredMaxAge;
    }

    public Integer getRequiredMinAge() {
        return requiredMinAge;
    }

    public void setRequiredMinAge(Integer requiredMinAge) {
        this.requiredMinAge = requiredMinAge;
    }

    public Double getSuggestedMaxAge() {
        return suggestedMaxAge;
    }

    public void setSuggestedMaxAge(Double suggestedMaxAge) {
        this.suggestedMaxAge = suggestedMaxAge;
    }

    public MedicalCondition getHealthCondition() {
        return healthCondition;
    }

    public void setHealthCondition(MedicalCondition healthCondition) {
        this.healthCondition = healthCondition;
    }

    public String getRequiredGender() {
        return requiredGender;
    }

    public void setRequiredGender(String requiredGender) {
        this.requiredGender = requiredGender;
    }
}
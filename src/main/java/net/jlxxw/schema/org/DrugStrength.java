package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DrugStrength extends MedicalIntangible {
    public DrugStrength() {
    }

    /**
     * The units of an active ingredient's strength, e.g. mg.
     */
    @JsonProperty("strengthUnit")
    private String strengthUnit;
    /**
     * An active ingredient, typically chemical compounds and/or biologic substances.
     */
    @JsonProperty("activeIngredient")
    private String activeIngredient;
    /**
     * The value of an active ingredient's strength, e.g. 325.
     */
    @JsonProperty("strengthValue")
    private Double strengthValue;
    /**
     * Recommended intake of this supplement for a given population as defined by a specific recommending authority.
     */
    @JsonProperty("maximumIntake")
    private MaximumDoseSchedule maximumIntake;
    /**
     * The location in which the strength is available.
     */
    @JsonProperty("availableIn")
    private AdministrativeArea availableIn;

    public String getStrengthUnit() {
        return strengthUnit;
    }

    public void setStrengthUnit(String strengthUnit) {
        this.strengthUnit = strengthUnit;
    }

    public String getActiveIngredient() {
        return activeIngredient;
    }

    public void setActiveIngredient(String activeIngredient) {
        this.activeIngredient = activeIngredient;
    }

    public Double getStrengthValue() {
        return strengthValue;
    }

    public void setStrengthValue(Double strengthValue) {
        this.strengthValue = strengthValue;
    }

    public MaximumDoseSchedule getMaximumIntake() {
        return maximumIntake;
    }

    public void setMaximumIntake(MaximumDoseSchedule maximumIntake) {
        this.maximumIntake = maximumIntake;
    }

    public AdministrativeArea getAvailableIn() {
        return availableIn;
    }

    public void setAvailableIn(AdministrativeArea availableIn) {
        this.availableIn = availableIn;
    }
}
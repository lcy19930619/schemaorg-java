package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Substance extends MedicalEntity {
    public Substance() {
        setId("schema:Substance");
        setType("rdfs:Class");

    }

    /**
     * An active ingredient, typically chemical compounds and/or biologic substances.
     */
    @JsonProperty("activeIngredient")
    private String activeIngredient;
    /**
     * Recommended intake of this supplement for a given population as defined by a specific recommending authority.
     */
    @JsonProperty("maximumIntake")
    private MaximumDoseSchedule maximumIntake;

    public String getActiveIngredient() {
        return activeIngredient;
    }

    public void setActiveIngredient(String activeIngredient) {
        this.activeIngredient = activeIngredient;
    }

    public MaximumDoseSchedule getMaximumIntake() {
        return maximumIntake;
    }

    public void setMaximumIntake(MaximumDoseSchedule maximumIntake) {
        this.maximumIntake = maximumIntake;
    }
}
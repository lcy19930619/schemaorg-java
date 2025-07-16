package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MedicalSignOrSymptom extends MedicalCondition {
    public MedicalSignOrSymptom() {
    }

    /**
     * A possible treatment to address this condition, sign or symptom.
     */
    @JsonProperty("possibleTreatment")
    private MedicalTherapy possibleTreatment;

    public MedicalTherapy getPossibleTreatment() {
        return possibleTreatment;
    }

    public void setPossibleTreatment(MedicalTherapy possibleTreatment) {
        this.possibleTreatment = possibleTreatment;
    }
}
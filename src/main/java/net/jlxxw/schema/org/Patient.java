package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Patient extends Person {
    public Patient() {
        setId("schema:Patient");
        setType("rdfs:Class");

    }

    /**
     * Specifying a drug or medicine used in a medication procedure.
     */
    @JsonProperty("drug")
    private AbstractSchema drug;
    /**
     * Specifying the health condition(s) of a patient, medical study, or other target audience.
     */
    @JsonProperty("healthCondition")
    private MedicalCondition healthCondition;
    /**
     * One or more alternative conditions considered in the differential diagnosis process as output of a diagnosis process.
     */
    @JsonProperty("diagnosis")
    private MedicalCondition diagnosis;

    public AbstractSchema getDrug() {
        return drug;
    }

    public void setDrug(AbstractSchema drug) {
        this.drug = drug;
    }

    public MedicalCondition getHealthCondition() {
        return healthCondition;
    }

    public void setHealthCondition(MedicalCondition healthCondition) {
        this.healthCondition = healthCondition;
    }

    public MedicalCondition getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(MedicalCondition diagnosis) {
        this.diagnosis = diagnosis;
    }
}
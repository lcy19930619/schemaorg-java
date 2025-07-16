package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MedicalTrial extends MedicalStudy {
    public MedicalTrial() {
        setId("schema:MedicalTrial");
        setType("rdfs:Class");

    }

    /**
     * Specifics about the trial design (enumerated).
     */
    @JsonProperty("trialDesign")
    private MedicalTrialDesign trialDesign;

    public MedicalTrialDesign getTrialDesign() {
        return trialDesign;
    }

    public void setTrialDesign(MedicalTrialDesign trialDesign) {
        this.trialDesign = trialDesign;
    }
}
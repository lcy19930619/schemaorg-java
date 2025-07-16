package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MedicalTrial extends MedicalStudy {
    public MedicalTrial() {
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
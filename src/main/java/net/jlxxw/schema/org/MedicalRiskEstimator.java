package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MedicalRiskEstimator extends MedicalEntity {
    public MedicalRiskEstimator() {
        setId("schema:MedicalRiskEstimator");
        setType("rdfs:Class");

    }

    /**
     * The condition, complication, or symptom whose risk is being estimated.
     */
    @JsonProperty("estimatesRiskOf")
    private MedicalEntity estimatesRiskOf;
    /**
     * A modifiable or non-modifiable risk factor included in the calculation, e.g. age, coexisting condition.
     */
    @JsonProperty("includedRiskFactor")
    private MedicalRiskFactor includedRiskFactor;

    public MedicalEntity getEstimatesRiskOf() {
        return estimatesRiskOf;
    }

    public void setEstimatesRiskOf(MedicalEntity estimatesRiskOf) {
        this.estimatesRiskOf = estimatesRiskOf;
    }

    public MedicalRiskFactor getIncludedRiskFactor() {
        return includedRiskFactor;
    }

    public void setIncludedRiskFactor(MedicalRiskFactor includedRiskFactor) {
        this.includedRiskFactor = includedRiskFactor;
    }
}
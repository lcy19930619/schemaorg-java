package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MedicalRiskFactor extends MedicalEntity {
    public MedicalRiskFactor() {
    }

    /**
     * The condition, complication, etc. influenced by this factor.
     */
    @JsonProperty("increasesRiskOf")
    private MedicalEntity increasesRiskOf;

    public MedicalEntity getIncreasesRiskOf() {
        return increasesRiskOf;
    }

    public void setIncreasesRiskOf(MedicalEntity increasesRiskOf) {
        this.increasesRiskOf = increasesRiskOf;
    }
}
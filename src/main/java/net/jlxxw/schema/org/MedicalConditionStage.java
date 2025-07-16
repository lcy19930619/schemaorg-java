package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MedicalConditionStage extends MedicalIntangible {
    public MedicalConditionStage() {
        setId("schema:MedicalConditionStage");
        setType("rdfs:Class");

    }

    /**
     * The substage, e.g. 'a' for Stage IIIa.
     */
    @JsonProperty("subStageSuffix")
    private String subStageSuffix;
    /**
     * The stage represented as a number, e.g. 3.
     */
    @JsonProperty("stageAsNumber")
    private Double stageAsNumber;

    public String getSubStageSuffix() {
        return subStageSuffix;
    }

    public void setSubStageSuffix(String subStageSuffix) {
        this.subStageSuffix = subStageSuffix;
    }

    public Double getStageAsNumber() {
        return stageAsNumber;
    }

    public void setStageAsNumber(Double stageAsNumber) {
        this.stageAsNumber = stageAsNumber;
    }
}
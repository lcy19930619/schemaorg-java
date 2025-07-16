package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class MedicalRiskScore extends MedicalRiskEstimator {
    {
        setId("schema:MedicalRiskScore");
        setType("rdfs:Class");

    }

    /**
     * The algorithm or rules to follow to compute the score.
     */
    @JsonProperty("algorithm")
    private String algorithm;

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }
}
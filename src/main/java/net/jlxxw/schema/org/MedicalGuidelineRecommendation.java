package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MedicalGuidelineRecommendation extends MedicalGuideline {
    public MedicalGuidelineRecommendation() {
    }

    /**
     * Strength of the guideline's recommendation (e.g. 'class I').
     */
    @JsonProperty("recommendationStrength")
    private String recommendationStrength;

    public String getRecommendationStrength() {
        return recommendationStrength;
    }

    public void setRecommendationStrength(String recommendationStrength) {
        this.recommendationStrength = recommendationStrength;
    }
}
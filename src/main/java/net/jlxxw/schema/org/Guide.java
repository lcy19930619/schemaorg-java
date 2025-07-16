package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Guide extends CreativeWork {
    public Guide() {
        setId("schema:Guide");
        setType("rdfs:Class");

    }

    /**
     * This Review or Rating is relevant to this part or facet of the itemReviewed.
     */
    @JsonProperty("reviewAspect")
    private String reviewAspect;

    public String getReviewAspect() {
        return reviewAspect;
    }

    public void setReviewAspect(String reviewAspect) {
        this.reviewAspect = reviewAspect;
    }
}
package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class Rating extends Intangible {
    {
        setId("schema:Rating");
        setType("rdfs:Class");

    }

    /**
     * A short explanation (e.g. one to two sentences) providing background context and other information that led to the conclusion expressed in the rating. This is particularly applicable to ratings associated with "fact check" markup using [[ClaimReview]].
     */
    @JsonProperty("ratingExplanation")
    private String ratingExplanation;
    /**
     * The lowest value allowed in this rating system.
     */
    @JsonProperty("worstRating")
    private String worstRating;
    /**
     * The rating for the content.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     */
    @JsonProperty("ratingValue")
    private String ratingValue;
    /**
     * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     */
    @JsonProperty("author")
    private List<AbstractSchema> author;
    /**
     * The highest value allowed in this rating system.
     */
    @JsonProperty("bestRating")
    private Double bestRating;
    /**
     * This Review or Rating is relevant to this part or facet of the itemReviewed.
     */
    @JsonProperty("reviewAspect")
    private String reviewAspect;

    public String getRatingExplanation() {
        return ratingExplanation;
    }

    public void setRatingExplanation(String ratingExplanation) {
        this.ratingExplanation = ratingExplanation;
    }

    public String getWorstRating() {
        return worstRating;
    }

    public void setWorstRating(String worstRating) {
        this.worstRating = worstRating;
    }

    public String getRatingValue() {
        return ratingValue;
    }

    public void setRatingValue(String ratingValue) {
        this.ratingValue = ratingValue;
    }

    public List<AbstractSchema> getAuthor() {
        return author;
    }

    public void setAuthor(List<AbstractSchema> author) {
        this.author = author;
    }

    public Double getBestRating() {
        return bestRating;
    }

    public void setBestRating(Double bestRating) {
        this.bestRating = bestRating;
    }

    public String getReviewAspect() {
        return reviewAspect;
    }

    public void setReviewAspect(String reviewAspect) {
        this.reviewAspect = reviewAspect;
    }
}
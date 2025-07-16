package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class Guide extends CreativeWork {
    public Guide() {
}
    /** This Review or Rating is relevant to this part or facet of the itemReviewed. */
    @JsonProperty("reviewAspect")
    private String reviewAspect;

    public String getReviewAspect() { return reviewAspect; }
    public void setReviewAspect(String reviewAspect) { this.reviewAspect = reviewAspect; }
}
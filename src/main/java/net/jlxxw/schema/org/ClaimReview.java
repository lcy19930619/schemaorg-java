package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class ClaimReview extends Review {
    public ClaimReview() {
}
    /** A short summary of the specific claims reviewed in a ClaimReview. */
    @JsonProperty("claimReviewed")
    private String claimReviewed;

    public String getClaimReviewed() { return claimReviewed; }
    public void setClaimReviewed(String claimReviewed) { this.claimReviewed = claimReviewed; }
}
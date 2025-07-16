package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class ReviewAction extends AssessAction {
    public ReviewAction() {
}
    /** A sub property of result. The review that resulted in the performing of the action. */
    @JsonProperty("resultReview")
    private AbstractSchema resultReview;

    public AbstractSchema getResultReview() { return resultReview; }
    public void setResultReview(AbstractSchema resultReview) { this.resultReview = resultReview; }
}
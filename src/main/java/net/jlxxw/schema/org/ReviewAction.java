package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class ReviewAction extends AssessAction {
    {
        setId("schema:ReviewAction");
        setType("rdfs:Class");

    }

    /**
     * A sub property of result. The review that resulted in the performing of the action.
     */
    @JsonProperty("resultReview")
    private AbstractSchema resultReview;

    public AbstractSchema getResultReview() {
        return resultReview;
    }

    public void setResultReview(AbstractSchema resultReview) {
        this.resultReview = resultReview;
    }
}
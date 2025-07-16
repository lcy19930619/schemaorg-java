package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateAction extends Action {
    public UpdateAction() {
        setId("schema:UpdateAction");
        setType("rdfs:Class");

    }

    /**
     * A sub property of object. The collection target of the action.
     */
    @JsonProperty("targetCollection")
    private Thing targetCollection;

    public Thing getTargetCollection() {
        return targetCollection;
    }

    public void setTargetCollection(Thing targetCollection) {
        this.targetCollection = targetCollection;
    }
}
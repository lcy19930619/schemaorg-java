package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VoteAction extends ChooseAction {
    public VoteAction() {
        setId("schema:VoteAction");
        setType("rdfs:Class");

    }

    /**
     * A sub property of object. The candidate subject of this action.
     */
    @JsonProperty("candidate")
    private Person candidate;

    public Person getCandidate() {
        return candidate;
    }

    public void setCandidate(Person candidate) {
        this.candidate = candidate;
    }
}
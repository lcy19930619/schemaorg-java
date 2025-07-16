package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GiveAction extends TransferAction {
    public GiveAction() {
        setId("schema:GiveAction");
        setType("rdfs:Class");

    }

    /**
     * A sub property of participant. The participant who is at the receiving end of the action.
     */
    @JsonProperty("recipient")
    private List<AbstractSchema> recipient;

    public List<AbstractSchema> getRecipient() {
        return recipient;
    }

    public void setRecipient(List<AbstractSchema> recipient) {
        this.recipient = recipient;
    }
}
package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class SendAction extends TransferAction {
    {
        setId("schema:SendAction");
        setType("rdfs:Class");

    }

    /**
     * A sub property of participant. The participant who is at the receiving end of the action.
     */
    @JsonProperty("recipient")
    private List<AbstractSchema> recipient;
    /**
     * A sub property of instrument. The method of delivery.
     */
    @JsonProperty("deliveryMethod")
    private AbstractSchema deliveryMethod;

    public List<AbstractSchema> getRecipient() {
        return recipient;
    }

    public void setRecipient(List<AbstractSchema> recipient) {
        this.recipient = recipient;
    }

    public AbstractSchema getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(AbstractSchema deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }
}
package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class ReceiveAction extends TransferAction {
    {
        setId("schema:ReceiveAction");
        setType("rdfs:Class");

    }

    /**
     * A sub property of participant. The participant who is at the sending end of the action.
     */
    @JsonProperty("sender")
    private List<AbstractSchema> sender;
    /**
     * A sub property of instrument. The method of delivery.
     */
    @JsonProperty("deliveryMethod")
    private AbstractSchema deliveryMethod;

    public List<AbstractSchema> getSender() {
        return sender;
    }

    public void setSender(List<AbstractSchema> sender) {
        this.sender = sender;
    }

    public AbstractSchema getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(AbstractSchema deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }
}
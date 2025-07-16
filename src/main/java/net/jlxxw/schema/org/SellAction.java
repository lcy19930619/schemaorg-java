package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class SellAction extends TradeAction {
    {
        setId("schema:SellAction");
        setType("rdfs:Class");

    }

    /**
     * A sub property of participant. The participant/person/organization that bought the object.
     */
    @JsonProperty("buyer")
    private List<AbstractSchema> buyer;

    public List<AbstractSchema> getBuyer() {
        return buyer;
    }

    public void setBuyer(List<AbstractSchema> buyer) {
        this.buyer = buyer;
    }
}
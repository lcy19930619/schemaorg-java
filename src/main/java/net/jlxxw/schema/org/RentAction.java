package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class RentAction extends TradeAction {
    public RentAction() {
        setId("schema:RentAction");
        setType("rdfs:Class");

    }

    /**
     * A sub property of participant. The owner of the real estate property.
     */
    @JsonProperty("landlord")
    private List<AbstractSchema> landlord;

    public List<AbstractSchema> getLandlord() {
        return landlord;
    }

    public void setLandlord(List<AbstractSchema> landlord) {
        this.landlord = landlord;
    }
}
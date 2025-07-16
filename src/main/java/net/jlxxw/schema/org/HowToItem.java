package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class HowToItem extends ListItem {
    {
        setId("schema:HowToItem");
        setType("rdfs:Class");

    }

    /**
     * The required quantity of the item(s).
     */
    @JsonProperty("requiredQuantity")
    private Double requiredQuantity;

    public Double getRequiredQuantity() {
        return requiredQuantity;
    }

    public void setRequiredQuantity(Double requiredQuantity) {
        this.requiredQuantity = requiredQuantity;
    }
}
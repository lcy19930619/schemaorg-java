package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SomeProducts extends Product {
    public SomeProducts() {
    }

    /**
     * The current approximate inventory level for the item or items.
     */
    @JsonProperty("inventoryLevel")
    private QuantitativeValue inventoryLevel;

    public QuantitativeValue getInventoryLevel() {
        return inventoryLevel;
    }

    public void setInventoryLevel(QuantitativeValue inventoryLevel) {
        this.inventoryLevel = inventoryLevel;
    }
}
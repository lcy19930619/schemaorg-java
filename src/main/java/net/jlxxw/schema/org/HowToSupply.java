package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HowToSupply extends HowToItem {
    public HowToSupply() {
        setId("schema:HowToSupply");
        setType("rdfs:Class");

    }

    /**
     * The estimated cost of the supply or supplies consumed when performing instructions.
     */
    @JsonProperty("estimatedCost")
    private String estimatedCost;

    public String getEstimatedCost() {
        return estimatedCost;
    }

    public void setEstimatedCost(String estimatedCost) {
        this.estimatedCost = estimatedCost;
    }
}
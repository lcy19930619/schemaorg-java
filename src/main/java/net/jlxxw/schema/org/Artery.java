package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Artery extends Vessel {
    public Artery() {
        setId("schema:Artery");
        setType("rdfs:Class");

    }

    /**
     * The area to which the artery supplies blood.
     */
    @JsonProperty("supplyTo")
    private AnatomicalStructure supplyTo;
    /**
     * The branches that comprise the arterial structure.
     */
    @JsonProperty("arterialBranch")
    private AnatomicalStructure arterialBranch;

    public AnatomicalStructure getSupplyTo() {
        return supplyTo;
    }

    public void setSupplyTo(AnatomicalStructure supplyTo) {
        this.supplyTo = supplyTo;
    }

    public AnatomicalStructure getArterialBranch() {
        return arterialBranch;
    }

    public void setArterialBranch(AnatomicalStructure arterialBranch) {
        this.arterialBranch = arterialBranch;
    }
}
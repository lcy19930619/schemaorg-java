package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Vein extends Vessel {
    public Vein() {
    }

    /**
     * The anatomical or organ system that the vein flows into; a larger structure that the vein connects to.
     */
    @JsonProperty("tributary")
    private AnatomicalStructure tributary;
    /**
     * The vasculature that the vein drains into.
     */
    @JsonProperty("drainsTo")
    private Vessel drainsTo;
    /**
     * The anatomical or organ system drained by this vessel; generally refers to a specific part of an organ.
     */
    @JsonProperty("regionDrained")
    private List<AbstractSchema> regionDrained;

    public AnatomicalStructure getTributary() {
        return tributary;
    }

    public void setTributary(AnatomicalStructure tributary) {
        this.tributary = tributary;
    }

    public Vessel getDrainsTo() {
        return drainsTo;
    }

    public void setDrainsTo(Vessel drainsTo) {
        this.drainsTo = drainsTo;
    }

    public List<AbstractSchema> getRegionDrained() {
        return regionDrained;
    }

    public void setRegionDrained(List<AbstractSchema> regionDrained) {
        this.regionDrained = regionDrained;
    }
}
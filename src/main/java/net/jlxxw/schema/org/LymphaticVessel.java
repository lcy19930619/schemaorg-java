package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class LymphaticVessel extends Vessel {
    {
        setId("schema:LymphaticVessel");
        setType("rdfs:Class");

    }

    /**
     * The vasculature the lymphatic structure runs, or efferents, to.
     */
    @JsonProperty("runsTo")
    private Vessel runsTo;
    /**
     * The vasculature the lymphatic structure originates, or afferents, from.
     */
    @JsonProperty("originatesFrom")
    private Vessel originatesFrom;
    /**
     * The anatomical or organ system drained by this vessel; generally refers to a specific part of an organ.
     */
    @JsonProperty("regionDrained")
    private List<AbstractSchema> regionDrained;

    public Vessel getRunsTo() {
        return runsTo;
    }

    public void setRunsTo(Vessel runsTo) {
        this.runsTo = runsTo;
    }

    public Vessel getOriginatesFrom() {
        return originatesFrom;
    }

    public void setOriginatesFrom(Vessel originatesFrom) {
        this.originatesFrom = originatesFrom;
    }

    public List<AbstractSchema> getRegionDrained() {
        return regionDrained;
    }

    public void setRegionDrained(List<AbstractSchema> regionDrained) {
        this.regionDrained = regionDrained;
    }
}
package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class Residence extends Place {
    {
        setId("schema:Residence");
        setType("rdfs:Class");

    }

    /**
     * A floorplan of some [[Accommodation]].
     */
    @JsonProperty("accommodationFloorPlan")
    private FloorPlan accommodationFloorPlan;

    public FloorPlan getAccommodationFloorPlan() {
        return accommodationFloorPlan;
    }

    public void setAccommodationFloorPlan(FloorPlan accommodationFloorPlan) {
        this.accommodationFloorPlan = accommodationFloorPlan;
    }
}
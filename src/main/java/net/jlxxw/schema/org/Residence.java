package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class Residence extends Place {
    public Residence() {
}
    /** A floorplan of some [[Accommodation]]. */
    @JsonProperty("accommodationFloorPlan")
    private FloorPlan accommodationFloorPlan;

    public FloorPlan getAccommodationFloorPlan() { return accommodationFloorPlan; }
    public void setAccommodationFloorPlan(FloorPlan accommodationFloorPlan) { this.accommodationFloorPlan = accommodationFloorPlan; }
}
package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class InsertAction extends AddAction {
    public InsertAction() {
}
    /** A sub property of location. The final location of the object or the agent after the action. */
    @JsonProperty("toLocation")
    private Place toLocation;

    public Place getToLocation() { return toLocation; }
    public void setToLocation(Place toLocation) { this.toLocation = toLocation; }
}
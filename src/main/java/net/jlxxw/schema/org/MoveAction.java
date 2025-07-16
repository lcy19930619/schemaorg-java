package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class MoveAction extends Action {
    {
        setId("schema:MoveAction");
        setType("rdfs:Class");

    }

    /**
     * A sub property of location. The final location of the object or the agent after the action.
     */
    @JsonProperty("toLocation")
    private Place toLocation;
    /**
     * A sub property of location. The original location of the object or the agent before the action.
     */
    @JsonProperty("fromLocation")
    private Place fromLocation;

    public Place getToLocation() {
        return toLocation;
    }

    public void setToLocation(Place toLocation) {
        this.toLocation = toLocation;
    }

    public Place getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(Place fromLocation) {
        this.fromLocation = fromLocation;
    }
}
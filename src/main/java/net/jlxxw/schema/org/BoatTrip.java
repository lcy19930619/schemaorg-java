package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BoatTrip extends Trip {
    public BoatTrip() {
        setId("schema:BoatTrip");
        setType("rdfs:Class");

    }

    /**
     * The terminal or port from which the boat arrives.
     */
    @JsonProperty("arrivalBoatTerminal")
    private BoatTerminal arrivalBoatTerminal;
    /**
     * The terminal or port from which the boat departs.
     */
    @JsonProperty("departureBoatTerminal")
    private BoatTerminal departureBoatTerminal;

    public BoatTerminal getArrivalBoatTerminal() {
        return arrivalBoatTerminal;
    }

    public void setArrivalBoatTerminal(BoatTerminal arrivalBoatTerminal) {
        this.arrivalBoatTerminal = arrivalBoatTerminal;
    }

    public BoatTerminal getDepartureBoatTerminal() {
        return departureBoatTerminal;
    }

    public void setDepartureBoatTerminal(BoatTerminal departureBoatTerminal) {
        this.departureBoatTerminal = departureBoatTerminal;
    }
}
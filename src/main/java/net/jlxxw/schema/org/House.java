package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class House extends Accommodation {
    public House() {
        setId("schema:House");
        setType("rdfs:Class");

    }

    /**
     * The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
     * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
     */
    @JsonProperty("numberOfRooms")
    private Double numberOfRooms;

    public Double getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(Double numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
}
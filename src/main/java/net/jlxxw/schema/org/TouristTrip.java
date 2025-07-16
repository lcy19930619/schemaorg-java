package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class TouristTrip extends Trip {
    {
        setId("schema:TouristTrip");
        setType("rdfs:Class");

    }

    /**
     * Attraction suitable for type(s) of tourist. E.g. children, visitors from a particular country, etc.
     */
    @JsonProperty("touristType")
    private String touristType;

    public String getTouristType() {
        return touristType;
    }

    public void setTouristType(String touristType) {
        this.touristType = touristType;
    }
}
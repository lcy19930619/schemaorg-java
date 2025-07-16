package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class Airport extends CivicStructure {
    {
        setId("schema:Airport");
        setType("rdfs:Class");

    }

    /**
     * ICAO identifier for an airport.
     */
    @JsonProperty("icaoCode")
    private String icaoCode;
    /**
     * IATA identifier for an airline or airport.
     */
    @JsonProperty("iataCode")
    private String iataCode;

    public String getIcaoCode() {
        return icaoCode;
    }

    public void setIcaoCode(String icaoCode) {
        this.icaoCode = icaoCode;
    }

    public String getIataCode() {
        return iataCode;
    }

    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }
}
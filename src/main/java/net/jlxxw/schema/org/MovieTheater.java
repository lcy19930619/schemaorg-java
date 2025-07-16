package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class MovieTheater extends EntertainmentBusiness {
    {
        setId("schema:MovieTheater");
        setType("rdfs:Class");

    }

    /**
     * The number of screens in the movie theater.
     */
    @JsonProperty("screenCount")
    private Double screenCount;

    public Double getScreenCount() {
        return screenCount;
    }

    public void setScreenCount(Double screenCount) {
        this.screenCount = screenCount;
    }
}
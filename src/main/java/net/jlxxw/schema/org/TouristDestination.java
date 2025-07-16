package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TouristDestination extends Place {
    public TouristDestination() {
    }

    /**
     * Attraction suitable for type(s) of tourist. E.g. children, visitors from a particular country, etc.
     */
    @JsonProperty("touristType")
    private String touristType;
    /**
     * Attraction located at destination.
     */
    @JsonProperty("includesAttraction")
    private TouristAttraction includesAttraction;

    public String getTouristType() {
        return touristType;
    }

    public void setTouristType(String touristType) {
        this.touristType = touristType;
    }

    public TouristAttraction getIncludesAttraction() {
        return includesAttraction;
    }

    public void setIncludesAttraction(TouristAttraction includesAttraction) {
        this.includesAttraction = includesAttraction;
    }
}
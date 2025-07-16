package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SportsOrganization extends Organization {
    public SportsOrganization() {
    }

    /**
     * A type of sport (e.g. Baseball).
     */
    @JsonProperty("sport")
    private String sport;

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }
}
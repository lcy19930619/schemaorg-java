package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class OccupationalExperienceRequirements extends Intangible {
    {
        setId("schema:OccupationalExperienceRequirements");
        setType("rdfs:Class");

    }

    /**
     * Indicates the minimal number of months of experience required for a position.
     */
    @JsonProperty("monthsOfExperience")
    private Double monthsOfExperience;

    public Double getMonthsOfExperience() {
        return monthsOfExperience;
    }

    public void setMonthsOfExperience(Double monthsOfExperience) {
        this.monthsOfExperience = monthsOfExperience;
    }
}
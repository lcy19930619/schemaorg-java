package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class OccupationalExperienceRequirements extends Intangible {
    public OccupationalExperienceRequirements() {
}
    /** Indicates the minimal number of months of experience required for a position. */
    @JsonProperty("monthsOfExperience")
    private Double monthsOfExperience;

    public Double getMonthsOfExperience() { return monthsOfExperience; }
    public void setMonthsOfExperience(Double monthsOfExperience) { this.monthsOfExperience = monthsOfExperience; }
}
package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class Substance extends MedicalEntity {
    public Substance() {
}
    /** An active ingredient, typically chemical compounds and/or biologic substances. */
    @JsonProperty("activeIngredient")
    private String activeIngredient;
    /** Recommended intake of this supplement for a given population as defined by a specific recommending authority. */
    @JsonProperty("maximumIntake")
    private MaximumDoseSchedule maximumIntake;

    public String getActiveIngredient() { return activeIngredient; }
    public void setActiveIngredient(String activeIngredient) { this.activeIngredient = activeIngredient; }
    public MaximumDoseSchedule getMaximumIntake() { return maximumIntake; }
    public void setMaximumIntake(MaximumDoseSchedule maximumIntake) { this.maximumIntake = maximumIntake; }
}
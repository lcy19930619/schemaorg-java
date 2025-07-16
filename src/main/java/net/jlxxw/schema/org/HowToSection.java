package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class HowToSection extends ItemList {
    public HowToSection() {
}
    /** A single step item (as HowToStep, text, document, video, etc.) or a HowToSection (originally misnamed 'steps'; 'step' is preferred). */
    @JsonProperty("steps")
    private String steps;

    public String getSteps() { return steps; }
    public void setSteps(String steps) { this.steps = steps; }
}
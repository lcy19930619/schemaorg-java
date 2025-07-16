package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class PerformanceRole extends Role {
    public PerformanceRole() {
}
    /** The name of a character played in some acting or performing role, i.e. in a PerformanceRole. */
    @JsonProperty("characterName")
    private String characterName;

    public String getCharacterName() { return characterName; }
    public void setCharacterName(String characterName) { this.characterName = characterName; }
}
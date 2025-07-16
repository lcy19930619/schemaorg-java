package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PerformanceRole extends Role {
    public PerformanceRole() {
        setId("schema:PerformanceRole");
        setType("rdfs:Class");

    }

    /**
     * The name of a character played in some acting or performing role, i.e. in a PerformanceRole.
     */
    @JsonProperty("characterName")
    private String characterName;

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
}
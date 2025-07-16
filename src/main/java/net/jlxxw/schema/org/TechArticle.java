package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TechArticle extends Article {
    public TechArticle() {
    }

    /**
     * Proficiency needed for this content; expected values: 'Beginner', 'Expert'.
     */
    @JsonProperty("proficiencyLevel")
    private String proficiencyLevel;
    /**
     * Prerequisites needed to fulfill steps in article.
     */
    @JsonProperty("dependencies")
    private String dependencies;

    public String getProficiencyLevel() {
        return proficiencyLevel;
    }

    public void setProficiencyLevel(String proficiencyLevel) {
        this.proficiencyLevel = proficiencyLevel;
    }

    public String getDependencies() {
        return dependencies;
    }

    public void setDependencies(String dependencies) {
        this.dependencies = dependencies;
    }
}
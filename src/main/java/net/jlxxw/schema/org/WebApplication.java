package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WebApplication extends SoftwareApplication {
    public WebApplication() {
        setId("schema:WebApplication");
        setType("rdfs:Class");

    }

    /**
     * Specifies browser requirements in human-readable text. For example, 'requires HTML5 support'.
     */
    @JsonProperty("browserRequirements")
    private String browserRequirements;

    public String getBrowserRequirements() {
        return browserRequirements;
    }

    public void setBrowserRequirements(String browserRequirements) {
        this.browserRequirements = browserRequirements;
    }
}
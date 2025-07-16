package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class EducationEvent extends Event {
    {
        setId("schema:EducationEvent");
        setType("rdfs:Class");

    }

    /**
     * The item being described is intended to help a person learn the competency or learning outcome defined by the referenced term.
     */
    @JsonProperty("teaches")
    private String teaches;
    /**
     * The level in terms of progression through an educational or training context. Examples of educational levels include 'beginner', 'intermediate' or 'advanced', and formal sets of level indicators.
     */
    @JsonProperty("educationalLevel")
    private String educationalLevel;
    /**
     * The item being described is intended to assess the competency or learning outcome defined by the referenced term.
     */
    @JsonProperty("assesses")
    private String assesses;

    public String getTeaches() {
        return teaches;
    }

    public void setTeaches(String teaches) {
        this.teaches = teaches;
    }

    public String getEducationalLevel() {
        return educationalLevel;
    }

    public void setEducationalLevel(String educationalLevel) {
        this.educationalLevel = educationalLevel;
    }

    public String getAssesses() {
        return assesses;
    }

    public void setAssesses(String assesses) {
        this.assesses = assesses;
    }
}
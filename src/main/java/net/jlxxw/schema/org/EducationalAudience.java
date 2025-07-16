package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class EducationalAudience extends Audience {
    {
        setId("schema:EducationalAudience");
        setType("rdfs:Class");

    }

    /**
     * An educationalRole of an EducationalAudience.
     */
    @JsonProperty("educationalRole")
    private String educationalRole;

    public String getEducationalRole() {
        return educationalRole;
    }

    public void setEducationalRole(String educationalRole) {
        this.educationalRole = educationalRole;
    }
}
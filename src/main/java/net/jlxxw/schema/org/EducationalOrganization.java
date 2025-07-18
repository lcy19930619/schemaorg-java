package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class EducationalOrganization extends Organization {
    {
        setId("schema:EducationalOrganization");
        setType("rdfs:Class");

    }

    /**
     * Alumni of an organization.
     */
    @JsonProperty("alumni")
    private Person alumni;

    public Person getAlumni() {
        return alumni;
    }

    public void setAlumni(Person alumni) {
        this.alumni = alumni;
    }
}
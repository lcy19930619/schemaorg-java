package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Thesis extends CreativeWork {
    public Thesis() {
        setId("schema:Thesis");
        setType("rdfs:Class");

    }

    /**
     * Qualification, candidature, degree, application that Thesis supports.
     */
    @JsonProperty("inSupportOf")
    private String inSupportOf;

    public String getInSupportOf() {
        return inSupportOf;
    }

    public void setInSupportOf(String inSupportOf) {
        this.inSupportOf = inSupportOf;
    }
}
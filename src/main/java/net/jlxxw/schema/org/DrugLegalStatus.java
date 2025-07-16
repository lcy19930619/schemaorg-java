package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class DrugLegalStatus extends MedicalIntangible {
    {
        setId("schema:DrugLegalStatus");
        setType("rdfs:Class");

    }

    /**
     * The location in which the status applies.
     */
    @JsonProperty("applicableLocation")
    private AdministrativeArea applicableLocation;

    public AdministrativeArea getApplicableLocation() {
        return applicableLocation;
    }

    public void setApplicableLocation(AdministrativeArea applicableLocation) {
        this.applicableLocation = applicableLocation;
    }
}
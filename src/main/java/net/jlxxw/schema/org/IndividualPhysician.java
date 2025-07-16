package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class IndividualPhysician extends Physician {
    {
        setId("schema:IndividualPhysician");
        setType("rdfs:Class");

    }

    /**
     * A [[MedicalOrganization]] where the [[IndividualPhysician]] practices.
     */
    @JsonProperty("practicesAt")
    private MedicalOrganization practicesAt;

    public MedicalOrganization getPracticesAt() {
        return practicesAt;
    }

    public void setPracticesAt(MedicalOrganization practicesAt) {
        this.practicesAt = practicesAt;
    }
}
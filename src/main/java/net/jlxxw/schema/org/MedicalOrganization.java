package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class MedicalOrganization extends Organization {
    {
        setId("schema:MedicalOrganization");
        setType("rdfs:Class");

    }

    /**
     * A medical specialty of the provider.
     */
    @JsonProperty("medicalSpecialty")
    private AbstractSchema medicalSpecialty;
    /**
     * Name or unique ID of network. (Networks are often reused across different insurance plans.)
     */
    @JsonProperty("healthPlanNetworkId")
    private String healthPlanNetworkId;
    /**
     * Whether the provider is accepting new patients.
     */
    @JsonProperty("isAcceptingNewPatients")
    private Boolean isAcceptingNewPatients;

    public AbstractSchema getMedicalSpecialty() {
        return medicalSpecialty;
    }

    public void setMedicalSpecialty(AbstractSchema medicalSpecialty) {
        this.medicalSpecialty = medicalSpecialty;
    }

    public String getHealthPlanNetworkId() {
        return healthPlanNetworkId;
    }

    public void setHealthPlanNetworkId(String healthPlanNetworkId) {
        this.healthPlanNetworkId = healthPlanNetworkId;
    }

    public Boolean getIsAcceptingNewPatients() {
        return isAcceptingNewPatients;
    }

    public void setIsAcceptingNewPatients(Boolean isAcceptingNewPatients) {
        this.isAcceptingNewPatients = isAcceptingNewPatients;
    }
}
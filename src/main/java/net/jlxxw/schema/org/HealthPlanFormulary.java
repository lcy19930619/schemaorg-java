package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class HealthPlanFormulary extends Intangible {
    {
        setId("schema:HealthPlanFormulary");
        setType("rdfs:Class");

    }

    /**
     * Whether prescriptions can be delivered by mail.
     */
    @JsonProperty("offersPrescriptionByMail")
    private Boolean offersPrescriptionByMail;
    /**
     * The tier(s) of drugs offered by this formulary or insurance plan.
     */
    @JsonProperty("healthPlanDrugTier")
    private String healthPlanDrugTier;
    /**
     * The costs to the patient for services under this network or formulary.
     */
    @JsonProperty("healthPlanCostSharing")
    private Boolean healthPlanCostSharing;

    public Boolean getOffersPrescriptionByMail() {
        return offersPrescriptionByMail;
    }

    public void setOffersPrescriptionByMail(Boolean offersPrescriptionByMail) {
        this.offersPrescriptionByMail = offersPrescriptionByMail;
    }

    public String getHealthPlanDrugTier() {
        return healthPlanDrugTier;
    }

    public void setHealthPlanDrugTier(String healthPlanDrugTier) {
        this.healthPlanDrugTier = healthPlanDrugTier;
    }

    public Boolean getHealthPlanCostSharing() {
        return healthPlanCostSharing;
    }

    public void setHealthPlanCostSharing(Boolean healthPlanCostSharing) {
        this.healthPlanCostSharing = healthPlanCostSharing;
    }
}
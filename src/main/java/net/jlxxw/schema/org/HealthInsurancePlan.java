package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class HealthInsurancePlan extends Intangible {
    public HealthInsurancePlan() {
}
    /** TODO. */
    @JsonProperty("healthPlanDrugOption")
    private String healthPlanDrugOption;
    /** The 14-character, HIOS-generated Plan ID number. (Plan IDs must be unique, even across different markets.) */
    @JsonProperty("healthPlanId")
    private String healthPlanId;
    /** Formularies covered by this plan. */
    @JsonProperty("includesHealthPlanFormulary")
    private HealthPlanFormulary includesHealthPlanFormulary;
    /** The URL that goes directly to the plan brochure for the specific standard plan or plan variation. */
    @JsonProperty("healthPlanMarketingUrl")
    private String healthPlanMarketingUrl;
    /** Networks covered by this plan. */
    @JsonProperty("includesHealthPlanNetwork")
    private HealthPlanNetwork includesHealthPlanNetwork;
    /** A contact point for a person or organization. */
    @JsonProperty("contactPoint")
    private AbstractSchema contactPoint;
    /** The standard for interpreting the Plan ID. The preferred is "HIOS". See the Centers for Medicare & Medicaid Services for more details. */
    @JsonProperty("usesHealthPlanIdStandard")
    private String usesHealthPlanIdStandard;
    /** The tier(s) of drugs offered by this formulary or insurance plan. */
    @JsonProperty("healthPlanDrugTier")
    private String healthPlanDrugTier;
    /** The URL that goes directly to the summary of benefits and coverage for the specific standard plan or plan variation. */
    @JsonProperty("benefitsSummaryUrl")
    private String benefitsSummaryUrl;

    public String getHealthPlanDrugOption() { return healthPlanDrugOption; }
    public void setHealthPlanDrugOption(String healthPlanDrugOption) { this.healthPlanDrugOption = healthPlanDrugOption; }
    public String getHealthPlanId() { return healthPlanId; }
    public void setHealthPlanId(String healthPlanId) { this.healthPlanId = healthPlanId; }
    public HealthPlanFormulary getIncludesHealthPlanFormulary() { return includesHealthPlanFormulary; }
    public void setIncludesHealthPlanFormulary(HealthPlanFormulary includesHealthPlanFormulary) { this.includesHealthPlanFormulary = includesHealthPlanFormulary; }
    public String getHealthPlanMarketingUrl() { return healthPlanMarketingUrl; }
    public void setHealthPlanMarketingUrl(String healthPlanMarketingUrl) { this.healthPlanMarketingUrl = healthPlanMarketingUrl; }
    public HealthPlanNetwork getIncludesHealthPlanNetwork() { return includesHealthPlanNetwork; }
    public void setIncludesHealthPlanNetwork(HealthPlanNetwork includesHealthPlanNetwork) { this.includesHealthPlanNetwork = includesHealthPlanNetwork; }
    public AbstractSchema getContactPoint() { return contactPoint; }
    public void setContactPoint(AbstractSchema contactPoint) { this.contactPoint = contactPoint; }
    public String getUsesHealthPlanIdStandard() { return usesHealthPlanIdStandard; }
    public void setUsesHealthPlanIdStandard(String usesHealthPlanIdStandard) { this.usesHealthPlanIdStandard = usesHealthPlanIdStandard; }
    public String getHealthPlanDrugTier() { return healthPlanDrugTier; }
    public void setHealthPlanDrugTier(String healthPlanDrugTier) { this.healthPlanDrugTier = healthPlanDrugTier; }
    public String getBenefitsSummaryUrl() { return benefitsSummaryUrl; }
    public void setBenefitsSummaryUrl(String benefitsSummaryUrl) { this.benefitsSummaryUrl = benefitsSummaryUrl; }
}
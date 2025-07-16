package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class HealthPlanNetwork extends Intangible {
    public HealthPlanNetwork() {
}
    /** The tier(s) for this network. */
    @JsonProperty("healthPlanNetworkTier")
    private String healthPlanNetworkTier;
    /** Name or unique ID of network. (Networks are often reused across different insurance plans.) */
    @JsonProperty("healthPlanNetworkId")
    private String healthPlanNetworkId;
    /** The costs to the patient for services under this network or formulary. */
    @JsonProperty("healthPlanCostSharing")
    private Boolean healthPlanCostSharing;

    public String getHealthPlanNetworkTier() { return healthPlanNetworkTier; }
    public void setHealthPlanNetworkTier(String healthPlanNetworkTier) { this.healthPlanNetworkTier = healthPlanNetworkTier; }
    public String getHealthPlanNetworkId() { return healthPlanNetworkId; }
    public void setHealthPlanNetworkId(String healthPlanNetworkId) { this.healthPlanNetworkId = healthPlanNetworkId; }
    public Boolean getHealthPlanCostSharing() { return healthPlanCostSharing; }
    public void setHealthPlanCostSharing(Boolean healthPlanCostSharing) { this.healthPlanCostSharing = healthPlanCostSharing; }
}
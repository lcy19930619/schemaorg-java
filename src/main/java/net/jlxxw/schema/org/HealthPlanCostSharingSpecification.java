package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class HealthPlanCostSharingSpecification extends Intangible {
    public HealthPlanCostSharingSpecification() {
}
    /** The rate of coinsurance expressed as a number between 0.0 and 1.0. */
    @JsonProperty("healthPlanCoinsuranceRate")
    private Double healthPlanCoinsuranceRate;
    /** Whether the coinsurance applies before or after deductible, etc. TODO: Is this a closed set? */
    @JsonProperty("healthPlanCoinsuranceOption")
    private String healthPlanCoinsuranceOption;
    /** Whether the copay is before or after deductible, etc. TODO: Is this a closed set? */
    @JsonProperty("healthPlanCopayOption")
    private String healthPlanCopayOption;
    /** The category or type of pharmacy associated with this cost sharing. */
    @JsonProperty("healthPlanPharmacyCategory")
    private String healthPlanPharmacyCategory;
    /** The copay amount. */
    @JsonProperty("healthPlanCopay")
    private AbstractSchema healthPlanCopay;

    public Double getHealthPlanCoinsuranceRate() { return healthPlanCoinsuranceRate; }
    public void setHealthPlanCoinsuranceRate(Double healthPlanCoinsuranceRate) { this.healthPlanCoinsuranceRate = healthPlanCoinsuranceRate; }
    public String getHealthPlanCoinsuranceOption() { return healthPlanCoinsuranceOption; }
    public void setHealthPlanCoinsuranceOption(String healthPlanCoinsuranceOption) { this.healthPlanCoinsuranceOption = healthPlanCoinsuranceOption; }
    public String getHealthPlanCopayOption() { return healthPlanCopayOption; }
    public void setHealthPlanCopayOption(String healthPlanCopayOption) { this.healthPlanCopayOption = healthPlanCopayOption; }
    public String getHealthPlanPharmacyCategory() { return healthPlanPharmacyCategory; }
    public void setHealthPlanPharmacyCategory(String healthPlanPharmacyCategory) { this.healthPlanPharmacyCategory = healthPlanPharmacyCategory; }
    public AbstractSchema getHealthPlanCopay() { return healthPlanCopay; }
    public void setHealthPlanCopay(AbstractSchema healthPlanCopay) { this.healthPlanCopay = healthPlanCopay; }
}
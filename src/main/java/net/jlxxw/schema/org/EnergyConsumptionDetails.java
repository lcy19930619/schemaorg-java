package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class EnergyConsumptionDetails extends Intangible {
    public EnergyConsumptionDetails() {
}
    /** Specifies the least energy efficient class on the regulated EU energy consumption scale for the product category a product belongs to. For example, energy consumption for televisions placed on the market after January 1, 2020 is scaled from D to A+++. */
    @JsonProperty("energyEfficiencyScaleMin")
    private EUEnergyEfficiencyEnumeration energyEfficiencyScaleMin;
    /** Specifies the most energy efficient class on the regulated EU energy consumption scale for the product category a product belongs to. For example, energy consumption for televisions placed on the market after January 1, 2020 is scaled from D to A+++. */
    @JsonProperty("energyEfficiencyScaleMax")
    private EUEnergyEfficiencyEnumeration energyEfficiencyScaleMax;
    /** Defines the energy efficiency Category (which could be either a rating out of range of values or a yes/no certification) for a product according to an international energy efficiency standard. */
    @JsonProperty("hasEnergyEfficiencyCategory")
    private EnergyEfficiencyEnumeration hasEnergyEfficiencyCategory;

    public EUEnergyEfficiencyEnumeration getEnergyEfficiencyScaleMin() { return energyEfficiencyScaleMin; }
    public void setEnergyEfficiencyScaleMin(EUEnergyEfficiencyEnumeration energyEfficiencyScaleMin) { this.energyEfficiencyScaleMin = energyEfficiencyScaleMin; }
    public EUEnergyEfficiencyEnumeration getEnergyEfficiencyScaleMax() { return energyEfficiencyScaleMax; }
    public void setEnergyEfficiencyScaleMax(EUEnergyEfficiencyEnumeration energyEfficiencyScaleMax) { this.energyEfficiencyScaleMax = energyEfficiencyScaleMax; }
    public EnergyEfficiencyEnumeration getHasEnergyEfficiencyCategory() { return hasEnergyEfficiencyCategory; }
    public void setHasEnergyEfficiencyCategory(EnergyEfficiencyEnumeration hasEnergyEfficiencyCategory) { this.hasEnergyEfficiencyCategory = hasEnergyEfficiencyCategory; }
}
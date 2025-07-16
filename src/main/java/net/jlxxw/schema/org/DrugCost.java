package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DrugCost extends MedicalEntity {
    public DrugCost() {
        setId("schema:DrugCost");
        setType("rdfs:Class");

    }

    /**
     * The location in which the status applies.
     */
    @JsonProperty("applicableLocation")
    private AdministrativeArea applicableLocation;
    /**
     * The cost per unit of the drug.
     */
    @JsonProperty("costPerUnit")
    private Double costPerUnit;
    /**
     * Additional details to capture the origin of the cost data. For example, 'Medicare Part B'.
     */
    @JsonProperty("costOrigin")
    private String costOrigin;
    /**
     * The category of cost, such as wholesale, retail, reimbursement cap, etc.
     */
    @JsonProperty("costCategory")
    private DrugCostCategory costCategory;
    /**
     * The currency (in 3-letter) of the drug cost. See: http://en.wikipedia.org/wiki/ISO_4217.
     */
    @JsonProperty("costCurrency")
    private String costCurrency;
    /**
     * The unit in which the drug is measured, e.g. '5 mg tablet'.
     */
    @JsonProperty("drugUnit")
    private String drugUnit;

    public AdministrativeArea getApplicableLocation() {
        return applicableLocation;
    }

    public void setApplicableLocation(AdministrativeArea applicableLocation) {
        this.applicableLocation = applicableLocation;
    }

    public Double getCostPerUnit() {
        return costPerUnit;
    }

    public void setCostPerUnit(Double costPerUnit) {
        this.costPerUnit = costPerUnit;
    }

    public String getCostOrigin() {
        return costOrigin;
    }

    public void setCostOrigin(String costOrigin) {
        this.costOrigin = costOrigin;
    }

    public DrugCostCategory getCostCategory() {
        return costCategory;
    }

    public void setCostCategory(DrugCostCategory costCategory) {
        this.costCategory = costCategory;
    }

    public String getCostCurrency() {
        return costCurrency;
    }

    public void setCostCurrency(String costCurrency) {
        this.costCurrency = costCurrency;
    }

    public String getDrugUnit() {
        return drugUnit;
    }

    public void setDrugUnit(String drugUnit) {
        this.drugUnit = drugUnit;
    }
}
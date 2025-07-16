package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BusinessAudience extends Audience {
    public BusinessAudience() {
    }

    /**
     * The number of employees in an organization, e.g. business.
     */
    @JsonProperty("numberOfEmployees")
    private QuantitativeValue numberOfEmployees;
    /**
     * The size of the business in annual revenue.
     */
    @JsonProperty("yearlyRevenue")
    private QuantitativeValue yearlyRevenue;
    /**
     * The age of the business.
     */
    @JsonProperty("yearsInOperation")
    private QuantitativeValue yearsInOperation;

    public QuantitativeValue getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(QuantitativeValue numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public QuantitativeValue getYearlyRevenue() {
        return yearlyRevenue;
    }

    public void setYearlyRevenue(QuantitativeValue yearlyRevenue) {
        this.yearlyRevenue = yearlyRevenue;
    }

    public QuantitativeValue getYearsInOperation() {
        return yearsInOperation;
    }

    public void setYearsInOperation(QuantitativeValue yearsInOperation) {
        this.yearsInOperation = yearsInOperation;
    }
}
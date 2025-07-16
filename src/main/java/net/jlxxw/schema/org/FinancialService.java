package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FinancialService extends LocalBusiness {
    public FinancialService() {
    }

    /**
     * Description of fees, commissions, and other terms applied either to a class of financial product, or by a financial service organization.
     */
    @JsonProperty("feesAndCommissionsSpecification")
    private String feesAndCommissionsSpecification;

    public String getFeesAndCommissionsSpecification() {
        return feesAndCommissionsSpecification;
    }

    public void setFeesAndCommissionsSpecification(String feesAndCommissionsSpecification) {
        this.feesAndCommissionsSpecification = feesAndCommissionsSpecification;
    }
}
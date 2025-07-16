package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class FinancialProduct extends Service {
    public FinancialProduct() {
}
    /** The interest rate, charged or paid, applicable to the financial product. Note: This is different from the calculated annualPercentageRate. */
    @JsonProperty("interestRate")
    private Double interestRate;
    /** Description of fees, commissions, and other terms applied either to a class of financial product, or by a financial service organization. */
    @JsonProperty("feesAndCommissionsSpecification")
    private String feesAndCommissionsSpecification;
    /** The annual rate that is charged for borrowing (or made by investing), expressed as a single percentage number that represents the actual yearly cost of funds over the term of a loan. This includes any fees or additional costs associated with the transaction. */
    @JsonProperty("annualPercentageRate")
    private Double annualPercentageRate;

    public Double getInterestRate() { return interestRate; }
    public void setInterestRate(Double interestRate) { this.interestRate = interestRate; }
    public String getFeesAndCommissionsSpecification() { return feesAndCommissionsSpecification; }
    public void setFeesAndCommissionsSpecification(String feesAndCommissionsSpecification) { this.feesAndCommissionsSpecification = feesAndCommissionsSpecification; }
    public Double getAnnualPercentageRate() { return annualPercentageRate; }
    public void setAnnualPercentageRate(Double annualPercentageRate) { this.annualPercentageRate = annualPercentageRate; }
}
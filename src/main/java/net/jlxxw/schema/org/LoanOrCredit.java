package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class LoanOrCredit extends FinancialProduct {
    public LoanOrCredit() {
}
    /** A form of paying back money previously borrowed from a lender. Repayment usually takes the form of periodic payments that normally include part principal plus interest in each payment. */
    @JsonProperty("loanRepaymentForm")
    private RepaymentSpecification loanRepaymentForm;
    /** The type of a loan or credit. */
    @JsonProperty("loanType")
    private String loanType;
    /** Whether the terms for payment of interest can be renegotiated during the life of the loan. */
    @JsonProperty("renegotiableLoan")
    private Boolean renegotiableLoan;
    /** The currency in which the monetary amount is expressed.\n\nUse standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217), e.g. "USD"; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies, e.g. "BTC"; well known names for [Local Exchange Trading Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types, e.g. "Ithaca HOUR". */
    @JsonProperty("currency")
    private String currency;
    /** Assets required to secure loan or credit repayments. It may take form of third party pledge, goods, financial instruments (cash, securities, etc.) */
    @JsonProperty("requiredCollateral")
    private String requiredCollateral;
    /** The amount of money. */
    @JsonProperty("amount")
    private Double amount;
    /** The period of time after any due date that the borrower has to fulfil its obligations before a default (failure to pay) is deemed to have occurred. */
    @JsonProperty("gracePeriod")
    private Duration gracePeriod;
    /** The only way you get the money back in the event of default is the security. Recourse is where you still have the opportunity to go back to the borrower for the rest of the money. */
    @JsonProperty("recourseLoan")
    private Boolean recourseLoan;
    /** The duration of the loan or credit agreement. */
    @JsonProperty("loanTerm")
    private QuantitativeValue loanTerm;

    public RepaymentSpecification getLoanRepaymentForm() { return loanRepaymentForm; }
    public void setLoanRepaymentForm(RepaymentSpecification loanRepaymentForm) { this.loanRepaymentForm = loanRepaymentForm; }
    public String getLoanType() { return loanType; }
    public void setLoanType(String loanType) { this.loanType = loanType; }
    public Boolean getRenegotiableLoan() { return renegotiableLoan; }
    public void setRenegotiableLoan(Boolean renegotiableLoan) { this.renegotiableLoan = renegotiableLoan; }
    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }
    public String getRequiredCollateral() { return requiredCollateral; }
    public void setRequiredCollateral(String requiredCollateral) { this.requiredCollateral = requiredCollateral; }
    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }
    public Duration getGracePeriod() { return gracePeriod; }
    public void setGracePeriod(Duration gracePeriod) { this.gracePeriod = gracePeriod; }
    public Boolean getRecourseLoan() { return recourseLoan; }
    public void setRecourseLoan(Boolean recourseLoan) { this.recourseLoan = recourseLoan; }
    public QuantitativeValue getLoanTerm() { return loanTerm; }
    public void setLoanTerm(QuantitativeValue loanTerm) { this.loanTerm = loanTerm; }
}
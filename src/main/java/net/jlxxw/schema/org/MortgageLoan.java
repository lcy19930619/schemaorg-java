package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class MortgageLoan extends LoanOrCredit {
    public MortgageLoan() {
}
    /** Whether borrower is a resident of the jurisdiction where the property is located. */
    @JsonProperty("domiciledMortgage")
    private Boolean domiciledMortgage;
    /** Amount of mortgage mandate that can be converted into a proper mortgage at a later stage. */
    @JsonProperty("loanMortgageMandateAmount")
    private MonetaryAmount loanMortgageMandateAmount;

    public Boolean getDomiciledMortgage() { return domiciledMortgage; }
    public void setDomiciledMortgage(Boolean domiciledMortgage) { this.domiciledMortgage = domiciledMortgage; }
    public MonetaryAmount getLoanMortgageMandateAmount() { return loanMortgageMandateAmount; }
    public void setLoanMortgageMandateAmount(MonetaryAmount loanMortgageMandateAmount) { this.loanMortgageMandateAmount = loanMortgageMandateAmount; }
}
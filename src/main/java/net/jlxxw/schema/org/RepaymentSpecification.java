package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RepaymentSpecification extends StructuredValue {
    public RepaymentSpecification() {
    }

    /**
     * The amount to be paid as a penalty in the event of early payment of the loan.
     */
    @JsonProperty("earlyPrepaymentPenalty")
    private MonetaryAmount earlyPrepaymentPenalty;
    /**
     * The amount of money to pay in a single payment.
     */
    @JsonProperty("loanPaymentAmount")
    private MonetaryAmount loanPaymentAmount;
    /**
     * Frequency of payments due, i.e. number of months between payments. This is defined as a frequency, i.e. the reciprocal of a period of time.
     */
    @JsonProperty("loanPaymentFrequency")
    private Double loanPaymentFrequency;
    /**
     * The number of payments contractually required at origination to repay the loan. For monthly paying loans this is the number of months from the contractual first payment date to the maturity date.
     */
    @JsonProperty("numberOfLoanPayments")
    private Double numberOfLoanPayments;

    public MonetaryAmount getEarlyPrepaymentPenalty() {
        return earlyPrepaymentPenalty;
    }

    public void setEarlyPrepaymentPenalty(MonetaryAmount earlyPrepaymentPenalty) {
        this.earlyPrepaymentPenalty = earlyPrepaymentPenalty;
    }

    public MonetaryAmount getLoanPaymentAmount() {
        return loanPaymentAmount;
    }

    public void setLoanPaymentAmount(MonetaryAmount loanPaymentAmount) {
        this.loanPaymentAmount = loanPaymentAmount;
    }

    public Double getLoanPaymentFrequency() {
        return loanPaymentFrequency;
    }

    public void setLoanPaymentFrequency(Double loanPaymentFrequency) {
        this.loanPaymentFrequency = loanPaymentFrequency;
    }

    public Double getNumberOfLoanPayments() {
        return numberOfLoanPayments;
    }

    public void setNumberOfLoanPayments(Double numberOfLoanPayments) {
        this.numberOfLoanPayments = numberOfLoanPayments;
    }
}
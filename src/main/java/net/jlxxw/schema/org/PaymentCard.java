package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class PaymentCard extends FinancialProduct {
    {
        setId("schema:PaymentCard");
        setType("rdfs:Class");

    }

    /**
     * A floor limit is the amount of money above which credit card transactions must be authorized.
     */
    @JsonProperty("floorLimit")
    private MonetaryAmount floorLimit;
    /**
     * The minimum payment is the lowest amount of money that one is required to pay on a credit card statement each month.
     */
    @JsonProperty("monthlyMinimumRepaymentAmount")
    private Double monthlyMinimumRepaymentAmount;
    /**
     * A cardholder benefit that pays the cardholder a small percentage of their net expenditures.
     */
    @JsonProperty("cashBack")
    private Double cashBack;
    /**
     * A secure method for consumers to purchase products or services via debit, credit or smartcards by using RFID or NFC technology.
     */
    @JsonProperty("contactlessPayment")
    private Boolean contactlessPayment;

    public MonetaryAmount getFloorLimit() {
        return floorLimit;
    }

    public void setFloorLimit(MonetaryAmount floorLimit) {
        this.floorLimit = floorLimit;
    }

    public Double getMonthlyMinimumRepaymentAmount() {
        return monthlyMinimumRepaymentAmount;
    }

    public void setMonthlyMinimumRepaymentAmount(Double monthlyMinimumRepaymentAmount) {
        this.monthlyMinimumRepaymentAmount = monthlyMinimumRepaymentAmount;
    }

    public Double getCashBack() {
        return cashBack;
    }

    public void setCashBack(Double cashBack) {
        this.cashBack = cashBack;
    }

    public Boolean getContactlessPayment() {
        return contactlessPayment;
    }

    public void setContactlessPayment(Boolean contactlessPayment) {
        this.contactlessPayment = contactlessPayment;
    }
}
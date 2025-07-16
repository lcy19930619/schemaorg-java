package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InvestmentOrDeposit extends FinancialProduct {
    public InvestmentOrDeposit() {
    }

    /**
     * The amount of money.
     */
    @JsonProperty("amount")
    private Double amount;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
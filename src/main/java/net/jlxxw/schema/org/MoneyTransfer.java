package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MoneyTransfer extends TransferAction {
    public MoneyTransfer() {
    }

    /**
     * The amount of money.
     */
    @JsonProperty("amount")
    private Double amount;
    /**
     * A bank or bank’s branch, financial institution or international financial institution operating the beneficiary’s bank account or releasing funds for the beneficiary.
     */
    @JsonProperty("beneficiaryBank")
    private String beneficiaryBank;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getBeneficiaryBank() {
        return beneficiaryBank;
    }

    public void setBeneficiaryBank(String beneficiaryBank) {
        this.beneficiaryBank = beneficiaryBank;
    }
}
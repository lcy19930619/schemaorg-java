package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class InvestmentOrDeposit extends FinancialProduct {
    public InvestmentOrDeposit() {
}
    /** The amount of money. */
    @JsonProperty("amount")
    private Double amount;

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }
}
package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class BankAccount extends FinancialProduct {
    public BankAccount() {
}
    /** A minimum amount that has to be paid in every month. */
    @JsonProperty("accountMinimumInflow")
    private MonetaryAmount accountMinimumInflow;
    /** An overdraft is an extension of credit from a lending institution when an account reaches zero. An overdraft allows the individual to continue withdrawing money even if the account has no funds in it. Basically the bank allows people to borrow a set amount of money. */
    @JsonProperty("accountOverdraftLimit")
    private MonetaryAmount accountOverdraftLimit;
    /** The type of a bank account. */
    @JsonProperty("bankAccountType")
    private String bankAccountType;

    public MonetaryAmount getAccountMinimumInflow() { return accountMinimumInflow; }
    public void setAccountMinimumInflow(MonetaryAmount accountMinimumInflow) { this.accountMinimumInflow = accountMinimumInflow; }
    public MonetaryAmount getAccountOverdraftLimit() { return accountOverdraftLimit; }
    public void setAccountOverdraftLimit(MonetaryAmount accountOverdraftLimit) { this.accountOverdraftLimit = accountOverdraftLimit; }
    public String getBankAccountType() { return bankAccountType; }
    public void setBankAccountType(String bankAccountType) { this.bankAccountType = bankAccountType; }
}
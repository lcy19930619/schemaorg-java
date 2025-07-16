package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class MonetaryGrant extends Grant {
    {
        setId("schema:MonetaryGrant");
        setType("rdfs:Class");

    }

    /**
     * The amount of money.
     */
    @JsonProperty("amount")
    private Double amount;
    /**
     * A person or organization that supports (sponsors) something through some kind of financial contribution.
     */
    @JsonProperty("funder")
    private List<AbstractSchema> funder;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public List<AbstractSchema> getFunder() {
        return funder;
    }

    public void setFunder(List<AbstractSchema> funder) {
        this.funder = funder;
    }
}
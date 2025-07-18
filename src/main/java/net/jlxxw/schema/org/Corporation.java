package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class Corporation extends Organization {
    {
        setId("schema:Corporation");
        setType("rdfs:Class");

    }

    /**
     * The exchange traded instrument associated with a Corporation object. The tickerSymbol is expressed as an exchange and an instrument name separated by a space character. For the exchange component of the tickerSymbol attribute, we recommend using the controlled vocabulary of Market Identifier Codes (MIC) specified in ISO 15022.
     */
    @JsonProperty("tickerSymbol")
    private String tickerSymbol;

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }
}
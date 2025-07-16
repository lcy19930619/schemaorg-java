package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MonetaryAmount extends StructuredValue {
    public MonetaryAmount() {
        setId("schema:MonetaryAmount");
        setType("rdfs:Class");

    }

    /**
     * The value of a [[QuantitativeValue]] (including [[Observation]]) or property value node.\n\n* For [[QuantitativeValue]] and [[MonetaryAmount]], the recommended type for values is 'Number'.\n* For [[PropertyValue]], it can be 'Text', 'Number', 'Boolean', or 'StructuredValue'.\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     */
    @JsonProperty("value")
    private String value;
    /**
     * The date when the item becomes valid.
     */
    @JsonProperty("validFrom")
    private java.time.LocalDate validFrom;
    /**
     * The currency in which the monetary amount is expressed.\n\nUse standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217), e.g. "USD"; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies, e.g. "BTC"; well known names for [Local Exchange Trading Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types, e.g. "Ithaca HOUR".
     */
    @JsonProperty("currency")
    private String currency;
    /**
     * The lower value of some characteristic or property.
     */
    @JsonProperty("minValue")
    private Double minValue;
    /**
     * The upper value of some characteristic or property.
     */
    @JsonProperty("maxValue")
    private Double maxValue;
    /**
     * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
     */
    @JsonProperty("validThrough")
    private java.time.LocalDate validThrough;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public java.time.LocalDate getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(java.time.LocalDate validFrom) {
        this.validFrom = validFrom;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getMinValue() {
        return minValue;
    }

    public void setMinValue(Double minValue) {
        this.minValue = minValue;
    }

    public Double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Double maxValue) {
        this.maxValue = maxValue;
    }

    public java.time.LocalDate getValidThrough() {
        return validThrough;
    }

    public void setValidThrough(java.time.LocalDate validThrough) {
        this.validThrough = validThrough;
    }
}
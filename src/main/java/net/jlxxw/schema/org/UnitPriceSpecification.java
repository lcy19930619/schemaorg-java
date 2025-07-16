package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UnitPriceSpecification extends PriceSpecification {
    public UnitPriceSpecification() {
    }

    /**
     * Identifies a price component (for example, a line item on an invoice), part of the total price for an offer.
     */
    @JsonProperty("priceComponentType")
    private PriceComponentTypeEnumeration priceComponentType;
    /**
     * The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon.
     */
    @JsonProperty("unitCode")
    private String unitCode;
    /**
     * This property specifies the minimal quantity and rounding increment that will be the basis for the billing. The unit of measurement is specified by the unitCode property.
     */
    @JsonProperty("billingIncrement")
    private Double billingIncrement;
    /**
     * Specifies after how much time this price (or price component) becomes valid and billing starts. Can be used, for example, to model a price increase after the first year of a subscription. The unit of measurement is specified by the unitCode property.
     */
    @JsonProperty("billingStart")
    private Double billingStart;
    /**
     * Specifies for how long this price (or price component) will be billed. Can be used, for example, to model the contractual duration of a subscription or payment plan. Type can be either a Duration or a Number (in which case the unit of measurement, for example month, is specified by the unitCode property).
     */
    @JsonProperty("billingDuration")
    private Double billingDuration;
    /**
     * Defines the type of a price specified for an offered product, for example a list price, a (temporary) sale price or a manufacturer suggested retail price. If multiple prices are specified for an offer the [[priceType]] property can be used to identify the type of each such specified price. The value of priceType can be specified as a value from enumeration PriceTypeEnumeration or as a free form text string for price types that are not already predefined in PriceTypeEnumeration.
     */
    @JsonProperty("priceType")
    private String priceType;
    /**
     * A string or text indicating the unit of measurement. Useful if you cannot provide a standard unit code for
     * <a href='unitCode'>unitCode</a>.
     */
    @JsonProperty("unitText")
    private String unitText;
    /**
     * The reference quantity for which a certain price applies, e.g. 1 EUR per 4 kWh of electricity. This property is a replacement for unitOfMeasurement for the advanced cases where the price does not relate to a standard unit.
     */
    @JsonProperty("referenceQuantity")
    private QuantitativeValue referenceQuantity;

    public PriceComponentTypeEnumeration getPriceComponentType() {
        return priceComponentType;
    }

    public void setPriceComponentType(PriceComponentTypeEnumeration priceComponentType) {
        this.priceComponentType = priceComponentType;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public Double getBillingIncrement() {
        return billingIncrement;
    }

    public void setBillingIncrement(Double billingIncrement) {
        this.billingIncrement = billingIncrement;
    }

    public Double getBillingStart() {
        return billingStart;
    }

    public void setBillingStart(Double billingStart) {
        this.billingStart = billingStart;
    }

    public Double getBillingDuration() {
        return billingDuration;
    }

    public void setBillingDuration(Double billingDuration) {
        this.billingDuration = billingDuration;
    }

    public String getPriceType() {
        return priceType;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    public String getUnitText() {
        return unitText;
    }

    public void setUnitText(String unitText) {
        this.unitText = unitText;
    }

    public QuantitativeValue getReferenceQuantity() {
        return referenceQuantity;
    }

    public void setReferenceQuantity(QuantitativeValue referenceQuantity) {
        this.referenceQuantity = referenceQuantity;
    }
}
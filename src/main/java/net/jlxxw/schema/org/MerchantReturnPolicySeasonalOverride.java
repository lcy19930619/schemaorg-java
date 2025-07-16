package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MerchantReturnPolicySeasonalOverride extends Intangible {
    public MerchantReturnPolicySeasonalOverride() {
        setId("schema:MerchantReturnPolicySeasonalOverride");
        setType("rdfs:Class");

    }

    /**
     * A refund type, from an enumerated list.
     */
    @JsonProperty("refundType")
    private RefundTypeEnumeration refundType;
    /**
     * Amount of shipping costs for product returns (for any reason). Applicable when property [[returnFees]] equals [[ReturnShippingFees]].
     */
    @JsonProperty("returnShippingFeesAmount")
    private MonetaryAmount returnShippingFeesAmount;
    /**
     * The start date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
     */
    @JsonProperty("startDate")
    private java.time.LocalDate startDate;
    /**
     * The type of return method offered, specified from an enumeration.
     */
    @JsonProperty("returnMethod")
    private ReturnMethodEnumeration returnMethod;
    /**
     * Use [[MonetaryAmount]] to specify a fixed restocking fee for product returns, or use [[Number]] to specify a percentage of the product price paid by the customer.
     */
    @JsonProperty("restockingFee")
    private Double restockingFee;
    /**
     * The type of return fees for purchased products (for any return reason).
     */
    @JsonProperty("returnFees")
    private ReturnFeesEnumeration returnFees;
    /**
     * Specifies an applicable return policy (from an enumeration).
     */
    @JsonProperty("returnPolicyCategory")
    private MerchantReturnEnumeration returnPolicyCategory;
    /**
     * Specifies either a fixed return date or the number of days (from the delivery date) that a product can be returned. Used when the [[returnPolicyCategory]] property is specified as [[MerchantReturnFiniteReturnWindow]].
     */
    @JsonProperty("merchantReturnDays")
    private java.time.LocalDate merchantReturnDays;
    /**
     * The end date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
     */
    @JsonProperty("endDate")
    private java.time.LocalDate endDate;

    public RefundTypeEnumeration getRefundType() {
        return refundType;
    }

    public void setRefundType(RefundTypeEnumeration refundType) {
        this.refundType = refundType;
    }

    public MonetaryAmount getReturnShippingFeesAmount() {
        return returnShippingFeesAmount;
    }

    public void setReturnShippingFeesAmount(MonetaryAmount returnShippingFeesAmount) {
        this.returnShippingFeesAmount = returnShippingFeesAmount;
    }

    public java.time.LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(java.time.LocalDate startDate) {
        this.startDate = startDate;
    }

    public ReturnMethodEnumeration getReturnMethod() {
        return returnMethod;
    }

    public void setReturnMethod(ReturnMethodEnumeration returnMethod) {
        this.returnMethod = returnMethod;
    }

    public Double getRestockingFee() {
        return restockingFee;
    }

    public void setRestockingFee(Double restockingFee) {
        this.restockingFee = restockingFee;
    }

    public ReturnFeesEnumeration getReturnFees() {
        return returnFees;
    }

    public void setReturnFees(ReturnFeesEnumeration returnFees) {
        this.returnFees = returnFees;
    }

    public MerchantReturnEnumeration getReturnPolicyCategory() {
        return returnPolicyCategory;
    }

    public void setReturnPolicyCategory(MerchantReturnEnumeration returnPolicyCategory) {
        this.returnPolicyCategory = returnPolicyCategory;
    }

    public java.time.LocalDate getMerchantReturnDays() {
        return merchantReturnDays;
    }

    public void setMerchantReturnDays(java.time.LocalDate merchantReturnDays) {
        this.merchantReturnDays = merchantReturnDays;
    }

    public java.time.LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(java.time.LocalDate endDate) {
        this.endDate = endDate;
    }
}
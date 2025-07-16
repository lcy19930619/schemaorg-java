package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MerchantReturnPolicy extends Intangible {
    public MerchantReturnPolicy() {
    }

    /**
     * The method (from an enumeration) by which the customer obtains a return shipping label for a product returned for any reason.
     */
    @JsonProperty("returnLabelSource")
    private ReturnLabelSourceEnumeration returnLabelSource;
    /**
     * The method (from an enumeration) by which the customer obtains a return shipping label for a product returned due to customer remorse.
     */
    @JsonProperty("customerRemorseReturnLabelSource")
    private ReturnLabelSourceEnumeration customerRemorseReturnLabelSource;
    /**
     * A property-value pair representing an additional characteristic of the entity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.\n\nNote: Publishers should be aware that applications designed to use specific schema.org properties (e.g. https://schema.org/width, https://schema.org/color, https://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
     */
    @JsonProperty("additionalProperty")
    private PropertyValue additionalProperty;
    /**
     * Are in-store returns offered? (For more advanced return methods use the [[returnMethod]] property.)
     */
    @JsonProperty("inStoreReturnsOffered")
    private Boolean inStoreReturnsOffered;
    /**
     * Amount of shipping costs for defect product returns. Applicable when property [[itemDefectReturnFees]] equals [[ReturnShippingFees]].
     */
    @JsonProperty("itemDefectReturnShippingFeesAmount")
    private MonetaryAmount itemDefectReturnShippingFeesAmount;
    /**
     * A refund type, from an enumerated list.
     */
    @JsonProperty("refundType")
    private RefundTypeEnumeration refundType;
    /**
     * The membership program tier an Offer (or a PriceSpecification, OfferShippingDetails, or MerchantReturnPolicy under an Offer) is valid for.
     */
    @JsonProperty("validForMemberTier")
    private MemberProgramTier validForMemberTier;
    /**
     * The method (from an enumeration) by which the customer obtains a return shipping label for a defect product.
     */
    @JsonProperty("itemDefectReturnLabelSource")
    private ReturnLabelSourceEnumeration itemDefectReturnLabelSource;
    /**
     * Specifies a Web page or service by URL, for product returns.
     */
    @JsonProperty("merchantReturnLink")
    private String merchantReturnLink;
    /**
     * Amount of shipping costs for product returns (for any reason). Applicable when property [[returnFees]] equals [[ReturnShippingFees]].
     */
    @JsonProperty("returnShippingFeesAmount")
    private MonetaryAmount returnShippingFeesAmount;
    /**
     * The type of return method offered, specified from an enumeration.
     */
    @JsonProperty("returnMethod")
    private ReturnMethodEnumeration returnMethod;
    /**
     * The amount of shipping costs if a product is returned due to customer remorse. Applicable when property [[customerRemorseReturnFees]] equals [[ReturnShippingFees]].
     */
    @JsonProperty("customerRemorseReturnShippingFeesAmount")
    private MonetaryAmount customerRemorseReturnShippingFeesAmount;
    /**
     * Use [[MonetaryAmount]] to specify a fixed restocking fee for product returns, or use [[Number]] to specify a percentage of the product price paid by the customer.
     */
    @JsonProperty("restockingFee")
    private Double restockingFee;
    /**
     * The type of return fees for returns of defect products.
     */
    @JsonProperty("itemDefectReturnFees")
    private ReturnFeesEnumeration itemDefectReturnFees;
    /**
     * Seasonal override of a return policy.
     */
    @JsonProperty("returnPolicySeasonalOverride")
    private MerchantReturnPolicySeasonalOverride returnPolicySeasonalOverride;
    /**
     * A predefined value from OfferItemCondition specifying the condition of the product or service, or the products or services included in the offer. Also used for product return policies to specify the condition of products accepted for returns.
     */
    @JsonProperty("itemCondition")
    private OfferItemCondition itemCondition;
    /**
     * A country where a particular merchant return policy applies to, for example the two-letter ISO 3166-1 alpha-2 country code.
     */
    @JsonProperty("applicableCountry")
    private String applicableCountry;
    /**
     * The type of return fees if the product is returned due to customer remorse.
     */
    @JsonProperty("customerRemorseReturnFees")
    private ReturnFeesEnumeration customerRemorseReturnFees;
    /**
     * The country where the product has to be sent to for returns, for example "Ireland" using the [[name]] property of [[Country]]. You can also provide the two-letter [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1). Note that this can be different from the country where the product was originally shipped from or sent to.
     */
    @JsonProperty("returnPolicyCountry")
    private String returnPolicyCountry;
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

    public ReturnLabelSourceEnumeration getReturnLabelSource() {
        return returnLabelSource;
    }

    public void setReturnLabelSource(ReturnLabelSourceEnumeration returnLabelSource) {
        this.returnLabelSource = returnLabelSource;
    }

    public ReturnLabelSourceEnumeration getCustomerRemorseReturnLabelSource() {
        return customerRemorseReturnLabelSource;
    }

    public void setCustomerRemorseReturnLabelSource(ReturnLabelSourceEnumeration customerRemorseReturnLabelSource) {
        this.customerRemorseReturnLabelSource = customerRemorseReturnLabelSource;
    }

    public PropertyValue getAdditionalProperty() {
        return additionalProperty;
    }

    public void setAdditionalProperty(PropertyValue additionalProperty) {
        this.additionalProperty = additionalProperty;
    }

    public Boolean getInStoreReturnsOffered() {
        return inStoreReturnsOffered;
    }

    public void setInStoreReturnsOffered(Boolean inStoreReturnsOffered) {
        this.inStoreReturnsOffered = inStoreReturnsOffered;
    }

    public MonetaryAmount getItemDefectReturnShippingFeesAmount() {
        return itemDefectReturnShippingFeesAmount;
    }

    public void setItemDefectReturnShippingFeesAmount(MonetaryAmount itemDefectReturnShippingFeesAmount) {
        this.itemDefectReturnShippingFeesAmount = itemDefectReturnShippingFeesAmount;
    }

    public RefundTypeEnumeration getRefundType() {
        return refundType;
    }

    public void setRefundType(RefundTypeEnumeration refundType) {
        this.refundType = refundType;
    }

    public MemberProgramTier getValidForMemberTier() {
        return validForMemberTier;
    }

    public void setValidForMemberTier(MemberProgramTier validForMemberTier) {
        this.validForMemberTier = validForMemberTier;
    }

    public ReturnLabelSourceEnumeration getItemDefectReturnLabelSource() {
        return itemDefectReturnLabelSource;
    }

    public void setItemDefectReturnLabelSource(ReturnLabelSourceEnumeration itemDefectReturnLabelSource) {
        this.itemDefectReturnLabelSource = itemDefectReturnLabelSource;
    }

    public String getMerchantReturnLink() {
        return merchantReturnLink;
    }

    public void setMerchantReturnLink(String merchantReturnLink) {
        this.merchantReturnLink = merchantReturnLink;
    }

    public MonetaryAmount getReturnShippingFeesAmount() {
        return returnShippingFeesAmount;
    }

    public void setReturnShippingFeesAmount(MonetaryAmount returnShippingFeesAmount) {
        this.returnShippingFeesAmount = returnShippingFeesAmount;
    }

    public ReturnMethodEnumeration getReturnMethod() {
        return returnMethod;
    }

    public void setReturnMethod(ReturnMethodEnumeration returnMethod) {
        this.returnMethod = returnMethod;
    }

    public MonetaryAmount getCustomerRemorseReturnShippingFeesAmount() {
        return customerRemorseReturnShippingFeesAmount;
    }

    public void setCustomerRemorseReturnShippingFeesAmount(MonetaryAmount customerRemorseReturnShippingFeesAmount) {
        this.customerRemorseReturnShippingFeesAmount = customerRemorseReturnShippingFeesAmount;
    }

    public Double getRestockingFee() {
        return restockingFee;
    }

    public void setRestockingFee(Double restockingFee) {
        this.restockingFee = restockingFee;
    }

    public ReturnFeesEnumeration getItemDefectReturnFees() {
        return itemDefectReturnFees;
    }

    public void setItemDefectReturnFees(ReturnFeesEnumeration itemDefectReturnFees) {
        this.itemDefectReturnFees = itemDefectReturnFees;
    }

    public MerchantReturnPolicySeasonalOverride getReturnPolicySeasonalOverride() {
        return returnPolicySeasonalOverride;
    }

    public void setReturnPolicySeasonalOverride(MerchantReturnPolicySeasonalOverride returnPolicySeasonalOverride) {
        this.returnPolicySeasonalOverride = returnPolicySeasonalOverride;
    }

    public OfferItemCondition getItemCondition() {
        return itemCondition;
    }

    public void setItemCondition(OfferItemCondition itemCondition) {
        this.itemCondition = itemCondition;
    }

    public String getApplicableCountry() {
        return applicableCountry;
    }

    public void setApplicableCountry(String applicableCountry) {
        this.applicableCountry = applicableCountry;
    }

    public ReturnFeesEnumeration getCustomerRemorseReturnFees() {
        return customerRemorseReturnFees;
    }

    public void setCustomerRemorseReturnFees(ReturnFeesEnumeration customerRemorseReturnFees) {
        this.customerRemorseReturnFees = customerRemorseReturnFees;
    }

    public String getReturnPolicyCountry() {
        return returnPolicyCountry;
    }

    public void setReturnPolicyCountry(String returnPolicyCountry) {
        this.returnPolicyCountry = returnPolicyCountry;
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
}
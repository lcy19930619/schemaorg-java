package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Offer extends Intangible {
    public Offer() {
    }

    /**
     * Review of the item.
     */
    @JsonProperty("reviews")
    private AbstractSchema reviews;
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    @JsonProperty("aggregateRating")
    private AbstractSchema aggregateRating;
    /**
     * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
     */
    @JsonProperty("eligibleQuantity")
    private QuantitativeValue eligibleQuantity;
    /**
     * The serial number or any alphanumeric identifier of a particular product. When attached to an offer, it is a shortcut for the serial number of the product included in the offer.
     */
    @JsonProperty("serialNumber")
    private String serialNumber;
    /**
     * The availability of this item&#x2014;for example In stock, Out of stock, Pre-order, etc.
     */
    @JsonProperty("availability")
    private ItemAvailability availability;
    /**
     * One or more detailed price specifications, indicating the unit price and delivery or payment charges.
     */
    @JsonProperty("priceSpecification")
    private AbstractSchema priceSpecification;
    /**
     * A property-value pair representing an additional characteristic of the entity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.\n\nNote: Publishers should be aware that applications designed to use specific schema.org properties (e.g. https://schema.org/width, https://schema.org/color, https://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
     */
    @JsonProperty("additionalProperty")
    private PropertyValue additionalProperty;
    /**
     * A URL template (RFC 6570) for a checkout page for an offer. This approach allows merchants to specify a URL for online checkout of the offered product, by interpolating parameters such as the logged in user ID, product ID, quantity, discount code etc. Parameter naming and standardization are not specified here.
     */
    @JsonProperty("checkoutPageURLTemplate")
    private String checkoutPageURLTemplate;
    /**
     * The GTIN-14 code of the product, or the product to which the offer refers. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
     */
    @JsonProperty("gtin14")
    private String gtin14;
    /**
     * A measurement of an item, For example, the inseam of pants, the wheel size of a bicycle, the gauge of a screw, or the carbon footprint measured for certification by an authority. Usually an exact measurement, but can also be a range of measurements for adjustable products, for example belts and ski bindings.
     */
    @JsonProperty("hasMeasurement")
    private QuantitativeValue hasMeasurement;
    /**
     * The date when the item becomes valid.
     */
    @JsonProperty("validFrom")
    private java.time.LocalDate validFrom;
    /**
     * An additional offer that can only be obtained in combination with the first base offer (e.g. supplements and extensions that are available for a surcharge).
     */
    @JsonProperty("addOn")
    private Offer addOn;
    /**
     * The duration for which the given offer is valid.
     */
    @JsonProperty("eligibleDuration")
    private QuantitativeValue eligibleDuration;
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.\n\nSee also [[ineligibleRegion]].
     */
    @JsonProperty("eligibleRegion")
    private String eligibleRegion;
    /**
     * Indicates whether this content is family friendly.
     */
    @JsonProperty("isFamilyFriendly")
    private Boolean isFamilyFriendly;
    /**
     * The GTIN-13 code of the product, or the product to which the offer refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former 12-digit UPC codes can be converted into a GTIN-13 code by simply adding a preceding zero. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
     */
    @JsonProperty("gtin13")
    private String gtin13;
    /**
     * The geographic area where a service or offered item is provided.
     */
    @JsonProperty("areaServed")
    private String areaServed;
    /**
     * The GTIN-8 code of the product, or the product to which the offer refers. This code is also known as EAN/UCC-8 or 8-digit EAN. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
     */
    @JsonProperty("gtin8")
    private String gtin8;
    /**
     * An item being offered (or demanded). The transactional nature of the offer or demand is documented using [[businessFunction]], e.g. sell, lease etc. While several common expected types are listed explicitly in this definition, others can be used. Using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @JsonProperty("itemOffered")
    private List<AbstractSchema> itemOffered;
    /**
     * Indicates information about the shipping policies and options associated with an [[Offer]].
     */
    @JsonProperty("shippingDetails")
    private OfferShippingDetails shippingDetails;
    /**
     * The currency of the price, or a price component when attached to [[PriceSpecification]] and its subtypes.\n\nUse standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217), e.g. "USD"; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies, e.g. "BTC"; well known names for [Local Exchange Trading Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types, e.g. "Ithaca HOUR".
     */
    @JsonProperty("priceCurrency")
    private String priceCurrency;
    /**
     * The membership program tier an Offer (or a PriceSpecification, OfferShippingDetails, or MerchantReturnPolicy under an Offer) is valid for.
     */
    @JsonProperty("validForMemberTier")
    private MemberProgramTier validForMemberTier;
    /**
     * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
     */
    @JsonProperty("seller")
    private List<AbstractSchema> seller;
    /**
     * Used to tag an item to be intended or suitable for consumption or use by adults only.
     */
    @JsonProperty("hasAdultConsideration")
    private AdultOrientedEnumeration hasAdultConsideration;
    /**
     * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers.
     */
    @JsonProperty("sku")
    private String sku;
    /**
     * The GTIN-12 code of the product, or the product to which the offer refers. The GTIN-12 is the 12-digit GS1 Identification Key composed of a U.P.C. Company Prefix, Item Reference, and Check Digit used to identify trade items. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
     */
    @JsonProperty("gtin12")
    private String gtin12;
    /**
     * The delivery method(s) available for this offer.
     */
    @JsonProperty("availableDeliveryMethod")
    private AbstractSchema availableDeliveryMethod;
    /**
     * The payment method(s) that are accepted in general by an organization, or for some specific demand or offer.
     */
    @JsonProperty("acceptedPaymentMethod")
    private String acceptedPaymentMethod;
    /**
     * This links to a node or nodes indicating the exact quantity of the products included in  an [[Offer]] or [[ProductCollection]].
     */
    @JsonProperty("includesObject")
    private TypeAndQuantityNode includesObject;
    /**
     * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.\n\nUsage guidelines:\n\n* Use the [[priceCurrency]] property (with standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217), e.g. "USD"; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies, e.g. "BTC"; well known names for [Local Exchange Trading Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types, e.g. "Ithaca HOUR") instead of including [ambiguous symbols](http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign) such as '$' in the value.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.\n* Note that both [RDFa](http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute) and Microdata syntax allow the use of a "content=" attribute for publishing simple machine-readable values alongside more human-friendly formatting.\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similar Unicode symbols.
     */
    @JsonProperty("price")
    private String price;
    /**
     * A pointer to the organization or person making the offer.
     */
    @JsonProperty("offeredBy")
    private List<AbstractSchema> offeredBy;
    /**
     * The beginning of the availability of the product or service included in the offer.
     */
    @JsonProperty("availabilityStarts")
    private java.time.LocalDate availabilityStarts;
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @JsonProperty("category")
    private String category;
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.\n\nSee also [[eligibleRegion]].
     */
    @JsonProperty("ineligibleRegion")
    private String ineligibleRegion;
    /**
     * An Amazon Standard Identification Number (ASIN) is a 10-character alphanumeric unique identifier assigned by Amazon.com and its partners for product identification within the Amazon organization (summary from [Wikipedia](https://en.wikipedia.org/wiki/Amazon_Standard_Identification_Number)'s article).
     * <p>
     * Note also that this is a definition for how to include ASINs in Schema.org data, and not a definition of ASINs in general - see documentation from Amazon for authoritative details.
     * ASINs are most commonly encoded as text strings, but the [asin] property supports URL/URI as potential values too.
     */
    @JsonProperty("asin")
    private String asin;
    /**
     * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
     */
    @JsonProperty("validThrough")
    private java.time.LocalDate validThrough;
    /**
     * The place(s) from which the offer can be obtained (e.g. store locations).
     */
    @JsonProperty("availableAtOrFrom")
    private Place availableAtOrFrom;
    /**
     * A predefined value from OfferItemCondition specifying the condition of the product or service, or the products or services included in the offer. Also used for product return policies to specify the condition of products accepted for returns.
     */
    @JsonProperty("itemCondition")
    private OfferItemCondition itemCondition;
    /**
     * Specifies a MerchantReturnPolicy that may be applicable.
     */
    @JsonProperty("hasMerchantReturnPolicy")
    private MerchantReturnPolicy hasMerchantReturnPolicy;
    /**
     * Length of the lease for some [[Accommodation]], either particular to some [[Offer]] or in some cases intrinsic to the property.
     */
    @JsonProperty("leaseLength")
    private List<AbstractSchema> leaseLength;
    /**
     * The date after which the price is no longer available.
     */
    @JsonProperty("priceValidUntil")
    private java.time.LocalDate priceValidUntil;
    /**
     * The <a href="https://www.gs1.org/standards/gs1-digital-link">GS1 digital link</a> associated with the object. This URL should conform to the particular requirements of digital links. The link should only contain the Application Identifiers (AIs) that are relevant for the entity being annotated, for instance a [[Product]] or an [[Organization]], and for the correct granularity. In particular, for products:<ul><li>A Digital Link that contains a serial number (AI <code>21</code>) should only be present on instances of [[IndividualProduct]]</li><li>A Digital Link that contains a lot number (AI <code>10</code>) should be annotated as [[SomeProduct]] if only products from that lot are sold, or [[IndividualProduct]] if there is only a specific product.</li><li>A Digital Link that contains a global model number (AI <code>8013</code>)  should be attached to a [[Product]] or a [[ProductModel]].</li></ul> Other item types should be adapted similarly.
     */
    @JsonProperty("hasGS1DigitalLink")
    private String hasGS1DigitalLink;
    /**
     * The [[mobileUrl]] property is provided for specific situations in which data consumers need to determine whether one of several provided URLs is a dedicated 'mobile site'.
     * <p>
     * To discourage over-use, and reflecting intial usecases, the property is expected only on [[Product]] and [[Offer]], rather than [[Thing]]. The general trend in web technology is towards [responsive design](https://en.wikipedia.org/wiki/Responsive_web_design) in which content can be flexibly adapted to a wide range of browsing environments. Pages and sites referenced with the long-established [[url]] property should ideally also be usable on a wide variety of devices, including mobile phones. In most cases, it would be pointless and counter productive to attempt to update all [[url]] markup to use [[mobileUrl]] for more mobile-oriented pages. The property is intended for the case when items (primarily [[Product]] and [[Offer]]) have extra URLs hosted on an additional "mobile site" alongside the main one. It should not be taken as an endorsement of this publication style.
     */
    @JsonProperty("mobileUrl")
    private String mobileUrl;
    /**
     * A Global Trade Item Number ([GTIN](https://www.gs1.org/standards/id-keys/gtin)). GTINs identify trade items, including products and services, using numeric identification codes.
     * <p>
     * A correct [[gtin]] value should be a valid GTIN, which means that it should be an all-numeric string of either 8, 12, 13 or 14 digits, or a "GS1 Digital Link" URL based on such a string. The numeric component should also have a [valid GS1 check digit](https://www.gs1.org/services/check-digit-calculator) and meet the other rules for valid GTINs. See also [GS1's GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) and [Wikipedia](https://en.wikipedia.org/wiki/Global_Trade_Item_Number) for more details. Left-padding of the gtin values is not required or encouraged. The [[gtin]] property generalizes the earlier [[gtin8]], [[gtin12]], [[gtin13]], and [[gtin14]] properties.
     * <p>
     * The GS1 [digital link specifications](https://www.gs1.org/standards/Digital-Link/) expresses GTINs as URLs (URIs, IRIs, etc.).
     * Digital Links should be populated into the [[hasGS1DigitalLink]] attribute.
     * <p>
     * Note also that this is a definition for how to include GTINs in Schema.org data, and not a definition of GTINs in general - see the GS1 documentation for authoritative details.
     */
    @JsonProperty("gtin")
    private String gtin;
    /**
     * The end of the availability of the product or service included in the offer.
     */
    @JsonProperty("availabilityEnds")
    private java.time.LocalDate availabilityEnds;
    /**
     * The warranty promise(s) included in the offer.
     */
    @JsonProperty("warranty")
    private WarrantyPromise warranty;
    /**
     * The current approximate inventory level for the item or items.
     */
    @JsonProperty("inventoryLevel")
    private QuantitativeValue inventoryLevel;
    /**
     * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
     */
    @JsonProperty("eligibleTransactionVolume")
    private AbstractSchema eligibleTransactionVolume;
    /**
     * The amount of time that is required between accepting the offer and the actual usage of the resource or service.
     */
    @JsonProperty("advanceBookingRequirement")
    private QuantitativeValue advanceBookingRequirement;
    /**
     * A review of the item.
     */
    @JsonProperty("review")
    private AbstractSchema review;
    /**
     * The typical delay between the receipt of the order and the goods either leaving the warehouse or being prepared for pickup, in case the delivery method is on site pickup.
     */
    @JsonProperty("deliveryLeadTime")
    private QuantitativeValue deliveryLeadTime;
    /**
     * The type(s) of customers for which the given offer is valid.
     */
    @JsonProperty("eligibleCustomerType")
    private BusinessEntityType eligibleCustomerType;
    /**
     * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
     */
    @JsonProperty("mpn")
    private String mpn;

    public AbstractSchema getReviews() {
        return reviews;
    }

    public void setReviews(AbstractSchema reviews) {
        this.reviews = reviews;
    }

    public AbstractSchema getAggregateRating() {
        return aggregateRating;
    }

    public void setAggregateRating(AbstractSchema aggregateRating) {
        this.aggregateRating = aggregateRating;
    }

    public QuantitativeValue getEligibleQuantity() {
        return eligibleQuantity;
    }

    public void setEligibleQuantity(QuantitativeValue eligibleQuantity) {
        this.eligibleQuantity = eligibleQuantity;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public ItemAvailability getAvailability() {
        return availability;
    }

    public void setAvailability(ItemAvailability availability) {
        this.availability = availability;
    }

    public AbstractSchema getPriceSpecification() {
        return priceSpecification;
    }

    public void setPriceSpecification(AbstractSchema priceSpecification) {
        this.priceSpecification = priceSpecification;
    }

    public PropertyValue getAdditionalProperty() {
        return additionalProperty;
    }

    public void setAdditionalProperty(PropertyValue additionalProperty) {
        this.additionalProperty = additionalProperty;
    }

    public String getCheckoutPageURLTemplate() {
        return checkoutPageURLTemplate;
    }

    public void setCheckoutPageURLTemplate(String checkoutPageURLTemplate) {
        this.checkoutPageURLTemplate = checkoutPageURLTemplate;
    }

    public String getGtin14() {
        return gtin14;
    }

    public void setGtin14(String gtin14) {
        this.gtin14 = gtin14;
    }

    public QuantitativeValue getHasMeasurement() {
        return hasMeasurement;
    }

    public void setHasMeasurement(QuantitativeValue hasMeasurement) {
        this.hasMeasurement = hasMeasurement;
    }

    public java.time.LocalDate getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(java.time.LocalDate validFrom) {
        this.validFrom = validFrom;
    }

    public Offer getAddOn() {
        return addOn;
    }

    public void setAddOn(Offer addOn) {
        this.addOn = addOn;
    }

    public QuantitativeValue getEligibleDuration() {
        return eligibleDuration;
    }

    public void setEligibleDuration(QuantitativeValue eligibleDuration) {
        this.eligibleDuration = eligibleDuration;
    }

    public String getEligibleRegion() {
        return eligibleRegion;
    }

    public void setEligibleRegion(String eligibleRegion) {
        this.eligibleRegion = eligibleRegion;
    }

    public Boolean getIsFamilyFriendly() {
        return isFamilyFriendly;
    }

    public void setIsFamilyFriendly(Boolean isFamilyFriendly) {
        this.isFamilyFriendly = isFamilyFriendly;
    }

    public String getGtin13() {
        return gtin13;
    }

    public void setGtin13(String gtin13) {
        this.gtin13 = gtin13;
    }

    public String getAreaServed() {
        return areaServed;
    }

    public void setAreaServed(String areaServed) {
        this.areaServed = areaServed;
    }

    public String getGtin8() {
        return gtin8;
    }

    public void setGtin8(String gtin8) {
        this.gtin8 = gtin8;
    }

    public List<AbstractSchema> getItemOffered() {
        return itemOffered;
    }

    public void setItemOffered(List<AbstractSchema> itemOffered) {
        this.itemOffered = itemOffered;
    }

    public OfferShippingDetails getShippingDetails() {
        return shippingDetails;
    }

    public void setShippingDetails(OfferShippingDetails shippingDetails) {
        this.shippingDetails = shippingDetails;
    }

    public String getPriceCurrency() {
        return priceCurrency;
    }

    public void setPriceCurrency(String priceCurrency) {
        this.priceCurrency = priceCurrency;
    }

    public MemberProgramTier getValidForMemberTier() {
        return validForMemberTier;
    }

    public void setValidForMemberTier(MemberProgramTier validForMemberTier) {
        this.validForMemberTier = validForMemberTier;
    }

    public List<AbstractSchema> getSeller() {
        return seller;
    }

    public void setSeller(List<AbstractSchema> seller) {
        this.seller = seller;
    }

    public AdultOrientedEnumeration getHasAdultConsideration() {
        return hasAdultConsideration;
    }

    public void setHasAdultConsideration(AdultOrientedEnumeration hasAdultConsideration) {
        this.hasAdultConsideration = hasAdultConsideration;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getGtin12() {
        return gtin12;
    }

    public void setGtin12(String gtin12) {
        this.gtin12 = gtin12;
    }

    public AbstractSchema getAvailableDeliveryMethod() {
        return availableDeliveryMethod;
    }

    public void setAvailableDeliveryMethod(AbstractSchema availableDeliveryMethod) {
        this.availableDeliveryMethod = availableDeliveryMethod;
    }

    public String getAcceptedPaymentMethod() {
        return acceptedPaymentMethod;
    }

    public void setAcceptedPaymentMethod(String acceptedPaymentMethod) {
        this.acceptedPaymentMethod = acceptedPaymentMethod;
    }

    public TypeAndQuantityNode getIncludesObject() {
        return includesObject;
    }

    public void setIncludesObject(TypeAndQuantityNode includesObject) {
        this.includesObject = includesObject;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public List<AbstractSchema> getOfferedBy() {
        return offeredBy;
    }

    public void setOfferedBy(List<AbstractSchema> offeredBy) {
        this.offeredBy = offeredBy;
    }

    public java.time.LocalDate getAvailabilityStarts() {
        return availabilityStarts;
    }

    public void setAvailabilityStarts(java.time.LocalDate availabilityStarts) {
        this.availabilityStarts = availabilityStarts;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getIneligibleRegion() {
        return ineligibleRegion;
    }

    public void setIneligibleRegion(String ineligibleRegion) {
        this.ineligibleRegion = ineligibleRegion;
    }

    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    public java.time.LocalDate getValidThrough() {
        return validThrough;
    }

    public void setValidThrough(java.time.LocalDate validThrough) {
        this.validThrough = validThrough;
    }

    public Place getAvailableAtOrFrom() {
        return availableAtOrFrom;
    }

    public void setAvailableAtOrFrom(Place availableAtOrFrom) {
        this.availableAtOrFrom = availableAtOrFrom;
    }

    public OfferItemCondition getItemCondition() {
        return itemCondition;
    }

    public void setItemCondition(OfferItemCondition itemCondition) {
        this.itemCondition = itemCondition;
    }

    public MerchantReturnPolicy getHasMerchantReturnPolicy() {
        return hasMerchantReturnPolicy;
    }

    public void setHasMerchantReturnPolicy(MerchantReturnPolicy hasMerchantReturnPolicy) {
        this.hasMerchantReturnPolicy = hasMerchantReturnPolicy;
    }

    public List<AbstractSchema> getLeaseLength() {
        return leaseLength;
    }

    public void setLeaseLength(List<AbstractSchema> leaseLength) {
        this.leaseLength = leaseLength;
    }

    public java.time.LocalDate getPriceValidUntil() {
        return priceValidUntil;
    }

    public void setPriceValidUntil(java.time.LocalDate priceValidUntil) {
        this.priceValidUntil = priceValidUntil;
    }

    public String getHasGS1DigitalLink() {
        return hasGS1DigitalLink;
    }

    public void setHasGS1DigitalLink(String hasGS1DigitalLink) {
        this.hasGS1DigitalLink = hasGS1DigitalLink;
    }

    public String getMobileUrl() {
        return mobileUrl;
    }

    public void setMobileUrl(String mobileUrl) {
        this.mobileUrl = mobileUrl;
    }

    public String getGtin() {
        return gtin;
    }

    public void setGtin(String gtin) {
        this.gtin = gtin;
    }

    public java.time.LocalDate getAvailabilityEnds() {
        return availabilityEnds;
    }

    public void setAvailabilityEnds(java.time.LocalDate availabilityEnds) {
        this.availabilityEnds = availabilityEnds;
    }

    public WarrantyPromise getWarranty() {
        return warranty;
    }

    public void setWarranty(WarrantyPromise warranty) {
        this.warranty = warranty;
    }

    public QuantitativeValue getInventoryLevel() {
        return inventoryLevel;
    }

    public void setInventoryLevel(QuantitativeValue inventoryLevel) {
        this.inventoryLevel = inventoryLevel;
    }

    public AbstractSchema getEligibleTransactionVolume() {
        return eligibleTransactionVolume;
    }

    public void setEligibleTransactionVolume(AbstractSchema eligibleTransactionVolume) {
        this.eligibleTransactionVolume = eligibleTransactionVolume;
    }

    public QuantitativeValue getAdvanceBookingRequirement() {
        return advanceBookingRequirement;
    }

    public void setAdvanceBookingRequirement(QuantitativeValue advanceBookingRequirement) {
        this.advanceBookingRequirement = advanceBookingRequirement;
    }

    public AbstractSchema getReview() {
        return review;
    }

    public void setReview(AbstractSchema review) {
        this.review = review;
    }

    public QuantitativeValue getDeliveryLeadTime() {
        return deliveryLeadTime;
    }

    public void setDeliveryLeadTime(QuantitativeValue deliveryLeadTime) {
        this.deliveryLeadTime = deliveryLeadTime;
    }

    public BusinessEntityType getEligibleCustomerType() {
        return eligibleCustomerType;
    }

    public void setEligibleCustomerType(BusinessEntityType eligibleCustomerType) {
        this.eligibleCustomerType = eligibleCustomerType;
    }

    public String getMpn() {
        return mpn;
    }

    public void setMpn(String mpn) {
        this.mpn = mpn;
    }
}
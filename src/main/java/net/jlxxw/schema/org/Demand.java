package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Demand extends Intangible {
    public Demand() {
    }

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
     * The GTIN-14 code of the product, or the product to which the offer refers. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
     */
    @JsonProperty("gtin14")
    private String gtin14;
    /**
     * The date when the item becomes valid.
     */
    @JsonProperty("validFrom")
    private java.time.LocalDate validFrom;
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
     * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
     */
    @JsonProperty("seller")
    private List<AbstractSchema> seller;
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
     * The beginning of the availability of the product or service included in the offer.
     */
    @JsonProperty("availabilityStarts")
    private java.time.LocalDate availabilityStarts;
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

    public String getGtin14() {
        return gtin14;
    }

    public void setGtin14(String gtin14) {
        this.gtin14 = gtin14;
    }

    public java.time.LocalDate getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(java.time.LocalDate validFrom) {
        this.validFrom = validFrom;
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

    public List<AbstractSchema> getSeller() {
        return seller;
    }

    public void setSeller(List<AbstractSchema> seller) {
        this.seller = seller;
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

    public java.time.LocalDate getAvailabilityStarts() {
        return availabilityStarts;
    }

    public void setAvailabilityStarts(java.time.LocalDate availabilityStarts) {
        this.availabilityStarts = availabilityStarts;
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
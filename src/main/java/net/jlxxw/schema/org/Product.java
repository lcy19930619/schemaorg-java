package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Product extends AbstractSchema {
    public Product() {
        setId("schema:Product");
        setType("rdfs:Class");

    }

    /**
     * Certification information about a product, organization, service, place, or person.
     */
    @JsonProperty("hasCertification")
    private Certification hasCertification;
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
     * An award won by or for this item.
     */
    @JsonProperty("award")
    private String award;
    /**
     * A pointer to another, somehow related product (or multiple products).
     */
    @JsonProperty("isRelatedTo")
    private List<AbstractSchema> isRelatedTo;
    /**
     * The product identifier, such as ISBN. For example: ``` meta itemprop="productID" content="isbn:123-456-789" ```.
     */
    @JsonProperty("productID")
    private String productID;
    /**
     * Provides negative considerations regarding something, most typically in pro/con lists for reviews (alongside [[positiveNotes]]). For symmetry
     * <p>
     * In the case of a [[Review]], the property describes the [[itemReviewed]] from the perspective of the review; in the case of a [[Product]], the product itself is being described. Since product descriptions
     * tend to emphasise positive claims, it may be relatively unusual to find [[negativeNotes]] used in this way. Nevertheless for the sake of symmetry, [[negativeNotes]] can be used on [[Product]].
     * <p>
     * The property values can be expressed either as unstructured text (repeated as necessary), or if ordered, as a list (in which case the most negative is at the beginning of the list).
     */
    @JsonProperty("negativeNotes")
    private String negativeNotes;
    /**
     * The manufacturer of the product.
     */
    @JsonProperty("manufacturer")
    private Organization manufacturer;
    /**
     * Indicates the [NATO stock number](https://en.wikipedia.org/wiki/NATO_Stock_Number) (nsn) of a [[Product]].
     */
    @JsonProperty("nsn")
    private String nsn;
    /**
     * A [[Grant]] that directly or indirectly provide funding or sponsorship for this item. See also [[ownershipFundingInfo]].
     */
    @JsonProperty("funding")
    private Grant funding;
    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @JsonProperty("offers")
    private List<AbstractSchema> offers;
    /**
     * A property-value pair representing an additional characteristic of the entity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.\n\nNote: Publishers should be aware that applications designed to use specific schema.org properties (e.g. https://schema.org/width, https://schema.org/color, https://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
     */
    @JsonProperty("additionalProperty")
    private PropertyValue additionalProperty;
    /**
     * The date of production of the item, e.g. vehicle.
     */
    @JsonProperty("productionDate")
    private java.time.LocalDate productionDate;
    /**
     * The GTIN-14 code of the product, or the product to which the offer refers. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
     */
    @JsonProperty("gtin14")
    private String gtin14;
    /**
     * The color of the product.
     */
    @JsonProperty("color")
    private String color;
    /**
     * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties.
     */
    @JsonProperty("model")
    private String model;
    /**
     * The width of the item.
     */
    @JsonProperty("width")
    private List<AbstractSchema> width;
    /**
     * A pointer to another product (or multiple products) for which this product is an accessory or spare part.
     */
    @JsonProperty("isAccessoryOrSparePartFor")
    private Product isAccessoryOrSparePartFor;
    /**
     * Indicates the kind of product that this is a variant of. In the case of [[ProductModel]], this is a pointer (from a ProductModel) to a base product from which this product is a variant. It is safe to infer that the variant inherits all product features from the base model, unless defined locally. This is not transitive. In the case of a [[ProductGroup]], the group description also serves as a template, representing a set of Products that vary on explicitly defined, specific dimensions only (so it defines both a set of variants, as well as which values distinguish amongst those variants). When used with [[ProductGroup]], this property can apply to any [[Product]] included in the group.
     */
    @JsonProperty("isVariantOf")
    private List<AbstractSchema> isVariantOf;
    /**
     * The weight of the product or person.
     */
    @JsonProperty("weight")
    private List<AbstractSchema> weight;
    /**
     * A measurement of an item, For example, the inseam of pants, the wheel size of a bicycle, the gauge of a screw, or the carbon footprint measured for certification by an authority. Usually an exact measurement, but can also be a range of measurements for adjustable products, for example belts and ski bindings.
     */
    @JsonProperty("hasMeasurement")
    private QuantitativeValue hasMeasurement;
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @JsonProperty("brand")
    private List<Organization> brand;
    /**
     * A pointer to another product (or multiple products) for which this product is a consumable.
     */
    @JsonProperty("isConsumableFor")
    private Product isConsumableFor;
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
     * The GTIN-8 code of the product, or the product to which the offer refers. This code is also known as EAN/UCC-8 or 8-digit EAN. See [GS1 GTIN Summary](http://www.gs1.org/barcodes/technical/idkeys/gtin) for more details.
     */
    @JsonProperty("gtin8")
    private String gtin8;
    /**
     * The height of the item.
     */
    @JsonProperty("height")
    private List<AbstractSchema> height;
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
     * The country of origin of something, including products as well as creative  works such as movie and TV content.
     * <p>
     * In the case of TV and movie, this would be the country of the principle offices of the production company or individual responsible for the movie. For other kinds of [[CreativeWork]] it is difficult to provide fully general guidance, and properties such as [[contentLocation]] and [[locationCreated]] may be more applicable.
     * <p>
     * In the case of products, the country of origin of the product. The exact interpretation of this may vary by context and product type, and cannot be fully enumerated here.
     */
    @JsonProperty("countryOfOrigin")
    private Country countryOfOrigin;
    /**
     * The depth of the item.
     */
    @JsonProperty("depth")
    private List<AbstractSchema> depth;
    /**
     * The place where the item (typically [[Product]]) was last processed and tested before importation.
     */
    @JsonProperty("countryOfLastProcessing")
    private String countryOfLastProcessing;
    /**
     * Awards won by or for this item.
     */
    @JsonProperty("awards")
    private String awards;
    /**
     * A pattern that something has, for example 'polka dot', 'striped', 'Canadian flag'. Values are typically expressed as text, although links to controlled value schemes are also supported.
     */
    @JsonProperty("pattern")
    private String pattern;
    /**
     * A color swatch image, visualizing the color of a [[Product]]. Should match the textual description specified in the [[color]] property. This can be a URL or a fully described ImageObject.
     */
    @JsonProperty("colorSwatch")
    private String colorSwatch;
    /**
     * The place where the product was assembled.
     */
    @JsonProperty("countryOfAssembly")
    private String countryOfAssembly;
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @JsonProperty("category")
    private String category;
    /**
     * A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable.
     */
    @JsonProperty("size")
    private String size;
    /**
     * An Amazon Standard Identification Number (ASIN) is a 10-character alphanumeric unique identifier assigned by Amazon.com and its partners for product identification within the Amazon organization (summary from [Wikipedia](https://en.wikipedia.org/wiki/Amazon_Standard_Identification_Number)'s article).
     * <p>
     * Note also that this is a definition for how to include ASINs in Schema.org data, and not a definition of ASINs in general - see documentation from Amazon for authoritative details.
     * ASINs are most commonly encoded as text strings, but the [asin] property supports URL/URI as potential values too.
     */
    @JsonProperty("asin")
    private String asin;
    /**
     * Indicates the [[productGroupID]] for a [[ProductGroup]] that this product [[isVariantOf]].
     */
    @JsonProperty("inProductGroupWithID")
    private String inProductGroupWithID;
    /**
     * A predefined value from OfferItemCondition specifying the condition of the product or service, or the products or services included in the offer. Also used for product return policies to specify the condition of products accepted for returns.
     */
    @JsonProperty("itemCondition")
    private OfferItemCondition itemCondition;
    /**
     * Defines the energy efficiency Category (also known as "class" or "rating") for a product according to an international energy efficiency standard.
     */
    @JsonProperty("hasEnergyConsumptionDetails")
    private EnergyConsumptionDetails hasEnergyConsumptionDetails;
    /**
     * Specifies a MerchantReturnPolicy that may be applicable.
     */
    @JsonProperty("hasMerchantReturnPolicy")
    private MerchantReturnPolicy hasMerchantReturnPolicy;
    /**
     * A material that something is made from, e.g. leather, wool, cotton, paper.
     */
    @JsonProperty("material")
    private String material;
    /**
     * The date the item, e.g. vehicle, was purchased by the current owner.
     */
    @JsonProperty("purchaseDate")
    private java.time.LocalDate purchaseDate;
    /**
     * The <a href="https://www.gs1.org/standards/gs1-digital-link">GS1 digital link</a> associated with the object. This URL should conform to the particular requirements of digital links. The link should only contain the Application Identifiers (AIs) that are relevant for the entity being annotated, for instance a [[Product]] or an [[Organization]], and for the correct granularity. In particular, for products:<ul><li>A Digital Link that contains a serial number (AI <code>21</code>) should only be present on instances of [[IndividualProduct]]</li><li>A Digital Link that contains a lot number (AI <code>10</code>) should be annotated as [[SomeProduct]] if only products from that lot are sold, or [[IndividualProduct]] if there is only a specific product.</li><li>A Digital Link that contains a global model number (AI <code>8013</code>)  should be attached to a [[Product]] or a [[ProductModel]].</li></ul> Other item types should be adapted similarly.
     */
    @JsonProperty("hasGS1DigitalLink")
    private String hasGS1DigitalLink;
    /**
     * An associated logo.
     */
    @JsonProperty("logo")
    private String logo;
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
     * Provides positive considerations regarding something, for example product highlights or (alongside [[negativeNotes]]) pro/con lists for reviews.
     * <p>
     * In the case of a [[Review]], the property describes the [[itemReviewed]] from the perspective of the review; in the case of a [[Product]], the product itself is being described.
     * <p>
     * The property values can be expressed either as unstructured text (repeated as necessary), or if ordered, as a list (in which case the most positive is at the beginning of the list).
     */
    @JsonProperty("positiveNotes")
    private String positiveNotes;
    /**
     * A slogan or motto associated with the item.
     */
    @JsonProperty("slogan")
    private String slogan;
    /**
     * A review of the item.
     */
    @JsonProperty("review")
    private AbstractSchema review;
    /**
     * The release date of a product or product model. This can be used to distinguish the exact variant of a product.
     */
    @JsonProperty("releaseDate")
    private java.time.LocalDate releaseDate;
    /**
     * A pointer to another, functionally similar product (or multiple products).
     */
    @JsonProperty("isSimilarTo")
    private List<AbstractSchema> isSimilarTo;
    /**
     * Keywords or tags used to describe some item. Multiple textual entries in a keywords list are typically delimited by commas, or by repeating the property.
     */
    @JsonProperty("keywords")
    private String keywords;
    /**
     * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers.
     */
    @JsonProperty("mpn")
    private String mpn;

    public Certification getHasCertification() {
        return hasCertification;
    }

    public void setHasCertification(Certification hasCertification) {
        this.hasCertification = hasCertification;
    }

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

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public List<AbstractSchema> getIsRelatedTo() {
        return isRelatedTo;
    }

    public void setIsRelatedTo(List<AbstractSchema> isRelatedTo) {
        this.isRelatedTo = isRelatedTo;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getNegativeNotes() {
        return negativeNotes;
    }

    public void setNegativeNotes(String negativeNotes) {
        this.negativeNotes = negativeNotes;
    }

    public Organization getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Organization manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getNsn() {
        return nsn;
    }

    public void setNsn(String nsn) {
        this.nsn = nsn;
    }

    public Grant getFunding() {
        return funding;
    }

    public void setFunding(Grant funding) {
        this.funding = funding;
    }

    public List<AbstractSchema> getOffers() {
        return offers;
    }

    public void setOffers(List<AbstractSchema> offers) {
        this.offers = offers;
    }

    public PropertyValue getAdditionalProperty() {
        return additionalProperty;
    }

    public void setAdditionalProperty(PropertyValue additionalProperty) {
        this.additionalProperty = additionalProperty;
    }

    public java.time.LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(java.time.LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public String getGtin14() {
        return gtin14;
    }

    public void setGtin14(String gtin14) {
        this.gtin14 = gtin14;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<AbstractSchema> getWidth() {
        return width;
    }

    public void setWidth(List<AbstractSchema> width) {
        this.width = width;
    }

    public Product getIsAccessoryOrSparePartFor() {
        return isAccessoryOrSparePartFor;
    }

    public void setIsAccessoryOrSparePartFor(Product isAccessoryOrSparePartFor) {
        this.isAccessoryOrSparePartFor = isAccessoryOrSparePartFor;
    }

    public List<AbstractSchema> getIsVariantOf() {
        return isVariantOf;
    }

    public void setIsVariantOf(List<AbstractSchema> isVariantOf) {
        this.isVariantOf = isVariantOf;
    }

    public List<AbstractSchema> getWeight() {
        return weight;
    }

    public void setWeight(List<AbstractSchema> weight) {
        this.weight = weight;
    }

    public QuantitativeValue getHasMeasurement() {
        return hasMeasurement;
    }

    public void setHasMeasurement(QuantitativeValue hasMeasurement) {
        this.hasMeasurement = hasMeasurement;
    }

    public List<Organization> getBrand() {
        return brand;
    }

    public void setBrand(List<Organization> brand) {
        this.brand = brand;
    }

    public Product getIsConsumableFor() {
        return isConsumableFor;
    }

    public void setIsConsumableFor(Product isConsumableFor) {
        this.isConsumableFor = isConsumableFor;
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

    public String getGtin8() {
        return gtin8;
    }

    public void setGtin8(String gtin8) {
        this.gtin8 = gtin8;
    }

    public List<AbstractSchema> getHeight() {
        return height;
    }

    public void setHeight(List<AbstractSchema> height) {
        this.height = height;
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

    public Country getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(Country countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public List<AbstractSchema> getDepth() {
        return depth;
    }

    public void setDepth(List<AbstractSchema> depth) {
        this.depth = depth;
    }

    public String getCountryOfLastProcessing() {
        return countryOfLastProcessing;
    }

    public void setCountryOfLastProcessing(String countryOfLastProcessing) {
        this.countryOfLastProcessing = countryOfLastProcessing;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getColorSwatch() {
        return colorSwatch;
    }

    public void setColorSwatch(String colorSwatch) {
        this.colorSwatch = colorSwatch;
    }

    public String getCountryOfAssembly() {
        return countryOfAssembly;
    }

    public void setCountryOfAssembly(String countryOfAssembly) {
        this.countryOfAssembly = countryOfAssembly;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    public String getInProductGroupWithID() {
        return inProductGroupWithID;
    }

    public void setInProductGroupWithID(String inProductGroupWithID) {
        this.inProductGroupWithID = inProductGroupWithID;
    }

    public OfferItemCondition getItemCondition() {
        return itemCondition;
    }

    public void setItemCondition(OfferItemCondition itemCondition) {
        this.itemCondition = itemCondition;
    }

    public EnergyConsumptionDetails getHasEnergyConsumptionDetails() {
        return hasEnergyConsumptionDetails;
    }

    public void setHasEnergyConsumptionDetails(EnergyConsumptionDetails hasEnergyConsumptionDetails) {
        this.hasEnergyConsumptionDetails = hasEnergyConsumptionDetails;
    }

    public MerchantReturnPolicy getHasMerchantReturnPolicy() {
        return hasMerchantReturnPolicy;
    }

    public void setHasMerchantReturnPolicy(MerchantReturnPolicy hasMerchantReturnPolicy) {
        this.hasMerchantReturnPolicy = hasMerchantReturnPolicy;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public java.time.LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(java.time.LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getHasGS1DigitalLink() {
        return hasGS1DigitalLink;
    }

    public void setHasGS1DigitalLink(String hasGS1DigitalLink) {
        this.hasGS1DigitalLink = hasGS1DigitalLink;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
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

    public String getPositiveNotes() {
        return positiveNotes;
    }

    public void setPositiveNotes(String positiveNotes) {
        this.positiveNotes = positiveNotes;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public AbstractSchema getReview() {
        return review;
    }

    public void setReview(AbstractSchema review) {
        this.review = review;
    }

    public java.time.LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(java.time.LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<AbstractSchema> getIsSimilarTo() {
        return isSimilarTo;
    }

    public void setIsSimilarTo(List<AbstractSchema> isSimilarTo) {
        this.isSimilarTo = isSimilarTo;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getMpn() {
        return mpn;
    }

    public void setMpn(String mpn) {
        this.mpn = mpn;
    }
}
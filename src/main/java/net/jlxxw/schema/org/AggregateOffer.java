package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class AggregateOffer extends Offer {
    public AggregateOffer() {
        setId("schema:AggregateOffer");
        setType("rdfs:Class");

    }

    /**
     * The number of offers for the product.
     */
    @JsonProperty("offerCount")
    private Integer offerCount;
    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @JsonProperty("offers")
    private List<AbstractSchema> offers;
    /**
     * The lowest price of all offers available.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     */
    @JsonProperty("lowPrice")
    private String lowPrice;
    /**
     * The highest price of all offers available.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     */
    @JsonProperty("highPrice")
    private String highPrice;

    public Integer getOfferCount() {
        return offerCount;
    }

    public void setOfferCount(Integer offerCount) {
        this.offerCount = offerCount;
    }

    public List<AbstractSchema> getOffers() {
        return offers;
    }

    public void setOffers(List<AbstractSchema> offers) {
        this.offers = offers;
    }

    public String getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(String lowPrice) {
        this.lowPrice = lowPrice;
    }

    public String getHighPrice() {
        return highPrice;
    }

    public void setHighPrice(String highPrice) {
        this.highPrice = highPrice;
    }
}
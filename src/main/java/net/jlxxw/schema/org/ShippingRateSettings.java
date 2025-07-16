package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ShippingRateSettings extends StructuredValue {
    public ShippingRateSettings() {
        setId("schema:ShippingRateSettings");
        setType("rdfs:Class");

    }

    /**
     * Indicates when shipping to a particular [[shippingDestination]] is not available.
     */
    @JsonProperty("doesNotShip")
    private Boolean doesNotShip;
    /**
     * The shipping rate is the cost of shipping to the specified destination. Typically, the maxValue and currency values (of the [[MonetaryAmount]]) are most appropriate.
     */
    @JsonProperty("shippingRate")
    private List<AbstractSchema> shippingRate;
    /**
     * indicates (possibly multiple) shipping destinations. These can be defined in several ways, e.g. postalCode ranges.
     */
    @JsonProperty("shippingDestination")
    private DefinedRegion shippingDestination;
    /**
     * This can be marked 'true' to indicate that some published [[DeliveryTimeSettings]] or [[ShippingRateSettings]] are intended to apply to all [[OfferShippingDetails]] published by the same merchant, when referenced by a [[shippingSettingsLink]] in those settings. It is not meaningful to use a 'true' value for this property alongside a transitTimeLabel (for [[DeliveryTimeSettings]]) or shippingLabel (for [[ShippingRateSettings]]), since this property is for use with unlabelled settings.
     */
    @JsonProperty("isUnlabelledFallback")
    private Boolean isUnlabelledFallback;
    /**
     * A monetary value above (or at) which the shipping rate becomes free. Intended to be used via an [[OfferShippingDetails]] with [[shippingSettingsLink]] matching this [[ShippingRateSettings]].
     */
    @JsonProperty("freeShippingThreshold")
    private List<AbstractSchema> freeShippingThreshold;
    /**
     * Fraction of the value of the order that is charged as shipping cost.
     */
    @JsonProperty("orderPercentage")
    private Double orderPercentage;
    /**
     * Fraction of the weight that is used to compute the shipping price.
     */
    @JsonProperty("weightPercentage")
    private Double weightPercentage;

    public Boolean getDoesNotShip() {
        return doesNotShip;
    }

    public void setDoesNotShip(Boolean doesNotShip) {
        this.doesNotShip = doesNotShip;
    }

    public List<AbstractSchema> getShippingRate() {
        return shippingRate;
    }

    public void setShippingRate(List<AbstractSchema> shippingRate) {
        this.shippingRate = shippingRate;
    }

    public DefinedRegion getShippingDestination() {
        return shippingDestination;
    }

    public void setShippingDestination(DefinedRegion shippingDestination) {
        this.shippingDestination = shippingDestination;
    }

    public Boolean getIsUnlabelledFallback() {
        return isUnlabelledFallback;
    }

    public void setIsUnlabelledFallback(Boolean isUnlabelledFallback) {
        this.isUnlabelledFallback = isUnlabelledFallback;
    }

    public List<AbstractSchema> getFreeShippingThreshold() {
        return freeShippingThreshold;
    }

    public void setFreeShippingThreshold(List<AbstractSchema> freeShippingThreshold) {
        this.freeShippingThreshold = freeShippingThreshold;
    }

    public Double getOrderPercentage() {
        return orderPercentage;
    }

    public void setOrderPercentage(Double orderPercentage) {
        this.orderPercentage = orderPercentage;
    }

    public Double getWeightPercentage() {
        return weightPercentage;
    }

    public void setWeightPercentage(Double weightPercentage) {
        this.weightPercentage = weightPercentage;
    }
}
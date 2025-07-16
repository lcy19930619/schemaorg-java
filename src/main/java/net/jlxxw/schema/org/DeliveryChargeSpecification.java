package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class DeliveryChargeSpecification extends PriceSpecification {
    {
        setId("schema:DeliveryChargeSpecification");
        setType("rdfs:Class");

    }

    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.\n\nSee also [[ineligibleRegion]].
     */
    @JsonProperty("eligibleRegion")
    private String eligibleRegion;
    /**
     * The geographic area where a service or offered item is provided.
     */
    @JsonProperty("areaServed")
    private String areaServed;
    /**
     * The delivery method(s) to which the delivery charge or payment charge specification applies.
     */
    @JsonProperty("appliesToDeliveryMethod")
    private AbstractSchema appliesToDeliveryMethod;
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.\n\nSee also [[eligibleRegion]].
     */
    @JsonProperty("ineligibleRegion")
    private String ineligibleRegion;

    public String getEligibleRegion() {
        return eligibleRegion;
    }

    public void setEligibleRegion(String eligibleRegion) {
        this.eligibleRegion = eligibleRegion;
    }

    public String getAreaServed() {
        return areaServed;
    }

    public void setAreaServed(String areaServed) {
        this.areaServed = areaServed;
    }

    public AbstractSchema getAppliesToDeliveryMethod() {
        return appliesToDeliveryMethod;
    }

    public void setAppliesToDeliveryMethod(AbstractSchema appliesToDeliveryMethod) {
        this.appliesToDeliveryMethod = appliesToDeliveryMethod;
    }

    public String getIneligibleRegion() {
        return ineligibleRegion;
    }

    public void setIneligibleRegion(String ineligibleRegion) {
        this.ineligibleRegion = ineligibleRegion;
    }
}
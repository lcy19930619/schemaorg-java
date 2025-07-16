package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class ActionAccessSpecification extends Intangible {
    {
        setId("schema:ActionAccessSpecification");
        setType("rdfs:Class");

    }

    /**
     * An Offer which must be accepted before the user can perform the Action. For example, the user may need to buy a movie before being able to watch it.
     */
    @JsonProperty("expectsAcceptanceOf")
    private Offer expectsAcceptanceOf;
    /**
     * Indicates if use of the media require a subscription  (either paid or free). Allowed values are ```true``` or ```false``` (note that an earlier version had 'yes', 'no').
     */
    @JsonProperty("requiresSubscription")
    private Boolean requiresSubscription;
    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.\n\nSee also [[ineligibleRegion]].
     */
    @JsonProperty("eligibleRegion")
    private String eligibleRegion;
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
     * The end of the availability of the product or service included in the offer.
     */
    @JsonProperty("availabilityEnds")
    private java.time.LocalDate availabilityEnds;

    public Offer getExpectsAcceptanceOf() {
        return expectsAcceptanceOf;
    }

    public void setExpectsAcceptanceOf(Offer expectsAcceptanceOf) {
        this.expectsAcceptanceOf = expectsAcceptanceOf;
    }

    public Boolean getRequiresSubscription() {
        return requiresSubscription;
    }

    public void setRequiresSubscription(Boolean requiresSubscription) {
        this.requiresSubscription = requiresSubscription;
    }

    public String getEligibleRegion() {
        return eligibleRegion;
    }

    public void setEligibleRegion(String eligibleRegion) {
        this.eligibleRegion = eligibleRegion;
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

    public java.time.LocalDate getAvailabilityEnds() {
        return availabilityEnds;
    }

    public void setAvailabilityEnds(java.time.LocalDate availabilityEnds) {
        this.availabilityEnds = availabilityEnds;
    }
}
package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Trip extends Intangible {
    public Trip() {
    }

    /**
     * The expected arrival time.
     */
    @JsonProperty("arrivalTime")
    private java.time.LocalDateTime arrivalTime;
    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
     */
    @JsonProperty("offers")
    private List<AbstractSchema> offers;
    /**
     * The expected departure time.
     */
    @JsonProperty("departureTime")
    private java.time.LocalDateTime departureTime;
    /**
     * Identifies that this [[Trip]] is a subTrip of another Trip.  For example Day 1, Day 2, etc. of a multi-day trip.
     */
    @JsonProperty("partOfTrip")
    private Trip partOfTrip;
    /**
     * Identifies a [[Trip]] that is a subTrip of this Trip.  For example Day 1, Day 2, etc. of a multi-day trip.
     */
    @JsonProperty("subTrip")
    private Trip subTrip;
    /**
     * The location of origin of the trip, prior to any destination(s).
     */
    @JsonProperty("tripOrigin")
    private Place tripOrigin;
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @JsonProperty("provider")
    private List<AbstractSchema> provider;
    /**
     * Destination(s) ( [[Place]] ) that make up a trip. For a trip where destination order is important use [[ItemList]] to specify that order (see examples).
     */
    @JsonProperty("itinerary")
    private List<AbstractSchema> itinerary;

    public java.time.LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(java.time.LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public List<AbstractSchema> getOffers() {
        return offers;
    }

    public void setOffers(List<AbstractSchema> offers) {
        this.offers = offers;
    }

    public java.time.LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(java.time.LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public Trip getPartOfTrip() {
        return partOfTrip;
    }

    public void setPartOfTrip(Trip partOfTrip) {
        this.partOfTrip = partOfTrip;
    }

    public Trip getSubTrip() {
        return subTrip;
    }

    public void setSubTrip(Trip subTrip) {
        this.subTrip = subTrip;
    }

    public Place getTripOrigin() {
        return tripOrigin;
    }

    public void setTripOrigin(Place tripOrigin) {
        this.tripOrigin = tripOrigin;
    }

    public List<AbstractSchema> getProvider() {
        return provider;
    }

    public void setProvider(List<AbstractSchema> provider) {
        this.provider = provider;
    }

    public List<AbstractSchema> getItinerary() {
        return itinerary;
    }

    public void setItinerary(List<AbstractSchema> itinerary) {
        this.itinerary = itinerary;
    }
}
package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RentalCarReservation extends Reservation {
    public RentalCarReservation() {
    }

    /**
     * When a taxi will pick up a passenger or a rental car can be picked up.
     */
    @JsonProperty("pickupTime")
    private java.time.LocalDateTime pickupTime;
    /**
     * Where a rental car can be dropped off.
     */
    @JsonProperty("dropoffLocation")
    private Place dropoffLocation;
    /**
     * Where a taxi will pick up a passenger or a rental car can be picked up.
     */
    @JsonProperty("pickupLocation")
    private Place pickupLocation;
    /**
     * When a rental car can be dropped off.
     */
    @JsonProperty("dropoffTime")
    private java.time.LocalDateTime dropoffTime;

    public java.time.LocalDateTime getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(java.time.LocalDateTime pickupTime) {
        this.pickupTime = pickupTime;
    }

    public Place getDropoffLocation() {
        return dropoffLocation;
    }

    public void setDropoffLocation(Place dropoffLocation) {
        this.dropoffLocation = dropoffLocation;
    }

    public Place getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(Place pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public java.time.LocalDateTime getDropoffTime() {
        return dropoffTime;
    }

    public void setDropoffTime(java.time.LocalDateTime dropoffTime) {
        this.dropoffTime = dropoffTime;
    }
}
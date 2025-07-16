package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LodgingReservation extends Reservation {
    public LodgingReservation() {
    }

    /**
     * The number of adults staying in the unit.
     */
    @JsonProperty("numAdults")
    private Integer numAdults;
    /**
     * The number of children staying in the unit.
     */
    @JsonProperty("numChildren")
    private Integer numChildren;
    /**
     * The latest someone may check out of a lodging establishment.
     */
    @JsonProperty("checkoutTime")
    private java.time.LocalDateTime checkoutTime;
    /**
     * Textual description of the unit type (including suite vs. room, size of bed, etc.).
     */
    @JsonProperty("lodgingUnitType")
    private String lodgingUnitType;
    /**
     * The earliest someone may check into a lodging establishment.
     */
    @JsonProperty("checkinTime")
    private java.time.LocalDateTime checkinTime;
    /**
     * A full description of the lodging unit.
     */
    @JsonProperty("lodgingUnitDescription")
    private String lodgingUnitDescription;

    public Integer getNumAdults() {
        return numAdults;
    }

    public void setNumAdults(Integer numAdults) {
        this.numAdults = numAdults;
    }

    public Integer getNumChildren() {
        return numChildren;
    }

    public void setNumChildren(Integer numChildren) {
        this.numChildren = numChildren;
    }

    public java.time.LocalDateTime getCheckoutTime() {
        return checkoutTime;
    }

    public void setCheckoutTime(java.time.LocalDateTime checkoutTime) {
        this.checkoutTime = checkoutTime;
    }

    public String getLodgingUnitType() {
        return lodgingUnitType;
    }

    public void setLodgingUnitType(String lodgingUnitType) {
        this.lodgingUnitType = lodgingUnitType;
    }

    public java.time.LocalDateTime getCheckinTime() {
        return checkinTime;
    }

    public void setCheckinTime(java.time.LocalDateTime checkinTime) {
        this.checkinTime = checkinTime;
    }

    public String getLodgingUnitDescription() {
        return lodgingUnitDescription;
    }

    public void setLodgingUnitDescription(String lodgingUnitDescription) {
        this.lodgingUnitDescription = lodgingUnitDescription;
    }
}
package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
import net.jlxxw.schema.org.JsonLdType;
public class TaxiReservation extends Reservation {
    public TaxiReservation() {
}
    /** When a taxi will pick up a passenger or a rental car can be picked up. */
    @JsonProperty("pickupTime")
    private java.time.LocalDateTime pickupTime;
    /** Number of people the reservation should accommodate. */
    @JsonProperty("partySize")
    private Integer partySize;
    /** Where a taxi will pick up a passenger or a rental car can be picked up. */
    @JsonProperty("pickupLocation")
    private Place pickupLocation;

    public java.time.LocalDateTime getPickupTime() { return pickupTime; }
    public void setPickupTime(java.time.LocalDateTime pickupTime) { this.pickupTime = pickupTime; }
    public Integer getPartySize() { return partySize; }
    public void setPartySize(Integer partySize) { this.partySize = partySize; }
    public Place getPickupLocation() { return pickupLocation; }
    public void setPickupLocation(Place pickupLocation) { this.pickupLocation = pickupLocation; }
}
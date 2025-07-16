package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class FlightReservation extends Reservation {
    public FlightReservation() {
}
    /** The airline-specific indicator of boarding order / preference. */
    @JsonProperty("boardingGroup")
    private String boardingGroup;
    /** The passenger's sequence number as assigned by the airline. */
    @JsonProperty("passengerSequenceNumber")
    private String passengerSequenceNumber;
    /** The priority status assigned to a passenger for security or boarding (e.g. FastTrack or Priority). */
    @JsonProperty("passengerPriorityStatus")
    private String passengerPriorityStatus;
    /** The type of security screening the passenger is subject to. */
    @JsonProperty("securityScreening")
    private String securityScreening;

    public String getBoardingGroup() { return boardingGroup; }
    public void setBoardingGroup(String boardingGroup) { this.boardingGroup = boardingGroup; }
    public String getPassengerSequenceNumber() { return passengerSequenceNumber; }
    public void setPassengerSequenceNumber(String passengerSequenceNumber) { this.passengerSequenceNumber = passengerSequenceNumber; }
    public String getPassengerPriorityStatus() { return passengerPriorityStatus; }
    public void setPassengerPriorityStatus(String passengerPriorityStatus) { this.passengerPriorityStatus = passengerPriorityStatus; }
    public String getSecurityScreening() { return securityScreening; }
    public void setSecurityScreening(String securityScreening) { this.securityScreening = securityScreening; }
}
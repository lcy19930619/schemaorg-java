package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class Airline extends Organization {
    public Airline() {
}
    /** The type of boarding policy used by the airline (e.g. zone-based or group-based). */
    @JsonProperty("boardingPolicy")
    private BoardingPolicyType boardingPolicy;
    /** IATA identifier for an airline or airport. */
    @JsonProperty("iataCode")
    private String iataCode;

    public BoardingPolicyType getBoardingPolicy() { return boardingPolicy; }
    public void setBoardingPolicy(BoardingPolicyType boardingPolicy) { this.boardingPolicy = boardingPolicy; }
    public String getIataCode() { return iataCode; }
    public void setIataCode(String iataCode) { this.iataCode = iataCode; }
}
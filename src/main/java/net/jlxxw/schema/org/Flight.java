package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Flight extends Trip {
    public Flight() {
        setId("schema:Flight");
        setType("rdfs:Class");

    }

    /**
     * 'carrier' is an out-dated term indicating the 'provider' for parcel delivery and flights.
     */
    @JsonProperty("carrier")
    private Organization carrier;
    /**
     * The distance of the flight.
     */
    @JsonProperty("flightDistance")
    private String flightDistance;
    /**
     * The unique identifier for a flight including the airline IATA code. For example, if describing United flight 110, where the IATA code for United is 'UA', the flightNumber is 'UA110'.
     */
    @JsonProperty("flightNumber")
    private String flightNumber;
    /**
     * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
     */
    @JsonProperty("seller")
    private List<AbstractSchema> seller;
    /**
     * The type of boarding policy used by the airline (e.g. zone-based or group-based).
     */
    @JsonProperty("boardingPolicy")
    private BoardingPolicyType boardingPolicy;
    /**
     * The estimated time the flight will take.
     */
    @JsonProperty("estimatedFlightDuration")
    private String estimatedFlightDuration;
    /**
     * Identifier of the flight's arrival terminal.
     */
    @JsonProperty("arrivalTerminal")
    private String arrivalTerminal;
    /**
     * Identifier of the flight's departure terminal.
     */
    @JsonProperty("departureTerminal")
    private String departureTerminal;
    /**
     * The kind of aircraft (e.g., "Boeing 747").
     */
    @JsonProperty("aircraft")
    private String aircraft;
    /**
     * The time when a passenger can check into the flight online.
     */
    @JsonProperty("webCheckinTime")
    private java.time.LocalDateTime webCheckinTime;
    /**
     * The airport where the flight originates.
     */
    @JsonProperty("departureAirport")
    private Airport departureAirport;
    /**
     * Description of the meals that will be provided or available for purchase.
     */
    @JsonProperty("mealService")
    private String mealService;
    /**
     * Identifier of the flight's arrival gate.
     */
    @JsonProperty("arrivalGate")
    private String arrivalGate;
    /**
     * Identifier of the flight's departure gate.
     */
    @JsonProperty("departureGate")
    private String departureGate;
    /**
     * The airport where the flight terminates.
     */
    @JsonProperty("arrivalAirport")
    private Airport arrivalAirport;

    public Organization getCarrier() {
        return carrier;
    }

    public void setCarrier(Organization carrier) {
        this.carrier = carrier;
    }

    public String getFlightDistance() {
        return flightDistance;
    }

    public void setFlightDistance(String flightDistance) {
        this.flightDistance = flightDistance;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public List<AbstractSchema> getSeller() {
        return seller;
    }

    public void setSeller(List<AbstractSchema> seller) {
        this.seller = seller;
    }

    public BoardingPolicyType getBoardingPolicy() {
        return boardingPolicy;
    }

    public void setBoardingPolicy(BoardingPolicyType boardingPolicy) {
        this.boardingPolicy = boardingPolicy;
    }

    public String getEstimatedFlightDuration() {
        return estimatedFlightDuration;
    }

    public void setEstimatedFlightDuration(String estimatedFlightDuration) {
        this.estimatedFlightDuration = estimatedFlightDuration;
    }

    public String getArrivalTerminal() {
        return arrivalTerminal;
    }

    public void setArrivalTerminal(String arrivalTerminal) {
        this.arrivalTerminal = arrivalTerminal;
    }

    public String getDepartureTerminal() {
        return departureTerminal;
    }

    public void setDepartureTerminal(String departureTerminal) {
        this.departureTerminal = departureTerminal;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public java.time.LocalDateTime getWebCheckinTime() {
        return webCheckinTime;
    }

    public void setWebCheckinTime(java.time.LocalDateTime webCheckinTime) {
        this.webCheckinTime = webCheckinTime;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(Airport departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getMealService() {
        return mealService;
    }

    public void setMealService(String mealService) {
        this.mealService = mealService;
    }

    public String getArrivalGate() {
        return arrivalGate;
    }

    public void setArrivalGate(String arrivalGate) {
        this.arrivalGate = arrivalGate;
    }

    public String getDepartureGate() {
        return departureGate;
    }

    public void setDepartureGate(String departureGate) {
        this.departureGate = departureGate;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(Airport arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }
}
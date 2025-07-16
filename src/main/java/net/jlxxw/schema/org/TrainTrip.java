package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class TrainTrip extends Trip {
    {
        setId("schema:TrainTrip");
        setType("rdfs:Class");

    }

    /**
     * The platform from which the train departs.
     */
    @JsonProperty("departurePlatform")
    private String departurePlatform;
    /**
     * The platform where the train arrives.
     */
    @JsonProperty("arrivalPlatform")
    private String arrivalPlatform;
    /**
     * The name of the train (e.g. The Orient Express).
     */
    @JsonProperty("trainName")
    private String trainName;
    /**
     * The station from which the train departs.
     */
    @JsonProperty("departureStation")
    private TrainStation departureStation;
    /**
     * The station where the train trip ends.
     */
    @JsonProperty("arrivalStation")
    private TrainStation arrivalStation;
    /**
     * The unique identifier for the train.
     */
    @JsonProperty("trainNumber")
    private String trainNumber;

    public String getDeparturePlatform() {
        return departurePlatform;
    }

    public void setDeparturePlatform(String departurePlatform) {
        this.departurePlatform = departurePlatform;
    }

    public String getArrivalPlatform() {
        return arrivalPlatform;
    }

    public void setArrivalPlatform(String arrivalPlatform) {
        this.arrivalPlatform = arrivalPlatform;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public TrainStation getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(TrainStation departureStation) {
        this.departureStation = departureStation;
    }

    public TrainStation getArrivalStation() {
        return arrivalStation;
    }

    public void setArrivalStation(TrainStation arrivalStation) {
        this.arrivalStation = arrivalStation;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }
}
package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import net.jlxxw.schema.org.JsonLdType;
public class BusTrip extends Trip {
    public BusTrip() {
}
    /** The unique identifier for the bus. */
    @JsonProperty("busNumber")
    private String busNumber;
    /** The name of the bus (e.g. Bolt Express). */
    @JsonProperty("busName")
    private String busName;
    /** The stop or station from which the bus departs. */
    @JsonProperty("departureBusStop")
    private List<AbstractSchema> departureBusStop;
    /** The stop or station from which the bus arrives. */
    @JsonProperty("arrivalBusStop")
    private List<AbstractSchema> arrivalBusStop;

    public String getBusNumber() { return busNumber; }
    public void setBusNumber(String busNumber) { this.busNumber = busNumber; }
    public String getBusName() { return busName; }
    public void setBusName(String busName) { this.busName = busName; }
    public List<AbstractSchema> getDepartureBusStop() { return departureBusStop; }
    public void setDepartureBusStop(List<AbstractSchema> departureBusStop) { this.departureBusStop = departureBusStop; }
    public List<AbstractSchema> getArrivalBusStop() { return arrivalBusStop; }
    public void setArrivalBusStop(List<AbstractSchema> arrivalBusStop) { this.arrivalBusStop = arrivalBusStop; }
}
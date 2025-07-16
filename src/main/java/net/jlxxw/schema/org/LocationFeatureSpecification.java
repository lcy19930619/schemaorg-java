package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import net.jlxxw.schema.org.JsonLdType;
public class LocationFeatureSpecification extends PropertyValue {
    public LocationFeatureSpecification() {
}
    /** The hours during which this service or contact is available. */
    @JsonProperty("hoursAvailable")
    private AbstractSchema hoursAvailable;
    /** The date when the item becomes valid. */
    @JsonProperty("validFrom")
    private java.time.LocalDate validFrom;
    /** The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours. */
    @JsonProperty("validThrough")
    private java.time.LocalDate validThrough;

    public AbstractSchema getHoursAvailable() { return hoursAvailable; }
    public void setHoursAvailable(AbstractSchema hoursAvailable) { this.hoursAvailable = hoursAvailable; }
    public java.time.LocalDate getValidFrom() { return validFrom; }
    public void setValidFrom(java.time.LocalDate validFrom) { this.validFrom = validFrom; }
    public java.time.LocalDate getValidThrough() { return validThrough; }
    public void setValidThrough(java.time.LocalDate validThrough) { this.validThrough = validThrough; }
}
package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class BedDetails extends Intangible {
    public BedDetails() {
}
    /** The quantity of the given bed type available in the HotelRoom, Suite, House, or Apartment. */
    @JsonProperty("numberOfBeds")
    private Double numberOfBeds;
    /** The type of bed to which the BedDetail refers, i.e. the type of bed available in the quantity indicated by quantity. */
    @JsonProperty("typeOfBed")
    private String typeOfBed;

    public Double getNumberOfBeds() { return numberOfBeds; }
    public void setNumberOfBeds(Double numberOfBeds) { this.numberOfBeds = numberOfBeds; }
    public String getTypeOfBed() { return typeOfBed; }
    public void setTypeOfBed(String typeOfBed) { this.typeOfBed = typeOfBed; }
}
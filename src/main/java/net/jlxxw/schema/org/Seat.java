package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class Seat extends Intangible {
    public Seat() {
}
    /** The location of the reserved seat (e.g., 27). */
    @JsonProperty("seatNumber")
    private String seatNumber;
    /** The row location of the reserved seat (e.g., B). */
    @JsonProperty("seatRow")
    private String seatRow;
    /** The section location of the reserved seat (e.g. Orchestra). */
    @JsonProperty("seatSection")
    private String seatSection;
    /** The type/class of the seat. */
    @JsonProperty("seatingType")
    private String seatingType;

    public String getSeatNumber() { return seatNumber; }
    public void setSeatNumber(String seatNumber) { this.seatNumber = seatNumber; }
    public String getSeatRow() { return seatRow; }
    public void setSeatRow(String seatRow) { this.seatRow = seatRow; }
    public String getSeatSection() { return seatSection; }
    public void setSeatSection(String seatSection) { this.seatSection = seatSection; }
    public String getSeatingType() { return seatingType; }
    public void setSeatingType(String seatingType) { this.seatingType = seatingType; }
}
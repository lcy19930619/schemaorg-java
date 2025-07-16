package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import net.jlxxw.schema.org.JsonLdType;
public class RentAction extends TradeAction {
    public RentAction() {
}
    /** A sub property of participant. The owner of the real estate property. */
    @JsonProperty("landlord")
    private List<AbstractSchema> landlord;

    public List<AbstractSchema> getLandlord() { return landlord; }
    public void setLandlord(List<AbstractSchema> landlord) { this.landlord = landlord; }
}
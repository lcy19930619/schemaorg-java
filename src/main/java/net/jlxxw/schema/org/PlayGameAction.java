package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class PlayGameAction extends ConsumeAction {
    public PlayGameAction() {
}
    /** Indicates the availability type of the game content associated with this action, such as whether it is a full version or a demo. */
    @JsonProperty("gameAvailabilityType")
    private String gameAvailabilityType;

    public String getGameAvailabilityType() { return gameAvailabilityType; }
    public void setGameAvailabilityType(String gameAvailabilityType) { this.gameAvailabilityType = gameAvailabilityType; }
}
package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import net.jlxxw.schema.org.JsonLdType;
public class EndorseAction extends ReactAction {
    public EndorseAction() {
}
    /** A sub property of participant. The person/organization being supported. */
    @JsonProperty("endorsee")
    private List<AbstractSchema> endorsee;

    public List<AbstractSchema> getEndorsee() { return endorsee; }
    public void setEndorsee(List<AbstractSchema> endorsee) { this.endorsee = endorsee; }
}
package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import net.jlxxw.schema.org.JsonLdType;
public class GiveAction extends TransferAction {
    public GiveAction() {
}
    /** A sub property of participant. The participant who is at the receiving end of the action. */
    @JsonProperty("recipient")
    private List<AbstractSchema> recipient;

    public List<AbstractSchema> getRecipient() { return recipient; }
    public void setRecipient(List<AbstractSchema> recipient) { this.recipient = recipient; }
}
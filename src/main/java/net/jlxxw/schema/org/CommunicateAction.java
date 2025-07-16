package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import net.jlxxw.schema.org.JsonLdType;
public class CommunicateAction extends InteractAction {
    public CommunicateAction() {
}
    /** A sub property of participant. The participant who is at the receiving end of the action. */
    @JsonProperty("recipient")
    private List<AbstractSchema> recipient;
    /** The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]]. */
    @JsonProperty("inLanguage")
    private String inLanguage;
    /** The subject matter of the content. */
    @JsonProperty("about")
    private Thing about;

    public List<AbstractSchema> getRecipient() { return recipient; }
    public void setRecipient(List<AbstractSchema> recipient) { this.recipient = recipient; }
    public String getInLanguage() { return inLanguage; }
    public void setInLanguage(String inLanguage) { this.inLanguage = inLanguage; }
    public Thing getAbout() { return about; }
    public void setAbout(Thing about) { this.about = about; }
}
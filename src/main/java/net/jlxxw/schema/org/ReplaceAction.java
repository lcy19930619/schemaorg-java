package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class ReplaceAction extends UpdateAction {
    public ReplaceAction() {
}
    /** A sub property of object. The object that is being replaced. */
    @JsonProperty("replacee")
    private Thing replacee;
    /** A sub property of object. The object that replaces. */
    @JsonProperty("replacer")
    private Thing replacer;

    public Thing getReplacee() { return replacee; }
    public void setReplacee(Thing replacee) { this.replacee = replacee; }
    public Thing getReplacer() { return replacer; }
    public void setReplacer(Thing replacer) { this.replacer = replacer; }
}
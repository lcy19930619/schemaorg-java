package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class UpdateAction extends Action {
    public UpdateAction() {
}
    /** A sub property of object. The collection target of the action. */
    @JsonProperty("targetCollection")
    private Thing targetCollection;

    public Thing getTargetCollection() { return targetCollection; }
    public void setTargetCollection(Thing targetCollection) { this.targetCollection = targetCollection; }
}
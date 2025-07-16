package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import net.jlxxw.schema.org.JsonLdType;
public class PublicationEvent extends Event {
    public PublicationEvent() {
}
    /** A flag to signal that the item, event, or place is accessible for free. */
    @JsonProperty("free")
    private Boolean free;
    /** A broadcast service associated with the publication event. */
    @JsonProperty("publishedOn")
    private BroadcastService publishedOn;
    /** An agent associated with the publication event. */
    @JsonProperty("publishedBy")
    private List<AbstractSchema> publishedBy;

    public Boolean getFree() { return free; }
    public void setFree(Boolean free) { this.free = free; }
    public BroadcastService getPublishedOn() { return publishedOn; }
    public void setPublishedOn(BroadcastService publishedOn) { this.publishedOn = publishedOn; }
    public List<AbstractSchema> getPublishedBy() { return publishedBy; }
    public void setPublishedBy(List<AbstractSchema> publishedBy) { this.publishedBy = publishedBy; }
}
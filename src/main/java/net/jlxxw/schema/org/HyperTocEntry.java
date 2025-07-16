package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class HyperTocEntry extends CreativeWork {
    public HyperTocEntry() {
}
    /** A media object that encodes this CreativeWork. This property is a synonym for encoding. */
    @JsonProperty("associatedMedia")
    private MediaObject associatedMedia;
    /** Text of an utterances (spoken words, lyrics etc.) that occurs at a certain section of a media object, represented as a [[HyperTocEntry]]. */
    @JsonProperty("utterances")
    private String utterances;
    /** A [[HyperTocEntry]] can have a [[tocContinuation]] indicated, which is another [[HyperTocEntry]] that would be the default next item to play or render. */
    @JsonProperty("tocContinuation")
    private HyperTocEntry tocContinuation;

    public MediaObject getAssociatedMedia() { return associatedMedia; }
    public void setAssociatedMedia(MediaObject associatedMedia) { this.associatedMedia = associatedMedia; }
    public String getUtterances() { return utterances; }
    public void setUtterances(String utterances) { this.utterances = utterances; }
    public HyperTocEntry getTocContinuation() { return tocContinuation; }
    public void setTocContinuation(HyperTocEntry tocContinuation) { this.tocContinuation = tocContinuation; }
}
package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HyperToc extends CreativeWork {
    public HyperToc() {
        setId("schema:HyperToc");
        setType("rdfs:Class");

    }

    /**
     * A media object that encodes this CreativeWork. This property is a synonym for encoding.
     */
    @JsonProperty("associatedMedia")
    private MediaObject associatedMedia;
    /**
     * Indicates a [[HyperTocEntry]] in a [[HyperToc]].
     */
    @JsonProperty("tocEntry")
    private HyperTocEntry tocEntry;

    public MediaObject getAssociatedMedia() {
        return associatedMedia;
    }

    public void setAssociatedMedia(MediaObject associatedMedia) {
        this.associatedMedia = associatedMedia;
    }

    public HyperTocEntry getTocEntry() {
        return tocEntry;
    }

    public void setTocEntry(HyperTocEntry tocEntry) {
        this.tocEntry = tocEntry;
    }
}
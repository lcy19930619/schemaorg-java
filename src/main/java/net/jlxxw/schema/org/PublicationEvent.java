package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class PublicationEvent extends Event {
    {
        setId("schema:PublicationEvent");
        setType("rdfs:Class");

    }

    /**
     * A flag to signal that the item, event, or place is accessible for free.
     */
    @JsonProperty("free")
    private Boolean free;
    /**
     * A broadcast service associated with the publication event.
     */
    @JsonProperty("publishedOn")
    private BroadcastService publishedOn;
    /**
     * An agent associated with the publication event.
     */
    @JsonProperty("publishedBy")
    private List<AbstractSchema> publishedBy;

    public Boolean getFree() {
        return free;
    }

    public void setFree(Boolean free) {
        this.free = free;
    }

    public BroadcastService getPublishedOn() {
        return publishedOn;
    }

    public void setPublishedOn(BroadcastService publishedOn) {
        this.publishedOn = publishedOn;
    }

    public List<AbstractSchema> getPublishedBy() {
        return publishedBy;
    }

    public void setPublishedBy(List<AbstractSchema> publishedBy) {
        this.publishedBy = publishedBy;
    }
}
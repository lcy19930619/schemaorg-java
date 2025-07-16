package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataFeedItem extends Intangible {
    public DataFeedItem() {
        setId("schema:DataFeedItem");
        setType("rdfs:Class");

    }

    /**
     * An entity represented by an entry in a list or data feed (e.g. an 'artist' in a list of 'artists').
     */
    @JsonProperty("item")
    private Thing item;
    /**
     * The date on which the CreativeWork was most recently modified or when the item's entry was modified within a DataFeed.
     */
    @JsonProperty("dateModified")
    private java.time.LocalDate dateModified;
    /**
     * The datetime the item was removed from the DataFeed.
     */
    @JsonProperty("dateDeleted")
    private java.time.LocalDate dateDeleted;
    /**
     * The date on which the CreativeWork was created or the item was added to a DataFeed.
     */
    @JsonProperty("dateCreated")
    private java.time.LocalDate dateCreated;

    public Thing getItem() {
        return item;
    }

    public void setItem(Thing item) {
        this.item = item;
    }

    public java.time.LocalDate getDateModified() {
        return dateModified;
    }

    public void setDateModified(java.time.LocalDate dateModified) {
        this.dateModified = dateModified;
    }

    public java.time.LocalDate getDateDeleted() {
        return dateDeleted;
    }

    public void setDateDeleted(java.time.LocalDate dateDeleted) {
        this.dateDeleted = dateDeleted;
    }

    public java.time.LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(java.time.LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }
}
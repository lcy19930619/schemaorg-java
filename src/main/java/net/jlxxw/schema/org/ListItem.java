package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListItem extends Intangible {
    public ListItem() {
        setId("schema:ListItem");
        setType("rdfs:Class");

    }

    /**
     * An entity represented by an entry in a list or data feed (e.g. an 'artist' in a list of 'artists').
     */
    @JsonProperty("item")
    private Thing item;
    /**
     * The position of an item in a series or sequence of items.
     */
    @JsonProperty("position")
    private String position;
    /**
     * A link to the ListItem that precedes the current one.
     */
    @JsonProperty("previousItem")
    private ListItem previousItem;
    /**
     * A link to the ListItem that follows the current one.
     */
    @JsonProperty("nextItem")
    private ListItem nextItem;

    public Thing getItem() {
        return item;
    }

    public void setItem(Thing item) {
        this.item = item;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public ListItem getPreviousItem() {
        return previousItem;
    }

    public void setPreviousItem(ListItem previousItem) {
        this.previousItem = previousItem;
    }

    public ListItem getNextItem() {
        return nextItem;
    }

    public void setNextItem(ListItem nextItem) {
        this.nextItem = nextItem;
    }
}
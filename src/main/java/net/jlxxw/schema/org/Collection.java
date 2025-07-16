package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Collection extends CreativeWork {
    public Collection() {
    }

    /**
     * {'@language': 'en', '@value': 'The number of items in the [[Collection]].'}
     */
    @JsonProperty("collectionSize")
    private Integer collectionSize;

    public Integer getCollectionSize() {
        return collectionSize;
    }

    public void setCollectionSize(Integer collectionSize) {
        this.collectionSize = collectionSize;
    }
}
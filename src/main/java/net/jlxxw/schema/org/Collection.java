package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class Collection extends CreativeWork {
    {
        setId("schema:Collection");
        setType("rdfs:Class");
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
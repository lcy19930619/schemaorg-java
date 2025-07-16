package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataFeed extends Dataset {
    public DataFeed() {
        setId("schema:DataFeed");
        setType("rdfs:Class");

    }

    /**
     * An item within a data feed. Data feeds may have many elements.
     */
    @JsonProperty("dataFeedElement")
    private String dataFeedElement;

    public String getDataFeedElement() {
        return dataFeedElement;
    }

    public void setDataFeedElement(String dataFeedElement) {
        this.dataFeedElement = dataFeedElement;
    }
}
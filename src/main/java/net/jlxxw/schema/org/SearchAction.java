package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class SearchAction extends Action {
    {
        setId("schema:SearchAction");
        setType("rdfs:Class");

    }

    /**
     * A sub property of instrument. The query used on this action.
     */
    @JsonProperty("query")
    private String query;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
}
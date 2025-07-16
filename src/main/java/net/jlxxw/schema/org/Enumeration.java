package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Enumeration extends Intangible {
    public Enumeration() {
        setId("schema:Enumeration");
        setType("rdfs:Class");

    }

    /**
     * Relates a term (i.e. a property, class or enumeration) to one that supersedes it.
     */
    @JsonProperty("supersededBy")
    private List<AbstractSchema> supersededBy;

    public List<AbstractSchema> getSupersededBy() {
        return supersededBy;
    }

    public void setSupersededBy(List<AbstractSchema> supersededBy) {
        this.supersededBy = supersededBy;
    }
}
package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Audiobook extends AudioObject {
    public Audiobook() {
        setId("schema:Audiobook");
        setType("rdfs:Class");

    }

    /**
     * A person who reads (performs) the audiobook.
     */
    @JsonProperty("readBy")
    private Person readBy;

    public Person getReadBy() {
        return readBy;
    }

    public void setReadBy(Person readBy) {
        this.readBy = readBy;
    }
}
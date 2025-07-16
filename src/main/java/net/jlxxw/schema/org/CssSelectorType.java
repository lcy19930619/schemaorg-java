package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CssSelectorType extends Text {
    public CssSelectorType() {
        setId("schema:CssSelectorType");
        setType("rdfs:Class");
    }
    @JsonProperty("@type")
    private String type;

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }
}
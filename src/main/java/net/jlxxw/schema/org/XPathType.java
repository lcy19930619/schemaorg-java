package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class XPathType extends Text {
    {
        setId("schema:XPathType");
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
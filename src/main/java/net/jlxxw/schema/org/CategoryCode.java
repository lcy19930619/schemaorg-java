package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class CategoryCode extends DefinedTerm {
    {
        setId("schema:CategoryCode");
        setType("rdfs:Class");

    }

    /**
     * A [[CategoryCodeSet]] that contains this category code.
     */
    @JsonProperty("inCodeSet")
    private String inCodeSet;
    /**
     * A short textual code that uniquely identifies the value.
     */
    @JsonProperty("codeValue")
    private String codeValue;

    public String getInCodeSet() {
        return inCodeSet;
    }

    public void setInCodeSet(String inCodeSet) {
        this.inCodeSet = inCodeSet;
    }

    public String getCodeValue() {
        return codeValue;
    }

    public void setCodeValue(String codeValue) {
        this.codeValue = codeValue;
    }
}
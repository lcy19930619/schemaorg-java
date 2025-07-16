package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class ProductCollection extends Collection {
    {
        setId("schema:ProductCollection");
        setType("rdfs:Class");

    }

    /**
     * This links to a node or nodes indicating the exact quantity of the products included in  an [[Offer]] or [[ProductCollection]].
     */
    @JsonProperty("includesObject")
    private TypeAndQuantityNode includesObject;

    public TypeAndQuantityNode getIncludesObject() {
        return includesObject;
    }

    public void setIncludesObject(TypeAndQuantityNode includesObject) {
        this.includesObject = includesObject;
    }
}
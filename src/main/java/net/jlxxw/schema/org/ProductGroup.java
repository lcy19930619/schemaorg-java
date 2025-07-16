package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class ProductGroup extends Product {
    {
        setId("schema:ProductGroup");
        setType("rdfs:Class");

    }

    /**
     * Indicates a textual identifier for a ProductGroup.
     */
    @JsonProperty("productGroupID")
    private String productGroupID;
    /**
     * Indicates the property or properties by which the variants in a [[ProductGroup]] vary, e.g. their size, color etc. Schema.org properties can be referenced by their short name e.g. "color"; terms defined elsewhere can be referenced with their URIs.
     */
    @JsonProperty("variesBy")
    private String variesBy;
    /**
     * Indicates a [[Product]] that is a member of this [[ProductGroup]] (or [[ProductModel]]).
     */
    @JsonProperty("hasVariant")
    private Product hasVariant;

    public String getProductGroupID() {
        return productGroupID;
    }

    public void setProductGroupID(String productGroupID) {
        this.productGroupID = productGroupID;
    }

    public String getVariesBy() {
        return variesBy;
    }

    public void setVariesBy(String variesBy) {
        this.variesBy = variesBy;
    }

    public Product getHasVariant() {
        return hasVariant;
    }

    public void setHasVariant(Product hasVariant) {
        this.hasVariant = hasVariant;
    }
}
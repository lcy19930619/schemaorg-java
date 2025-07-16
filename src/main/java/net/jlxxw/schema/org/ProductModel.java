package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ProductModel extends Product {
    public ProductModel() {
    }

    /**
     * A pointer from a previous, often discontinued variant of the product to its newer variant.
     */
    @JsonProperty("predecessorOf")
    private ProductModel predecessorOf;
    /**
     * Indicates the kind of product that this is a variant of. In the case of [[ProductModel]], this is a pointer (from a ProductModel) to a base product from which this product is a variant. It is safe to infer that the variant inherits all product features from the base model, unless defined locally. This is not transitive. In the case of a [[ProductGroup]], the group description also serves as a template, representing a set of Products that vary on explicitly defined, specific dimensions only (so it defines both a set of variants, as well as which values distinguish amongst those variants). When used with [[ProductGroup]], this property can apply to any [[Product]] included in the group.
     */
    @JsonProperty("isVariantOf")
    private List<AbstractSchema> isVariantOf;
    /**
     * A pointer from a newer variant of a product  to its previous, often discontinued predecessor.
     */
    @JsonProperty("successorOf")
    private ProductModel successorOf;

    public ProductModel getPredecessorOf() {
        return predecessorOf;
    }

    public void setPredecessorOf(ProductModel predecessorOf) {
        this.predecessorOf = predecessorOf;
    }

    public List<AbstractSchema> getIsVariantOf() {
        return isVariantOf;
    }

    public void setIsVariantOf(List<AbstractSchema> isVariantOf) {
        this.isVariantOf = isVariantOf;
    }

    public ProductModel getSuccessorOf() {
        return successorOf;
    }

    public void setSuccessorOf(ProductModel successorOf) {
        this.successorOf = successorOf;
    }
}
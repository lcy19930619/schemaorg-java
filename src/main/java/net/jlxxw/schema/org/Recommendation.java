package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Recommendation extends Review {
    public Recommendation() {
    }

    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @JsonProperty("category")
    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
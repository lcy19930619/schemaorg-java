package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CategoryCodeSet extends DefinedTermSet {
    public CategoryCodeSet() {
        setId("schema:CategoryCodeSet");
        setType("rdfs:Class");

    }

    /**
     * A Category code contained in this code set.
     */
    @JsonProperty("hasCategoryCode")
    private CategoryCode hasCategoryCode;

    public CategoryCode getHasCategoryCode() {
        return hasCategoryCode;
    }

    public void setHasCategoryCode(CategoryCode hasCategoryCode) {
        this.hasCategoryCode = hasCategoryCode;
    }
}
package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class CategoryCodeSet extends DefinedTermSet {
    public CategoryCodeSet() {
}
    /** A Category code contained in this code set. */
    @JsonProperty("hasCategoryCode")
    private CategoryCode hasCategoryCode;

    public CategoryCode getHasCategoryCode() { return hasCategoryCode; }
    public void setHasCategoryCode(CategoryCode hasCategoryCode) { this.hasCategoryCode = hasCategoryCode; }
}
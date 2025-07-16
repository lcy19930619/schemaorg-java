package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class ItemList extends Intangible {
    public ItemList() {
}
    /** Indicates a prototype of the elements in the list that is used to hold aggregate information (ratings, offers, etc.). */
    @JsonProperty("aggregateElement")
    private Thing aggregateElement;
    /** Type of ordering (e.g. Ascending, Descending, Unordered). */
    @JsonProperty("itemListOrder")
    private String itemListOrder;
    /** For itemListElement values, you can use simple strings (e.g. "Peter", "Paul", "Mary"), existing entities, or use ListItem.\n\nText values are best if the elements in the list are plain strings. Existing entities are best for a simple, unordered list of existing things in your data. ListItem is used with ordered lists when you want to provide additional context about the element in that list or when the same item might be in different places in different lists.\n\nNote: The order of elements in your mark-up is not sufficient for indicating the order or elements.  Use ListItem with a 'position' property in such cases. */
    @JsonProperty("itemListElement")
    private String itemListElement;
    /** The number of items in an ItemList. Note that some descriptions might not fully describe all items in a list (e.g., multi-page pagination); in such cases, the numberOfItems would be for the entire list. */
    @JsonProperty("numberOfItems")
    private Integer numberOfItems;

    public Thing getAggregateElement() { return aggregateElement; }
    public void setAggregateElement(Thing aggregateElement) { this.aggregateElement = aggregateElement; }
    public String getItemListOrder() { return itemListOrder; }
    public void setItemListOrder(String itemListOrder) { this.itemListOrder = itemListOrder; }
    public String getItemListElement() { return itemListElement; }
    public void setItemListElement(String itemListElement) { this.itemListElement = itemListElement; }
    public Integer getNumberOfItems() { return numberOfItems; }
    public void setNumberOfItems(Integer numberOfItems) { this.numberOfItems = numberOfItems; }
}
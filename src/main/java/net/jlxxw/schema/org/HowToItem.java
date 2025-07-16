package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class HowToItem extends ListItem {
    public HowToItem() {
}
    /** The required quantity of the item(s). */
    @JsonProperty("requiredQuantity")
    private Double requiredQuantity;

    public Double getRequiredQuantity() { return requiredQuantity; }
    public void setRequiredQuantity(Double requiredQuantity) { this.requiredQuantity = requiredQuantity; }
}
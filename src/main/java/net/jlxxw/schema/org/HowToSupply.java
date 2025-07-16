package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class HowToSupply extends HowToItem {
    public HowToSupply() {
}
    /** The estimated cost of the supply or supplies consumed when performing instructions. */
    @JsonProperty("estimatedCost")
    private String estimatedCost;

    public String getEstimatedCost() { return estimatedCost; }
    public void setEstimatedCost(String estimatedCost) { this.estimatedCost = estimatedCost; }
}
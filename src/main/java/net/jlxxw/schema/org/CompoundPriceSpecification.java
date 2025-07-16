package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class CompoundPriceSpecification extends PriceSpecification {
    public CompoundPriceSpecification() {
}
    /** This property links to all [[UnitPriceSpecification]] nodes that apply in parallel for the [[CompoundPriceSpecification]] node. */
    @JsonProperty("priceComponent")
    private UnitPriceSpecification priceComponent;
    /** Defines the type of a price specified for an offered product, for example a list price, a (temporary) sale price or a manufacturer suggested retail price. If multiple prices are specified for an offer the [[priceType]] property can be used to identify the type of each such specified price. The value of priceType can be specified as a value from enumeration PriceTypeEnumeration or as a free form text string for price types that are not already predefined in PriceTypeEnumeration. */
    @JsonProperty("priceType")
    private String priceType;

    public UnitPriceSpecification getPriceComponent() { return priceComponent; }
    public void setPriceComponent(UnitPriceSpecification priceComponent) { this.priceComponent = priceComponent; }
    public String getPriceType() { return priceType; }
    public void setPriceType(String priceType) { this.priceType = priceType; }
}
package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import net.jlxxw.schema.org.JsonLdType;
public class OfferShippingDetails extends StructuredValue {
    public OfferShippingDetails() {
}
    /** Indicates when shipping to a particular [[shippingDestination]] is not available. */
    @JsonProperty("doesNotShip")
    private Boolean doesNotShip;
    /** The width of the item. */
    @JsonProperty("width")
    private List<AbstractSchema> width;
    /** The weight of the product or person. */
    @JsonProperty("weight")
    private List<AbstractSchema> weight;
    /** The height of the item. */
    @JsonProperty("height")
    private List<AbstractSchema> height;
    /** The shipping rate is the cost of shipping to the specified destination. Typically, the maxValue and currency values (of the [[MonetaryAmount]]) are most appropriate. */
    @JsonProperty("shippingRate")
    private List<AbstractSchema> shippingRate;
    /** The membership program tier an Offer (or a PriceSpecification, OfferShippingDetails, or MerchantReturnPolicy under an Offer) is valid for. */
    @JsonProperty("validForMemberTier")
    private MemberProgramTier validForMemberTier;
    /** indicates (possibly multiple) shipping destinations. These can be defined in several ways, e.g. postalCode ranges. */
    @JsonProperty("shippingDestination")
    private DefinedRegion shippingDestination;
    /** Specification of a shipping service offered by the organization. */
    @JsonProperty("hasShippingService")
    private ShippingService hasShippingService;
    /** The total delay between the receipt of the order and the goods reaching the final customer. */
    @JsonProperty("deliveryTime")
    private ShippingDeliveryTime deliveryTime;
    /** The depth of the item. */
    @JsonProperty("depth")
    private List<AbstractSchema> depth;
    /** Indicates the origin of a shipment, i.e. where it should be coming from. */
    @JsonProperty("shippingOrigin")
    private DefinedRegion shippingOrigin;

    public Boolean getDoesNotShip() { return doesNotShip; }
    public void setDoesNotShip(Boolean doesNotShip) { this.doesNotShip = doesNotShip; }
    public List<AbstractSchema> getWidth() { return width; }
    public void setWidth(List<AbstractSchema> width) { this.width = width; }
    public List<AbstractSchema> getWeight() { return weight; }
    public void setWeight(List<AbstractSchema> weight) { this.weight = weight; }
    public List<AbstractSchema> getHeight() { return height; }
    public void setHeight(List<AbstractSchema> height) { this.height = height; }
    public List<AbstractSchema> getShippingRate() { return shippingRate; }
    public void setShippingRate(List<AbstractSchema> shippingRate) { this.shippingRate = shippingRate; }
    public MemberProgramTier getValidForMemberTier() { return validForMemberTier; }
    public void setValidForMemberTier(MemberProgramTier validForMemberTier) { this.validForMemberTier = validForMemberTier; }
    public DefinedRegion getShippingDestination() { return shippingDestination; }
    public void setShippingDestination(DefinedRegion shippingDestination) { this.shippingDestination = shippingDestination; }
    public ShippingService getHasShippingService() { return hasShippingService; }
    public void setHasShippingService(ShippingService hasShippingService) { this.hasShippingService = hasShippingService; }
    public ShippingDeliveryTime getDeliveryTime() { return deliveryTime; }
    public void setDeliveryTime(ShippingDeliveryTime deliveryTime) { this.deliveryTime = deliveryTime; }
    public List<AbstractSchema> getDepth() { return depth; }
    public void setDepth(List<AbstractSchema> depth) { this.depth = depth; }
    public DefinedRegion getShippingOrigin() { return shippingOrigin; }
    public void setShippingOrigin(DefinedRegion shippingOrigin) { this.shippingOrigin = shippingOrigin; }
}
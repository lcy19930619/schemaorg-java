package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import net.jlxxw.schema.org.JsonLdType;
public class ShippingDeliveryTime extends StructuredValue {
    public ShippingDeliveryTime() {
}
    /** Days of the week when the merchant typically operates, indicated via opening hours markup. */
    @JsonProperty("businessDays")
    private List<DayOfWeek> businessDays;
    /** Order cutoff time allows merchants to describe the time after which they will no longer process orders received on that day. For orders processed after cutoff time, one day gets added to the delivery time estimate. This property is expected to be most typically used via the [[ShippingRateSettings]] publication pattern. The time is indicated using the ISO-8601 Time format, e.g. "23:30:00-05:00" would represent 6:30 pm Eastern Standard Time (EST) which is 5 hours behind Coordinated Universal Time (UTC). */
    @JsonProperty("cutoffTime")
    private AbstractSchema cutoffTime;
    /** The typical delay between the receipt of the order and the goods either leaving the warehouse or being prepared for pickup, in case the delivery method is on site pickup.

In the context of [[ShippingDeliveryTime]], Typical properties: minValue, maxValue, unitCode (d for DAY).  This is by common convention assumed to mean business days (if a unitCode is used, coded as "d"), i.e. only counting days when the business normally operates.

In the context of [[ShippingService]], use the [[ServicePeriod]] format, that contains the same information in a structured form, with cut-off time, business days and duration. */
    @JsonProperty("handlingTime")
    private List<AbstractSchema> handlingTime;
    /** The typical delay the order has been sent for delivery and the goods reach the final customer.

  In the context of [[ShippingDeliveryTime]], use the [[QuantitativeValue]]. Typical properties: minValue, maxValue, unitCode (d for DAY).

  In the context of [[ShippingConditions]], use the [[ServicePeriod]]. It has a duration (as a [[QuantitativeValue]]) and also business days and a cut-off time.
 */
    @JsonProperty("transitTime")
    private List<AbstractSchema> transitTime;

    public List<DayOfWeek> getBusinessDays() { return businessDays; }
    public void setBusinessDays(List<DayOfWeek> businessDays) { this.businessDays = businessDays; }
    public AbstractSchema getCutoffTime() { return cutoffTime; }
    public void setCutoffTime(AbstractSchema cutoffTime) { this.cutoffTime = cutoffTime; }
    public List<AbstractSchema> getHandlingTime() { return handlingTime; }
    public void setHandlingTime(List<AbstractSchema> handlingTime) { this.handlingTime = handlingTime; }
    public List<AbstractSchema> getTransitTime() { return transitTime; }
    public void setTransitTime(List<AbstractSchema> transitTime) { this.transitTime = transitTime; }
}
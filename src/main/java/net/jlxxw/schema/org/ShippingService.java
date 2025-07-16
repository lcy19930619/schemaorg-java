package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ShippingService extends StructuredValue {
    public ShippingService() {
        setId("schema:ShippingService");
        setType("rdfs:Class");

    }

    /**
     * The conditions (constraints, price) applicable to the [[ShippingService]].
     */
    @JsonProperty("shippingConditions")
    private AbstractSchema shippingConditions;
    /**
     * The membership program tier an Offer (or a PriceSpecification, OfferShippingDetails, or MerchantReturnPolicy under an Offer) is valid for.
     */
    @JsonProperty("validForMemberTier")
    private MemberProgramTier validForMemberTier;
    /**
     * Type of fulfillment applicable to the [[ShippingService]].
     */
    @JsonProperty("fulfillmentType")
    private FulfillmentTypeEnumeration fulfillmentType;
    /**
     * The typical delay between the receipt of the order and the goods either leaving the warehouse or being prepared for pickup, in case the delivery method is on site pickup.
     * <p>
     * In the context of [[ShippingDeliveryTime]], Typical properties: minValue, maxValue, unitCode (d for DAY).  This is by common convention assumed to mean business days (if a unitCode is used, coded as "d"), i.e. only counting days when the business normally operates.
     * <p>
     * In the context of [[ShippingService]], use the [[ServicePeriod]] format, that contains the same information in a structured form, with cut-off time, business days and duration.
     */
    @JsonProperty("handlingTime")
    private List<AbstractSchema> handlingTime;

    public AbstractSchema getShippingConditions() {
        return shippingConditions;
    }

    public void setShippingConditions(AbstractSchema shippingConditions) {
        this.shippingConditions = shippingConditions;
    }

    public MemberProgramTier getValidForMemberTier() {
        return validForMemberTier;
    }

    public void setValidForMemberTier(MemberProgramTier validForMemberTier) {
        this.validForMemberTier = validForMemberTier;
    }

    public FulfillmentTypeEnumeration getFulfillmentType() {
        return fulfillmentType;
    }

    public void setFulfillmentType(FulfillmentTypeEnumeration fulfillmentType) {
        this.fulfillmentType = fulfillmentType;
    }

    public List<AbstractSchema> getHandlingTime() {
        return handlingTime;
    }

    public void setHandlingTime(List<AbstractSchema> handlingTime) {
        this.handlingTime = handlingTime;
    }
}
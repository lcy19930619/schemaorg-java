package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class PaymentChargeSpecification extends PriceSpecification {
    {
        setId("schema:PaymentChargeSpecification");
        setType("rdfs:Class");

    }

    /**
     * The payment method(s) to which the payment charge specification applies.
     */
    @JsonProperty("appliesToPaymentMethod")
    private AbstractSchema appliesToPaymentMethod;
    /**
     * The delivery method(s) to which the delivery charge or payment charge specification applies.
     */
    @JsonProperty("appliesToDeliveryMethod")
    private AbstractSchema appliesToDeliveryMethod;

    public AbstractSchema getAppliesToPaymentMethod() {
        return appliesToPaymentMethod;
    }

    public void setAppliesToPaymentMethod(AbstractSchema appliesToPaymentMethod) {
        this.appliesToPaymentMethod = appliesToPaymentMethod;
    }

    public AbstractSchema getAppliesToDeliveryMethod() {
        return appliesToDeliveryMethod;
    }

    public void setAppliesToDeliveryMethod(AbstractSchema appliesToDeliveryMethod) {
        this.appliesToDeliveryMethod = appliesToDeliveryMethod;
    }
}
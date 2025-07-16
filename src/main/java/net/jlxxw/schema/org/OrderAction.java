package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderAction extends TradeAction {
    public OrderAction() {
    }

    /**
     * A sub property of instrument. The method of delivery.
     */
    @JsonProperty("deliveryMethod")
    private AbstractSchema deliveryMethod;

    public AbstractSchema getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(AbstractSchema deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }
}
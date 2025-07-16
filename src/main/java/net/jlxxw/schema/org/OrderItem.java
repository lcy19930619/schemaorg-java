package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class OrderItem extends Intangible {
    public OrderItem() {
        setId("schema:OrderItem");
        setType("rdfs:Class");

    }

    /**
     * The delivery of the parcel related to this order or order item.
     */
    @JsonProperty("orderDelivery")
    private ParcelDelivery orderDelivery;
    /**
     * The current status of the order item.
     */
    @JsonProperty("orderItemStatus")
    private AbstractSchema orderItemStatus;
    /**
     * The item ordered.
     */
    @JsonProperty("orderedItem")
    private List<AbstractSchema> orderedItem;
    /**
     * The number of the item ordered. If the property is not set, assume the quantity is one.
     */
    @JsonProperty("orderQuantity")
    private Double orderQuantity;
    /**
     * The identifier of the order item.
     */
    @JsonProperty("orderItemNumber")
    private String orderItemNumber;

    public ParcelDelivery getOrderDelivery() {
        return orderDelivery;
    }

    public void setOrderDelivery(ParcelDelivery orderDelivery) {
        this.orderDelivery = orderDelivery;
    }

    public AbstractSchema getOrderItemStatus() {
        return orderItemStatus;
    }

    public void setOrderItemStatus(AbstractSchema orderItemStatus) {
        this.orderItemStatus = orderItemStatus;
    }

    public List<AbstractSchema> getOrderedItem() {
        return orderedItem;
    }

    public void setOrderedItem(List<AbstractSchema> orderedItem) {
        this.orderedItem = orderedItem;
    }

    public Double getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(Double orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public String getOrderItemNumber() {
        return orderItemNumber;
    }

    public void setOrderItemNumber(String orderItemNumber) {
        this.orderItemNumber = orderItemNumber;
    }
}
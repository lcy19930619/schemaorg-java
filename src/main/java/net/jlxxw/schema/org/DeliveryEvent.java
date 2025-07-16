package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeliveryEvent extends Event {
    public DeliveryEvent() {
        setId("schema:DeliveryEvent");
        setType("rdfs:Class");

    }

    /**
     * After this date, the item will no longer be available for pickup.
     */
    @JsonProperty("availableThrough")
    private java.time.LocalDateTime availableThrough;
    /**
     * Method used for delivery or shipping.
     */
    @JsonProperty("hasDeliveryMethod")
    private AbstractSchema hasDeliveryMethod;
    /**
     * When the item is available for pickup from the store, locker, etc.
     */
    @JsonProperty("availableFrom")
    private java.time.LocalDateTime availableFrom;
    /**
     * Password, PIN, or access code needed for delivery (e.g. from a locker).
     */
    @JsonProperty("accessCode")
    private String accessCode;

    public java.time.LocalDateTime getAvailableThrough() {
        return availableThrough;
    }

    public void setAvailableThrough(java.time.LocalDateTime availableThrough) {
        this.availableThrough = availableThrough;
    }

    public AbstractSchema getHasDeliveryMethod() {
        return hasDeliveryMethod;
    }

    public void setHasDeliveryMethod(AbstractSchema hasDeliveryMethod) {
        this.hasDeliveryMethod = hasDeliveryMethod;
    }

    public java.time.LocalDateTime getAvailableFrom() {
        return availableFrom;
    }

    public void setAvailableFrom(java.time.LocalDateTime availableFrom) {
        this.availableFrom = availableFrom;
    }

    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }
}
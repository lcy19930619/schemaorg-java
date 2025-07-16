package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ParcelDelivery extends Intangible {
    public ParcelDelivery() {
    }

    /**
     * 'carrier' is an out-dated term indicating the 'provider' for parcel delivery and flights.
     */
    @JsonProperty("carrier")
    private Organization carrier;
    /**
     * The overall order the items in this delivery were included in.
     */
    @JsonProperty("partOfOrder")
    private Order partOfOrder;
    /**
     * Tracking url for the parcel delivery.
     */
    @JsonProperty("trackingUrl")
    private String trackingUrl;
    /**
     * The earliest date the package may arrive.
     */
    @JsonProperty("expectedArrivalFrom")
    private java.time.LocalDate expectedArrivalFrom;
    /**
     * Item(s) being shipped.
     */
    @JsonProperty("itemShipped")
    private Product itemShipped;
    /**
     * Shipper tracking number.
     */
    @JsonProperty("trackingNumber")
    private String trackingNumber;
    /**
     * Method used for delivery or shipping.
     */
    @JsonProperty("hasDeliveryMethod")
    private AbstractSchema hasDeliveryMethod;
    /**
     * The latest date the package may arrive.
     */
    @JsonProperty("expectedArrivalUntil")
    private java.time.LocalDate expectedArrivalUntil;
    /**
     * New entry added as the package passes through each leg of its journey (from shipment to final delivery).
     */
    @JsonProperty("deliveryStatus")
    private DeliveryEvent deliveryStatus;
    /**
     * Destination address.
     */
    @JsonProperty("deliveryAddress")
    private PostalAddress deliveryAddress;
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @JsonProperty("provider")
    private List<AbstractSchema> provider;
    /**
     * Shipper's address.
     */
    @JsonProperty("originAddress")
    private PostalAddress originAddress;

    public Organization getCarrier() {
        return carrier;
    }

    public void setCarrier(Organization carrier) {
        this.carrier = carrier;
    }

    public Order getPartOfOrder() {
        return partOfOrder;
    }

    public void setPartOfOrder(Order partOfOrder) {
        this.partOfOrder = partOfOrder;
    }

    public String getTrackingUrl() {
        return trackingUrl;
    }

    public void setTrackingUrl(String trackingUrl) {
        this.trackingUrl = trackingUrl;
    }

    public java.time.LocalDate getExpectedArrivalFrom() {
        return expectedArrivalFrom;
    }

    public void setExpectedArrivalFrom(java.time.LocalDate expectedArrivalFrom) {
        this.expectedArrivalFrom = expectedArrivalFrom;
    }

    public Product getItemShipped() {
        return itemShipped;
    }

    public void setItemShipped(Product itemShipped) {
        this.itemShipped = itemShipped;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public AbstractSchema getHasDeliveryMethod() {
        return hasDeliveryMethod;
    }

    public void setHasDeliveryMethod(AbstractSchema hasDeliveryMethod) {
        this.hasDeliveryMethod = hasDeliveryMethod;
    }

    public java.time.LocalDate getExpectedArrivalUntil() {
        return expectedArrivalUntil;
    }

    public void setExpectedArrivalUntil(java.time.LocalDate expectedArrivalUntil) {
        this.expectedArrivalUntil = expectedArrivalUntil;
    }

    public DeliveryEvent getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(DeliveryEvent deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public PostalAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(PostalAddress deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public List<AbstractSchema> getProvider() {
        return provider;
    }

    public void setProvider(List<AbstractSchema> provider) {
        this.provider = provider;
    }

    public PostalAddress getOriginAddress() {
        return originAddress;
    }

    public void setOriginAddress(PostalAddress originAddress) {
        this.originAddress = originAddress;
    }
}
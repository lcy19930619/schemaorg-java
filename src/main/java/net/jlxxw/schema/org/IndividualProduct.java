package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IndividualProduct extends Product {
    public IndividualProduct() {
    }

    /**
     * The serial number or any alphanumeric identifier of a particular product. When attached to an offer, it is a shortcut for the serial number of the product included in the offer.
     */
    @JsonProperty("serialNumber")
    private String serialNumber;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
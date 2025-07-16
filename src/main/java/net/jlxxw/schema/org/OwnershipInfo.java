package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class OwnershipInfo extends StructuredValue {
    public OwnershipInfo() {
        setId("schema:OwnershipInfo");
        setType("rdfs:Class");

    }

    /**
     * The date and time of obtaining the product.
     */
    @JsonProperty("ownedFrom")
    private java.time.LocalDateTime ownedFrom;
    /**
     * The date and time of giving up ownership on the product.
     */
    @JsonProperty("ownedThrough")
    private java.time.LocalDateTime ownedThrough;
    /**
     * The organization or person from which the product was acquired.
     */
    @JsonProperty("acquiredFrom")
    private List<AbstractSchema> acquiredFrom;
    /**
     * The product that this structured value is referring to.
     */
    @JsonProperty("typeOfGood")
    private List<AbstractSchema> typeOfGood;

    public java.time.LocalDateTime getOwnedFrom() {
        return ownedFrom;
    }

    public void setOwnedFrom(java.time.LocalDateTime ownedFrom) {
        this.ownedFrom = ownedFrom;
    }

    public java.time.LocalDateTime getOwnedThrough() {
        return ownedThrough;
    }

    public void setOwnedThrough(java.time.LocalDateTime ownedThrough) {
        this.ownedThrough = ownedThrough;
    }

    public List<AbstractSchema> getAcquiredFrom() {
        return acquiredFrom;
    }

    public void setAcquiredFrom(List<AbstractSchema> acquiredFrom) {
        this.acquiredFrom = acquiredFrom;
    }

    public List<AbstractSchema> getTypeOfGood() {
        return typeOfGood;
    }

    public void setTypeOfGood(List<AbstractSchema> typeOfGood) {
        this.typeOfGood = typeOfGood;
    }
}
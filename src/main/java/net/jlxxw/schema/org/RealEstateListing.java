package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class RealEstateListing extends WebPage {
    public RealEstateListing() {
    }

    /**
     * Publication date of an online listing.
     */
    @JsonProperty("datePosted")
    private java.time.LocalDate datePosted;
    /**
     * Length of the lease for some [[Accommodation]], either particular to some [[Offer]] or in some cases intrinsic to the property.
     */
    @JsonProperty("leaseLength")
    private List<AbstractSchema> leaseLength;

    public java.time.LocalDate getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(java.time.LocalDate datePosted) {
        this.datePosted = datePosted;
    }

    public List<AbstractSchema> getLeaseLength() {
        return leaseLength;
    }

    public void setLeaseLength(List<AbstractSchema> leaseLength) {
        this.leaseLength = leaseLength;
    }
}
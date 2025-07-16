package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Permit extends Intangible {
    public Permit() {
        setId("schema:Permit");
        setType("rdfs:Class");

    }

    /**
     * The target audience for this permit.
     */
    @JsonProperty("permitAudience")
    private Audience permitAudience;
    /**
     * The date when the item becomes valid.
     */
    @JsonProperty("validFrom")
    private java.time.LocalDate validFrom;
    /**
     * The duration of validity of a permit or similar thing.
     */
    @JsonProperty("validFor")
    private Duration validFor;
    /**
     * The geographic area where the item is valid. Applies for example to a [[Permit]], a [[Certification]], or an [[EducationalOccupationalCredential]].
     */
    @JsonProperty("validIn")
    private AdministrativeArea validIn;
    /**
     * The organization issuing the item, for example a [[Permit]], [[Ticket]], or [[Certification]].
     */
    @JsonProperty("issuedBy")
    private Organization issuedBy;
    /**
     * The date when the item is no longer valid.
     */
    @JsonProperty("validUntil")
    private java.time.LocalDate validUntil;
    /**
     * The service through which the permit was granted.
     */
    @JsonProperty("issuedThrough")
    private Service issuedThrough;

    public Audience getPermitAudience() {
        return permitAudience;
    }

    public void setPermitAudience(Audience permitAudience) {
        this.permitAudience = permitAudience;
    }

    public java.time.LocalDate getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(java.time.LocalDate validFrom) {
        this.validFrom = validFrom;
    }

    public Duration getValidFor() {
        return validFor;
    }

    public void setValidFor(Duration validFor) {
        this.validFor = validFor;
    }

    public AdministrativeArea getValidIn() {
        return validIn;
    }

    public void setValidIn(AdministrativeArea validIn) {
        this.validIn = validIn;
    }

    public Organization getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(Organization issuedBy) {
        this.issuedBy = issuedBy;
    }

    public java.time.LocalDate getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(java.time.LocalDate validUntil) {
        this.validUntil = validUntil;
    }

    public Service getIssuedThrough() {
        return issuedThrough;
    }

    public void setIssuedThrough(Service issuedThrough) {
        this.issuedThrough = issuedThrough;
    }
}
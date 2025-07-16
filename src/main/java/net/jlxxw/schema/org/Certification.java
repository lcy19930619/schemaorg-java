package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Certification extends CreativeWork {
    public Certification() {
        setId("schema:Certification");
        setType("rdfs:Class");

    }

    /**
     * Date the content expires and is no longer useful or available. For example a [[VideoObject]] or [[NewsArticle]] whose availability or relevance is time-limited, a [[ClaimReview]] fact check whose publisher wants to indicate that it may no longer be relevant (or helpful to highlight) after some date, or a [[Certification]] the validity has expired.
     */
    @JsonProperty("expires")
    private java.time.LocalDateTime expires;
    /**
     * A measurement of an item, For example, the inseam of pants, the wheel size of a bicycle, the gauge of a screw, or the carbon footprint measured for certification by an authority. Usually an exact measurement, but can also be a range of measurements for adjustable products, for example belts and ski bindings.
     */
    @JsonProperty("hasMeasurement")
    private QuantitativeValue hasMeasurement;
    /**
     * The date when the item becomes valid.
     */
    @JsonProperty("validFrom")
    private java.time.LocalDate validFrom;
    /**
     * Identifier of a certification instance (as registered with an independent certification body). Typically this identifier can be used to consult and verify the certification instance. See also [gs1:certificationIdentification](https://www.gs1.org/voc/certificationIdentification).
     */
    @JsonProperty("certificationIdentification")
    private String certificationIdentification;
    /**
     * Indicates the current status of a certification: active or inactive. See also  [gs1:certificationStatus](https://www.gs1.org/voc/certificationStatus).
     */
    @JsonProperty("certificationStatus")
    private CertificationStatusEnumeration certificationStatus;
    /**
     * Date of first publication or broadcast. For example the date a [[CreativeWork]] was broadcast or a [[Certification]] was issued.
     */
    @JsonProperty("datePublished")
    private java.time.LocalDate datePublished;
    /**
     * Date when a certification was last audited. See also  [gs1:certificationAuditDate](https://www.gs1.org/voc/certificationAuditDate).
     */
    @JsonProperty("auditDate")
    private java.time.LocalDate auditDate;
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
     * Rating of a certification instance (as defined by an independent certification body). Typically this rating can be used to rate the level to which the requirements of the certification instance are fulfilled. See also [gs1:certificationValue](https://www.gs1.org/voc/certificationValue).
     */
    @JsonProperty("certificationRating")
    private Rating certificationRating;
    /**
     * An associated logo.
     */
    @JsonProperty("logo")
    private String logo;
    /**
     * The subject matter of the content.
     */
    @JsonProperty("about")
    private Thing about;

    public java.time.LocalDateTime getExpires() {
        return expires;
    }

    public void setExpires(java.time.LocalDateTime expires) {
        this.expires = expires;
    }

    public QuantitativeValue getHasMeasurement() {
        return hasMeasurement;
    }

    public void setHasMeasurement(QuantitativeValue hasMeasurement) {
        this.hasMeasurement = hasMeasurement;
    }

    public java.time.LocalDate getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(java.time.LocalDate validFrom) {
        this.validFrom = validFrom;
    }

    public String getCertificationIdentification() {
        return certificationIdentification;
    }

    public void setCertificationIdentification(String certificationIdentification) {
        this.certificationIdentification = certificationIdentification;
    }

    public CertificationStatusEnumeration getCertificationStatus() {
        return certificationStatus;
    }

    public void setCertificationStatus(CertificationStatusEnumeration certificationStatus) {
        this.certificationStatus = certificationStatus;
    }

    public java.time.LocalDate getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(java.time.LocalDate datePublished) {
        this.datePublished = datePublished;
    }

    public java.time.LocalDate getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(java.time.LocalDate auditDate) {
        this.auditDate = auditDate;
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

    public Rating getCertificationRating() {
        return certificationRating;
    }

    public void setCertificationRating(Rating certificationRating) {
        this.certificationRating = certificationRating;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Thing getAbout() {
        return about;
    }

    public void setAbout(Thing about) {
        this.about = about;
    }
}
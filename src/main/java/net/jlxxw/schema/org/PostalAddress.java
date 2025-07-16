package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostalAddress extends ContactPoint {
    public PostalAddress() {
        setId("schema:PostalAddress");
        setType("rdfs:Class");

    }

    /**
     * The street address. For example, 1600 Amphitheatre Pkwy.
     */
    @JsonProperty("streetAddress")
    private String streetAddress;
    /**
     * An address extension such as an apartment number, C/O or alternative name.
     */
    @JsonProperty("extendedAddress")
    private String extendedAddress;
    /**
     * The country. Recommended to be in 2-letter [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1) format, for example "US". For backward compatibility, a 3-letter [ISO 3166-1 alpha-3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) country code such as "SGP" or a full country name such as "Singapore" can also be used.
     */
    @JsonProperty("addressCountry")
    private String addressCountry;
    /**
     * The region in which the locality is, and which is in the country. For example, California or another appropriate first-level [Administrative division](https://en.wikipedia.org/wiki/List_of_administrative_divisions_by_country).
     */
    @JsonProperty("addressRegion")
    private String addressRegion;
    /**
     * The postal code. For example, 94043.
     */
    @JsonProperty("postalCode")
    private String postalCode;
    /**
     * The post office box number for PO box addresses.
     */
    @JsonProperty("postOfficeBoxNumber")
    private String postOfficeBoxNumber;
    /**
     * The locality in which the street address is, and which is in the region. For example, Mountain View.
     */
    @JsonProperty("addressLocality")
    private String addressLocality;

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getExtendedAddress() {
        return extendedAddress;
    }

    public void setExtendedAddress(String extendedAddress) {
        this.extendedAddress = extendedAddress;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    public String getAddressRegion() {
        return addressRegion;
    }

    public void setAddressRegion(String addressRegion) {
        this.addressRegion = addressRegion;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostOfficeBoxNumber() {
        return postOfficeBoxNumber;
    }

    public void setPostOfficeBoxNumber(String postOfficeBoxNumber) {
        this.postOfficeBoxNumber = postOfficeBoxNumber;
    }

    public String getAddressLocality() {
        return addressLocality;
    }

    public void setAddressLocality(String addressLocality) {
        this.addressLocality = addressLocality;
    }
}
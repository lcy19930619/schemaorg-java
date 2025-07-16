package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DefinedRegion extends StructuredValue {
    public DefinedRegion() {
        setId("schema:DefinedRegion");
        setType("rdfs:Class");

    }

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
     * A defined range of postal codes.
     */
    @JsonProperty("postalCodeRange")
    private PostalCodeRangeSpecification postalCodeRange;
    /**
     * A defined range of postal codes indicated by a common textual prefix. Used for non-numeric systems such as UK.
     */
    @JsonProperty("postalCodePrefix")
    private String postalCodePrefix;

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

    public PostalCodeRangeSpecification getPostalCodeRange() {
        return postalCodeRange;
    }

    public void setPostalCodeRange(PostalCodeRangeSpecification postalCodeRange) {
        this.postalCodeRange = postalCodeRange;
    }

    public String getPostalCodePrefix() {
        return postalCodePrefix;
    }

    public void setPostalCodePrefix(String postalCodePrefix) {
        this.postalCodePrefix = postalCodePrefix;
    }
}
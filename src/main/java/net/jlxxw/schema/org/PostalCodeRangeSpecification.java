package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostalCodeRangeSpecification extends StructuredValue {
    public PostalCodeRangeSpecification() {
        setId("schema:PostalCodeRangeSpecification");
        setType("rdfs:Class");

    }

    /**
     * Last postal code in the range (included). Needs to be after [[postalCodeBegin]].
     */
    @JsonProperty("postalCodeEnd")
    private String postalCodeEnd;
    /**
     * First postal code in a range (included).
     */
    @JsonProperty("postalCodeBegin")
    private String postalCodeBegin;

    public String getPostalCodeEnd() {
        return postalCodeEnd;
    }

    public void setPostalCodeEnd(String postalCodeEnd) {
        this.postalCodeEnd = postalCodeEnd;
    }

    public String getPostalCodeBegin() {
        return postalCodeBegin;
    }

    public void setPostalCodeBegin(String postalCodeBegin) {
        this.postalCodeBegin = postalCodeBegin;
    }
}
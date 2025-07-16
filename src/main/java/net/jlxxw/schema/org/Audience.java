package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class Audience extends Intangible {
    {
        setId("schema:Audience");
        setType("rdfs:Class");
    }

    /**
     * The geographic area associated with the audience.
     */
    @JsonProperty("geographicArea")
    private AdministrativeArea geographicArea;
    /**
     * The target group associated with a given audience (e.g. veterans, car owners, musicians, etc.).
     */
    @JsonProperty("audienceType")
    private String audienceType;

    public AdministrativeArea getGeographicArea() {
        return geographicArea;
    }

    public void setGeographicArea(AdministrativeArea geographicArea) {
        this.geographicArea = geographicArea;
    }

    public String getAudienceType() {
        return audienceType;
    }

    public void setAudienceType(String audienceType) {
        this.audienceType = audienceType;
    }
}
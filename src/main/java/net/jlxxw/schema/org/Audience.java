package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class Audience extends Intangible {
    public Audience() {
}
    /** The geographic area associated with the audience. */
    @JsonProperty("geographicArea")
    private AdministrativeArea geographicArea;
    /** The target group associated with a given audience (e.g. veterans, car owners, musicians, etc.). */
    @JsonProperty("audienceType")
    private String audienceType;

    public AdministrativeArea getGeographicArea() { return geographicArea; }
    public void setGeographicArea(AdministrativeArea geographicArea) { this.geographicArea = geographicArea; }
    public String getAudienceType() { return audienceType; }
    public void setAudienceType(String audienceType) { this.audienceType = audienceType; }
}
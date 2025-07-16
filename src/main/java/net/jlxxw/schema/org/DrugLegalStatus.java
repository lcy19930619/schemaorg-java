package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class DrugLegalStatus extends MedicalIntangible {
    public DrugLegalStatus() {
}
    /** The location in which the status applies. */
    @JsonProperty("applicableLocation")
    private AdministrativeArea applicableLocation;

    public AdministrativeArea getApplicableLocation() { return applicableLocation; }
    public void setApplicableLocation(AdministrativeArea applicableLocation) { this.applicableLocation = applicableLocation; }
}
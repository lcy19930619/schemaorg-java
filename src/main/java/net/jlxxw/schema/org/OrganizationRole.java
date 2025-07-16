package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class OrganizationRole extends Role {
    public OrganizationRole() {
}
    /** A number associated with a role in an organization, for example, the number on an athlete's jersey. */
    @JsonProperty("numberedPosition")
    private Double numberedPosition;

    public Double getNumberedPosition() { return numberedPosition; }
    public void setNumberedPosition(Double numberedPosition) { this.numberedPosition = numberedPosition; }
}
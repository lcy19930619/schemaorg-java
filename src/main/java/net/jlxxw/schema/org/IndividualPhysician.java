package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class IndividualPhysician extends Physician {
    public IndividualPhysician() {
}
    /** A [[MedicalOrganization]] where the [[IndividualPhysician]] practices. */
    @JsonProperty("practicesAt")
    private MedicalOrganization practicesAt;

    public MedicalOrganization getPracticesAt() { return practicesAt; }
    public void setPracticesAt(MedicalOrganization practicesAt) { this.practicesAt = practicesAt; }
}
package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class MedicalCause extends MedicalEntity {
    public MedicalCause() {
}
    /** The condition, complication, symptom, sign, etc. caused. */
    @JsonProperty("causeOf")
    private MedicalEntity causeOf;

    public MedicalEntity getCauseOf() { return causeOf; }
    public void setCauseOf(MedicalEntity causeOf) { this.causeOf = causeOf; }
}
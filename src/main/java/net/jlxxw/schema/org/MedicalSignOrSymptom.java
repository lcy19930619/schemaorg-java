package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class MedicalSignOrSymptom extends MedicalCondition {
    public MedicalSignOrSymptom() {
}
    /** A possible treatment to address this condition, sign or symptom. */
    @JsonProperty("possibleTreatment")
    private MedicalTherapy possibleTreatment;

    public MedicalTherapy getPossibleTreatment() { return possibleTreatment; }
    public void setPossibleTreatment(MedicalTherapy possibleTreatment) { this.possibleTreatment = possibleTreatment; }
}
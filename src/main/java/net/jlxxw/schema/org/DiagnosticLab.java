package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class DiagnosticLab extends MedicalOrganization {
    public DiagnosticLab() {
}
    /** A diagnostic test or procedure offered by this lab. */
    @JsonProperty("availableTest")
    private MedicalTest availableTest;

    public MedicalTest getAvailableTest() { return availableTest; }
    public void setAvailableTest(MedicalTest availableTest) { this.availableTest = availableTest; }
}
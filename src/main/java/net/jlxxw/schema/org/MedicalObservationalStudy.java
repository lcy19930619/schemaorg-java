package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class MedicalObservationalStudy extends MedicalStudy {
    public MedicalObservationalStudy() {
}
    /** Specifics about the observational study design (enumerated). */
    @JsonProperty("studyDesign")
    private MedicalObservationalStudyDesign studyDesign;

    public MedicalObservationalStudyDesign getStudyDesign() { return studyDesign; }
    public void setStudyDesign(MedicalObservationalStudyDesign studyDesign) { this.studyDesign = studyDesign; }
}
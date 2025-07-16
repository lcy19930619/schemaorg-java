package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import net.jlxxw.schema.org.JsonLdType;
public class MedicalGuideline extends MedicalEntity {
    public MedicalGuideline() {
}
    /** Source of the data used to formulate the guidance, e.g. RCT, consensus opinion, etc. */
    @JsonProperty("evidenceOrigin")
    private String evidenceOrigin;
    /** The medical conditions, treatments, etc. that are the subject of the guideline. */
    @JsonProperty("guidelineSubject")
    private MedicalEntity guidelineSubject;
    /** Date on which this guideline's recommendation was made. */
    @JsonProperty("guidelineDate")
    private java.time.LocalDate guidelineDate;
    /** Strength of evidence of the data used to formulate the guideline (enumerated). */
    @JsonProperty("evidenceLevel")
    private MedicalEvidenceLevel evidenceLevel;

    public String getEvidenceOrigin() { return evidenceOrigin; }
    public void setEvidenceOrigin(String evidenceOrigin) { this.evidenceOrigin = evidenceOrigin; }
    public MedicalEntity getGuidelineSubject() { return guidelineSubject; }
    public void setGuidelineSubject(MedicalEntity guidelineSubject) { this.guidelineSubject = guidelineSubject; }
    public java.time.LocalDate getGuidelineDate() { return guidelineDate; }
    public void setGuidelineDate(java.time.LocalDate guidelineDate) { this.guidelineDate = guidelineDate; }
    public MedicalEvidenceLevel getEvidenceLevel() { return evidenceLevel; }
    public void setEvidenceLevel(MedicalEvidenceLevel evidenceLevel) { this.evidenceLevel = evidenceLevel; }
}
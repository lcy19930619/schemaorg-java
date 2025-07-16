package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MedicalObservationalStudy extends MedicalStudy {
    public MedicalObservationalStudy() {
        setId("schema:MedicalObservationalStudy");
        setType("rdfs:Class");

    }

    /**
     * Specifics about the observational study design (enumerated).
     */
    @JsonProperty("studyDesign")
    private MedicalObservationalStudyDesign studyDesign;

    public MedicalObservationalStudyDesign getStudyDesign() {
        return studyDesign;
    }

    public void setStudyDesign(MedicalObservationalStudyDesign studyDesign) {
        this.studyDesign = studyDesign;
    }
}
package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DDxElement extends MedicalIntangible {
    public DDxElement() {
        setId("schema:DDxElement");
        setType("rdfs:Class");

    }

    /**
     * One of a set of signs and symptoms that can be used to distinguish this diagnosis from others in the differential diagnosis.
     */
    @JsonProperty("distinguishingSign")
    private MedicalSignOrSymptom distinguishingSign;
    /**
     * One or more alternative conditions considered in the differential diagnosis process as output of a diagnosis process.
     */
    @JsonProperty("diagnosis")
    private MedicalCondition diagnosis;

    public MedicalSignOrSymptom getDistinguishingSign() {
        return distinguishingSign;
    }

    public void setDistinguishingSign(MedicalSignOrSymptom distinguishingSign) {
        this.distinguishingSign = distinguishingSign;
    }

    public MedicalCondition getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(MedicalCondition diagnosis) {
        this.diagnosis = diagnosis;
    }
}
package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MedicalSign extends MedicalSignOrSymptom {
    public MedicalSign() {
        setId("schema:MedicalSign");
        setType("rdfs:Class");

    }

    /**
     * A physical examination that can identify this sign.
     */
    @JsonProperty("identifyingExam")
    private PhysicalExam identifyingExam;
    /**
     * A diagnostic test that can identify this sign.
     */
    @JsonProperty("identifyingTest")
    private MedicalTest identifyingTest;

    public PhysicalExam getIdentifyingExam() {
        return identifyingExam;
    }

    public void setIdentifyingExam(PhysicalExam identifyingExam) {
        this.identifyingExam = identifyingExam;
    }

    public MedicalTest getIdentifyingTest() {
        return identifyingTest;
    }

    public void setIdentifyingTest(MedicalTest identifyingTest) {
        this.identifyingTest = identifyingTest;
    }
}
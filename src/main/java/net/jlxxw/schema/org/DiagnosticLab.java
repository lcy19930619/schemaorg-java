package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DiagnosticLab extends MedicalOrganization {
    public DiagnosticLab() {
    }

    /**
     * A diagnostic test or procedure offered by this lab.
     */
    @JsonProperty("availableTest")
    private MedicalTest availableTest;

    public MedicalTest getAvailableTest() {
        return availableTest;
    }

    public void setAvailableTest(MedicalTest availableTest) {
        this.availableTest = availableTest;
    }
}
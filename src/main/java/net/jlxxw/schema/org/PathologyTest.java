package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PathologyTest extends MedicalTest {
    public PathologyTest() {
    }

    /**
     * The type of tissue sample required for the test.
     */
    @JsonProperty("tissueSample")
    private String tissueSample;

    public String getTissueSample() {
        return tissueSample;
    }

    public void setTissueSample(String tissueSample) {
        this.tissueSample = tissueSample;
    }
}
package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ImagingTest extends MedicalTest {
    public ImagingTest() {
    }

    /**
     * Imaging technique used.
     */
    @JsonProperty("imagingTechnique")
    private MedicalImagingTechnique imagingTechnique;

    public MedicalImagingTechnique getImagingTechnique() {
        return imagingTechnique;
    }

    public void setImagingTechnique(MedicalImagingTechnique imagingTechnique) {
        this.imagingTechnique = imagingTechnique;
    }
}
package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MedicalTherapy extends TherapeuticProcedure {
    public MedicalTherapy() {
    }

    /**
     * A therapy that duplicates or overlaps this one.
     */
    @JsonProperty("duplicateTherapy")
    private MedicalTherapy duplicateTherapy;
    /**
     * A contraindication for this therapy.
     */
    @JsonProperty("contraindication")
    private String contraindication;
    /**
     * A possible serious complication and/or serious side effect of this therapy. Serious adverse outcomes include those that are life-threatening; result in death, disability, or permanent damage; require hospitalization or prolong existing hospitalization; cause congenital anomalies or birth defects; or jeopardize the patient and may require medical or surgical intervention to prevent one of the outcomes in this definition.
     */
    @JsonProperty("seriousAdverseOutcome")
    private MedicalEntity seriousAdverseOutcome;

    public MedicalTherapy getDuplicateTherapy() {
        return duplicateTherapy;
    }

    public void setDuplicateTherapy(MedicalTherapy duplicateTherapy) {
        this.duplicateTherapy = duplicateTherapy;
    }

    public String getContraindication() {
        return contraindication;
    }

    public void setContraindication(String contraindication) {
        this.contraindication = contraindication;
    }

    public MedicalEntity getSeriousAdverseOutcome() {
        return seriousAdverseOutcome;
    }

    public void setSeriousAdverseOutcome(MedicalEntity seriousAdverseOutcome) {
        this.seriousAdverseOutcome = seriousAdverseOutcome;
    }
}
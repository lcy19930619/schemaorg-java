package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TherapeuticProcedure extends MedicalProcedure {
    public TherapeuticProcedure() {
    }

    /**
     * Specifying a drug or medicine used in a medication procedure.
     */
    @JsonProperty("drug")
    private AbstractSchema drug;
    /**
     * A possible complication and/or side effect of this therapy. If it is known that an adverse outcome is serious (resulting in death, disability, or permanent damage; requiring hospitalization; or otherwise life-threatening or requiring immediate medical attention), tag it as a seriousAdverseOutcome instead.
     */
    @JsonProperty("adverseOutcome")
    private MedicalEntity adverseOutcome;
    /**
     * A dosing schedule for the drug for a given population, either observed, recommended, or maximum dose based on the type used.
     */
    @JsonProperty("doseSchedule")
    private AbstractSchema doseSchedule;

    public AbstractSchema getDrug() {
        return drug;
    }

    public void setDrug(AbstractSchema drug) {
        this.drug = drug;
    }

    public MedicalEntity getAdverseOutcome() {
        return adverseOutcome;
    }

    public void setAdverseOutcome(MedicalEntity adverseOutcome) {
        this.adverseOutcome = adverseOutcome;
    }

    public AbstractSchema getDoseSchedule() {
        return doseSchedule;
    }

    public void setDoseSchedule(AbstractSchema doseSchedule) {
        this.doseSchedule = doseSchedule;
    }
}
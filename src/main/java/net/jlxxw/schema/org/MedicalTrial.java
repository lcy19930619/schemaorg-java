package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class MedicalTrial extends MedicalStudy {
    public MedicalTrial() {
}
    /** Specifics about the trial design (enumerated). */
    @JsonProperty("trialDesign")
    private MedicalTrialDesign trialDesign;

    public MedicalTrialDesign getTrialDesign() { return trialDesign; }
    public void setTrialDesign(MedicalTrialDesign trialDesign) { this.trialDesign = trialDesign; }
}
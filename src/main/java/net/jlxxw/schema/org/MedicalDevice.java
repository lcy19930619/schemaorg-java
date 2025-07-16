package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class MedicalDevice extends MedicalEntity {
    public MedicalDevice() {
}
    /** A description of the workup, testing, and other preparations required before implanting this device. */
    @JsonProperty("preOp")
    private String preOp;
    /** A contraindication for this therapy. */
    @JsonProperty("contraindication")
    private String contraindication;
    /** A description of the procedure involved in setting up, using, and/or installing the device. */
    @JsonProperty("procedure")
    private String procedure;
    /** A possible serious complication and/or serious side effect of this therapy. Serious adverse outcomes include those that are life-threatening; result in death, disability, or permanent damage; require hospitalization or prolong existing hospitalization; cause congenital anomalies or birth defects; or jeopardize the patient and may require medical or surgical intervention to prevent one of the outcomes in this definition. */
    @JsonProperty("seriousAdverseOutcome")
    private MedicalEntity seriousAdverseOutcome;
    /** A description of the postoperative procedures, care, and/or followups for this device. */
    @JsonProperty("postOp")
    private String postOp;
    /** A possible complication and/or side effect of this therapy. If it is known that an adverse outcome is serious (resulting in death, disability, or permanent damage; requiring hospitalization; or otherwise life-threatening or requiring immediate medical attention), tag it as a seriousAdverseOutcome instead. */
    @JsonProperty("adverseOutcome")
    private MedicalEntity adverseOutcome;

    public String getPreOp() { return preOp; }
    public void setPreOp(String preOp) { this.preOp = preOp; }
    public String getContraindication() { return contraindication; }
    public void setContraindication(String contraindication) { this.contraindication = contraindication; }
    public String getProcedure() { return procedure; }
    public void setProcedure(String procedure) { this.procedure = procedure; }
    public MedicalEntity getSeriousAdverseOutcome() { return seriousAdverseOutcome; }
    public void setSeriousAdverseOutcome(MedicalEntity seriousAdverseOutcome) { this.seriousAdverseOutcome = seriousAdverseOutcome; }
    public String getPostOp() { return postOp; }
    public void setPostOp(String postOp) { this.postOp = postOp; }
    public MedicalEntity getAdverseOutcome() { return adverseOutcome; }
    public void setAdverseOutcome(MedicalEntity adverseOutcome) { this.adverseOutcome = adverseOutcome; }
}
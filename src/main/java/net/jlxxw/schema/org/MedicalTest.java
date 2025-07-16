package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class MedicalTest extends MedicalEntity {
    public MedicalTest() {
}
    /** A condition the test is used to diagnose. */
    @JsonProperty("usedToDiagnose")
    private MedicalCondition usedToDiagnose;
    /** Drugs that affect the test's results. */
    @JsonProperty("affectedBy")
    private AbstractSchema affectedBy;
    /** Range of acceptable values for a typical patient, when applicable. */
    @JsonProperty("normalRange")
    private String normalRange;
    /** Device used to perform the test. */
    @JsonProperty("usesDevice")
    private MedicalDevice usesDevice;
    /** A sign detected by the test. */
    @JsonProperty("signDetected")
    private MedicalSign signDetected;

    public MedicalCondition getUsedToDiagnose() { return usedToDiagnose; }
    public void setUsedToDiagnose(MedicalCondition usedToDiagnose) { this.usedToDiagnose = usedToDiagnose; }
    public AbstractSchema getAffectedBy() { return affectedBy; }
    public void setAffectedBy(AbstractSchema affectedBy) { this.affectedBy = affectedBy; }
    public String getNormalRange() { return normalRange; }
    public void setNormalRange(String normalRange) { this.normalRange = normalRange; }
    public MedicalDevice getUsesDevice() { return usesDevice; }
    public void setUsesDevice(MedicalDevice usesDevice) { this.usesDevice = usesDevice; }
    public MedicalSign getSignDetected() { return signDetected; }
    public void setSignDetected(MedicalSign signDetected) { this.signDetected = signDetected; }
}
package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class MedicalConditionStage extends MedicalIntangible {
    public MedicalConditionStage() {
}
    /** The substage, e.g. 'a' for Stage IIIa. */
    @JsonProperty("subStageSuffix")
    private String subStageSuffix;
    /** The stage represented as a number, e.g. 3. */
    @JsonProperty("stageAsNumber")
    private Double stageAsNumber;

    public String getSubStageSuffix() { return subStageSuffix; }
    public void setSubStageSuffix(String subStageSuffix) { this.subStageSuffix = subStageSuffix; }
    public Double getStageAsNumber() { return stageAsNumber; }
    public void setStageAsNumber(Double stageAsNumber) { this.stageAsNumber = stageAsNumber; }
}
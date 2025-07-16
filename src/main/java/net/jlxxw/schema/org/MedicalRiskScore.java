package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class MedicalRiskScore extends MedicalRiskEstimator {
    public MedicalRiskScore() {
}
    /** The algorithm or rules to follow to compute the score. */
    @JsonProperty("algorithm")
    private String algorithm;

    public String getAlgorithm() { return algorithm; }
    public void setAlgorithm(String algorithm) { this.algorithm = algorithm; }
}
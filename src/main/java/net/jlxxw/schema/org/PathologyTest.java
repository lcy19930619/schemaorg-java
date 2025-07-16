package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class PathologyTest extends MedicalTest {
    public PathologyTest() {
}
    /** The type of tissue sample required for the test. */
    @JsonProperty("tissueSample")
    private String tissueSample;

    public String getTissueSample() { return tissueSample; }
    public void setTissueSample(String tissueSample) { this.tissueSample = tissueSample; }
}
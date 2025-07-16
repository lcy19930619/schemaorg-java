package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class MedicalTestPanel extends MedicalTest {
    public MedicalTestPanel() {
}
    /** A component test of the panel. */
    @JsonProperty("subTest")
    private MedicalTest subTest;

    public MedicalTest getSubTest() { return subTest; }
    public void setSubTest(MedicalTest subTest) { this.subTest = subTest; }
}
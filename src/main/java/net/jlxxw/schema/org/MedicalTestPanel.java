package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class MedicalTestPanel extends MedicalTest {
    {
        setId("schema:MedicalTestPanel");
        setType("rdfs:Class");

    }

    /**
     * A component test of the panel.
     */
    @JsonProperty("subTest")
    private MedicalTest subTest;

    public MedicalTest getSubTest() {
        return subTest;
    }

    public void setSubTest(MedicalTest subTest) {
        this.subTest = subTest;
    }
}
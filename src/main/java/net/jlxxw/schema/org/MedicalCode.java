package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MedicalCode extends CategoryCode {
    public MedicalCode() {
    }

    /**
     * A short textual code that uniquely identifies the value.
     */
    @JsonProperty("codeValue")
    private String codeValue;
    /**
     * The coding system, e.g. 'ICD-10'.
     */
    @JsonProperty("codingSystem")
    private String codingSystem;

    public String getCodeValue() {
        return codeValue;
    }

    public void setCodeValue(String codeValue) {
        this.codeValue = codeValue;
    }

    public String getCodingSystem() {
        return codingSystem;
    }

    public void setCodingSystem(String codingSystem) {
        this.codingSystem = codingSystem;
    }
}
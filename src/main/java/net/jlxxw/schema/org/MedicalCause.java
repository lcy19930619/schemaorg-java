package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MedicalCause extends MedicalEntity {
    public MedicalCause() {
        setId("schema:MedicalCause");
        setType("rdfs:Class");

    }

    /**
     * The condition, complication, symptom, sign, etc. caused.
     */
    @JsonProperty("causeOf")
    private MedicalEntity causeOf;

    public MedicalEntity getCauseOf() {
        return causeOf;
    }

    public void setCauseOf(MedicalEntity causeOf) {
        this.causeOf = causeOf;
    }
}
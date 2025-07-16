package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class Joint extends AnatomicalStructure {
    {
        setId("schema:Joint");
        setType("rdfs:Class");

    }

    /**
     * The biomechanical properties of the bone.
     */
    @JsonProperty("biomechnicalClass")
    private String biomechnicalClass;
    /**
     * The name given to how bone physically connects to each other.
     */
    @JsonProperty("structuralClass")
    private String structuralClass;
    /**
     * The degree of mobility the joint allows.
     */
    @JsonProperty("functionalClass")
    private String functionalClass;

    public String getBiomechnicalClass() {
        return biomechnicalClass;
    }

    public void setBiomechnicalClass(String biomechnicalClass) {
        this.biomechnicalClass = biomechnicalClass;
    }

    public String getStructuralClass() {
        return structuralClass;
    }

    public void setStructuralClass(String structuralClass) {
        this.structuralClass = structuralClass;
    }

    public String getFunctionalClass() {
        return functionalClass;
    }

    public void setFunctionalClass(String functionalClass) {
        this.functionalClass = functionalClass;
    }
}
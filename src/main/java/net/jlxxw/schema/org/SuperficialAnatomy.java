package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class SuperficialAnatomy extends MedicalEntity {
    {
        setId("schema:SuperficialAnatomy");
        setType("rdfs:Class");

    }

    /**
     * Anatomical systems or structures that relate to the superficial anatomy.
     */
    @JsonProperty("relatedAnatomy")
    private List<AbstractSchema> relatedAnatomy;
    /**
     * A medical condition associated with this anatomy.
     */
    @JsonProperty("relatedCondition")
    private MedicalCondition relatedCondition;
    /**
     * The significance associated with the superficial anatomy; as an example, how characteristics of the superficial anatomy can suggest underlying medical conditions or courses of treatment.
     */
    @JsonProperty("significance")
    private String significance;
    /**
     * If applicable, a description of the pathophysiology associated with the anatomical system, including potential abnormal changes in the mechanical, physical, and biochemical functions of the system.
     */
    @JsonProperty("associatedPathophysiology")
    private String associatedPathophysiology;
    /**
     * A medical therapy related to this anatomy.
     */
    @JsonProperty("relatedTherapy")
    private MedicalTherapy relatedTherapy;

    public List<AbstractSchema> getRelatedAnatomy() {
        return relatedAnatomy;
    }

    public void setRelatedAnatomy(List<AbstractSchema> relatedAnatomy) {
        this.relatedAnatomy = relatedAnatomy;
    }

    public MedicalCondition getRelatedCondition() {
        return relatedCondition;
    }

    public void setRelatedCondition(MedicalCondition relatedCondition) {
        this.relatedCondition = relatedCondition;
    }

    public String getSignificance() {
        return significance;
    }

    public void setSignificance(String significance) {
        this.significance = significance;
    }

    public String getAssociatedPathophysiology() {
        return associatedPathophysiology;
    }

    public void setAssociatedPathophysiology(String associatedPathophysiology) {
        this.associatedPathophysiology = associatedPathophysiology;
    }

    public MedicalTherapy getRelatedTherapy() {
        return relatedTherapy;
    }

    public void setRelatedTherapy(MedicalTherapy relatedTherapy) {
        this.relatedTherapy = relatedTherapy;
    }
}
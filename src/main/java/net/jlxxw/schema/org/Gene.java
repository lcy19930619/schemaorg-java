package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Gene extends BioChemEntity {
    public Gene() {
        setId("schema:Gene");
        setType("rdfs:Class");

    }

    /**
     * Another BioChemEntity encoded by this one.
     */
    @JsonProperty("encodesBioChemEntity")
    private BioChemEntity encodesBioChemEntity;
    /**
     * Tissue, organ, biological sample, etc in which activity of this gene has been observed experimentally. For example brain, digestive system.
     */
    @JsonProperty("expressedIn")
    private List<AbstractSchema> expressedIn;
    /**
     * A symbolic representation of a BioChemEntity. For example, a nucleotide sequence of a Gene or an amino acid sequence of a Protein.
     */
    @JsonProperty("hasBioPolymerSequence")
    private String hasBioPolymerSequence;
    /**
     * Another gene which is a variation of this one.
     */
    @JsonProperty("alternativeOf")
    private Gene alternativeOf;

    public BioChemEntity getEncodesBioChemEntity() {
        return encodesBioChemEntity;
    }

    public void setEncodesBioChemEntity(BioChemEntity encodesBioChemEntity) {
        this.encodesBioChemEntity = encodesBioChemEntity;
    }

    public List<AbstractSchema> getExpressedIn() {
        return expressedIn;
    }

    public void setExpressedIn(List<AbstractSchema> expressedIn) {
        this.expressedIn = expressedIn;
    }

    public String getHasBioPolymerSequence() {
        return hasBioPolymerSequence;
    }

    public void setHasBioPolymerSequence(String hasBioPolymerSequence) {
        this.hasBioPolymerSequence = hasBioPolymerSequence;
    }

    public Gene getAlternativeOf() {
        return alternativeOf;
    }

    public void setAlternativeOf(Gene alternativeOf) {
        this.alternativeOf = alternativeOf;
    }
}
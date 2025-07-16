package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Protein extends BioChemEntity {
    public Protein() {
    }

    /**
     * A symbolic representation of a BioChemEntity. For example, a nucleotide sequence of a Gene or an amino acid sequence of a Protein.
     */
    @JsonProperty("hasBioPolymerSequence")
    private String hasBioPolymerSequence;

    public String getHasBioPolymerSequence() {
        return hasBioPolymerSequence;
    }

    public void setHasBioPolymerSequence(String hasBioPolymerSequence) {
        this.hasBioPolymerSequence = hasBioPolymerSequence;
    }
}
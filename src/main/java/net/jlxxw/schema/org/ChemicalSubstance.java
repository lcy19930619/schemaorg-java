package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChemicalSubstance extends BioChemEntity {
    public ChemicalSubstance() {
        setId("schema:ChemicalSubstance");
        setType("rdfs:Class");

    }

    /**
     * The chemical composition describes the identity and relative ratio of the chemical elements that make up the substance.
     */
    @JsonProperty("chemicalComposition")
    private String chemicalComposition;
    /**
     * A role played by the BioChemEntity within a chemical context.
     */
    @JsonProperty("chemicalRole")
    private DefinedTerm chemicalRole;
    /**
     * Intended use of the BioChemEntity by humans.
     */
    @JsonProperty("potentialUse")
    private DefinedTerm potentialUse;

    public String getChemicalComposition() {
        return chemicalComposition;
    }

    public void setChemicalComposition(String chemicalComposition) {
        this.chemicalComposition = chemicalComposition;
    }

    public DefinedTerm getChemicalRole() {
        return chemicalRole;
    }

    public void setChemicalRole(DefinedTerm chemicalRole) {
        this.chemicalRole = chemicalRole;
    }

    public DefinedTerm getPotentialUse() {
        return potentialUse;
    }

    public void setPotentialUse(DefinedTerm potentialUse) {
        this.potentialUse = potentialUse;
    }
}
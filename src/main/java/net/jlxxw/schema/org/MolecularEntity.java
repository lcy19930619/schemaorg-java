package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MolecularEntity extends BioChemEntity {
    public MolecularEntity() {
    }

    /**
     * Non-proprietary identifier for molecular entity that can be used in printed and electronic data sources thus enabling easier linking of diverse data compilations.
     */
    @JsonProperty("inChI")
    private String inChI;
    /**
     * This is the molecular weight of the entity being described, not of the parent. Units should be included in the form '&lt;Number&gt; &lt;unit&gt;', for example '12 amu' or as '&lt;QuantitativeValue&gt;.
     */
    @JsonProperty("molecularWeight")
    private String molecularWeight;
    /**
     * A role played by the BioChemEntity within a chemical context.
     */
    @JsonProperty("chemicalRole")
    private DefinedTerm chemicalRole;
    /**
     * A specification in form of a line notation for describing the structure of chemical species using short ASCII strings.  Double bond stereochemistry \ indicators may need to be escaped in the string in formats where the backslash is an escape character.
     */
    @JsonProperty("smiles")
    private String smiles;
    /**
     * The monoisotopic mass is the sum of the masses of the atoms in a molecule using the unbound, ground-state, rest mass of the principal (most abundant) isotope for each element instead of the isotopic average mass. Please include the units in the form '&lt;Number&gt; &lt;unit&gt;', for example '770.230488 g/mol' or as '&lt;QuantitativeValue&gt;.
     */
    @JsonProperty("monoisotopicMolecularWeight")
    private String monoisotopicMolecularWeight;
    /**
     * Systematic method of naming chemical compounds as recommended by the International Union of Pure and Applied Chemistry (IUPAC).
     */
    @JsonProperty("iupacName")
    private String iupacName;
    /**
     * Intended use of the BioChemEntity by humans.
     */
    @JsonProperty("potentialUse")
    private DefinedTerm potentialUse;
    /**
     * InChIKey is a hashed version of the full InChI (using the SHA-256 algorithm).
     */
    @JsonProperty("inChIKey")
    private String inChIKey;
    /**
     * The empirical formula is the simplest whole number ratio of all the atoms in a molecule.
     */
    @JsonProperty("molecularFormula")
    private String molecularFormula;

    public String getInChI() {
        return inChI;
    }

    public void setInChI(String inChI) {
        this.inChI = inChI;
    }

    public String getMolecularWeight() {
        return molecularWeight;
    }

    public void setMolecularWeight(String molecularWeight) {
        this.molecularWeight = molecularWeight;
    }

    public DefinedTerm getChemicalRole() {
        return chemicalRole;
    }

    public void setChemicalRole(DefinedTerm chemicalRole) {
        this.chemicalRole = chemicalRole;
    }

    public String getSmiles() {
        return smiles;
    }

    public void setSmiles(String smiles) {
        this.smiles = smiles;
    }

    public String getMonoisotopicMolecularWeight() {
        return monoisotopicMolecularWeight;
    }

    public void setMonoisotopicMolecularWeight(String monoisotopicMolecularWeight) {
        this.monoisotopicMolecularWeight = monoisotopicMolecularWeight;
    }

    public String getIupacName() {
        return iupacName;
    }

    public void setIupacName(String iupacName) {
        this.iupacName = iupacName;
    }

    public DefinedTerm getPotentialUse() {
        return potentialUse;
    }

    public void setPotentialUse(DefinedTerm potentialUse) {
        this.potentialUse = potentialUse;
    }

    public String getInChIKey() {
        return inChIKey;
    }

    public void setInChIKey(String inChIKey) {
        this.inChIKey = inChIKey;
    }

    public String getMolecularFormula() {
        return molecularFormula;
    }

    public void setMolecularFormula(String molecularFormula) {
        this.molecularFormula = molecularFormula;
    }
}
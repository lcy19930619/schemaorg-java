package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Taxon extends AbstractSchema {
    public Taxon() {
    }

    /**
     * A Defined Term contained in this term set.
     */
    @JsonProperty("hasDefinedTerm")
    private DefinedTerm hasDefinedTerm;
    /**
     * Closest child taxa of the taxon in question.
     */
    @JsonProperty("childTaxon")
    private String childTaxon;
    /**
     * Closest parent taxon of the taxon in question.
     */
    @JsonProperty("parentTaxon")
    private String parentTaxon;
    /**
     * The taxonomic rank of this taxon given preferably as a URI from a controlled vocabulary – typically the ranks from TDWG TaxonRank ontology or equivalent Wikidata URIs.
     */
    @JsonProperty("taxonRank")
    private String taxonRank;

    public DefinedTerm getHasDefinedTerm() {
        return hasDefinedTerm;
    }

    public void setHasDefinedTerm(DefinedTerm hasDefinedTerm) {
        this.hasDefinedTerm = hasDefinedTerm;
    }

    public String getChildTaxon() {
        return childTaxon;
    }

    public void setChildTaxon(String childTaxon) {
        this.childTaxon = childTaxon;
    }

    public String getParentTaxon() {
        return parentTaxon;
    }

    public void setParentTaxon(String parentTaxon) {
        this.parentTaxon = parentTaxon;
    }

    public String getTaxonRank() {
        return taxonRank;
    }

    public void setTaxonRank(String taxonRank) {
        this.taxonRank = taxonRank;
    }
}
package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class BioChemEntity extends AbstractSchema {
    public BioChemEntity() {
}
    /** A [[Grant]] that directly or indirectly provide funding or sponsorship for this item. See also [[ownershipFundingInfo]]. */
    @JsonProperty("funding")
    private Grant funding;
    /** A common representation such as a protein sequence or chemical structure for this entity. For images use schema.org/image. */
    @JsonProperty("hasRepresentation")
    private String hasRepresentation;
    /** Subcellular location where this BioChemEntity is located; please use PropertyValue if you want to include any evidence. */
    @JsonProperty("isLocatedInSubcellularLocation")
    private String isLocatedInSubcellularLocation;
    /** Disease associated to this BioChemEntity. Such disease can be a MedicalCondition or a URL. If you want to add an evidence supporting the association, please use PropertyValue. */
    @JsonProperty("associatedDisease")
    private String associatedDisease;
    /** The taxonomic grouping of the organism that expresses, encodes, or in some way related to the BioChemEntity. */
    @JsonProperty("taxonomicRange")
    private String taxonomicRange;
    /** A BioChemEntity that is known to interact with this item. */
    @JsonProperty("bioChemInteraction")
    private BioChemEntity bioChemInteraction;
    /** A role played by the BioChemEntity within a biological context. */
    @JsonProperty("biologicalRole")
    private DefinedTerm biologicalRole;
    /** Another BioChemEntity encoding by this one. */
    @JsonProperty("isEncodedByBioChemEntity")
    private Gene isEncodedByBioChemEntity;
    /** Indicates a BioChemEntity that (in some sense) has this BioChemEntity as a part.  */
    @JsonProperty("hasBioChemEntityPart")
    private BioChemEntity hasBioChemEntityPart;
    /** Biological process this BioChemEntity is involved in; please use PropertyValue if you want to include any evidence. */
    @JsonProperty("isInvolvedInBiologicalProcess")
    private String isInvolvedInBiologicalProcess;
    /** Molecular function performed by this BioChemEntity; please use PropertyValue if you want to include any evidence. */
    @JsonProperty("hasMolecularFunction")
    private String hasMolecularFunction;
    /** Indicates a BioChemEntity that is (in some sense) a part of this BioChemEntity.  */
    @JsonProperty("isPartOfBioChemEntity")
    private BioChemEntity isPartOfBioChemEntity;
    /** A similar BioChemEntity, e.g., obtained by fingerprint similarity algorithms. */
    @JsonProperty("bioChemSimilarity")
    private BioChemEntity bioChemSimilarity;

    public Grant getFunding() { return funding; }
    public void setFunding(Grant funding) { this.funding = funding; }
    public String getHasRepresentation() { return hasRepresentation; }
    public void setHasRepresentation(String hasRepresentation) { this.hasRepresentation = hasRepresentation; }
    public String getIsLocatedInSubcellularLocation() { return isLocatedInSubcellularLocation; }
    public void setIsLocatedInSubcellularLocation(String isLocatedInSubcellularLocation) { this.isLocatedInSubcellularLocation = isLocatedInSubcellularLocation; }
    public String getAssociatedDisease() { return associatedDisease; }
    public void setAssociatedDisease(String associatedDisease) { this.associatedDisease = associatedDisease; }
    public String getTaxonomicRange() { return taxonomicRange; }
    public void setTaxonomicRange(String taxonomicRange) { this.taxonomicRange = taxonomicRange; }
    public BioChemEntity getBioChemInteraction() { return bioChemInteraction; }
    public void setBioChemInteraction(BioChemEntity bioChemInteraction) { this.bioChemInteraction = bioChemInteraction; }
    public DefinedTerm getBiologicalRole() { return biologicalRole; }
    public void setBiologicalRole(DefinedTerm biologicalRole) { this.biologicalRole = biologicalRole; }
    public Gene getIsEncodedByBioChemEntity() { return isEncodedByBioChemEntity; }
    public void setIsEncodedByBioChemEntity(Gene isEncodedByBioChemEntity) { this.isEncodedByBioChemEntity = isEncodedByBioChemEntity; }
    public BioChemEntity getHasBioChemEntityPart() { return hasBioChemEntityPart; }
    public void setHasBioChemEntityPart(BioChemEntity hasBioChemEntityPart) { this.hasBioChemEntityPart = hasBioChemEntityPart; }
    public String getIsInvolvedInBiologicalProcess() { return isInvolvedInBiologicalProcess; }
    public void setIsInvolvedInBiologicalProcess(String isInvolvedInBiologicalProcess) { this.isInvolvedInBiologicalProcess = isInvolvedInBiologicalProcess; }
    public String getHasMolecularFunction() { return hasMolecularFunction; }
    public void setHasMolecularFunction(String hasMolecularFunction) { this.hasMolecularFunction = hasMolecularFunction; }
    public BioChemEntity getIsPartOfBioChemEntity() { return isPartOfBioChemEntity; }
    public void setIsPartOfBioChemEntity(BioChemEntity isPartOfBioChemEntity) { this.isPartOfBioChemEntity = isPartOfBioChemEntity; }
    public BioChemEntity getBioChemSimilarity() { return bioChemSimilarity; }
    public void setBioChemSimilarity(BioChemEntity bioChemSimilarity) { this.bioChemSimilarity = bioChemSimilarity; }
}
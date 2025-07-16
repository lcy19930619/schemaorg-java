package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class AnatomicalStructure extends MedicalEntity {
    public AnatomicalStructure() {
}
    /** The anatomical or organ system that this structure is part of. */
    @JsonProperty("partOfSystem")
    private AnatomicalSystem partOfSystem;
    /** An image containing a diagram that illustrates the structure and/or its component substructures and/or connections with other structures. */
    @JsonProperty("diagram")
    private ImageObject diagram;
    /** Other anatomical structures to which this structure is connected. */
    @JsonProperty("connectedTo")
    private AnatomicalStructure connectedTo;
    /** Location in the body of the anatomical structure. */
    @JsonProperty("bodyLocation")
    private String bodyLocation;
    /** A medical condition associated with this anatomy. */
    @JsonProperty("relatedCondition")
    private MedicalCondition relatedCondition;
    /** If applicable, a description of the pathophysiology associated with the anatomical system, including potential abnormal changes in the mechanical, physical, and biochemical functions of the system. */
    @JsonProperty("associatedPathophysiology")
    private String associatedPathophysiology;
    /** A medical therapy related to this anatomy. */
    @JsonProperty("relatedTherapy")
    private MedicalTherapy relatedTherapy;
    /** Component (sub-)structure(s) that comprise this anatomical structure. */
    @JsonProperty("subStructure")
    private AnatomicalStructure subStructure;

    public AnatomicalSystem getPartOfSystem() { return partOfSystem; }
    public void setPartOfSystem(AnatomicalSystem partOfSystem) { this.partOfSystem = partOfSystem; }
    public ImageObject getDiagram() { return diagram; }
    public void setDiagram(ImageObject diagram) { this.diagram = diagram; }
    public AnatomicalStructure getConnectedTo() { return connectedTo; }
    public void setConnectedTo(AnatomicalStructure connectedTo) { this.connectedTo = connectedTo; }
    public String getBodyLocation() { return bodyLocation; }
    public void setBodyLocation(String bodyLocation) { this.bodyLocation = bodyLocation; }
    public MedicalCondition getRelatedCondition() { return relatedCondition; }
    public void setRelatedCondition(MedicalCondition relatedCondition) { this.relatedCondition = relatedCondition; }
    public String getAssociatedPathophysiology() { return associatedPathophysiology; }
    public void setAssociatedPathophysiology(String associatedPathophysiology) { this.associatedPathophysiology = associatedPathophysiology; }
    public MedicalTherapy getRelatedTherapy() { return relatedTherapy; }
    public void setRelatedTherapy(MedicalTherapy relatedTherapy) { this.relatedTherapy = relatedTherapy; }
    public AnatomicalStructure getSubStructure() { return subStructure; }
    public void setSubStructure(AnatomicalStructure subStructure) { this.subStructure = subStructure; }
}
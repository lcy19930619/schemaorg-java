package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import net.jlxxw.schema.org.JsonLdType;
public class AnatomicalSystem extends MedicalEntity {
    public AnatomicalSystem() {
}
    /** A medical condition associated with this anatomy. */
    @JsonProperty("relatedCondition")
    private MedicalCondition relatedCondition;
    /** Specifying something physically contained by something else. Typically used here for the underlying anatomical structures, such as organs, that comprise the anatomical system. */
    @JsonProperty("comprisedOf")
    private List<AbstractSchema> comprisedOf;
    /** Related anatomical structure(s) that are not part of the system but relate or connect to it, such as vascular bundles associated with an organ system. */
    @JsonProperty("relatedStructure")
    private AnatomicalStructure relatedStructure;
    /** If applicable, a description of the pathophysiology associated with the anatomical system, including potential abnormal changes in the mechanical, physical, and biochemical functions of the system. */
    @JsonProperty("associatedPathophysiology")
    private String associatedPathophysiology;
    /** A medical therapy related to this anatomy. */
    @JsonProperty("relatedTherapy")
    private MedicalTherapy relatedTherapy;

    public MedicalCondition getRelatedCondition() { return relatedCondition; }
    public void setRelatedCondition(MedicalCondition relatedCondition) { this.relatedCondition = relatedCondition; }
    public List<AbstractSchema> getComprisedOf() { return comprisedOf; }
    public void setComprisedOf(List<AbstractSchema> comprisedOf) { this.comprisedOf = comprisedOf; }
    public AnatomicalStructure getRelatedStructure() { return relatedStructure; }
    public void setRelatedStructure(AnatomicalStructure relatedStructure) { this.relatedStructure = relatedStructure; }
    public String getAssociatedPathophysiology() { return associatedPathophysiology; }
    public void setAssociatedPathophysiology(String associatedPathophysiology) { this.associatedPathophysiology = associatedPathophysiology; }
    public MedicalTherapy getRelatedTherapy() { return relatedTherapy; }
    public void setRelatedTherapy(MedicalTherapy relatedTherapy) { this.relatedTherapy = relatedTherapy; }
}
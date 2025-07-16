package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class LearningResource extends CreativeWork {
    public LearningResource() {
}
    /** The item being described is intended to help a person learn the competency or learning outcome defined by the referenced term. */
    @JsonProperty("teaches")
    private String teaches;
    /** The predominant type or kind characterizing the learning resource. For example, 'presentation', 'handout'. */
    @JsonProperty("learningResourceType")
    private String learningResourceType;
    /** The level in terms of progression through an educational or training context. Examples of educational levels include 'beginner', 'intermediate' or 'advanced', and formal sets of level indicators. */
    @JsonProperty("educationalLevel")
    private String educationalLevel;
    /** The item being described is intended to assess the competency or learning outcome defined by the referenced term. */
    @JsonProperty("assesses")
    private String assesses;
    /** Knowledge, skill, ability or personal attribute that must be demonstrated by a person or other entity in order to do something such as earn an Educational Occupational Credential or understand a LearningResource. */
    @JsonProperty("competencyRequired")
    private String competencyRequired;
    /** An alignment to an established educational framework.

This property should not be used where the nature of the alignment can be described using a simple property, for example to express that a resource [[teaches]] or [[assesses]] a competency. */
    @JsonProperty("educationalAlignment")
    private AlignmentObject educationalAlignment;
    /** The purpose of a work in the context of education; for example, 'assignment', 'group work'. */
    @JsonProperty("educationalUse")
    private String educationalUse;

    public String getTeaches() { return teaches; }
    public void setTeaches(String teaches) { this.teaches = teaches; }
    public String getLearningResourceType() { return learningResourceType; }
    public void setLearningResourceType(String learningResourceType) { this.learningResourceType = learningResourceType; }
    public String getEducationalLevel() { return educationalLevel; }
    public void setEducationalLevel(String educationalLevel) { this.educationalLevel = educationalLevel; }
    public String getAssesses() { return assesses; }
    public void setAssesses(String assesses) { this.assesses = assesses; }
    public String getCompetencyRequired() { return competencyRequired; }
    public void setCompetencyRequired(String competencyRequired) { this.competencyRequired = competencyRequired; }
    public AlignmentObject getEducationalAlignment() { return educationalAlignment; }
    public void setEducationalAlignment(AlignmentObject educationalAlignment) { this.educationalAlignment = educationalAlignment; }
    public String getEducationalUse() { return educationalUse; }
    public void setEducationalUse(String educationalUse) { this.educationalUse = educationalUse; }
}
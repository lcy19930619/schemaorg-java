package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class AlignmentObject extends Intangible {
    public AlignmentObject() {
}
    /** The name of a node in an established educational framework. */
    @JsonProperty("targetName")
    private String targetName;
    /** A category of alignment between the learning resource and the framework node. Recommended values include: 'requires', 'textComplexity', 'readingLevel', and 'educationalSubject'. */
    @JsonProperty("alignmentType")
    private String alignmentType;
    /** The URL of a node in an established educational framework. */
    @JsonProperty("targetUrl")
    private String targetUrl;
    /** The framework to which the resource being described is aligned. */
    @JsonProperty("educationalFramework")
    private String educationalFramework;
    /** The description of a node in an established educational framework. */
    @JsonProperty("targetDescription")
    private String targetDescription;

    public String getTargetName() { return targetName; }
    public void setTargetName(String targetName) { this.targetName = targetName; }
    public String getAlignmentType() { return alignmentType; }
    public void setAlignmentType(String alignmentType) { this.alignmentType = alignmentType; }
    public String getTargetUrl() { return targetUrl; }
    public void setTargetUrl(String targetUrl) { this.targetUrl = targetUrl; }
    public String getEducationalFramework() { return educationalFramework; }
    public void setEducationalFramework(String educationalFramework) { this.educationalFramework = educationalFramework; }
    public String getTargetDescription() { return targetDescription; }
    public void setTargetDescription(String targetDescription) { this.targetDescription = targetDescription; }
}
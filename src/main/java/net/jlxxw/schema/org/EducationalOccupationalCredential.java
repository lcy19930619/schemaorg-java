package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class EducationalOccupationalCredential extends CreativeWork {
    public EducationalOccupationalCredential() {
}
    /** The level in terms of progression through an educational or training context. Examples of educational levels include 'beginner', 'intermediate' or 'advanced', and formal sets of level indicators. */
    @JsonProperty("educationalLevel")
    private String educationalLevel;
    /** The duration of validity of a permit or similar thing. */
    @JsonProperty("validFor")
    private Duration validFor;
    /** Knowledge, skill, ability or personal attribute that must be demonstrated by a person or other entity in order to do something such as earn an Educational Occupational Credential or understand a LearningResource. */
    @JsonProperty("competencyRequired")
    private String competencyRequired;
    /** An organization that acknowledges the validity, value or utility of a credential. Note: recognition may include a process of quality assurance or accreditation. */
    @JsonProperty("recognizedBy")
    private Organization recognizedBy;
    /** The geographic area where the item is valid. Applies for example to a [[Permit]], a [[Certification]], or an [[EducationalOccupationalCredential]].  */
    @JsonProperty("validIn")
    private AdministrativeArea validIn;
    /** The category or type of credential being described, for example "degree”, “certificate”, “badge”, or more specific term. */
    @JsonProperty("credentialCategory")
    private String credentialCategory;

    public String getEducationalLevel() { return educationalLevel; }
    public void setEducationalLevel(String educationalLevel) { this.educationalLevel = educationalLevel; }
    public Duration getValidFor() { return validFor; }
    public void setValidFor(Duration validFor) { this.validFor = validFor; }
    public String getCompetencyRequired() { return competencyRequired; }
    public void setCompetencyRequired(String competencyRequired) { this.competencyRequired = competencyRequired; }
    public Organization getRecognizedBy() { return recognizedBy; }
    public void setRecognizedBy(Organization recognizedBy) { this.recognizedBy = recognizedBy; }
    public AdministrativeArea getValidIn() { return validIn; }
    public void setValidIn(AdministrativeArea validIn) { this.validIn = validIn; }
    public String getCredentialCategory() { return credentialCategory; }
    public void setCredentialCategory(String credentialCategory) { this.credentialCategory = credentialCategory; }
}
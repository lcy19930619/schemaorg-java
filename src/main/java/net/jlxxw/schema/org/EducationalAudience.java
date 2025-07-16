package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class EducationalAudience extends Audience {
    public EducationalAudience() {
}
    /** An educationalRole of an EducationalAudience. */
    @JsonProperty("educationalRole")
    private String educationalRole;

    public String getEducationalRole() { return educationalRole; }
    public void setEducationalRole(String educationalRole) { this.educationalRole = educationalRole; }
}
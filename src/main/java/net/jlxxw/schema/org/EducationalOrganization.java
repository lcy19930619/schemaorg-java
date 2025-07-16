package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class EducationalOrganization extends Organization {
    public EducationalOrganization() {
}
    /** Alumni of an organization. */
    @JsonProperty("alumni")
    private Person alumni;

    public Person getAlumni() { return alumni; }
    public void setAlumni(Person alumni) { this.alumni = alumni; }
}
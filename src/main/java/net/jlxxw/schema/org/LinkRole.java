package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class LinkRole extends Role {
    public LinkRole() {
}
    /** Indicates the relationship type of a Web link.  */
    @JsonProperty("linkRelationship")
    private String linkRelationship;
    /** The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]]. */
    @JsonProperty("inLanguage")
    private String inLanguage;

    public String getLinkRelationship() { return linkRelationship; }
    public void setLinkRelationship(String linkRelationship) { this.linkRelationship = linkRelationship; }
    public String getInLanguage() { return inLanguage; }
    public void setInLanguage(String inLanguage) { this.inLanguage = inLanguage; }
}
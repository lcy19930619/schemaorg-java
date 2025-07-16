package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class WebSite extends CreativeWork {
    public WebSite() {
}
    /** The International Standard Serial Number (ISSN) that identifies this serial publication. You can repeat this property to identify different formats of, or the linking ISSN (ISSN-L) for, this serial publication. */
    @JsonProperty("issn")
    private String issn;

    public String getIssn() { return issn; }
    public void setIssn(String issn) { this.issn = issn; }
}
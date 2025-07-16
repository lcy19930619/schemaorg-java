package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class DefinedTerm extends Intangible {
    public DefinedTerm() {
}
    /** A [[DefinedTermSet]] that contains this term. */
    @JsonProperty("inDefinedTermSet")
    private String inDefinedTermSet;
    /** A code that identifies this [[DefinedTerm]] within a [[DefinedTermSet]]. */
    @JsonProperty("termCode")
    private String termCode;

    public String getInDefinedTermSet() { return inDefinedTermSet; }
    public void setInDefinedTermSet(String inDefinedTermSet) { this.inDefinedTermSet = inDefinedTermSet; }
    public String getTermCode() { return termCode; }
    public void setTermCode(String termCode) { this.termCode = termCode; }
}
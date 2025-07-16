package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class DefinedTermSet extends CreativeWork {
    public DefinedTermSet() {
}
    /** A Defined Term contained in this term set. */
    @JsonProperty("hasDefinedTerm")
    private DefinedTerm hasDefinedTerm;

    public DefinedTerm getHasDefinedTerm() { return hasDefinedTerm; }
    public void setHasDefinedTerm(DefinedTerm hasDefinedTerm) { this.hasDefinedTerm = hasDefinedTerm; }
}
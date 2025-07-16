package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class CategoryCode extends DefinedTerm {
    public CategoryCode() {
}
    /** A [[CategoryCodeSet]] that contains this category code. */
    @JsonProperty("inCodeSet")
    private String inCodeSet;
    /** A short textual code that uniquely identifies the value. */
    @JsonProperty("codeValue")
    private String codeValue;

    public String getInCodeSet() { return inCodeSet; }
    public void setInCodeSet(String inCodeSet) { this.inCodeSet = inCodeSet; }
    public String getCodeValue() { return codeValue; }
    public void setCodeValue(String codeValue) { this.codeValue = codeValue; }
}
package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class Thesis extends CreativeWork {
    public Thesis() {
}
    /** Qualification, candidature, degree, application that Thesis supports. */
    @JsonProperty("inSupportOf")
    private String inSupportOf;

    public String getInSupportOf() { return inSupportOf; }
    public void setInSupportOf(String inSupportOf) { this.inSupportOf = inSupportOf; }
}
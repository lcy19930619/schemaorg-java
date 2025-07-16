package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class Audiobook extends AudioObject {
    public Audiobook() {
}
    /** A person who reads (performs) the audiobook. */
    @JsonProperty("readBy")
    private Person readBy;

    public Person getReadBy() { return readBy; }
    public void setReadBy(Person readBy) { this.readBy = readBy; }
}
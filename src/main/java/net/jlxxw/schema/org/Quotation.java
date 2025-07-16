package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import net.jlxxw.schema.org.JsonLdType;
public class Quotation extends CreativeWork {
    public Quotation() {
}
    /** The (e.g. fictional) character, Person or Organization to whom the quotation is attributed within the containing CreativeWork. */
    @JsonProperty("spokenByCharacter")
    private List<AbstractSchema> spokenByCharacter;

    public List<AbstractSchema> getSpokenByCharacter() { return spokenByCharacter; }
    public void setSpokenByCharacter(List<AbstractSchema> spokenByCharacter) { this.spokenByCharacter = spokenByCharacter; }
}
package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class ArchiveOrganization extends LocalBusiness {
    public ArchiveOrganization() {
}
    /** {'@language': 'en', '@value': 'Collection, [fonds](https://en.wikipedia.org/wiki/Fonds), or item held, kept or maintained by an [[ArchiveOrganization]].'} */
    @JsonProperty("archiveHeld")
    private ArchiveComponent archiveHeld;

    public ArchiveComponent getArchiveHeld() { return archiveHeld; }
    public void setArchiveHeld(ArchiveComponent archiveHeld) { this.archiveHeld = archiveHeld; }
}
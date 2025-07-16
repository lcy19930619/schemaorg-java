package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class ArchiveComponent extends CreativeWork {
    public ArchiveComponent() {
}
    /** {'@language': 'en', '@value': '[[ArchiveOrganization]] that holds, keeps or maintains the [[ArchiveComponent]].'} */
    @JsonProperty("holdingArchive")
    private ArchiveOrganization holdingArchive;
    /** {'@language': 'en', '@value': 'Current location of the item.'} */
    @JsonProperty("itemLocation")
    private String itemLocation;

    public ArchiveOrganization getHoldingArchive() { return holdingArchive; }
    public void setHoldingArchive(ArchiveOrganization holdingArchive) { this.holdingArchive = holdingArchive; }
    public String getItemLocation() { return itemLocation; }
    public void setItemLocation(String itemLocation) { this.itemLocation = itemLocation; }
}
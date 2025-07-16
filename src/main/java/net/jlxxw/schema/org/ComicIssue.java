package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class ComicIssue extends PublicationIssue {
    public ComicIssue() {
}
    /** The individual who traces over the pencil drawings in ink after pencils are complete. */
    @JsonProperty("inker")
    private Person inker;
    /** The individual who draws the primary narrative artwork. */
    @JsonProperty("penciler")
    private Person penciler;
    /** The primary artist for a work
    	in a medium other than pencils or digital line art--for example, if the
    	primary artwork is done in watercolors or digital paints. */
    @JsonProperty("artist")
    private Person artist;
    /** The individual who adds color to inked drawings. */
    @JsonProperty("colorist")
    private Person colorist;
    /** A description of the variant cover
    	for the issue, if the issue is a variant printing. For example, "Bryan Hitch
    	Variant Cover" or "2nd Printing Variant". */
    @JsonProperty("variantCover")
    private String variantCover;
    /** The individual who adds lettering, including speech balloons and sound effects, to artwork. */
    @JsonProperty("letterer")
    private Person letterer;

    public Person getInker() { return inker; }
    public void setInker(Person inker) { this.inker = inker; }
    public Person getPenciler() { return penciler; }
    public void setPenciler(Person penciler) { this.penciler = penciler; }
    public Person getArtist() { return artist; }
    public void setArtist(Person artist) { this.artist = artist; }
    public Person getColorist() { return colorist; }
    public void setColorist(Person colorist) { this.colorist = colorist; }
    public String getVariantCover() { return variantCover; }
    public void setVariantCover(String variantCover) { this.variantCover = variantCover; }
    public Person getLetterer() { return letterer; }
    public void setLetterer(Person letterer) { this.letterer = letterer; }
}
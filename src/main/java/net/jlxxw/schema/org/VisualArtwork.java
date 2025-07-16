package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import net.jlxxw.schema.org.JsonLdType;
public class VisualArtwork extends CreativeWork {
    public VisualArtwork() {
}
    /** The supporting materials for the artwork, e.g. Canvas, Paper, Wood, Board, etc. */
    @JsonProperty("artworkSurface")
    private String artworkSurface;
    /** A material used as a surface in some artwork, e.g. Canvas, Paper, Wood, Board, etc. */
    @JsonProperty("surface")
    private String surface;
    /** The individual who traces over the pencil drawings in ink after pencils are complete. */
    @JsonProperty("inker")
    private Person inker;
    /** The width of the item. */
    @JsonProperty("width")
    private List<AbstractSchema> width;
    /** The number of copies when multiple copies of a piece of artwork are produced - e.g. for a limited edition of 20 prints, 'artEdition' refers to the total number of copies (in this example "20"). */
    @JsonProperty("artEdition")
    private Integer artEdition;
    /** The weight of the product or person. */
    @JsonProperty("weight")
    private List<AbstractSchema> weight;
    /** The height of the item. */
    @JsonProperty("height")
    private List<AbstractSchema> height;
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
    /** The material used. (E.g. Oil, Watercolour, Acrylic, Linoprint, Marble, Cyanotype, Digital, Lithograph, DryPoint, Intaglio, Pastel, Woodcut, Pencil, Mixed Media, etc.) */
    @JsonProperty("artMedium")
    private String artMedium;
    /** The depth of the item. */
    @JsonProperty("depth")
    private List<AbstractSchema> depth;
    /** The individual who adds lettering, including speech balloons and sound effects, to artwork. */
    @JsonProperty("letterer")
    private Person letterer;
    /** e.g. Painting, Drawing, Sculpture, Print, Photograph, Assemblage, Collage, etc. */
    @JsonProperty("artform")
    private String artform;

    public String getArtworkSurface() { return artworkSurface; }
    public void setArtworkSurface(String artworkSurface) { this.artworkSurface = artworkSurface; }
    public String getSurface() { return surface; }
    public void setSurface(String surface) { this.surface = surface; }
    public Person getInker() { return inker; }
    public void setInker(Person inker) { this.inker = inker; }
    public List<AbstractSchema> getWidth() { return width; }
    public void setWidth(List<AbstractSchema> width) { this.width = width; }
    public Integer getArtEdition() { return artEdition; }
    public void setArtEdition(Integer artEdition) { this.artEdition = artEdition; }
    public List<AbstractSchema> getWeight() { return weight; }
    public void setWeight(List<AbstractSchema> weight) { this.weight = weight; }
    public List<AbstractSchema> getHeight() { return height; }
    public void setHeight(List<AbstractSchema> height) { this.height = height; }
    public Person getPenciler() { return penciler; }
    public void setPenciler(Person penciler) { this.penciler = penciler; }
    public Person getArtist() { return artist; }
    public void setArtist(Person artist) { this.artist = artist; }
    public Person getColorist() { return colorist; }
    public void setColorist(Person colorist) { this.colorist = colorist; }
    public String getArtMedium() { return artMedium; }
    public void setArtMedium(String artMedium) { this.artMedium = artMedium; }
    public List<AbstractSchema> getDepth() { return depth; }
    public void setDepth(List<AbstractSchema> depth) { this.depth = depth; }
    public Person getLetterer() { return letterer; }
    public void setLetterer(Person letterer) { this.letterer = letterer; }
    public String getArtform() { return artform; }
    public void setArtform(String artform) { this.artform = artform; }
}
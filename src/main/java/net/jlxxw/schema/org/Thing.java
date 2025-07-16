package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import net.jlxxw.schema.org.JsonLdType;
public class Thing extends AbstractSchema {
    public Thing() {
}
    /** The identifier property represents any kind of identifier for any kind of [[Thing]], such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See [background notes](/docs/datamodel.html#identifierBg) for more details.
         */
    @JsonProperty("identifier")
    private String identifier;
    /** Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role. */
    @JsonProperty("potentialAction")
    private Action potentialAction;
    /** An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. Typically the value is a URI-identified RDF class, and in this case corresponds to the
    use of rdf:type in RDF. Text values can be used sparingly, for cases where useful information can be added without their being an appropriate schema to reference. In the case of text values, the class label should follow the schema.org <a href="https://schema.org/docs/styleguide.html">style guide</a>. */
    @JsonProperty("additionalType")
    private String additionalType;
    /** The name of the item. */
    @JsonProperty("name")
    private String name;
    /** Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See [background notes](/docs/datamodel.html#mainEntityBackground) for details. */
    @JsonProperty("mainEntityOfPage")
    private String mainEntityOfPage;
    /** URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website. */
    @JsonProperty("sameAs")
    private String sameAs;
    /** A description of the item. */
    @JsonProperty("description")
    private String description;
    /** An image of the item. This can be a [[URL]] or a fully described [[ImageObject]]. */
    @JsonProperty("image")
    private String image;
    /** A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation. */
    @JsonProperty("disambiguatingDescription")
    private String disambiguatingDescription;
    /** A CreativeWork or Event about this Thing. */
    @JsonProperty("subjectOf")
    private List<AbstractSchema> subjectOf;
    /** An alias for the item. */
    @JsonProperty("alternateName")
    private String alternateName;

    public String getIdentifier() { return identifier; }
    public void setIdentifier(String identifier) { this.identifier = identifier; }
    public Action getPotentialAction() { return potentialAction; }
    public void setPotentialAction(Action potentialAction) { this.potentialAction = potentialAction; }
    public String getAdditionalType() { return additionalType; }
    public void setAdditionalType(String additionalType) { this.additionalType = additionalType; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getMainEntityOfPage() { return mainEntityOfPage; }
    public void setMainEntityOfPage(String mainEntityOfPage) { this.mainEntityOfPage = mainEntityOfPage; }
    public String getSameAs() { return sameAs; }
    public void setSameAs(String sameAs) { this.sameAs = sameAs; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }
    public String getDisambiguatingDescription() { return disambiguatingDescription; }
    public void setDisambiguatingDescription(String disambiguatingDescription) { this.disambiguatingDescription = disambiguatingDescription; }
    public List<AbstractSchema> getSubjectOf() { return subjectOf; }
    public void setSubjectOf(List<AbstractSchema> subjectOf) { this.subjectOf = subjectOf; }
    public String getAlternateName() { return alternateName; }
    public void setAlternateName(String alternateName) { this.alternateName = alternateName; }
}
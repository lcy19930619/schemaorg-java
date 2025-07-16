package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import net.jlxxw.schema.org.JsonLdType;
public class Movie extends CreativeWork {
    public Movie() {
}
    /** The production company or studio responsible for the item, e.g. series, video game, episode etc. */
    @JsonProperty("productionCompany")
    private Organization productionCompany;
    /** Languages in which subtitles/captions are available, in [IETF BCP 47 standard format](http://tools.ietf.org/html/bcp47). */
    @JsonProperty("subtitleLanguage")
    private String subtitleLanguage;
    /** The composer of the soundtrack. */
    @JsonProperty("musicBy")
    private List<AbstractSchema> musicBy;
    /** A director of e.g. TV, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip. */
    @JsonProperty("director")
    private Person director;
    /** An [EIDR](https://eidr.org/) (Entertainment Identifier Registry) [[identifier]] representing at the most general/abstract level, a work of film or television.

For example, the motion picture known as "Ghostbusters" has a titleEIDR of  "10.5240/7EC7-228A-510A-053E-CBB8-J". This title (or work) may have several variants, which EIDR calls "edits". See [[editEIDR]].

Since schema.org types like [[Movie]], [[TVEpisode]], [[TVSeason]], and [[TVSeries]] can be used for both works and their multiple expressions, it is possible to use [[titleEIDR]] alone (for a general description), or alongside [[editEIDR]] for a more edit-specific description.
 */
    @JsonProperty("titleEIDR")
    private String titleEIDR;
    /** An actor (individual or a group), e.g. in TV, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip. */
    @JsonProperty("actor")
    private List<AbstractSchema> actor;
    /** The country of origin of something, including products as well as creative  works such as movie and TV content.

In the case of TV and movie, this would be the country of the principle offices of the production company or individual responsible for the movie. For other kinds of [[CreativeWork]] it is difficult to provide fully general guidance, and properties such as [[contentLocation]] and [[locationCreated]] may be more applicable.

In the case of products, the country of origin of the product. The exact interpretation of this may vary by context and product type, and cannot be fully enumerated here. */
    @JsonProperty("countryOfOrigin")
    private Country countryOfOrigin;
    /** The trailer of a movie or TV/radio series, season, episode, etc. */
    @JsonProperty("trailer")
    private VideoObject trailer;
    /** An actor, e.g. in TV, radio, movie, video games etc. Actors can be associated with individual items or with a series, episode, clip. */
    @JsonProperty("actors")
    private Person actors;
    /** A director of e.g. TV, radio, movie, video games etc. content. Directors can be associated with individual items or with a series, episode, clip. */
    @JsonProperty("directors")
    private Person directors;

    public Organization getProductionCompany() { return productionCompany; }
    public void setProductionCompany(Organization productionCompany) { this.productionCompany = productionCompany; }
    public String getSubtitleLanguage() { return subtitleLanguage; }
    public void setSubtitleLanguage(String subtitleLanguage) { this.subtitleLanguage = subtitleLanguage; }
    public List<AbstractSchema> getMusicBy() { return musicBy; }
    public void setMusicBy(List<AbstractSchema> musicBy) { this.musicBy = musicBy; }
    public Person getDirector() { return director; }
    public void setDirector(Person director) { this.director = director; }
    public String getTitleEIDR() { return titleEIDR; }
    public void setTitleEIDR(String titleEIDR) { this.titleEIDR = titleEIDR; }
    public List<AbstractSchema> getActor() { return actor; }
    public void setActor(List<AbstractSchema> actor) { this.actor = actor; }
    public Country getCountryOfOrigin() { return countryOfOrigin; }
    public void setCountryOfOrigin(Country countryOfOrigin) { this.countryOfOrigin = countryOfOrigin; }
    public VideoObject getTrailer() { return trailer; }
    public void setTrailer(VideoObject trailer) { this.trailer = trailer; }
    public Person getActors() { return actors; }
    public void setActors(Person actors) { this.actors = actors; }
    public Person getDirectors() { return directors; }
    public void setDirectors(Person directors) { this.directors = directors; }
}
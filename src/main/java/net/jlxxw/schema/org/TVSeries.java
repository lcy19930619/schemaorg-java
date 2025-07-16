package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import net.jlxxw.schema.org.JsonLdType;
public class TVSeries extends CreativeWork {
    public TVSeries() {
}
    /** The production company or studio responsible for the item, e.g. series, video game, episode etc. */
    @JsonProperty("productionCompany")
    private Organization productionCompany;
    /** An episode of a TV, radio or game media within a series or season. */
    @JsonProperty("episode")
    private AbstractSchema episode;
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
    /** An episode of a TV/radio series or season. */
    @JsonProperty("episodes")
    private AbstractSchema episodes;
    /** The trailer of a movie or TV/radio series, season, episode, etc. */
    @JsonProperty("trailer")
    private VideoObject trailer;
    /** The number of episodes in this season or series. */
    @JsonProperty("numberOfEpisodes")
    private Integer numberOfEpisodes;
    /** A season in a media series. */
    @JsonProperty("seasons")
    private CreativeWorkSeason seasons;
    /** An actor, e.g. in TV, radio, movie, video games etc. Actors can be associated with individual items or with a series, episode, clip. */
    @JsonProperty("actors")
    private Person actors;
    /** A season that is part of the media series. */
    @JsonProperty("containsSeason")
    private CreativeWorkSeason containsSeason;
    /** A director of e.g. TV, radio, movie, video games etc. content. Directors can be associated with individual items or with a series, episode, clip. */
    @JsonProperty("directors")
    private Person directors;
    /** The number of seasons in this series. */
    @JsonProperty("numberOfSeasons")
    private Integer numberOfSeasons;

    public Organization getProductionCompany() { return productionCompany; }
    public void setProductionCompany(Organization productionCompany) { this.productionCompany = productionCompany; }
    public AbstractSchema getEpisode() { return episode; }
    public void setEpisode(AbstractSchema episode) { this.episode = episode; }
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
    public AbstractSchema getEpisodes() { return episodes; }
    public void setEpisodes(AbstractSchema episodes) { this.episodes = episodes; }
    public VideoObject getTrailer() { return trailer; }
    public void setTrailer(VideoObject trailer) { this.trailer = trailer; }
    public Integer getNumberOfEpisodes() { return numberOfEpisodes; }
    public void setNumberOfEpisodes(Integer numberOfEpisodes) { this.numberOfEpisodes = numberOfEpisodes; }
    public CreativeWorkSeason getSeasons() { return seasons; }
    public void setSeasons(CreativeWorkSeason seasons) { this.seasons = seasons; }
    public Person getActors() { return actors; }
    public void setActors(Person actors) { this.actors = actors; }
    public CreativeWorkSeason getContainsSeason() { return containsSeason; }
    public void setContainsSeason(CreativeWorkSeason containsSeason) { this.containsSeason = containsSeason; }
    public Person getDirectors() { return directors; }
    public void setDirectors(Person directors) { this.directors = directors; }
    public Integer getNumberOfSeasons() { return numberOfSeasons; }
    public void setNumberOfSeasons(Integer numberOfSeasons) { this.numberOfSeasons = numberOfSeasons; }
}
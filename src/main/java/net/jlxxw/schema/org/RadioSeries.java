package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import net.jlxxw.schema.org.JsonLdType;
public class RadioSeries extends CreativeWorkSeries {
    public RadioSeries() {
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
    /** An actor (individual or a group), e.g. in TV, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip. */
    @JsonProperty("actor")
    private List<AbstractSchema> actor;
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
    public List<AbstractSchema> getActor() { return actor; }
    public void setActor(List<AbstractSchema> actor) { this.actor = actor; }
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
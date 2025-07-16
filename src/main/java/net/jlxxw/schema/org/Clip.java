package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import net.jlxxw.schema.org.JsonLdType;
public class Clip extends CreativeWork {
    public Clip() {
}
    /** The series to which this episode or season belongs. */
    @JsonProperty("partOfSeries")
    private CreativeWorkSeries partOfSeries;
    /** Position of the clip within an ordered group of clips. */
    @JsonProperty("clipNumber")
    private String clipNumber;
    /** The composer of the soundtrack. */
    @JsonProperty("musicBy")
    private List<AbstractSchema> musicBy;
    /** A director of e.g. TV, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip. */
    @JsonProperty("director")
    private Person director;
    /** An actor (individual or a group), e.g. in TV, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip. */
    @JsonProperty("actor")
    private List<AbstractSchema> actor;
    /** The start time of the clip expressed as the number of seconds from the beginning of the work. */
    @JsonProperty("startOffset")
    private Double startOffset;
    /** The end time of the clip expressed as the number of seconds from the beginning of the work. */
    @JsonProperty("endOffset")
    private Double endOffset;
    /** An actor, e.g. in TV, radio, movie, video games etc. Actors can be associated with individual items or with a series, episode, clip. */
    @JsonProperty("actors")
    private Person actors;
    /** A director of e.g. TV, radio, movie, video games etc. content. Directors can be associated with individual items or with a series, episode, clip. */
    @JsonProperty("directors")
    private Person directors;
    /** The season to which this episode belongs. */
    @JsonProperty("partOfSeason")
    private CreativeWorkSeason partOfSeason;
    /** The episode to which this clip belongs. */
    @JsonProperty("partOfEpisode")
    private AbstractSchema partOfEpisode;

    public CreativeWorkSeries getPartOfSeries() { return partOfSeries; }
    public void setPartOfSeries(CreativeWorkSeries partOfSeries) { this.partOfSeries = partOfSeries; }
    public String getClipNumber() { return clipNumber; }
    public void setClipNumber(String clipNumber) { this.clipNumber = clipNumber; }
    public List<AbstractSchema> getMusicBy() { return musicBy; }
    public void setMusicBy(List<AbstractSchema> musicBy) { this.musicBy = musicBy; }
    public Person getDirector() { return director; }
    public void setDirector(Person director) { this.director = director; }
    public List<AbstractSchema> getActor() { return actor; }
    public void setActor(List<AbstractSchema> actor) { this.actor = actor; }
    public Double getStartOffset() { return startOffset; }
    public void setStartOffset(Double startOffset) { this.startOffset = startOffset; }
    public Double getEndOffset() { return endOffset; }
    public void setEndOffset(Double endOffset) { this.endOffset = endOffset; }
    public Person getActors() { return actors; }
    public void setActors(Person actors) { this.actors = actors; }
    public Person getDirectors() { return directors; }
    public void setDirectors(Person directors) { this.directors = directors; }
    public CreativeWorkSeason getPartOfSeason() { return partOfSeason; }
    public void setPartOfSeason(CreativeWorkSeason partOfSeason) { this.partOfSeason = partOfSeason; }
    public AbstractSchema getPartOfEpisode() { return partOfEpisode; }
    public void setPartOfEpisode(AbstractSchema partOfEpisode) { this.partOfEpisode = partOfEpisode; }
}
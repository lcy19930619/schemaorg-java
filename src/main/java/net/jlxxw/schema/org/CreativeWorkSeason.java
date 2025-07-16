package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CreativeWorkSeason extends CreativeWork {
    public CreativeWorkSeason() {
    }

    /**
     * The production company or studio responsible for the item, e.g. series, video game, episode etc.
     */
    @JsonProperty("productionCompany")
    private Organization productionCompany;
    /**
     * The series to which this episode or season belongs.
     */
    @JsonProperty("partOfSeries")
    private CreativeWorkSeries partOfSeries;
    /**
     * An episode of a TV, radio or game media within a series or season.
     */
    @JsonProperty("episode")
    private AbstractSchema episode;
    /**
     * A director of e.g. TV, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip.
     */
    @JsonProperty("director")
    private Person director;
    /**
     * An actor (individual or a group), e.g. in TV, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip.
     */
    @JsonProperty("actor")
    private List<AbstractSchema> actor;
    /**
     * An episode of a TV/radio series or season.
     */
    @JsonProperty("episodes")
    private AbstractSchema episodes;
    /**
     * The trailer of a movie or TV/radio series, season, episode, etc.
     */
    @JsonProperty("trailer")
    private VideoObject trailer;
    /**
     * Position of the season within an ordered group of seasons.
     */
    @JsonProperty("seasonNumber")
    private String seasonNumber;
    /**
     * The start date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
     */
    @JsonProperty("startDate")
    private java.time.LocalDate startDate;
    /**
     * The number of episodes in this season or series.
     */
    @JsonProperty("numberOfEpisodes")
    private Integer numberOfEpisodes;
    /**
     * The end date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)).
     */
    @JsonProperty("endDate")
    private java.time.LocalDate endDate;

    public Organization getProductionCompany() {
        return productionCompany;
    }

    public void setProductionCompany(Organization productionCompany) {
        this.productionCompany = productionCompany;
    }

    public CreativeWorkSeries getPartOfSeries() {
        return partOfSeries;
    }

    public void setPartOfSeries(CreativeWorkSeries partOfSeries) {
        this.partOfSeries = partOfSeries;
    }

    public AbstractSchema getEpisode() {
        return episode;
    }

    public void setEpisode(AbstractSchema episode) {
        this.episode = episode;
    }

    public Person getDirector() {
        return director;
    }

    public void setDirector(Person director) {
        this.director = director;
    }

    public List<AbstractSchema> getActor() {
        return actor;
    }

    public void setActor(List<AbstractSchema> actor) {
        this.actor = actor;
    }

    public AbstractSchema getEpisodes() {
        return episodes;
    }

    public void setEpisodes(AbstractSchema episodes) {
        this.episodes = episodes;
    }

    public VideoObject getTrailer() {
        return trailer;
    }

    public void setTrailer(VideoObject trailer) {
        this.trailer = trailer;
    }

    public String getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(String seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public java.time.LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(java.time.LocalDate startDate) {
        this.startDate = startDate;
    }

    public Integer getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public void setNumberOfEpisodes(Integer numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public java.time.LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(java.time.LocalDate endDate) {
        this.endDate = endDate;
    }
}
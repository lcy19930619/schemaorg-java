package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class VideoGameSeries extends CreativeWorkSeries {
    {
        setId("schema:VideoGameSeries");
        setType("rdfs:Class");

    }

    /**
     * Real or fictional location of the game (or part of game).
     */
    @JsonProperty("gameLocation")
    private String gameLocation;
    /**
     * The task that a player-controlled character, or group of characters may complete in order to gain a reward.
     */
    @JsonProperty("quest")
    private Thing quest;
    /**
     * The electronic systems used to play <a href="http://en.wikipedia.org/wiki/Category:Video_game_platforms">video games</a>.
     */
    @JsonProperty("gamePlatform")
    private String gamePlatform;
    /**
     * The production company or studio responsible for the item, e.g. series, video game, episode etc.
     */
    @JsonProperty("productionCompany")
    private Organization productionCompany;
    /**
     * Indicates whether this game is multi-player, co-op or single-player.  The game can be marked as multi-player, co-op and single-player at the same time.
     */
    @JsonProperty("playMode")
    private GamePlayMode playMode;
    /**
     * A piece of data that represents a particular aspect of a fictional character (skill, power, character points, advantage, disadvantage).
     */
    @JsonProperty("characterAttribute")
    private Thing characterAttribute;
    /**
     * An episode of a TV, radio or game media within a series or season.
     */
    @JsonProperty("episode")
    private AbstractSchema episode;
    /**
     * The composer of the soundtrack.
     */
    @JsonProperty("musicBy")
    private List<AbstractSchema> musicBy;
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
     * An item is an object within the game world that can be collected by a player or, occasionally, a non-player character.
     */
    @JsonProperty("gameItem")
    private Thing gameItem;
    /**
     * The trailer of a movie or TV/radio series, season, episode, etc.
     */
    @JsonProperty("trailer")
    private VideoObject trailer;
    /**
     * The number of episodes in this season or series.
     */
    @JsonProperty("numberOfEpisodes")
    private Integer numberOfEpisodes;
    /**
     * A season in a media series.
     */
    @JsonProperty("seasons")
    private CreativeWorkSeason seasons;
    /**
     * Indicate how many people can play this game (minimum, maximum, or range).
     */
    @JsonProperty("numberOfPlayers")
    private QuantitativeValue numberOfPlayers;
    /**
     * Cheat codes to the game.
     */
    @JsonProperty("cheatCode")
    private CreativeWork cheatCode;
    /**
     * An actor, e.g. in TV, radio, movie, video games etc. Actors can be associated with individual items or with a series, episode, clip.
     */
    @JsonProperty("actors")
    private Person actors;
    /**
     * A season that is part of the media series.
     */
    @JsonProperty("containsSeason")
    private CreativeWorkSeason containsSeason;
    /**
     * A director of e.g. TV, radio, movie, video games etc. content. Directors can be associated with individual items or with a series, episode, clip.
     */
    @JsonProperty("directors")
    private Person directors;
    /**
     * The number of seasons in this series.
     */
    @JsonProperty("numberOfSeasons")
    private Integer numberOfSeasons;

    public String getGameLocation() {
        return gameLocation;
    }

    public void setGameLocation(String gameLocation) {
        this.gameLocation = gameLocation;
    }

    public Thing getQuest() {
        return quest;
    }

    public void setQuest(Thing quest) {
        this.quest = quest;
    }

    public String getGamePlatform() {
        return gamePlatform;
    }

    public void setGamePlatform(String gamePlatform) {
        this.gamePlatform = gamePlatform;
    }

    public Organization getProductionCompany() {
        return productionCompany;
    }

    public void setProductionCompany(Organization productionCompany) {
        this.productionCompany = productionCompany;
    }

    public GamePlayMode getPlayMode() {
        return playMode;
    }

    public void setPlayMode(GamePlayMode playMode) {
        this.playMode = playMode;
    }

    public Thing getCharacterAttribute() {
        return characterAttribute;
    }

    public void setCharacterAttribute(Thing characterAttribute) {
        this.characterAttribute = characterAttribute;
    }

    public AbstractSchema getEpisode() {
        return episode;
    }

    public void setEpisode(AbstractSchema episode) {
        this.episode = episode;
    }

    public List<AbstractSchema> getMusicBy() {
        return musicBy;
    }

    public void setMusicBy(List<AbstractSchema> musicBy) {
        this.musicBy = musicBy;
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

    public Thing getGameItem() {
        return gameItem;
    }

    public void setGameItem(Thing gameItem) {
        this.gameItem = gameItem;
    }

    public VideoObject getTrailer() {
        return trailer;
    }

    public void setTrailer(VideoObject trailer) {
        this.trailer = trailer;
    }

    public Integer getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public void setNumberOfEpisodes(Integer numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public CreativeWorkSeason getSeasons() {
        return seasons;
    }

    public void setSeasons(CreativeWorkSeason seasons) {
        this.seasons = seasons;
    }

    public QuantitativeValue getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(QuantitativeValue numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public CreativeWork getCheatCode() {
        return cheatCode;
    }

    public void setCheatCode(CreativeWork cheatCode) {
        this.cheatCode = cheatCode;
    }

    public Person getActors() {
        return actors;
    }

    public void setActors(Person actors) {
        this.actors = actors;
    }

    public CreativeWorkSeason getContainsSeason() {
        return containsSeason;
    }

    public void setContainsSeason(CreativeWorkSeason containsSeason) {
        this.containsSeason = containsSeason;
    }

    public Person getDirectors() {
        return directors;
    }

    public void setDirectors(Person directors) {
        this.directors = directors;
    }

    public Integer getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public void setNumberOfSeasons(Integer numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }
}
package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import net.jlxxw.schema.org.JsonLdType;
public class VideoGame extends SoftwareApplication {
    public VideoGame() {
}
    /** Links to tips, tactics, etc. */
    @JsonProperty("gameTip")
    private CreativeWork gameTip;
    /** The electronic systems used to play <a href="http://en.wikipedia.org/wiki/Category:Video_game_platforms">video games</a>. */
    @JsonProperty("gamePlatform")
    private String gamePlatform;
    /** Indicates whether this game is multi-player, co-op or single-player.  The game can be marked as multi-player, co-op and single-player at the same time. */
    @JsonProperty("playMode")
    private GamePlayMode playMode;
    /** The composer of the soundtrack. */
    @JsonProperty("musicBy")
    private List<AbstractSchema> musicBy;
    /** A director of e.g. TV, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip. */
    @JsonProperty("director")
    private Person director;
    /** An actor (individual or a group), e.g. in TV, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip. */
    @JsonProperty("actor")
    private List<AbstractSchema> actor;
    /** The edition of a video game. */
    @JsonProperty("gameEdition")
    private String gameEdition;
    /** The trailer of a movie or TV/radio series, season, episode, etc. */
    @JsonProperty("trailer")
    private VideoObject trailer;
    /** Cheat codes to the game. */
    @JsonProperty("cheatCode")
    private CreativeWork cheatCode;
    /** An actor, e.g. in TV, radio, movie, video games etc. Actors can be associated with individual items or with a series, episode, clip. */
    @JsonProperty("actors")
    private Person actors;
    /** A director of e.g. TV, radio, movie, video games etc. content. Directors can be associated with individual items or with a series, episode, clip. */
    @JsonProperty("directors")
    private Person directors;

    public CreativeWork getGameTip() { return gameTip; }
    public void setGameTip(CreativeWork gameTip) { this.gameTip = gameTip; }
    public String getGamePlatform() { return gamePlatform; }
    public void setGamePlatform(String gamePlatform) { this.gamePlatform = gamePlatform; }
    public GamePlayMode getPlayMode() { return playMode; }
    public void setPlayMode(GamePlayMode playMode) { this.playMode = playMode; }
    public List<AbstractSchema> getMusicBy() { return musicBy; }
    public void setMusicBy(List<AbstractSchema> musicBy) { this.musicBy = musicBy; }
    public Person getDirector() { return director; }
    public void setDirector(Person director) { this.director = director; }
    public List<AbstractSchema> getActor() { return actor; }
    public void setActor(List<AbstractSchema> actor) { this.actor = actor; }
    public String getGameEdition() { return gameEdition; }
    public void setGameEdition(String gameEdition) { this.gameEdition = gameEdition; }
    public VideoObject getTrailer() { return trailer; }
    public void setTrailer(VideoObject trailer) { this.trailer = trailer; }
    public CreativeWork getCheatCode() { return cheatCode; }
    public void setCheatCode(CreativeWork cheatCode) { this.cheatCode = cheatCode; }
    public Person getActors() { return actors; }
    public void setActors(Person actors) { this.actors = actors; }
    public Person getDirectors() { return directors; }
    public void setDirectors(Person directors) { this.directors = directors; }
}
package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class VideoObject extends MediaObject {
    public VideoObject() {
        setId("schema:VideoObject");
        setType("rdfs:Class");

    }

    /**
     * If this MediaObject is an AudioObject or VideoObject, the transcript of that object.
     */
    @JsonProperty("transcript")
    private String transcript;
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
     * The caption for this object. For downloadable machine formats (closed caption, subtitles etc.) use MediaObject and indicate the [[encodingFormat]].
     */
    @JsonProperty("caption")
    private String caption;
    /**
     * The quality of the video.
     */
    @JsonProperty("videoQuality")
    private String videoQuality;
    /**
     * Represents textual captioning from a [[MediaObject]], e.g. text of a 'meme'.
     */
    @JsonProperty("embeddedTextCaption")
    private String embeddedTextCaption;
    /**
     * The frame size of the video.
     */
    @JsonProperty("videoFrameSize")
    private String videoFrameSize;
    /**
     * An actor, e.g. in TV, radio, movie, video games etc. Actors can be associated with individual items or with a series, episode, clip.
     */
    @JsonProperty("actors")
    private Person actors;
    /**
     * A director of e.g. TV, radio, movie, video games etc. content. Directors can be associated with individual items or with a series, episode, clip.
     */
    @JsonProperty("directors")
    private Person directors;

    public String getTranscript() {
        return transcript;
    }

    public void setTranscript(String transcript) {
        this.transcript = transcript;
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

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getVideoQuality() {
        return videoQuality;
    }

    public void setVideoQuality(String videoQuality) {
        this.videoQuality = videoQuality;
    }

    public String getEmbeddedTextCaption() {
        return embeddedTextCaption;
    }

    public void setEmbeddedTextCaption(String embeddedTextCaption) {
        this.embeddedTextCaption = embeddedTextCaption;
    }

    public String getVideoFrameSize() {
        return videoFrameSize;
    }

    public void setVideoFrameSize(String videoFrameSize) {
        this.videoFrameSize = videoFrameSize;
    }

    public Person getActors() {
        return actors;
    }

    public void setActors(Person actors) {
        this.actors = actors;
    }

    public Person getDirectors() {
        return directors;
    }

    public void setDirectors(Person directors) {
        this.directors = directors;
    }
}
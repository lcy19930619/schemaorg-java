package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MusicComposition extends CreativeWork {
    public MusicComposition() {
        setId("schema:MusicComposition");
        setType("rdfs:Class");

    }

    /**
     * The International Standard Musical Work Code for the composition.
     */
    @JsonProperty("iswcCode")
    private String iswcCode;
    /**
     * The words in the song.
     */
    @JsonProperty("lyrics")
    private CreativeWork lyrics;
    /**
     * An audio recording of the work.
     */
    @JsonProperty("recordedAs")
    private MusicRecording recordedAs;
    /**
     * The type of composition (e.g. overture, sonata, symphony, etc.).
     */
    @JsonProperty("musicCompositionForm")
    private String musicCompositionForm;
    /**
     * The date and place the work was first performed.
     */
    @JsonProperty("firstPerformance")
    private Event firstPerformance;
    /**
     * An arrangement derived from the composition.
     */
    @JsonProperty("musicArrangement")
    private MusicComposition musicArrangement;
    /**
     * Smaller compositions included in this work (e.g. a movement in a symphony).
     */
    @JsonProperty("includedComposition")
    private MusicComposition includedComposition;
    /**
     * The person who wrote the words.
     */
    @JsonProperty("lyricist")
    private Person lyricist;
    /**
     * The key, mode, or scale this composition uses.
     */
    @JsonProperty("musicalKey")
    private String musicalKey;
    /**
     * The person or organization who wrote a composition, or who is the composer of a work performed at some event.
     */
    @JsonProperty("composer")
    private List<AbstractSchema> composer;

    public String getIswcCode() {
        return iswcCode;
    }

    public void setIswcCode(String iswcCode) {
        this.iswcCode = iswcCode;
    }

    public CreativeWork getLyrics() {
        return lyrics;
    }

    public void setLyrics(CreativeWork lyrics) {
        this.lyrics = lyrics;
    }

    public MusicRecording getRecordedAs() {
        return recordedAs;
    }

    public void setRecordedAs(MusicRecording recordedAs) {
        this.recordedAs = recordedAs;
    }

    public String getMusicCompositionForm() {
        return musicCompositionForm;
    }

    public void setMusicCompositionForm(String musicCompositionForm) {
        this.musicCompositionForm = musicCompositionForm;
    }

    public Event getFirstPerformance() {
        return firstPerformance;
    }

    public void setFirstPerformance(Event firstPerformance) {
        this.firstPerformance = firstPerformance;
    }

    public MusicComposition getMusicArrangement() {
        return musicArrangement;
    }

    public void setMusicArrangement(MusicComposition musicArrangement) {
        this.musicArrangement = musicArrangement;
    }

    public MusicComposition getIncludedComposition() {
        return includedComposition;
    }

    public void setIncludedComposition(MusicComposition includedComposition) {
        this.includedComposition = includedComposition;
    }

    public Person getLyricist() {
        return lyricist;
    }

    public void setLyricist(Person lyricist) {
        this.lyricist = lyricist;
    }

    public String getMusicalKey() {
        return musicalKey;
    }

    public void setMusicalKey(String musicalKey) {
        this.musicalKey = musicalKey;
    }

    public List<AbstractSchema> getComposer() {
        return composer;
    }

    public void setComposer(List<AbstractSchema> composer) {
        this.composer = composer;
    }
}
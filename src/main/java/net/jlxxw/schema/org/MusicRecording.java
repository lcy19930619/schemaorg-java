package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class MusicRecording extends CreativeWork {
    {
        setId("schema:MusicRecording");
        setType("rdfs:Class");

    }

    /**
     * The composition this track is a recording of.
     */
    @JsonProperty("recordingOf")
    private MusicComposition recordingOf;
    /**
     * The playlist to which this recording belongs.
     */
    @JsonProperty("inPlaylist")
    private MusicPlaylist inPlaylist;
    /**
     * The album to which this recording belongs.
     */
    @JsonProperty("inAlbum")
    private MusicAlbum inAlbum;
    /**
     * The artist that performed this album or recording.
     */
    @JsonProperty("byArtist")
    private List<AbstractSchema> byArtist;
    /**
     * The International Standard Recording Code for the recording.
     */
    @JsonProperty("isrcCode")
    private String isrcCode;

    public MusicComposition getRecordingOf() {
        return recordingOf;
    }

    public void setRecordingOf(MusicComposition recordingOf) {
        this.recordingOf = recordingOf;
    }

    public MusicPlaylist getInPlaylist() {
        return inPlaylist;
    }

    public void setInPlaylist(MusicPlaylist inPlaylist) {
        this.inPlaylist = inPlaylist;
    }

    public MusicAlbum getInAlbum() {
        return inAlbum;
    }

    public void setInAlbum(MusicAlbum inAlbum) {
        this.inAlbum = inAlbum;
    }

    public List<AbstractSchema> getByArtist() {
        return byArtist;
    }

    public void setByArtist(List<AbstractSchema> byArtist) {
        this.byArtist = byArtist;
    }

    public String getIsrcCode() {
        return isrcCode;
    }

    public void setIsrcCode(String isrcCode) {
        this.isrcCode = isrcCode;
    }
}
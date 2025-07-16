package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MusicPlaylist extends CreativeWork {
    public MusicPlaylist() {
        setId("schema:MusicPlaylist");
        setType("rdfs:Class");

    }

    /**
     * A music recording (track)&#x2014;usually a single song.
     */
    @JsonProperty("tracks")
    private MusicRecording tracks;
    /**
     * The number of tracks in this album or playlist.
     */
    @JsonProperty("numTracks")
    private Integer numTracks;
    /**
     * A music recording (track)&#x2014;usually a single song. If an ItemList is given, the list should contain items of type MusicRecording.
     */
    @JsonProperty("track")
    private List<AbstractSchema> track;

    public MusicRecording getTracks() {
        return tracks;
    }

    public void setTracks(MusicRecording tracks) {
        this.tracks = tracks;
    }

    public Integer getNumTracks() {
        return numTracks;
    }

    public void setNumTracks(Integer numTracks) {
        this.numTracks = numTracks;
    }

    public List<AbstractSchema> getTrack() {
        return track;
    }

    public void setTrack(List<AbstractSchema> track) {
        this.track = track;
    }
}
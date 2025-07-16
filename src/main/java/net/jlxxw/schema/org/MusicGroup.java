package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class MusicGroup extends PerformingGroup {
    {
        setId("schema:MusicGroup");
        setType("rdfs:Class");

    }

    /**
     * A music recording (track)&#x2014;usually a single song.
     */
    @JsonProperty("tracks")
    private MusicRecording tracks;
    /**
     * A member of a music group&#x2014;for example, John, Paul, George, or Ringo.
     */
    @JsonProperty("musicGroupMember")
    private Person musicGroupMember;
    /**
     * Genre of the creative work, broadcast channel or group.
     */
    @JsonProperty("genre")
    private String genre;
    /**
     * A collection of music albums.
     */
    @JsonProperty("albums")
    private MusicAlbum albums;
    /**
     * A music album.
     */
    @JsonProperty("album")
    private MusicAlbum album;
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

    public Person getMusicGroupMember() {
        return musicGroupMember;
    }

    public void setMusicGroupMember(Person musicGroupMember) {
        this.musicGroupMember = musicGroupMember;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public MusicAlbum getAlbums() {
        return albums;
    }

    public void setAlbums(MusicAlbum albums) {
        this.albums = albums;
    }

    public MusicAlbum getAlbum() {
        return album;
    }

    public void setAlbum(MusicAlbum album) {
        this.album = album;
    }

    public List<AbstractSchema> getTrack() {
        return track;
    }

    public void setTrack(List<AbstractSchema> track) {
        this.track = track;
    }
}
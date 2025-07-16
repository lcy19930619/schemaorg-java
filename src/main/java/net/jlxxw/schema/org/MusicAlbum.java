package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MusicAlbum extends MusicPlaylist {
    public MusicAlbum() {
        setId("schema:MusicAlbum");
        setType("rdfs:Class");

    }

    /**
     * Classification of the album by its type of content: soundtrack, live album, studio album, etc.
     */
    @JsonProperty("albumProductionType")
    private MusicAlbumProductionType albumProductionType;
    /**
     * A release of this album.
     */
    @JsonProperty("albumRelease")
    private MusicRelease albumRelease;
    /**
     * The kind of release which this album is: single, EP or album.
     */
    @JsonProperty("albumReleaseType")
    private MusicAlbumReleaseType albumReleaseType;
    /**
     * The artist that performed this album or recording.
     */
    @JsonProperty("byArtist")
    private List<AbstractSchema> byArtist;

    public MusicAlbumProductionType getAlbumProductionType() {
        return albumProductionType;
    }

    public void setAlbumProductionType(MusicAlbumProductionType albumProductionType) {
        this.albumProductionType = albumProductionType;
    }

    public MusicRelease getAlbumRelease() {
        return albumRelease;
    }

    public void setAlbumRelease(MusicRelease albumRelease) {
        this.albumRelease = albumRelease;
    }

    public MusicAlbumReleaseType getAlbumReleaseType() {
        return albumReleaseType;
    }

    public void setAlbumReleaseType(MusicAlbumReleaseType albumReleaseType) {
        this.albumReleaseType = albumReleaseType;
    }

    public List<AbstractSchema> getByArtist() {
        return byArtist;
    }

    public void setByArtist(List<AbstractSchema> byArtist) {
        this.byArtist = byArtist;
    }
}
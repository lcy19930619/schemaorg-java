package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class MusicRelease extends MusicPlaylist {
    {
        setId("schema:MusicRelease");
        setType("rdfs:Class");

    }

    /**
     * The label that issued the release.
     */
    @JsonProperty("recordLabel")
    private Organization recordLabel;
    /**
     * The album this is a release of.
     */
    @JsonProperty("releaseOf")
    private MusicAlbum releaseOf;
    /**
     * The group the release is credited to if different than the byArtist. For example, Red and Blue is credited to "Stefani Germanotta Band", but by Lady Gaga.
     */
    @JsonProperty("creditedTo")
    private List<AbstractSchema> creditedTo;
    /**
     * Format of this release (the type of recording media used, i.e. compact disc, digital media, LP, etc.).
     */
    @JsonProperty("musicReleaseFormat")
    private MusicReleaseFormatType musicReleaseFormat;
    /**
     * The catalog number for the release.
     */
    @JsonProperty("catalogNumber")
    private String catalogNumber;

    public Organization getRecordLabel() {
        return recordLabel;
    }

    public void setRecordLabel(Organization recordLabel) {
        this.recordLabel = recordLabel;
    }

    public MusicAlbum getReleaseOf() {
        return releaseOf;
    }

    public void setReleaseOf(MusicAlbum releaseOf) {
        this.releaseOf = releaseOf;
    }

    public List<AbstractSchema> getCreditedTo() {
        return creditedTo;
    }

    public void setCreditedTo(List<AbstractSchema> creditedTo) {
        this.creditedTo = creditedTo;
    }

    public MusicReleaseFormatType getMusicReleaseFormat() {
        return musicReleaseFormat;
    }

    public void setMusicReleaseFormat(MusicReleaseFormatType musicReleaseFormat) {
        this.musicReleaseFormat = musicReleaseFormat;
    }

    public String getCatalogNumber() {
        return catalogNumber;
    }

    public void setCatalogNumber(String catalogNumber) {
        this.catalogNumber = catalogNumber;
    }
}
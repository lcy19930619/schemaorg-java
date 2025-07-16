package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BroadcastChannel extends Intangible {
    public BroadcastChannel() {
        setId("schema:BroadcastChannel");
        setType("rdfs:Class");

    }

    /**
     * The frequency used for over-the-air broadcasts. Numeric values or simple ranges, e.g. 87-99. In addition a shortcut idiom is supported for frequencies of AM and FM radio channels, e.g. "87 FM".
     */
    @JsonProperty("broadcastFrequency")
    private String broadcastFrequency;
    /**
     * The CableOrSatelliteService offering the channel.
     */
    @JsonProperty("inBroadcastLineup")
    private CableOrSatelliteService inBroadcastLineup;
    /**
     * Genre of the creative work, broadcast channel or group.
     */
    @JsonProperty("genre")
    private String genre;
    /**
     * The type of service required to have access to the channel (e.g. Standard or Premium).
     */
    @JsonProperty("broadcastServiceTier")
    private String broadcastServiceTier;
    /**
     * The BroadcastService offered on this channel.
     */
    @JsonProperty("providesBroadcastService")
    private BroadcastService providesBroadcastService;
    /**
     * The unique address by which the BroadcastService can be identified in a provider lineup. In US, this is typically a number.
     */
    @JsonProperty("broadcastChannelId")
    private String broadcastChannelId;

    public String getBroadcastFrequency() {
        return broadcastFrequency;
    }

    public void setBroadcastFrequency(String broadcastFrequency) {
        this.broadcastFrequency = broadcastFrequency;
    }

    public CableOrSatelliteService getInBroadcastLineup() {
        return inBroadcastLineup;
    }

    public void setInBroadcastLineup(CableOrSatelliteService inBroadcastLineup) {
        this.inBroadcastLineup = inBroadcastLineup;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getBroadcastServiceTier() {
        return broadcastServiceTier;
    }

    public void setBroadcastServiceTier(String broadcastServiceTier) {
        this.broadcastServiceTier = broadcastServiceTier;
    }

    public BroadcastService getProvidesBroadcastService() {
        return providesBroadcastService;
    }

    public void setProvidesBroadcastService(BroadcastService providesBroadcastService) {
        this.providesBroadcastService = providesBroadcastService;
    }

    public String getBroadcastChannelId() {
        return broadcastChannelId;
    }

    public void setBroadcastChannelId(String broadcastChannelId) {
        this.broadcastChannelId = broadcastChannelId;
    }
}
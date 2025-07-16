package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BroadcastEvent extends PublicationEvent {
    public BroadcastEvent() {
        setId("schema:BroadcastEvent");
        setType("rdfs:Class");

    }

    /**
     * The type of screening or video broadcast used (e.g. IMAX, 3D, SD, HD, etc.).
     */
    @JsonProperty("videoFormat")
    private String videoFormat;
    /**
     * Languages in which subtitles/captions are available, in [IETF BCP 47 standard format](http://tools.ietf.org/html/bcp47).
     */
    @JsonProperty("subtitleLanguage")
    private String subtitleLanguage;
    /**
     * The event being broadcast such as a sporting event or awards ceremony.
     */
    @JsonProperty("broadcastOfEvent")
    private Event broadcastOfEvent;
    /**
     * True if the broadcast is of a live event.
     */
    @JsonProperty("isLiveBroadcast")
    private Boolean isLiveBroadcast;

    public String getVideoFormat() {
        return videoFormat;
    }

    public void setVideoFormat(String videoFormat) {
        this.videoFormat = videoFormat;
    }

    public String getSubtitleLanguage() {
        return subtitleLanguage;
    }

    public void setSubtitleLanguage(String subtitleLanguage) {
        this.subtitleLanguage = subtitleLanguage;
    }

    public Event getBroadcastOfEvent() {
        return broadcastOfEvent;
    }

    public void setBroadcastOfEvent(Event broadcastOfEvent) {
        this.broadcastOfEvent = broadcastOfEvent;
    }

    public Boolean getIsLiveBroadcast() {
        return isLiveBroadcast;
    }

    public void setIsLiveBroadcast(Boolean isLiveBroadcast) {
        this.isLiveBroadcast = isLiveBroadcast;
    }
}
package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BroadcastService extends Service {
    public BroadcastService() {
    }

    /**
     * The frequency used for over-the-air broadcasts. Numeric values or simple ranges, e.g. 87-99. In addition a shortcut idiom is supported for frequencies of AM and FM radio channels, e.g. "87 FM".
     */
    @JsonProperty("broadcastFrequency")
    private String broadcastFrequency;
    /**
     * The name displayed in the channel guide. For many US affiliates, it is the network name.
     */
    @JsonProperty("broadcastDisplayName")
    private String broadcastDisplayName;
    /**
     * The area within which users can expect to reach the broadcast service.
     */
    @JsonProperty("area")
    private Place area;
    /**
     * The organization owning or operating the broadcast service.
     */
    @JsonProperty("broadcaster")
    private Organization broadcaster;
    /**
     * The media network(s) whose content is broadcast on this station.
     */
    @JsonProperty("broadcastAffiliateOf")
    private Organization broadcastAffiliateOf;
    /**
     * A broadcast service to which the broadcast service may belong to such as regional variations of a national channel.
     */
    @JsonProperty("parentService")
    private BroadcastService parentService;
    /**
     * A [callsign](https://en.wikipedia.org/wiki/Call_sign), as used in broadcasting and radio communications to identify people, radio and TV stations, or vehicles.
     */
    @JsonProperty("callSign")
    private String callSign;
    /**
     * The type of screening or video broadcast used (e.g. IMAX, 3D, SD, HD, etc.).
     */
    @JsonProperty("videoFormat")
    private String videoFormat;
    /**
     * A broadcast channel of a broadcast service.
     */
    @JsonProperty("hasBroadcastChannel")
    private BroadcastChannel hasBroadcastChannel;
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
     */
    @JsonProperty("inLanguage")
    private String inLanguage;
    /**
     * The timezone in [ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601) for which the service bases its broadcasts.
     */
    @JsonProperty("broadcastTimezone")
    private String broadcastTimezone;

    public String getBroadcastFrequency() {
        return broadcastFrequency;
    }

    public void setBroadcastFrequency(String broadcastFrequency) {
        this.broadcastFrequency = broadcastFrequency;
    }

    public String getBroadcastDisplayName() {
        return broadcastDisplayName;
    }

    public void setBroadcastDisplayName(String broadcastDisplayName) {
        this.broadcastDisplayName = broadcastDisplayName;
    }

    public Place getArea() {
        return area;
    }

    public void setArea(Place area) {
        this.area = area;
    }

    public Organization getBroadcaster() {
        return broadcaster;
    }

    public void setBroadcaster(Organization broadcaster) {
        this.broadcaster = broadcaster;
    }

    public Organization getBroadcastAffiliateOf() {
        return broadcastAffiliateOf;
    }

    public void setBroadcastAffiliateOf(Organization broadcastAffiliateOf) {
        this.broadcastAffiliateOf = broadcastAffiliateOf;
    }

    public BroadcastService getParentService() {
        return parentService;
    }

    public void setParentService(BroadcastService parentService) {
        this.parentService = parentService;
    }

    public String getCallSign() {
        return callSign;
    }

    public void setCallSign(String callSign) {
        this.callSign = callSign;
    }

    public String getVideoFormat() {
        return videoFormat;
    }

    public void setVideoFormat(String videoFormat) {
        this.videoFormat = videoFormat;
    }

    public BroadcastChannel getHasBroadcastChannel() {
        return hasBroadcastChannel;
    }

    public void setHasBroadcastChannel(BroadcastChannel hasBroadcastChannel) {
        this.hasBroadcastChannel = hasBroadcastChannel;
    }

    public String getInLanguage() {
        return inLanguage;
    }

    public void setInLanguage(String inLanguage) {
        this.inLanguage = inLanguage;
    }

    public String getBroadcastTimezone() {
        return broadcastTimezone;
    }

    public void setBroadcastTimezone(String broadcastTimezone) {
        this.broadcastTimezone = broadcastTimezone;
    }
}
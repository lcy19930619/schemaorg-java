package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class BroadcastFrequencySpecification extends Intangible {
    {
        setId("schema:BroadcastFrequencySpecification");
        setType("rdfs:Class");

    }

    /**
     * The frequency in MHz for a particular broadcast.
     */
    @JsonProperty("broadcastFrequencyValue")
    private Double broadcastFrequencyValue;
    /**
     * The subchannel used for the broadcast.
     */
    @JsonProperty("broadcastSubChannel")
    private String broadcastSubChannel;
    /**
     * The modulation (e.g. FM, AM, etc) used by a particular broadcast service.
     */
    @JsonProperty("broadcastSignalModulation")
    private String broadcastSignalModulation;

    public Double getBroadcastFrequencyValue() {
        return broadcastFrequencyValue;
    }

    public void setBroadcastFrequencyValue(Double broadcastFrequencyValue) {
        this.broadcastFrequencyValue = broadcastFrequencyValue;
    }

    public String getBroadcastSubChannel() {
        return broadcastSubChannel;
    }

    public void setBroadcastSubChannel(String broadcastSubChannel) {
        this.broadcastSubChannel = broadcastSubChannel;
    }

    public String getBroadcastSignalModulation() {
        return broadcastSignalModulation;
    }

    public void setBroadcastSignalModulation(String broadcastSignalModulation) {
        this.broadcastSignalModulation = broadcastSignalModulation;
    }
}
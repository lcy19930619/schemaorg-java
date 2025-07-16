package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class BroadcastFrequencySpecification extends Intangible {
    public BroadcastFrequencySpecification() {
}
    /** The frequency in MHz for a particular broadcast. */
    @JsonProperty("broadcastFrequencyValue")
    private Double broadcastFrequencyValue;
    /** The subchannel used for the broadcast. */
    @JsonProperty("broadcastSubChannel")
    private String broadcastSubChannel;
    /** The modulation (e.g. FM, AM, etc) used by a particular broadcast service. */
    @JsonProperty("broadcastSignalModulation")
    private String broadcastSignalModulation;

    public Double getBroadcastFrequencyValue() { return broadcastFrequencyValue; }
    public void setBroadcastFrequencyValue(Double broadcastFrequencyValue) { this.broadcastFrequencyValue = broadcastFrequencyValue; }
    public String getBroadcastSubChannel() { return broadcastSubChannel; }
    public void setBroadcastSubChannel(String broadcastSubChannel) { this.broadcastSubChannel = broadcastSubChannel; }
    public String getBroadcastSignalModulation() { return broadcastSignalModulation; }
    public void setBroadcastSignalModulation(String broadcastSignalModulation) { this.broadcastSignalModulation = broadcastSignalModulation; }
}
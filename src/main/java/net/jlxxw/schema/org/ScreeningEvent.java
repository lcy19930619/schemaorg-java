package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class ScreeningEvent extends Event {
    public ScreeningEvent() {
}
    /** The type of screening or video broadcast used (e.g. IMAX, 3D, SD, HD, etc.). */
    @JsonProperty("videoFormat")
    private String videoFormat;
    /** Languages in which subtitles/captions are available, in [IETF BCP 47 standard format](http://tools.ietf.org/html/bcp47). */
    @JsonProperty("subtitleLanguage")
    private String subtitleLanguage;
    /** The movie presented during this event. */
    @JsonProperty("workPresented")
    private Movie workPresented;

    public String getVideoFormat() { return videoFormat; }
    public void setVideoFormat(String videoFormat) { this.videoFormat = videoFormat; }
    public String getSubtitleLanguage() { return subtitleLanguage; }
    public void setSubtitleLanguage(String subtitleLanguage) { this.subtitleLanguage = subtitleLanguage; }
    public Movie getWorkPresented() { return workPresented; }
    public void setWorkPresented(Movie workPresented) { this.workPresented = workPresented; }
}
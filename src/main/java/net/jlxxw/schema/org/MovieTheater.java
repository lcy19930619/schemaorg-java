package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class MovieTheater extends EntertainmentBusiness {
    public MovieTheater() {
}
    /** The number of screens in the movie theater. */
    @JsonProperty("screenCount")
    private Double screenCount;

    public Double getScreenCount() { return screenCount; }
    public void setScreenCount(Double screenCount) { this.screenCount = screenCount; }
}
package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import net.jlxxw.schema.org.JsonLdType;
public class Claim extends CreativeWork {
    public Claim() {
}
    /** For a [[Claim]] interpreted from [[MediaObject]] content, the [[interpretedAsClaim]] property can be used to indicate a claim contained, implied or refined from the content of a [[MediaObject]]. */
    @JsonProperty("claimInterpreter")
    private List<AbstractSchema> claimInterpreter;
    /** Indicates the first known occurrence of a [[Claim]] in some [[CreativeWork]]. */
    @JsonProperty("firstAppearance")
    private CreativeWork firstAppearance;

    public List<AbstractSchema> getClaimInterpreter() { return claimInterpreter; }
    public void setClaimInterpreter(List<AbstractSchema> claimInterpreter) { this.claimInterpreter = claimInterpreter; }
    public CreativeWork getFirstAppearance() { return firstAppearance; }
    public void setFirstAppearance(CreativeWork firstAppearance) { this.firstAppearance = firstAppearance; }
}
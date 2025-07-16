package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class SocialMediaPosting extends Article {
    public SocialMediaPosting() {
}
    /** A CreativeWork such as an image, video, or audio clip shared as part of this posting. */
    @JsonProperty("sharedContent")
    private CreativeWork sharedContent;

    public CreativeWork getSharedContent() { return sharedContent; }
    public void setSharedContent(CreativeWork sharedContent) { this.sharedContent = sharedContent; }
}
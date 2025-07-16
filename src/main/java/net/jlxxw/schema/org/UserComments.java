package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
import java.util.List;
import net.jlxxw.schema.org.JsonLdType;
public class UserComments extends UserInteraction {
    public UserComments() {
}
    /** The URL at which a reply may be posted to the specified UserComment. */
    @JsonProperty("replyToUrl")
    private String replyToUrl;
    /** The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork. */
    @JsonProperty("creator")
    private List<AbstractSchema> creator;
    /** The time at which the UserComment was made. */
    @JsonProperty("commentTime")
    private java.time.LocalDateTime commentTime;
    /** Specifies the CreativeWork associated with the UserComment. */
    @JsonProperty("discusses")
    private CreativeWork discusses;
    /** The text of the UserComment. */
    @JsonProperty("commentText")
    private String commentText;

    public String getReplyToUrl() { return replyToUrl; }
    public void setReplyToUrl(String replyToUrl) { this.replyToUrl = replyToUrl; }
    public List<AbstractSchema> getCreator() { return creator; }
    public void setCreator(List<AbstractSchema> creator) { this.creator = creator; }
    public java.time.LocalDateTime getCommentTime() { return commentTime; }
    public void setCommentTime(java.time.LocalDateTime commentTime) { this.commentTime = commentTime; }
    public CreativeWork getDiscusses() { return discusses; }
    public void setDiscusses(CreativeWork discusses) { this.discusses = discusses; }
    public String getCommentText() { return commentText; }
    public void setCommentText(String commentText) { this.commentText = commentText; }
}
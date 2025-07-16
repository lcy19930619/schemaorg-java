package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
import net.jlxxw.schema.org.JsonLdType;
public class LiveBlogPosting extends BlogPosting {
    public LiveBlogPosting() {
}
    /** An update to the LiveBlog. */
    @JsonProperty("liveBlogUpdate")
    private BlogPosting liveBlogUpdate;
    /** The time when the live blog will begin covering the Event. Note that coverage may begin before the Event's start time. The LiveBlogPosting may also be created before coverage begins. */
    @JsonProperty("coverageStartTime")
    private java.time.LocalDateTime coverageStartTime;
    /** The time when the live blog will stop covering the Event. Note that coverage may continue after the Event concludes. */
    @JsonProperty("coverageEndTime")
    private java.time.LocalDateTime coverageEndTime;

    public BlogPosting getLiveBlogUpdate() { return liveBlogUpdate; }
    public void setLiveBlogUpdate(BlogPosting liveBlogUpdate) { this.liveBlogUpdate = liveBlogUpdate; }
    public java.time.LocalDateTime getCoverageStartTime() { return coverageStartTime; }
    public void setCoverageStartTime(java.time.LocalDateTime coverageStartTime) { this.coverageStartTime = coverageStartTime; }
    public java.time.LocalDateTime getCoverageEndTime() { return coverageEndTime; }
    public void setCoverageEndTime(java.time.LocalDateTime coverageEndTime) { this.coverageEndTime = coverageEndTime; }
}
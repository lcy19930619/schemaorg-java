package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Comment extends CreativeWork {
    public Comment() {
        setId("schema:Comment");
        setType("rdfs:Class");
    }

    /**
     * The parent of a question, answer or item in general. Typically used for Q/A discussion threads e.g. a chain of comments with the first comment being an [[Article]] or other [[CreativeWork]]. See also [[comment]] which points from something to a comment about it.
     */
    @JsonProperty("parentItem")
    private List<AbstractSchema> parentItem;
    /**
     * The number of downvotes this question, answer or comment has received from the community.
     */
    @JsonProperty("downvoteCount")
    private Integer downvoteCount;
    /**
     * A CreativeWork such as an image, video, or audio clip shared as part of this posting.
     */
    @JsonProperty("sharedContent")
    private CreativeWork sharedContent;
    /**
     * The number of upvotes this question, answer or comment has received from the community.
     */
    @JsonProperty("upvoteCount")
    private Integer upvoteCount;

    public List<AbstractSchema> getParentItem() {
        return parentItem;
    }

    public void setParentItem(List<AbstractSchema> parentItem) {
        this.parentItem = parentItem;
    }

    public Integer getDownvoteCount() {
        return downvoteCount;
    }

    public void setDownvoteCount(Integer downvoteCount) {
        this.downvoteCount = downvoteCount;
    }

    public CreativeWork getSharedContent() {
        return sharedContent;
    }

    public void setSharedContent(CreativeWork sharedContent) {
        this.sharedContent = sharedContent;
    }

    public Integer getUpvoteCount() {
        return upvoteCount;
    }

    public void setUpvoteCount(Integer upvoteCount) {
        this.upvoteCount = upvoteCount;
    }
}
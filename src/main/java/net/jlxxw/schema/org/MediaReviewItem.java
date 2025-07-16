package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MediaReviewItem extends CreativeWork {
    public MediaReviewItem() {
        setId("schema:MediaReviewItem");
        setType("rdfs:Class");

    }

    /**
     * In the context of a [[MediaReview]], indicates specific media item(s) that are grouped using a [[MediaReviewItem]].
     */
    @JsonProperty("mediaItemAppearance")
    private MediaObject mediaItemAppearance;

    public MediaObject getMediaItemAppearance() {
        return mediaItemAppearance;
    }

    public void setMediaItemAppearance(MediaObject mediaItemAppearance) {
        this.mediaItemAppearance = mediaItemAppearance;
    }
}
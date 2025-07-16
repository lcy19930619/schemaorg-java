package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MediaReview extends Review {
    public MediaReview() {
        setId("schema:MediaReview");
        setType("rdfs:Class");

    }

    /**
     * Indicates a MediaManipulationRatingEnumeration classification of a media object (in the context of how it was published or shared).
     */
    @JsonProperty("mediaAuthenticityCategory")
    private MediaManipulationRatingEnumeration mediaAuthenticityCategory;
    /**
     * Describes, in a [[MediaReview]] when dealing with [[DecontextualizedContent]], background information that can contribute to better interpretation of the [[MediaObject]].
     */
    @JsonProperty("originalMediaContextDescription")
    private String originalMediaContextDescription;
    /**
     * Link to the page containing an original version of the content, or directly to an online copy of the original [[MediaObject]] content, e.g. video file.
     */
    @JsonProperty("originalMediaLink")
    private String originalMediaLink;

    public MediaManipulationRatingEnumeration getMediaAuthenticityCategory() {
        return mediaAuthenticityCategory;
    }

    public void setMediaAuthenticityCategory(MediaManipulationRatingEnumeration mediaAuthenticityCategory) {
        this.mediaAuthenticityCategory = mediaAuthenticityCategory;
    }

    public String getOriginalMediaContextDescription() {
        return originalMediaContextDescription;
    }

    public void setOriginalMediaContextDescription(String originalMediaContextDescription) {
        this.originalMediaContextDescription = originalMediaContextDescription;
    }

    public String getOriginalMediaLink() {
        return originalMediaLink;
    }

    public void setOriginalMediaLink(String originalMediaLink) {
        this.originalMediaLink = originalMediaLink;
    }
}
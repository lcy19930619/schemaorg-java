package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class SocialMediaPosting extends Article {
    {
        setId("schema:SocialMediaPosting");
        setType("rdfs:Class");

    }

    /**
     * A CreativeWork such as an image, video, or audio clip shared as part of this posting.
     */
    @JsonProperty("sharedContent")
    private CreativeWork sharedContent;

    public CreativeWork getSharedContent() {
        return sharedContent;
    }

    public void setSharedContent(CreativeWork sharedContent) {
        this.sharedContent = sharedContent;
    }
}
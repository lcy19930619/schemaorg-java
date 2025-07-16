package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ImageObject extends MediaObject {
    public ImageObject() {
        setId("schema:ImageObject");
        setType("rdfs:Class");

    }

    /**
     * Indicates whether this image is representative of the content of the page.
     */
    @JsonProperty("representativeOfPage")
    private Boolean representativeOfPage;
    /**
     * The caption for this object. For downloadable machine formats (closed caption, subtitles etc.) use MediaObject and indicate the [[encodingFormat]].
     */
    @JsonProperty("caption")
    private String caption;
    /**
     * Represents textual captioning from a [[MediaObject]], e.g. text of a 'meme'.
     */
    @JsonProperty("embeddedTextCaption")
    private String embeddedTextCaption;
    /**
     * exif data for this object.
     */
    @JsonProperty("exifData")
    private String exifData;

    public Boolean getRepresentativeOfPage() {
        return representativeOfPage;
    }

    public void setRepresentativeOfPage(Boolean representativeOfPage) {
        this.representativeOfPage = representativeOfPage;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getEmbeddedTextCaption() {
        return embeddedTextCaption;
    }

    public void setEmbeddedTextCaption(String embeddedTextCaption) {
        this.embeddedTextCaption = embeddedTextCaption;
    }

    public String getExifData() {
        return exifData;
    }

    public void setExifData(String exifData) {
        this.exifData = exifData;
    }
}
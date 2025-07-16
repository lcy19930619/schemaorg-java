package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AudioObject extends MediaObject {
    public AudioObject() {
        setId("schema:AudioObject");
        setType("rdfs:Class");

    }

    /**
     * If this MediaObject is an AudioObject or VideoObject, the transcript of that object.
     */
    @JsonProperty("transcript")
    private String transcript;
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

    public String getTranscript() {
        return transcript;
    }

    public void setTranscript(String transcript) {
        this.transcript = transcript;
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
}
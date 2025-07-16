package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SeekToAction extends Action {
    public SeekToAction() {
    }

    /**
     * The start time of the clip expressed as the number of seconds from the beginning of the work.
     */
    @JsonProperty("startOffset")
    private Double startOffset;

    public Double getStartOffset() {
        return startOffset;
    }

    public void setStartOffset(Double startOffset) {
        this.startOffset = startOffset;
    }
}
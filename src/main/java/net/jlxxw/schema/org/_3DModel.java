package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class _3DModel extends MediaObject {
    /**
     * Whether the 3DModel allows resizing. For example, room layout applications often do not allow 3DModel elements to be resized to reflect reality.
     */
    @JsonProperty("isResizable")
    private Boolean isResizable;

    public Boolean getIsResizable() {
        return isResizable;
    }

    public void setIsResizable(Boolean isResizable) {
        this.isResizable = isResizable;
    }
}
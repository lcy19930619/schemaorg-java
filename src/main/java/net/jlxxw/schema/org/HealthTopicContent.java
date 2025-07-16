package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HealthTopicContent extends WebContent {
    public HealthTopicContent() {
    }

    /**
     * Indicates the aspect or aspects specifically addressed in some [[HealthTopicContent]]. For example, that the content is an overview, or that it talks about treatment, self-care, treatments or their side-effects.
     */
    @JsonProperty("hasHealthAspect")
    private HealthAspectEnumeration hasHealthAspect;

    public HealthAspectEnumeration getHasHealthAspect() {
        return hasHealthAspect;
    }

    public void setHasHealthAspect(HealthAspectEnumeration hasHealthAspect) {
        this.hasHealthAspect = hasHealthAspect;
    }
}
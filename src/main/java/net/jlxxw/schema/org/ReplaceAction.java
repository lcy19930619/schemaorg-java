package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReplaceAction extends UpdateAction {
    public ReplaceAction() {
        setId("schema:ReplaceAction");
        setType("rdfs:Class");

    }

    /**
     * A sub property of object. The object that is being replaced.
     */
    @JsonProperty("replacee")
    private Thing replacee;
    /**
     * A sub property of object. The object that replaces.
     */
    @JsonProperty("replacer")
    private Thing replacer;

    public Thing getReplacee() {
        return replacee;
    }

    public void setReplacee(Thing replacee) {
        this.replacee = replacee;
    }

    public Thing getReplacer() {
        return replacer;
    }

    public void setReplacer(Thing replacer) {
        this.replacer = replacer;
    }
}
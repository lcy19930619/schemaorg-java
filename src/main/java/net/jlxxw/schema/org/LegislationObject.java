package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LegislationObject extends MediaObject {
    public LegislationObject() {
        setId("schema:LegislationObject");
        setType("rdfs:Class");

    }

    /**
     * The legal value of this legislation file. The same legislation can be written in multiple files with different legal values. Typically a digitally signed PDF have a "stronger" legal value than the HTML file of the same act.
     */
    @JsonProperty("legislationLegalValue")
    private LegalValueLevel legislationLegalValue;

    public LegalValueLevel getLegislationLegalValue() {
        return legislationLegalValue;
    }

    public void setLegislationLegalValue(LegalValueLevel legislationLegalValue) {
        this.legislationLegalValue = legislationLegalValue;
    }
}
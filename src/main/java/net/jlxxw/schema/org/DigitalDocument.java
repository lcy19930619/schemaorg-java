package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DigitalDocument extends CreativeWork {
    public DigitalDocument() {
        setId("schema:DigitalDocument");
        setType("rdfs:Class");

    }

    /**
     * A permission related to the access to this document (e.g. permission to read or write an electronic document). For a public document, specify a grantee with an Audience with audienceType equal to "public".
     */
    @JsonProperty("hasDigitalDocumentPermission")
    private DigitalDocumentPermission hasDigitalDocumentPermission;

    public DigitalDocumentPermission getHasDigitalDocumentPermission() {
        return hasDigitalDocumentPermission;
    }

    public void setHasDigitalDocumentPermission(DigitalDocumentPermission hasDigitalDocumentPermission) {
        this.hasDigitalDocumentPermission = hasDigitalDocumentPermission;
    }
}
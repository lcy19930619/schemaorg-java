package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class ArchiveComponent extends CreativeWork {
    {
        setId("schema:ArchiveComponent");
        setType("rdfs:Class");
    }

    @JsonProperty("rdfs:label")
    private CustomLabel customLabel;

    @JsonProperty("rdfs:comment")
    private CustomComment customComment;
    /**
     * {'@language': 'en', '@value': '[[ArchiveOrganization]] that holds, keeps or maintains the [[ArchiveComponent]].'}
     */
    @JsonProperty("holdingArchive")
    private ArchiveOrganization holdingArchive;
    /**
     * {'@language': 'en', '@value': 'Current location of the item.'}
     */
    @JsonProperty("itemLocation")
    private String itemLocation;

    public ArchiveOrganization getHoldingArchive() {
        return holdingArchive;
    }

    public void setHoldingArchive(ArchiveOrganization holdingArchive) {
        this.holdingArchive = holdingArchive;
    }

    public String getItemLocation() {
        return itemLocation;
    }

    public void setItemLocation(String itemLocation) {
        this.itemLocation = itemLocation;
    }


    static class CustomComment{
        @JsonProperty("@language")
        private String language;
        @JsonProperty("@value")
        private String value;

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    static class CustomLabel{
        @JsonProperty("@language")
        private String language;
        @JsonProperty("@value")
        private String value;

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public CustomComment getCustomComment() {
        return customComment;
    }

    public void setCustomComment(CustomComment customComment) {
        this.customComment = customComment;
    }

    public CustomLabel getCustomLabel() {
        return customLabel;
    }

    public void setCustomLabel(CustomLabel customLabel) {
        this.customLabel = customLabel;
    }
}
package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ArchiveOrganization extends LocalBusiness {
    public ArchiveOrganization() {
        setId("schema:ArchiveOrganization");
        setType("rdfs:Class");
    }


    @JsonProperty("rdfs:label")
    private CustomLabel customLabel;

    @JsonProperty("rdfs:comment")
    private CustomComment customComment;
    

    /**
     * {'@language': 'en', '@value': 'Collection, [fonds](https://en.wikipedia.org/wiki/Fonds), or item held, kept or maintained by an [[ArchiveOrganization]].'}
     */
    @JsonProperty("archiveHeld")
    private ArchiveComponent archiveHeld;

    public ArchiveComponent getArchiveHeld() {
        return archiveHeld;
    }

    public void setArchiveHeld(ArchiveComponent archiveHeld) {
        this.archiveHeld = archiveHeld;
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
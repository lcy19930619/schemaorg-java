package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class WebSite extends CreativeWork {
    {
        setId("schema:WebSite");
        setType("rdfs:Class");

    }

    /**
     * The International Standard Serial Number (ISSN) that identifies this serial publication. You can repeat this property to identify different formats of, or the linking ISSN (ISSN-L) for, this serial publication.
     */
    @JsonProperty("issn")
    private String issn;

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }
}
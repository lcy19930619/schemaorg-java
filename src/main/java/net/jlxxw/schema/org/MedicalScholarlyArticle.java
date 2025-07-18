package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class MedicalScholarlyArticle extends ScholarlyArticle {
    {
        setId("schema:MedicalScholarlyArticle");
        setType("rdfs:Class");

    }

    /**
     * The type of the medical article, taken from the US NLM MeSH publication type catalog. See also [MeSH documentation](http://www.nlm.nih.gov/mesh/pubtypes.html).
     */
    @JsonProperty("publicationType")
    private String publicationType;

    public String getPublicationType() {
        return publicationType;
    }

    public void setPublicationType(String publicationType) {
        this.publicationType = publicationType;
    }
}
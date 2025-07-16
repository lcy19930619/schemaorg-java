package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WriteAction extends CreateAction {
    public WriteAction() {
        setId("schema:WriteAction");
        setType("rdfs:Class");

    }

    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
     */
    @JsonProperty("inLanguage")
    private String inLanguage;

    public String getInLanguage() {
        return inLanguage;
    }

    public void setInLanguage(String inLanguage) {
        this.inLanguage = inLanguage;
    }
}
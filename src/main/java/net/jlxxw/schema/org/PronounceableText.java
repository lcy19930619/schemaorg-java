package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class PronounceableText extends Text {
    {
        setId("schema:PronounceableText");
        setType("rdfs:Class");

    }
    @JsonProperty("@type")
    private String type;

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }
    /**
     * Form of markup used. eg. [SSML](https://www.w3.org/TR/speech-synthesis11) or [IPA](https://www.wikidata.org/wiki/Property:P898).
     */
    @JsonProperty("speechToTextMarkup")
    private String speechToTextMarkup;
    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
     */
    @JsonProperty("inLanguage")
    private String inLanguage;
    /**
     * Representation of a text [[textValue]] using the specified [[speechToTextMarkup]]. For example the city name of Houston in IPA: /ˈhjuːstən/.
     */
    @JsonProperty("phoneticText")
    private String phoneticText;
    /**
     * Text value being annotated.
     */
    @JsonProperty("textValue")
    private String textValue;

    public String getSpeechToTextMarkup() {
        return speechToTextMarkup;
    }

    public void setSpeechToTextMarkup(String speechToTextMarkup) {
        this.speechToTextMarkup = speechToTextMarkup;
    }

    public String getInLanguage() {
        return inLanguage;
    }

    public void setInLanguage(String inLanguage) {
        this.inLanguage = inLanguage;
    }

    public String getPhoneticText() {
        return phoneticText;
    }

    public void setPhoneticText(String phoneticText) {
        this.phoneticText = phoneticText;
    }

    public String getTextValue() {
        return textValue;
    }

    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }
}
package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TouristAttraction extends Place {
    public TouristAttraction() {
        setId("schema:TouristAttraction");
        setType("rdfs:Class");

    }

    /**
     * Attraction suitable for type(s) of tourist. E.g. children, visitors from a particular country, etc.
     */
    @JsonProperty("touristType")
    private String touristType;
    /**
     * A language someone may use with or at the item, service or place. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[inLanguage]].
     */
    @JsonProperty("availableLanguage")
    private String availableLanguage;

    public String getTouristType() {
        return touristType;
    }

    public void setTouristType(String touristType) {
        this.touristType = touristType;
    }

    public String getAvailableLanguage() {
        return availableLanguage;
    }

    public void setAvailableLanguage(String availableLanguage) {
        this.availableLanguage = availableLanguage;
    }
}
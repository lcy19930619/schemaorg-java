package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WebPageElement extends CreativeWork {
    public WebPageElement() {
    }

    /**
     * A CSS selector, e.g. of a [[SpeakableSpecification]] or [[WebPageElement]]. In the latter case, multiple matches within a page can constitute a single conceptual "Web page element".
     */
    @JsonProperty("cssSelector")
    private String cssSelector;
    /**
     * An XPath, e.g. of a [[SpeakableSpecification]] or [[WebPageElement]]. In the latter case, multiple matches within a page can constitute a single conceptual "Web page element".
     */
    @JsonProperty("xpath")
    private String xpath;

    public String getCssSelector() {
        return cssSelector;
    }

    public void setCssSelector(String cssSelector) {
        this.cssSelector = cssSelector;
    }

    public String getXpath() {
        return xpath;
    }

    public void setXpath(String xpath) {
        this.xpath = xpath;
    }
}
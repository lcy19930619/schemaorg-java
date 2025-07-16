package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class WebPage extends CreativeWork {
    public WebPage() {
        setId("schema:WebPage");
        setType("rdfs:Class");

    }

    /**
     * One of the domain specialities to which this web page's content applies.
     */
    @JsonProperty("specialty")
    private AbstractSchema specialty;
    /**
     * People or organizations that have reviewed the content on this web page for accuracy and/or completeness.
     */
    @JsonProperty("reviewedBy")
    private List<AbstractSchema> reviewedBy;
    /**
     * Indicates the main image on the page.
     */
    @JsonProperty("primaryImageOfPage")
    private ImageObject primaryImageOfPage;
    /**
     * The most significant URLs on the page. Typically, these are the non-navigation links that are clicked on the most.
     */
    @JsonProperty("significantLinks")
    private String significantLinks;
    /**
     * Indicates if this web page element is the main subject of the page.
     */
    @JsonProperty("mainContentOfPage")
    private WebPageElement mainContentOfPage;
    /**
     * A set of links that can help a user understand and navigate a website hierarchy.
     */
    @JsonProperty("breadcrumb")
    private String breadcrumb;
    /**
     * Indicates sections of a Web page that are particularly 'speakable' in the sense of being highlighted as being especially appropriate for text-to-speech conversion. Other sections of a page may also be usefully spoken in particular circumstances; the 'speakable' property serves to indicate the parts most likely to be generally useful for speech.
     * <p>
     * The *speakable* property can be repeated an arbitrary number of times, with three kinds of possible 'content-locator' values:
     * <p>
     * 1.) *id-value* URL references - uses *id-value* of an element in the page being annotated. The simplest use of *speakable* has (potentially relative) URL values, referencing identified sections of the document concerned.
     * <p>
     * 2.) CSS Selectors - addresses content in the annotated page, e.g. via class attribute. Use the [[cssSelector]] property.
     * <p>
     * 3.)  XPaths - addresses content via XPaths (assuming an XML view of the content). Use the [[xpath]] property.
     * <p>
     * For more sophisticated markup of speakable sections beyond simple ID references, either CSS selectors or XPath expressions to pick out document section(s) as speakable. For this
     * we define a supporting type, [[SpeakableSpecification]]  which is defined to be a possible value of the *speakable* property.
     */
    @JsonProperty("speakable")
    private String speakable;
    /**
     * A link related to this web page, for example to other related web pages.
     */
    @JsonProperty("relatedLink")
    private String relatedLink;
    /**
     * Date on which the content on this web page was last reviewed for accuracy and/or completeness.
     */
    @JsonProperty("lastReviewed")
    private java.time.LocalDate lastReviewed;
    /**
     * One of the more significant URLs on the page. Typically, these are the non-navigation links that are clicked on the most.
     */
    @JsonProperty("significantLink")
    private String significantLink;

    public AbstractSchema getSpecialty() {
        return specialty;
    }

    public void setSpecialty(AbstractSchema specialty) {
        this.specialty = specialty;
    }

    public List<AbstractSchema> getReviewedBy() {
        return reviewedBy;
    }

    public void setReviewedBy(List<AbstractSchema> reviewedBy) {
        this.reviewedBy = reviewedBy;
    }

    public ImageObject getPrimaryImageOfPage() {
        return primaryImageOfPage;
    }

    public void setPrimaryImageOfPage(ImageObject primaryImageOfPage) {
        this.primaryImageOfPage = primaryImageOfPage;
    }

    public String getSignificantLinks() {
        return significantLinks;
    }

    public void setSignificantLinks(String significantLinks) {
        this.significantLinks = significantLinks;
    }

    public WebPageElement getMainContentOfPage() {
        return mainContentOfPage;
    }

    public void setMainContentOfPage(WebPageElement mainContentOfPage) {
        this.mainContentOfPage = mainContentOfPage;
    }

    public String getBreadcrumb() {
        return breadcrumb;
    }

    public void setBreadcrumb(String breadcrumb) {
        this.breadcrumb = breadcrumb;
    }

    public String getSpeakable() {
        return speakable;
    }

    public void setSpeakable(String speakable) {
        this.speakable = speakable;
    }

    public String getRelatedLink() {
        return relatedLink;
    }

    public void setRelatedLink(String relatedLink) {
        this.relatedLink = relatedLink;
    }

    public java.time.LocalDate getLastReviewed() {
        return lastReviewed;
    }

    public void setLastReviewed(java.time.LocalDate lastReviewed) {
        this.lastReviewed = lastReviewed;
    }

    public String getSignificantLink() {
        return significantLink;
    }

    public void setSignificantLink(String significantLink) {
        this.significantLink = significantLink;
    }
}
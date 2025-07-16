package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SpecialAnnouncement extends CreativeWork {
    public SpecialAnnouncement() {
        setId("schema:SpecialAnnouncement");
        setType("rdfs:Class");

    }

    /**
     * Information about travel bans, e.g. in the context of a pandemic.
     */
    @JsonProperty("travelBans")
    private String travelBans;
    /**
     * Publication date of an online listing.
     */
    @JsonProperty("datePosted")
    private java.time.LocalDate datePosted;
    /**
     * Information about getting tested (for a [[MedicalCondition]]), e.g. in the context of a pandemic.
     */
    @JsonProperty("gettingTestedInfo")
    private String gettingTestedInfo;
    /**
     * Guidelines about quarantine rules, e.g. in the context of a pandemic.
     */
    @JsonProperty("quarantineGuidelines")
    private String quarantineGuidelines;
    /**
     * Statistical information about the spread of a disease, either as [[WebContent]], or
     * described directly as a [[Dataset]], or the specific [[Observation]]s in the dataset. When a [[WebContent]] URL is
     * provided, the page indicated might also contain more such markup.
     */
    @JsonProperty("diseaseSpreadStatistics")
    private String diseaseSpreadStatistics;
    /**
     * Information about disease prevention.
     */
    @JsonProperty("diseasePreventionInfo")
    private String diseasePreventionInfo;
    /**
     * Information about public transport closures.
     */
    @JsonProperty("publicTransportClosuresInfo")
    private String publicTransportClosuresInfo;
    /**
     * governmentBenefitsInfo provides information about government benefits associated with a SpecialAnnouncement.
     */
    @JsonProperty("governmentBenefitsInfo")
    private GovernmentService governmentBenefitsInfo;
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @JsonProperty("category")
    private String category;
    /**
     * Indicates a specific [[CivicStructure]] or [[LocalBusiness]] associated with the SpecialAnnouncement. For example, a specific testing facility or business with special opening hours. For a larger geographic region like a quarantine of an entire region, use [[spatialCoverage]].
     */
    @JsonProperty("announcementLocation")
    private List<AbstractSchema> announcementLocation;
    /**
     * Indicates a page with news updates and guidelines. This could often be (but is not required to be) the main page containing [[SpecialAnnouncement]] markup on a site.
     */
    @JsonProperty("newsUpdatesAndGuidelines")
    private String newsUpdatesAndGuidelines;
    /**
     * Information about school closures.
     */
    @JsonProperty("schoolClosuresInfo")
    private String schoolClosuresInfo;
    /**
     * The URL for a feed, e.g. associated with a podcast series, blog, or series of date-stamped updates. This is usually RSS or Atom.
     */
    @JsonProperty("webFeed")
    private String webFeed;

    public String getTravelBans() {
        return travelBans;
    }

    public void setTravelBans(String travelBans) {
        this.travelBans = travelBans;
    }

    public java.time.LocalDate getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(java.time.LocalDate datePosted) {
        this.datePosted = datePosted;
    }

    public String getGettingTestedInfo() {
        return gettingTestedInfo;
    }

    public void setGettingTestedInfo(String gettingTestedInfo) {
        this.gettingTestedInfo = gettingTestedInfo;
    }

    public String getQuarantineGuidelines() {
        return quarantineGuidelines;
    }

    public void setQuarantineGuidelines(String quarantineGuidelines) {
        this.quarantineGuidelines = quarantineGuidelines;
    }

    public String getDiseaseSpreadStatistics() {
        return diseaseSpreadStatistics;
    }

    public void setDiseaseSpreadStatistics(String diseaseSpreadStatistics) {
        this.diseaseSpreadStatistics = diseaseSpreadStatistics;
    }

    public String getDiseasePreventionInfo() {
        return diseasePreventionInfo;
    }

    public void setDiseasePreventionInfo(String diseasePreventionInfo) {
        this.diseasePreventionInfo = diseasePreventionInfo;
    }

    public String getPublicTransportClosuresInfo() {
        return publicTransportClosuresInfo;
    }

    public void setPublicTransportClosuresInfo(String publicTransportClosuresInfo) {
        this.publicTransportClosuresInfo = publicTransportClosuresInfo;
    }

    public GovernmentService getGovernmentBenefitsInfo() {
        return governmentBenefitsInfo;
    }

    public void setGovernmentBenefitsInfo(GovernmentService governmentBenefitsInfo) {
        this.governmentBenefitsInfo = governmentBenefitsInfo;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<AbstractSchema> getAnnouncementLocation() {
        return announcementLocation;
    }

    public void setAnnouncementLocation(List<AbstractSchema> announcementLocation) {
        this.announcementLocation = announcementLocation;
    }

    public String getNewsUpdatesAndGuidelines() {
        return newsUpdatesAndGuidelines;
    }

    public void setNewsUpdatesAndGuidelines(String newsUpdatesAndGuidelines) {
        this.newsUpdatesAndGuidelines = newsUpdatesAndGuidelines;
    }

    public String getSchoolClosuresInfo() {
        return schoolClosuresInfo;
    }

    public void setSchoolClosuresInfo(String schoolClosuresInfo) {
        this.schoolClosuresInfo = schoolClosuresInfo;
    }

    public String getWebFeed() {
        return webFeed;
    }

    public void setWebFeed(String webFeed) {
        this.webFeed = webFeed;
    }
}
package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import net.jlxxw.schema.org.JsonLdType;
public class MediaObject extends CreativeWork {
    public MediaObject() {
}
    /** The regions where the media is allowed. If not specified, then it's assumed to be allowed everywhere. Specify the countries in [ISO 3166 format](http://en.wikipedia.org/wiki/ISO_3166). */
    @JsonProperty("regionsAllowed")
    private Place regionsAllowed;
    /** The [SHA-2](https://en.wikipedia.org/wiki/SHA-2) SHA256 hash of the content of the item. For example, a zero-length input has value 'e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855'. */
    @JsonProperty("sha256")
    private String sha256;
    /** The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. E.g. John wrote a book from *January* to December. For media, including audio and video, it's the time offset of the start of a clip within a larger file.\n\nNote that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions. */
    @JsonProperty("startTime")
    private java.time.LocalDateTime startTime;
    /** The width of the item. */
    @JsonProperty("width")
    private List<AbstractSchema> width;
    /** Used to indicate a specific claim contained, implied, translated or refined from the content of a [[MediaObject]] or other [[CreativeWork]]. The interpreting party can be indicated using [[claimInterpreter]]. */
    @JsonProperty("interpretedAsClaim")
    private Claim interpretedAsClaim;
    /** Indicates if use of the media require a subscription  (either paid or free). Allowed values are ```true``` or ```false``` (note that an earlier version had 'yes', 'no'). */
    @JsonProperty("requiresSubscription")
    private Boolean requiresSubscription;
    /** The production company or studio responsible for the item, e.g. series, video game, episode etc. */
    @JsonProperty("productionCompany")
    private Organization productionCompany;
    /** The bitrate of the media object. */
    @JsonProperty("bitrate")
    private String bitrate;
    /** The height of the item. */
    @JsonProperty("height")
    private List<AbstractSchema> height;
    /** A NewsArticle associated with the Media Object. */
    @JsonProperty("associatedArticle")
    private NewsArticle associatedArticle;
    /** File size in (mega/kilo)bytes. */
    @JsonProperty("contentSize")
    private String contentSize;
    /** The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. E.g. John wrote a book from January to *December*. For media, including audio and video, it's the time offset of the end of a clip within a larger file.\n\nNote that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions. */
    @JsonProperty("endTime")
    private java.time.LocalDateTime endTime;
    /** Media type typically expressed using a MIME format (see [IANA site](http://www.iana.org/assignments/media-types/media-types.xhtml) and [MDN reference](https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/MIME_types)), e.g. application/zip for a SoftwareApplication binary, audio/mpeg for .mp3 etc.

In cases where a [[CreativeWork]] has several media type representations, [[encoding]] can be used to indicate each [[MediaObject]] alongside particular [[encodingFormat]] information.

Unregistered or niche encoding and file formats can be indicated instead via the most appropriate URL, e.g. defining Web page or a Wikipedia/Wikidata entry. */
    @JsonProperty("encodingFormat")
    private String encodingFormat;
    /** The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.\n\nSee also [[eligibleRegion]].
       */
    @JsonProperty("ineligibleRegion")
    private String ineligibleRegion;
    /** Player type required&#x2014;for example, Flash or Silverlight. */
    @JsonProperty("playerType")
    private String playerType;
    /** Date (including time if available) when this media object was uploaded to this site. */
    @JsonProperty("uploadDate")
    private java.time.LocalDate uploadDate;
    /** Actual bytes of the media object, for example the image file or video file. */
    @JsonProperty("contentUrl")
    private String contentUrl;
    /** The CreativeWork encoded by this media object. */
    @JsonProperty("encodesCreativeWork")
    private CreativeWork encodesCreativeWork;
    /** A URL pointing to a player for a specific video. In general, this is the information in the ```src``` element of an ```embed``` tag and should not be the same as the content of the ```loc``` tag. */
    @JsonProperty("embedUrl")
    private String embedUrl;

    public Place getRegionsAllowed() { return regionsAllowed; }
    public void setRegionsAllowed(Place regionsAllowed) { this.regionsAllowed = regionsAllowed; }
    public String getSha256() { return sha256; }
    public void setSha256(String sha256) { this.sha256 = sha256; }
    public java.time.LocalDateTime getStartTime() { return startTime; }
    public void setStartTime(java.time.LocalDateTime startTime) { this.startTime = startTime; }
    public List<AbstractSchema> getWidth() { return width; }
    public void setWidth(List<AbstractSchema> width) { this.width = width; }
    public Claim getInterpretedAsClaim() { return interpretedAsClaim; }
    public void setInterpretedAsClaim(Claim interpretedAsClaim) { this.interpretedAsClaim = interpretedAsClaim; }
    public Boolean getRequiresSubscription() { return requiresSubscription; }
    public void setRequiresSubscription(Boolean requiresSubscription) { this.requiresSubscription = requiresSubscription; }
    public Organization getProductionCompany() { return productionCompany; }
    public void setProductionCompany(Organization productionCompany) { this.productionCompany = productionCompany; }
    public String getBitrate() { return bitrate; }
    public void setBitrate(String bitrate) { this.bitrate = bitrate; }
    public List<AbstractSchema> getHeight() { return height; }
    public void setHeight(List<AbstractSchema> height) { this.height = height; }
    public NewsArticle getAssociatedArticle() { return associatedArticle; }
    public void setAssociatedArticle(NewsArticle associatedArticle) { this.associatedArticle = associatedArticle; }
    public String getContentSize() { return contentSize; }
    public void setContentSize(String contentSize) { this.contentSize = contentSize; }
    public java.time.LocalDateTime getEndTime() { return endTime; }
    public void setEndTime(java.time.LocalDateTime endTime) { this.endTime = endTime; }
    public String getEncodingFormat() { return encodingFormat; }
    public void setEncodingFormat(String encodingFormat) { this.encodingFormat = encodingFormat; }
    public String getIneligibleRegion() { return ineligibleRegion; }
    public void setIneligibleRegion(String ineligibleRegion) { this.ineligibleRegion = ineligibleRegion; }
    public String getPlayerType() { return playerType; }
    public void setPlayerType(String playerType) { this.playerType = playerType; }
    public java.time.LocalDate getUploadDate() { return uploadDate; }
    public void setUploadDate(java.time.LocalDate uploadDate) { this.uploadDate = uploadDate; }
    public String getContentUrl() { return contentUrl; }
    public void setContentUrl(String contentUrl) { this.contentUrl = contentUrl; }
    public CreativeWork getEncodesCreativeWork() { return encodesCreativeWork; }
    public void setEncodesCreativeWork(CreativeWork encodesCreativeWork) { this.encodesCreativeWork = encodesCreativeWork; }
    public String getEmbedUrl() { return embedUrl; }
    public void setEmbedUrl(String embedUrl) { this.embedUrl = embedUrl; }
}
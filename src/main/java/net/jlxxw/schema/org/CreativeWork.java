package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import net.jlxxw.schema.org.JsonLdType;
public class CreativeWork extends AbstractSchema {
    public CreativeWork() {
}
    /** Indicates that the CreativeWork contains a reference to, but is not necessarily about a concept. */
    @JsonProperty("mentions")
    private Thing mentions;
    /** A resource that was used in the creation of this resource. This term can be repeated for multiple sources. For example, http://example.com/great-multiplication-intro.html. */
    @JsonProperty("isBasedOnUrl")
    private String isBasedOnUrl;
    /** Review of the item. */
    @JsonProperty("reviews")
    private AbstractSchema reviews;
    /** The overall rating, based on a collection of reviews or ratings, of the item. */
    @JsonProperty("aggregateRating")
    private AbstractSchema aggregateRating;
    /** The publishingPrinciples property indicates (typically via [[URL]]) a document describing the editorial principles of an [[Organization]] (or individual, e.g. a [[Person]] writing a blog) that relate to their activities as a publisher, e.g. ethics or diversity policies. When applied to a [[CreativeWork]] (e.g. [[NewsArticle]]) the principles are those of the party primarily responsible for the creation of the [[CreativeWork]].

While such policies are most typically expressed in natural language, sometimes related information (e.g. indicating a [[funder]]) can be expressed using schema.org terminology.
 */
    @JsonProperty("publishingPrinciples")
    private String publishingPrinciples;
    /** An award won by or for this item. */
    @JsonProperty("award")
    private String award;
    /** The publisher of the article in question. */
    @JsonProperty("publisher")
    private List<AbstractSchema> publisher;
    /** The party holding the legal copyright to the CreativeWork. */
    @JsonProperty("copyrightHolder")
    private List<AbstractSchema> copyrightHolder;
    /** The item being described is intended to help a person learn the competency or learning outcome defined by the referenced term. */
    @JsonProperty("teaches")
    private String teaches;
    /** Headline of the article. */
    @JsonProperty("headline")
    private String headline;
    /** Media type, typically MIME format (see [IANA site](http://www.iana.org/assignments/media-types/media-types.xhtml)) of the content, e.g. application/zip of a SoftwareApplication binary. In cases where a CreativeWork has several media type representations, 'encoding' can be used to indicate each MediaObject alongside particular fileFormat information. Unregistered or niche file formats can be indicated instead via the most appropriate URL, e.g. defining Web page or a Wikipedia entry. */
    @JsonProperty("fileFormat")
    private String fileFormat;
    /** The number of interactions for the CreativeWork using the WebSite or SoftwareApplication. The most specific child type of InteractionCounter should be used. */
    @JsonProperty("interactionStatistic")
    private InteractionCounter interactionStatistic;
    /** The predominant type or kind characterizing the learning resource. For example, 'presentation', 'handout'. */
    @JsonProperty("learningResourceType")
    private String learningResourceType;
    /** The number of words in the text of the CreativeWork such as an Article, Book, etc. */
    @JsonProperty("wordCount")
    private Integer wordCount;
    /** A maintainer of a [[Dataset]], software package ([[SoftwareApplication]]), or other [[Project]]. A maintainer is a [[Person]] or [[Organization]] that manages contributions to, and/or publication of, some (typically complex) artifact. It is common for distributions of software and data to be based on "upstream" sources. When [[maintainer]] is applied to a specific version of something e.g. a particular version or packaging of a [[Dataset]], it is always  possible that the upstream source has a different maintainer. The [[isBasedOn]] property can be used to indicate such relationships between datasets to make the different maintenance roles clear. Similarly in the case of software, a package may have dedicated maintainers working on integration into software distributions such as Ubuntu, as well as upstream maintainers of the underlying work.
       */
    @JsonProperty("maintainer")
    private List<AbstractSchema> maintainer;
    /** The human sensory perceptual system or cognitive faculty through which a person may process or perceive information. Values should be drawn from the [approved vocabulary](https://www.w3.org/2021/a11y-discov-vocab/latest/#accessMode-vocabulary). */
    @JsonProperty("accessMode")
    private String accessMode;
    /** The level in terms of progression through an educational or training context. Examples of educational levels include 'beginner', 'intermediate' or 'advanced', and formal sets of level indicators. */
    @JsonProperty("educationalLevel")
    private String educationalLevel;
    /** Date the content expires and is no longer useful or available. For example a [[VideoObject]] or [[NewsArticle]] whose availability or relevance is time-limited, a [[ClaimReview]] fact check whose publisher wants to indicate that it may no longer be relevant (or helpful to highlight) after some date, or a [[Certification]] the validity has expired. */
    @JsonProperty("expires")
    private java.time.LocalDateTime expires;
    /** A person or organization that supports a thing through a pledge, promise, or financial contribution. E.g. a sponsor of a Medical Study or a corporate sponsor of an event. */
    @JsonProperty("sponsor")
    private List<AbstractSchema> sponsor;
    /** A list of single or combined accessModes that are sufficient to understand all the intellectual content of a resource. Values should be drawn from the [approved vocabulary](https://www.w3.org/2021/a11y-discov-vocab/latest/#accessModeSufficient-vocabulary). */
    @JsonProperty("accessModeSufficient")
    private ItemList accessModeSufficient;
    /** A [[Grant]] that directly or indirectly provide funding or sponsorship for this item. See also [[ownershipFundingInfo]]. */
    @JsonProperty("funding")
    private Grant funding;
    /** An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
       */
    @JsonProperty("offers")
    private List<AbstractSchema> offers;
    /** Indicates that the resource is compatible with the referenced accessibility API. Values should be drawn from the [approved vocabulary](https://www.w3.org/2021/a11y-discov-vocab/latest/#accessibilityAPI-vocabulary). */
    @JsonProperty("accessibilityAPI")
    private String accessibilityAPI;
    /** The schema.org [[usageInfo]] property indicates further information about a [[CreativeWork]]. This property is applicable both to works that are freely available and to those that require payment or other transactions. It can reference additional information, e.g. community expectations on preferred linking and citation conventions, as well as purchasing details. For something that can be commercially licensed, usageInfo can provide detailed, resource-specific information about licensing options.

This property can be used alongside the license property which indicates license(s) applicable to some piece of content. The usageInfo property can provide information about other licensing options, e.g. acquiring commercial usage rights for an image that is also available under non-commercial creative commons licenses. */
    @JsonProperty("usageInfo")
    private String usageInfo;
    /** A creative work that this work is an example/instance/realization/derivation of. */
    @JsonProperty("exampleOfWork")
    private CreativeWork exampleOfWork;
    /** A media object that encodes this CreativeWork. This property is a synonym for associatedMedia. */
    @JsonProperty("encoding")
    private MediaObject encoding;
    /** Specifies the Person that is legally accountable for the CreativeWork. */
    @JsonProperty("accountablePerson")
    private Person accountablePerson;
    /** The work that this work has been translated from. E.g. 物种起源 is a translationOf “On the Origin of Species”. */
    @JsonProperty("translationOfWork")
    private CreativeWork translationOfWork;
    /** A media object that encodes this CreativeWork. This property is a synonym for encoding. */
    @JsonProperty("associatedMedia")
    private MediaObject associatedMedia;
    /** Text that can be used to credit person(s) and/or organization(s) associated with a published Creative Work. */
    @JsonProperty("creditText")
    private String creditText;
    /** The location depicted or described in the content. For example, the location in a photograph or painting. */
    @JsonProperty("contentLocation")
    private Place contentLocation;
    /** A publication event associated with the item. */
    @JsonProperty("publication")
    private PublicationEvent publication;
    /** The version of the CreativeWork embodied by a specified resource. */
    @JsonProperty("version")
    private Double version;
    /** The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork. */
    @JsonProperty("creator")
    private List<AbstractSchema> creator;
    /** An [EIDR](https://eidr.org/) (Entertainment Identifier Registry) [[identifier]] representing a specific edit / edition for a work of film or television.

For example, the motion picture known as "Ghostbusters" whose [[titleEIDR]] is "10.5240/7EC7-228A-510A-053E-CBB8-J" has several edits, e.g. "10.5240/1F2A-E1C5-680A-14C6-E76B-I" and "10.5240/8A35-3BEE-6497-5D12-9E4F-3".

Since schema.org types like [[Movie]] and [[TVEpisode]] can be used for both works and their multiple expressions, it is possible to use [[titleEIDR]] alone (for a general description), or alongside [[editEIDR]] for a more edit-specific description.
 */
    @JsonProperty("editEIDR")
    private String editEIDR;
    /** Used to indicate a specific claim contained, implied, translated or refined from the content of a [[MediaObject]] or other [[CreativeWork]]. The interpreting party can be indicated using [[claimInterpreter]]. */
    @JsonProperty("interpretedAsClaim")
    private Claim interpretedAsClaim;
    /** Indicates a page documenting how licenses can be purchased or otherwise acquired, for the current item. */
    @JsonProperty("acquireLicensePage")
    private String acquireLicensePage;
    /** A media object that encodes this CreativeWork. */
    @JsonProperty("encodings")
    private MediaObject encodings;
    /** Indicates the primary entity described in some page or other CreativeWork. */
    @JsonProperty("mainEntity")
    private Thing mainEntity;
    /** A citation or reference to another creative work, such as another publication, web page, scholarly article, etc. */
    @JsonProperty("citation")
    private String citation;
    /** Indicates whether this content is family friendly. */
    @JsonProperty("isFamilyFriendly")
    private Boolean isFamilyFriendly;
    /** {'@language': 'en', '@value': 'The quantity of the materials being described or an expression of the physical space they occupy.'} */
    @JsonProperty("materialExtent")
    private String materialExtent;
    /** A license document that applies to this structured data, typically indicated by URL. */
    @JsonProperty("sdLicense")
    private String sdLicense;
    /** Indicates an IPTCDigitalSourceEnumeration code indicating the nature of the digital source(s) for some [[CreativeWork]]. */
    @JsonProperty("digitalSourceType")
    private IPTCDigitalSourceEnumeration digitalSourceType;
    /** The Event where the CreativeWork was recorded. The CreativeWork may capture all or part of the event. */
    @JsonProperty("recordedAt")
    private Event recordedAt;
    /** The person or organization who produced the work (e.g. music album, movie, TV/radio series etc.). */
    @JsonProperty("producer")
    private List<AbstractSchema> producer;
    /** The item being described is intended to assess the competency or learning outcome defined by the referenced term. */
    @JsonProperty("assesses")
    private String assesses;
    /** The location where the CreativeWork was created, which may not be the same as the location depicted in the CreativeWork. */
    @JsonProperty("locationCreated")
    private Place locationCreated;
    /** The date on which the CreativeWork was most recently modified or when the item's entry was modified within a DataFeed. */
    @JsonProperty("dateModified")
    private java.time.LocalDate dateModified;
    /** Indicates (by URL or string) a particular version of a schema used in some CreativeWork. This property was created primarily to
    indicate the use of a specific schema.org release, e.g. ```10.0``` as a simple string, or more explicitly via URL, ```https://schema.org/docs/releases.html#v10.0```. There may be situations in which other schemas might usefully be referenced this way, e.g. ```http://dublincore.org/specifications/dublin-core/dces/1999-07-02/``` but this has not been carefully explored in the community. */
    @JsonProperty("schemaVersion")
    private String schemaVersion;
    /** A secondary contributor to the CreativeWork or Event. */
    @JsonProperty("contributor")
    private List<AbstractSchema> contributor;
    /** Fictional person connected with a creative work. */
    @JsonProperty("character")
    private Person character;
    /** The predominant mode of learning supported by the learning resource. Acceptable values are 'active', 'expositive', or 'mixed'. */
    @JsonProperty("interactivityType")
    private String interactivityType;
    /** The place and time the release was issued, expressed as a PublicationEvent. */
    @JsonProperty("releasedEvent")
    private PublicationEvent releasedEvent;
    /** Indicates an item or CreativeWork that is part of this item, or CreativeWork (in some sense). */
    @JsonProperty("hasPart")
    private CreativeWork hasPart;
    /** Genre of the creative work, broadcast channel or group. */
    @JsonProperty("genre")
    private String genre;
    /** The temporalCoverage of a CreativeWork indicates the period that the content applies to, i.e. that it describes, either as a DateTime or as a textual string indicating a time period in [ISO 8601 time interval format](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals). In
      the case of a Dataset it will typically indicate the relevant time period in a precise notation (e.g. for a 2011 census dataset, the year 2011 would be written "2011/2012"). Other forms of content, e.g. ScholarlyArticle, Book, TVSeries or TVEpisode, may indicate their temporalCoverage in broader terms - textually or via well-known URL.
      Written works such as books may sometimes have precise temporal coverage too, e.g. a work set in 1939 - 1945 can be indicated in ISO 8601 interval format format via "1939/1945".

Open-ended date ranges can be written with ".." in place of the end date. For example, "2015-11/.." indicates a range beginning in November 2015 and with no specified final date. This is tentative and might be updated in future when ISO 8601 is officially updated. */
    @JsonProperty("temporalCoverage")
    private String temporalCoverage;
    /** Indicates the date on which the current structured data was generated / published. Typically used alongside [[sdPublisher]]. */
    @JsonProperty("sdDatePublished")
    private java.time.LocalDate sdDatePublished;
    /** An alignment to an established educational framework.

This property should not be used where the nature of the alignment can be described using a simple property, for example to express that a resource [[teaches]] or [[assesses]] a competency. */
    @JsonProperty("educationalAlignment")
    private AlignmentObject educationalAlignment;
    /** The country of origin of something, including products as well as creative  works such as movie and TV content.

In the case of TV and movie, this would be the country of the principle offices of the production company or individual responsible for the movie. For other kinds of [[CreativeWork]] it is difficult to provide fully general guidance, and properties such as [[contentLocation]] and [[locationCreated]] may be more applicable.

In the case of products, the country of origin of the product. The exact interpretation of this may vary by context and product type, and cannot be fully enumerated here. */
    @JsonProperty("countryOfOrigin")
    private Country countryOfOrigin;
    /** Identifies input methods that are sufficient to fully control the described resource. Values should be drawn from the [approved vocabulary](https://www.w3.org/2021/a11y-discov-vocab/latest/#accessibilityControl-vocabulary). */
    @JsonProperty("accessibilityControl")
    private String accessibilityControl;
    /** The position of an item in a series or sequence of items. */
    @JsonProperty("position")
    private String position;
    /** The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]]. */
    @JsonProperty("inLanguage")
    private String inLanguage;
    /** A work that is a translation of the content of this work. E.g. 西遊記 has an English workTranslation “Journey to the West”, a German workTranslation “Monkeys Pilgerfahrt” and a Vietnamese  translation Tây du ký bình khảo. */
    @JsonProperty("workTranslation")
    private CreativeWork workTranslation;
    /** Text of a notice appropriate for describing the copyright aspects of this Creative Work, ideally indicating the owner of the copyright for the Work. */
    @JsonProperty("copyrightNotice")
    private String copyrightNotice;
    /** The typical expected age range, e.g. '7-9', '11-'. */
    @JsonProperty("typicalAgeRange")
    private String typicalAgeRange;
    /** Thumbnail image for an image or video. */
    @JsonProperty("thumbnail")
    private ImageObject thumbnail;
    /** The status of a creative work in terms of its stage in a lifecycle. Example terms include Incomplete, Draft, Published, Obsolete. Some organizations define a set of terms for the stages of their publication lifecycle. */
    @JsonProperty("creativeWorkStatus")
    private String creativeWorkStatus;
    /** Indicates a correction to a [[CreativeWork]], either via a [[CorrectionComment]], textually or in another document. */
    @JsonProperty("correction")
    private String correction;
    /** The spatialCoverage of a CreativeWork indicates the place(s) which are the focus of the content. It is a subproperty of
      contentLocation intended primarily for more technical and detailed materials. For example with a Dataset, it indicates
      areas that the dataset describes: a dataset of New York weather would have spatialCoverage which was the place: the state of New York. */
    @JsonProperty("spatialCoverage")
    private Place spatialCoverage;
    /** Date of first publication or broadcast. For example the date a [[CreativeWork]] was broadcast or a [[Certification]] was issued. */
    @JsonProperty("datePublished")
    private java.time.LocalDate datePublished;
    /** Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event. */
    @JsonProperty("translator")
    private List<AbstractSchema> translator;
    /** A thumbnail image relevant to the Thing. */
    @JsonProperty("thumbnailUrl")
    private String thumbnailUrl;
    /** Awards won by or for this item. */
    @JsonProperty("awards")
    private String awards;
    /** A pattern that something has, for example 'polka dot', 'striped', 'Canadian flag'. Values are typically expressed as text, although links to controlled value schemes are also supported. */
    @JsonProperty("pattern")
    private String pattern;
    /** An embedded video object. */
    @JsonProperty("video")
    private List<AbstractSchema> video;
    /** A secondary title of the CreativeWork. */
    @JsonProperty("alternativeHeadline")
    private String alternativeHeadline;
    /** A license document that applies to this content, typically indicated by URL. */
    @JsonProperty("license")
    private String license;
    /** The year during which the claimed copyright for the CreativeWork was first asserted. */
    @JsonProperty("copyrightYear")
    private Double copyrightYear;
    /** Media type typically expressed using a MIME format (see [IANA site](http://www.iana.org/assignments/media-types/media-types.xhtml) and [MDN reference](https://developer.mozilla.org/en-US/docs/Web/HTTP/Basics_of_HTTP/MIME_types)), e.g. application/zip for a SoftwareApplication binary, audio/mpeg for .mp3 etc.

In cases where a [[CreativeWork]] has several media type representations, [[encoding]] can be used to indicate each [[MediaObject]] alongside particular [[encodingFormat]] information.

Unregistered or niche encoding and file formats can be indicated instead via the most appropriate URL, e.g. defining Web page or a Wikipedia/Wikidata entry. */
    @JsonProperty("encodingFormat")
    private String encodingFormat;
    /** Content features of the resource, such as accessible media, alternatives and supported enhancements for accessibility. Values should be drawn from the [approved vocabulary](https://www.w3.org/2021/a11y-discov-vocab/latest/#accessibilityFeature-vocabulary). */
    @JsonProperty("accessibilityFeature")
    private String accessibilityFeature;
    /** A link to the page containing the comments of the CreativeWork. */
    @JsonProperty("discussionUrl")
    private String discussionUrl;
    /** The publishing division which published the comic. */
    @JsonProperty("publisherImprint")
    private Organization publisherImprint;
    /** A human-readable summary of specific accessibility features or deficiencies, consistent with the other accessibility metadata but expressing subtleties such as "short descriptions are present but long descriptions will be needed for non-visual users" or "short descriptions are present and no long descriptions are needed". */
    @JsonProperty("accessibilitySummary")
    private String accessibilitySummary;
    /** A characteristic of the described resource that is physiologically dangerous to some users. Related to WCAG 2.0 guideline 2.3. Values should be drawn from the [approved vocabulary](https://www.w3.org/2021/a11y-discov-vocab/latest/#accessibilityHazard-vocabulary). */
    @JsonProperty("accessibilityHazard")
    private String accessibilityHazard;
    /** A person or organization that supports (sponsors) something through some kind of financial contribution. */
    @JsonProperty("funder")
    private List<AbstractSchema> funder;
    /** The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably. */
    @JsonProperty("author")
    private List<AbstractSchema> author;
    /** A standardized size of a product or creative work, specified either through a simple textual string (for example 'XL', '32Wx34L'), a  QuantitativeValue with a unitCode, or a comprehensive and structured [[SizeSpecification]]; in other cases, the [[width]], [[height]], [[depth]] and [[weight]] properties may be more applicable.  */
    @JsonProperty("size")
    private String size;
    /** A resource from which this work is derived or from which it is a modification or adaptation. */
    @JsonProperty("isBasedOn")
    private String isBasedOn;
    /** Specifies the Person who edited the CreativeWork. */
    @JsonProperty("editor")
    private Person editor;
    /** The Organization on whose behalf the creator was working. */
    @JsonProperty("sourceOrganization")
    private Organization sourceOrganization;
    /** A flag to signal that the item, event, or place is accessible for free. */
    @JsonProperty("isAccessibleForFree")
    private Boolean isAccessibleForFree;
    /** The specific time described by a creative work, for works (e.g. articles, video objects etc.) that emphasise a particular moment within an Event. */
    @JsonProperty("contentReferenceTime")
    private java.time.LocalDateTime contentReferenceTime;
    /** The purpose of a work in the context of education; for example, 'assignment', 'group work'. */
    @JsonProperty("educationalUse")
    private String educationalUse;
    /** The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller. */
    @JsonProperty("provider")
    private List<AbstractSchema> provider;
    /** Indicates an item or CreativeWork that this item, or CreativeWork (in some sense), is part of. */
    @JsonProperty("isPartOf")
    private String isPartOf;
    /** Indicates the party responsible for generating and publishing the current structured data markup, typically in cases where the structured data is derived automatically from existing published content but published on a different site. For example, student projects and open data initiatives often re-publish existing content with more explicitly structured metadata. The
[[sdPublisher]] property helps make such practices more explicit. */
    @JsonProperty("sdPublisher")
    private List<AbstractSchema> sdPublisher;
    /** Conditions that affect the availability of, or method(s) of access to, an item. Typically used for real world items such as an [[ArchiveComponent]] held by an [[ArchiveOrganization]]. This property is not suitable for use as a general Web access control mechanism. It is expressed only in natural language.\n\nFor example "Available by appointment from the Reading Room" or "Accessible only from logged-in accounts ".  */
    @JsonProperty("conditionsOfAccess")
    private String conditionsOfAccess;
    /** A material that something is made from, e.g. leather, wool, cotton, paper. */
    @JsonProperty("material")
    private String material;
    /** Approximate or typical time it usually takes to work with or through the content of this work for the typical or target audience. */
    @JsonProperty("timeRequired")
    private Duration timeRequired;
    /** An abstract is a short description that summarizes a [[CreativeWork]]. */
    @JsonProperty("abstract")
    private String abstract_;
    /** Official rating of a piece of content&#x2014;for example, 'MPAA PG-13'. */
    @JsonProperty("contentRating")
    private String contentRating;
    /** An embedded audio object. */
    @JsonProperty("audio")
    private List<AbstractSchema> audio;
    /** Example/instance/realization/derivation of the concept of this creative work. E.g. the paperback edition, first edition, or e-book. */
    @JsonProperty("workExample")
    private CreativeWork workExample;
    /** The subject matter of the content. */
    @JsonProperty("about")
    private Thing about;
    /** The date on which the CreativeWork was created or the item was added to a DataFeed. */
    @JsonProperty("dateCreated")
    private java.time.LocalDate dateCreated;
    /** The number of comments this CreativeWork (e.g. Article, Question or Answer) has received. This is most applicable to works published in Web sites with commenting system; additional comments may exist elsewhere. */
    @JsonProperty("commentCount")
    private Integer commentCount;
    /** Indicates a page or other link involved in archival of a [[CreativeWork]]. In the case of [[MediaReview]], the items in a [[MediaReviewItem]] may often become inaccessible, but be archived by archival, journalistic, activist, or law enforcement organizations. In such cases, the referenced page may not directly publish the content. */
    @JsonProperty("archivedAt")
    private String archivedAt;
    /** The "spatial" property can be used in cases when more specific properties
(e.g. [[locationCreated]], [[spatialCoverage]], [[contentLocation]]) are not known to be appropriate. */
    @JsonProperty("spatial")
    private Place spatial;
    /** A review of the item. */
    @JsonProperty("review")
    private AbstractSchema review;
    /** The "temporal" property can be used in cases where more specific properties
(e.g. [[temporalCoverage]], [[dateCreated]], [[dateModified]], [[datePublished]]) are not known to be appropriate. */
    @JsonProperty("temporal")
    private String temporal;
    /** Keywords or tags used to describe some item. Multiple textual entries in a keywords list are typically delimited by commas, or by repeating the property. */
    @JsonProperty("keywords")
    private String keywords;

    public Thing getMentions() { return mentions; }
    public void setMentions(Thing mentions) { this.mentions = mentions; }
    public String getIsBasedOnUrl() { return isBasedOnUrl; }
    public void setIsBasedOnUrl(String isBasedOnUrl) { this.isBasedOnUrl = isBasedOnUrl; }
    public AbstractSchema getReviews() { return reviews; }
    public void setReviews(AbstractSchema reviews) { this.reviews = reviews; }
    public AbstractSchema getAggregateRating() { return aggregateRating; }
    public void setAggregateRating(AbstractSchema aggregateRating) { this.aggregateRating = aggregateRating; }
    public String getPublishingPrinciples() { return publishingPrinciples; }
    public void setPublishingPrinciples(String publishingPrinciples) { this.publishingPrinciples = publishingPrinciples; }
    public String getAward() { return award; }
    public void setAward(String award) { this.award = award; }
    public List<AbstractSchema> getPublisher() { return publisher; }
    public void setPublisher(List<AbstractSchema> publisher) { this.publisher = publisher; }
    public List<AbstractSchema> getCopyrightHolder() { return copyrightHolder; }
    public void setCopyrightHolder(List<AbstractSchema> copyrightHolder) { this.copyrightHolder = copyrightHolder; }
    public String getTeaches() { return teaches; }
    public void setTeaches(String teaches) { this.teaches = teaches; }
    public String getHeadline() { return headline; }
    public void setHeadline(String headline) { this.headline = headline; }
    public String getFileFormat() { return fileFormat; }
    public void setFileFormat(String fileFormat) { this.fileFormat = fileFormat; }
    public InteractionCounter getInteractionStatistic() { return interactionStatistic; }
    public void setInteractionStatistic(InteractionCounter interactionStatistic) { this.interactionStatistic = interactionStatistic; }
    public String getLearningResourceType() { return learningResourceType; }
    public void setLearningResourceType(String learningResourceType) { this.learningResourceType = learningResourceType; }
    public Integer getWordCount() { return wordCount; }
    public void setWordCount(Integer wordCount) { this.wordCount = wordCount; }
    public List<AbstractSchema> getMaintainer() { return maintainer; }
    public void setMaintainer(List<AbstractSchema> maintainer) { this.maintainer = maintainer; }
    public String getAccessMode() { return accessMode; }
    public void setAccessMode(String accessMode) { this.accessMode = accessMode; }
    public String getEducationalLevel() { return educationalLevel; }
    public void setEducationalLevel(String educationalLevel) { this.educationalLevel = educationalLevel; }
    public java.time.LocalDateTime getExpires() { return expires; }
    public void setExpires(java.time.LocalDateTime expires) { this.expires = expires; }
    public List<AbstractSchema> getSponsor() { return sponsor; }
    public void setSponsor(List<AbstractSchema> sponsor) { this.sponsor = sponsor; }
    public ItemList getAccessModeSufficient() { return accessModeSufficient; }
    public void setAccessModeSufficient(ItemList accessModeSufficient) { this.accessModeSufficient = accessModeSufficient; }
    public Grant getFunding() { return funding; }
    public void setFunding(Grant funding) { this.funding = funding; }
    public List<AbstractSchema> getOffers() { return offers; }
    public void setOffers(List<AbstractSchema> offers) { this.offers = offers; }
    public String getAccessibilityAPI() { return accessibilityAPI; }
    public void setAccessibilityAPI(String accessibilityAPI) { this.accessibilityAPI = accessibilityAPI; }
    public String getUsageInfo() { return usageInfo; }
    public void setUsageInfo(String usageInfo) { this.usageInfo = usageInfo; }
    public CreativeWork getExampleOfWork() { return exampleOfWork; }
    public void setExampleOfWork(CreativeWork exampleOfWork) { this.exampleOfWork = exampleOfWork; }
    public MediaObject getEncoding() { return encoding; }
    public void setEncoding(MediaObject encoding) { this.encoding = encoding; }
    public Person getAccountablePerson() { return accountablePerson; }
    public void setAccountablePerson(Person accountablePerson) { this.accountablePerson = accountablePerson; }
    public CreativeWork getTranslationOfWork() { return translationOfWork; }
    public void setTranslationOfWork(CreativeWork translationOfWork) { this.translationOfWork = translationOfWork; }
    public MediaObject getAssociatedMedia() { return associatedMedia; }
    public void setAssociatedMedia(MediaObject associatedMedia) { this.associatedMedia = associatedMedia; }
    public String getCreditText() { return creditText; }
    public void setCreditText(String creditText) { this.creditText = creditText; }
    public Place getContentLocation() { return contentLocation; }
    public void setContentLocation(Place contentLocation) { this.contentLocation = contentLocation; }
    public PublicationEvent getPublication() { return publication; }
    public void setPublication(PublicationEvent publication) { this.publication = publication; }
    public Double getVersion() { return version; }
    public void setVersion(Double version) { this.version = version; }
    public List<AbstractSchema> getCreator() { return creator; }
    public void setCreator(List<AbstractSchema> creator) { this.creator = creator; }
    public String getEditEIDR() { return editEIDR; }
    public void setEditEIDR(String editEIDR) { this.editEIDR = editEIDR; }
    public Claim getInterpretedAsClaim() { return interpretedAsClaim; }
    public void setInterpretedAsClaim(Claim interpretedAsClaim) { this.interpretedAsClaim = interpretedAsClaim; }
    public String getAcquireLicensePage() { return acquireLicensePage; }
    public void setAcquireLicensePage(String acquireLicensePage) { this.acquireLicensePage = acquireLicensePage; }
    public MediaObject getEncodings() { return encodings; }
    public void setEncodings(MediaObject encodings) { this.encodings = encodings; }
    public Thing getMainEntity() { return mainEntity; }
    public void setMainEntity(Thing mainEntity) { this.mainEntity = mainEntity; }
    public String getCitation() { return citation; }
    public void setCitation(String citation) { this.citation = citation; }
    public Boolean getIsFamilyFriendly() { return isFamilyFriendly; }
    public void setIsFamilyFriendly(Boolean isFamilyFriendly) { this.isFamilyFriendly = isFamilyFriendly; }
    public String getMaterialExtent() { return materialExtent; }
    public void setMaterialExtent(String materialExtent) { this.materialExtent = materialExtent; }
    public String getSdLicense() { return sdLicense; }
    public void setSdLicense(String sdLicense) { this.sdLicense = sdLicense; }
    public IPTCDigitalSourceEnumeration getDigitalSourceType() { return digitalSourceType; }
    public void setDigitalSourceType(IPTCDigitalSourceEnumeration digitalSourceType) { this.digitalSourceType = digitalSourceType; }
    public Event getRecordedAt() { return recordedAt; }
    public void setRecordedAt(Event recordedAt) { this.recordedAt = recordedAt; }
    public List<AbstractSchema> getProducer() { return producer; }
    public void setProducer(List<AbstractSchema> producer) { this.producer = producer; }
    public String getAssesses() { return assesses; }
    public void setAssesses(String assesses) { this.assesses = assesses; }
    public Place getLocationCreated() { return locationCreated; }
    public void setLocationCreated(Place locationCreated) { this.locationCreated = locationCreated; }
    public java.time.LocalDate getDateModified() { return dateModified; }
    public void setDateModified(java.time.LocalDate dateModified) { this.dateModified = dateModified; }
    public String getSchemaVersion() { return schemaVersion; }
    public void setSchemaVersion(String schemaVersion) { this.schemaVersion = schemaVersion; }
    public List<AbstractSchema> getContributor() { return contributor; }
    public void setContributor(List<AbstractSchema> contributor) { this.contributor = contributor; }
    public Person getCharacter() { return character; }
    public void setCharacter(Person character) { this.character = character; }
    public String getInteractivityType() { return interactivityType; }
    public void setInteractivityType(String interactivityType) { this.interactivityType = interactivityType; }
    public PublicationEvent getReleasedEvent() { return releasedEvent; }
    public void setReleasedEvent(PublicationEvent releasedEvent) { this.releasedEvent = releasedEvent; }
    public CreativeWork getHasPart() { return hasPart; }
    public void setHasPart(CreativeWork hasPart) { this.hasPart = hasPart; }
    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }
    public String getTemporalCoverage() { return temporalCoverage; }
    public void setTemporalCoverage(String temporalCoverage) { this.temporalCoverage = temporalCoverage; }
    public java.time.LocalDate getSdDatePublished() { return sdDatePublished; }
    public void setSdDatePublished(java.time.LocalDate sdDatePublished) { this.sdDatePublished = sdDatePublished; }
    public AlignmentObject getEducationalAlignment() { return educationalAlignment; }
    public void setEducationalAlignment(AlignmentObject educationalAlignment) { this.educationalAlignment = educationalAlignment; }
    public Country getCountryOfOrigin() { return countryOfOrigin; }
    public void setCountryOfOrigin(Country countryOfOrigin) { this.countryOfOrigin = countryOfOrigin; }
    public String getAccessibilityControl() { return accessibilityControl; }
    public void setAccessibilityControl(String accessibilityControl) { this.accessibilityControl = accessibilityControl; }
    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }
    public String getInLanguage() { return inLanguage; }
    public void setInLanguage(String inLanguage) { this.inLanguage = inLanguage; }
    public CreativeWork getWorkTranslation() { return workTranslation; }
    public void setWorkTranslation(CreativeWork workTranslation) { this.workTranslation = workTranslation; }
    public String getCopyrightNotice() { return copyrightNotice; }
    public void setCopyrightNotice(String copyrightNotice) { this.copyrightNotice = copyrightNotice; }
    public String getTypicalAgeRange() { return typicalAgeRange; }
    public void setTypicalAgeRange(String typicalAgeRange) { this.typicalAgeRange = typicalAgeRange; }
    public ImageObject getThumbnail() { return thumbnail; }
    public void setThumbnail(ImageObject thumbnail) { this.thumbnail = thumbnail; }
    public String getCreativeWorkStatus() { return creativeWorkStatus; }
    public void setCreativeWorkStatus(String creativeWorkStatus) { this.creativeWorkStatus = creativeWorkStatus; }
    public String getCorrection() { return correction; }
    public void setCorrection(String correction) { this.correction = correction; }
    public Place getSpatialCoverage() { return spatialCoverage; }
    public void setSpatialCoverage(Place spatialCoverage) { this.spatialCoverage = spatialCoverage; }
    public java.time.LocalDate getDatePublished() { return datePublished; }
    public void setDatePublished(java.time.LocalDate datePublished) { this.datePublished = datePublished; }
    public List<AbstractSchema> getTranslator() { return translator; }
    public void setTranslator(List<AbstractSchema> translator) { this.translator = translator; }
    public String getThumbnailUrl() { return thumbnailUrl; }
    public void setThumbnailUrl(String thumbnailUrl) { this.thumbnailUrl = thumbnailUrl; }
    public String getAwards() { return awards; }
    public void setAwards(String awards) { this.awards = awards; }
    public String getPattern() { return pattern; }
    public void setPattern(String pattern) { this.pattern = pattern; }
    public List<AbstractSchema> getVideo() { return video; }
    public void setVideo(List<AbstractSchema> video) { this.video = video; }
    public String getAlternativeHeadline() { return alternativeHeadline; }
    public void setAlternativeHeadline(String alternativeHeadline) { this.alternativeHeadline = alternativeHeadline; }
    public String getLicense() { return license; }
    public void setLicense(String license) { this.license = license; }
    public Double getCopyrightYear() { return copyrightYear; }
    public void setCopyrightYear(Double copyrightYear) { this.copyrightYear = copyrightYear; }
    public String getEncodingFormat() { return encodingFormat; }
    public void setEncodingFormat(String encodingFormat) { this.encodingFormat = encodingFormat; }
    public String getAccessibilityFeature() { return accessibilityFeature; }
    public void setAccessibilityFeature(String accessibilityFeature) { this.accessibilityFeature = accessibilityFeature; }
    public String getDiscussionUrl() { return discussionUrl; }
    public void setDiscussionUrl(String discussionUrl) { this.discussionUrl = discussionUrl; }
    public Organization getPublisherImprint() { return publisherImprint; }
    public void setPublisherImprint(Organization publisherImprint) { this.publisherImprint = publisherImprint; }
    public String getAccessibilitySummary() { return accessibilitySummary; }
    public void setAccessibilitySummary(String accessibilitySummary) { this.accessibilitySummary = accessibilitySummary; }
    public String getAccessibilityHazard() { return accessibilityHazard; }
    public void setAccessibilityHazard(String accessibilityHazard) { this.accessibilityHazard = accessibilityHazard; }
    public List<AbstractSchema> getFunder() { return funder; }
    public void setFunder(List<AbstractSchema> funder) { this.funder = funder; }
    public List<AbstractSchema> getAuthor() { return author; }
    public void setAuthor(List<AbstractSchema> author) { this.author = author; }
    public String getSize() { return size; }
    public void setSize(String size) { this.size = size; }
    public String getIsBasedOn() { return isBasedOn; }
    public void setIsBasedOn(String isBasedOn) { this.isBasedOn = isBasedOn; }
    public Person getEditor() { return editor; }
    public void setEditor(Person editor) { this.editor = editor; }
    public Organization getSourceOrganization() { return sourceOrganization; }
    public void setSourceOrganization(Organization sourceOrganization) { this.sourceOrganization = sourceOrganization; }
    public Boolean getIsAccessibleForFree() { return isAccessibleForFree; }
    public void setIsAccessibleForFree(Boolean isAccessibleForFree) { this.isAccessibleForFree = isAccessibleForFree; }
    public java.time.LocalDateTime getContentReferenceTime() { return contentReferenceTime; }
    public void setContentReferenceTime(java.time.LocalDateTime contentReferenceTime) { this.contentReferenceTime = contentReferenceTime; }
    public String getEducationalUse() { return educationalUse; }
    public void setEducationalUse(String educationalUse) { this.educationalUse = educationalUse; }
    public List<AbstractSchema> getProvider() { return provider; }
    public void setProvider(List<AbstractSchema> provider) { this.provider = provider; }
    public String getIsPartOf() { return isPartOf; }
    public void setIsPartOf(String isPartOf) { this.isPartOf = isPartOf; }
    public List<AbstractSchema> getSdPublisher() { return sdPublisher; }
    public void setSdPublisher(List<AbstractSchema> sdPublisher) { this.sdPublisher = sdPublisher; }
    public String getConditionsOfAccess() { return conditionsOfAccess; }
    public void setConditionsOfAccess(String conditionsOfAccess) { this.conditionsOfAccess = conditionsOfAccess; }
    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }
    public Duration getTimeRequired() { return timeRequired; }
    public void setTimeRequired(Duration timeRequired) { this.timeRequired = timeRequired; }
    public String getAbstract() { return abstract_; }
    public void setAbstract(String abstract_) { this.abstract_ = abstract_; }
    public String getContentRating() { return contentRating; }
    public void setContentRating(String contentRating) { this.contentRating = contentRating; }
    public List<AbstractSchema> getAudio() { return audio; }
    public void setAudio(List<AbstractSchema> audio) { this.audio = audio; }
    public CreativeWork getWorkExample() { return workExample; }
    public void setWorkExample(CreativeWork workExample) { this.workExample = workExample; }
    public Thing getAbout() { return about; }
    public void setAbout(Thing about) { this.about = about; }
    public java.time.LocalDate getDateCreated() { return dateCreated; }
    public void setDateCreated(java.time.LocalDate dateCreated) { this.dateCreated = dateCreated; }
    public Integer getCommentCount() { return commentCount; }
    public void setCommentCount(Integer commentCount) { this.commentCount = commentCount; }
    public String getArchivedAt() { return archivedAt; }
    public void setArchivedAt(String archivedAt) { this.archivedAt = archivedAt; }
    public Place getSpatial() { return spatial; }
    public void setSpatial(Place spatial) { this.spatial = spatial; }
    public AbstractSchema getReview() { return review; }
    public void setReview(AbstractSchema review) { this.review = review; }
    public String getTemporal() { return temporal; }
    public void setTemporal(String temporal) { this.temporal = temporal; }
    public String getKeywords() { return keywords; }
    public void setKeywords(String keywords) { this.keywords = keywords; }
}
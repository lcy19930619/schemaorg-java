package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import net.jlxxw.schema.org.JsonLdType;
public class Place extends AbstractSchema {
    public Place() {
    }
    /** Certification information about a product, organization, service, place, or person. */
    @JsonProperty("hasCertification")
    private Certification hasCertification;
    /** Review of the item. */
    @JsonProperty("reviews")
    private AbstractSchema reviews;
    /** The overall rating, based on a collection of reviews or ratings, of the item. */
    @JsonProperty("aggregateRating")
    private AbstractSchema aggregateRating;
    /** A short textual code (also called "store code") that uniquely identifies a place of business. The code is typically assigned by the parentOrganization and used in structured URLs.\n\nFor example, in the URL http://www.starbucks.co.uk/store-locator/etc/detail/3047 the code "3047" is a branchCode for a particular branch.
       */
    @JsonProperty("branchCode")
    private String branchCode;
    /** The basic containment relation between a place and one that contains it. */
    @JsonProperty("containedIn")
    private Place containedIn;
    /** The latitude of a location. For example ```37.42242``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)). */
    @JsonProperty("latitude")
    private String latitude;
    /** Upcoming or past events associated with this place or organization. */
    @JsonProperty("events")
    private Event events;
    /** The basic containment relation between a place and another that it contains. */
    @JsonProperty("containsPlace")
    private Place containsPlace;
    /** A property-value pair representing an additional characteristic of the entity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.\n\nNote: Publishers should be aware that applications designed to use specific schema.org properties (e.g. https://schema.org/width, https://schema.org/color, https://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
 */
    @JsonProperty("additionalProperty")
    private PropertyValue additionalProperty;
    /** A page providing information on how to book a tour of some [[Place]], such as an [[Accommodation]] or [[ApartmentComplex]] in a real estate setting, as well as other kinds of tours as appropriate. */
    @JsonProperty("tourBookingPage")
    private String tourBookingPage;
    /** Represents spatial relations in which two geometries (or the places they represent) have at least one point in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM). */
    @JsonProperty("geoIntersects")
    private List<AbstractSchema> geoIntersects;
    /** A flag to signal that the [[Place]] is open to public visitors.  If this property is omitted there is no assumed default boolean value. */
    @JsonProperty("publicAccess")
    private Boolean publicAccess;
    /** The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place. */
    @JsonProperty("isicV4")
    private String isicV4;
    /** The total number of individuals that may attend an event or venue. */
    @JsonProperty("maximumAttendeeCapacity")
    private Integer maximumAttendeeCapacity;
    /** An amenity feature (e.g. a characteristic or service) of the Accommodation. This generic property does not make a statement about whether the feature is included in an offer for the main accommodation or available at extra costs. */
    @JsonProperty("amenityFeature")
    private LocationFeatureSpecification amenityFeature;
    /** Photographs of this place. */
    @JsonProperty("photos")
    private List<AbstractSchema> photos;
    /** Represents a relationship between two geometries (or the places they represent), relating a geometry to another that crosses it: "a crosses b: they have some but not all interior points in common, and the dimension of the intersection is less than that of at least one of them". As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM). */
    @JsonProperty("geoCrosses")
    private List<AbstractSchema> geoCrosses;
    /** Represents spatial relations in which two geometries (or the places they represent) are topologically disjoint: "they have no point in common. They form a set of disconnected geometries." (A symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).) */
    @JsonProperty("geoDisjoint")
    private List<AbstractSchema> geoDisjoint;
    /** A URL to a map of the place. */
    @JsonProperty("hasMap")
    private String hasMap;
    /** The basic containment relation between a place and one that contains it. */
    @JsonProperty("containedInPlace")
    private Place containedInPlace;
    /** Represents a relationship between two geometries (or the places they represent), relating a containing geometry to a contained geometry. "a contains b iff no points of b lie in the exterior of a, and at least one point of the interior of b lies in the interior of a". As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM). */
    @JsonProperty("geoContains")
    private List<AbstractSchema> geoContains;
    /** The geo coordinates of the place. */
    @JsonProperty("geo")
    private List<AbstractSchema> geo;
    /** The telephone number. */
    @JsonProperty("telephone")
    private String telephone;
    /** The [Global Location Number](http://www.gs1.org/gln) (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations. */
    @JsonProperty("globalLocationNumber")
    private String globalLocationNumber;
    /** The longitude of a location. For example ```-122.08585``` ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)). */
    @JsonProperty("longitude")
    private String longitude;
    /** A URL to a map of the place. */
    @JsonProperty("maps")
    private String maps;
    /** Represents a relationship between two geometries (or the places they represent), relating a covering geometry to a covered geometry. "Every point of b is a point of (the interior or boundary of) a". As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM). */
    @JsonProperty("geoCovers")
    private List<AbstractSchema> geoCovers;
    /** Physical address of the item. */
    @JsonProperty("address")
    private String address;
    /** Represents spatial relations in which two geometries (or the places they represent) touch: "they have at least one boundary point in common, but no interior points." (A symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).) */
    @JsonProperty("geoTouches")
    private List<AbstractSchema> geoTouches;
    /** Represents a relationship between two geometries (or the places they represent), relating a geometry to another that geospatially overlaps it, i.e. they have some but not all points in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM). */
    @JsonProperty("geoOverlaps")
    private List<AbstractSchema> geoOverlaps;
    /** Indicates whether it is allowed to smoke in the place, e.g. in the restaurant, hotel or hotel room. */
    @JsonProperty("smokingAllowed")
    private Boolean smokingAllowed;
    /** A flag to signal that the item, event, or place is accessible for free. */
    @JsonProperty("isAccessibleForFree")
    private Boolean isAccessibleForFree;
    /** The fax number. */
    @JsonProperty("faxNumber")
    private String faxNumber;
    /** Represents a relationship between two geometries (or the places they represent), relating a geometry to one that contains it, i.e. it is inside (i.e. within) its interior. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM). */
    @JsonProperty("geoWithin")
    private List<AbstractSchema> geoWithin;
    /** The opening hours of a certain place. */
    @JsonProperty("openingHoursSpecification")
    private AbstractSchema openingHoursSpecification;
    /** The <a href="https://www.gs1.org/standards/gs1-digital-link">GS1 digital link</a> associated with the object. This URL should conform to the particular requirements of digital links. The link should only contain the Application Identifiers (AIs) that are relevant for the entity being annotated, for instance a [[Product]] or an [[Organization]], and for the correct granularity. In particular, for products:<ul><li>A Digital Link that contains a serial number (AI <code>21</code>) should only be present on instances of [[IndividualProduct]]</li><li>A Digital Link that contains a lot number (AI <code>10</code>) should be annotated as [[SomeProduct]] if only products from that lot are sold, or [[IndividualProduct]] if there is only a specific product.</li><li>A Digital Link that contains a global model number (AI <code>8013</code>)  should be attached to a [[Product]] or a [[ProductModel]].</li></ul> Other item types should be adapted similarly. */
    @JsonProperty("hasGS1DigitalLink")
    private String hasGS1DigitalLink;
    /** An associated logo. */
    @JsonProperty("logo")
    private String logo;
    /** A photograph of this place. */
    @JsonProperty("photo")
    private List<AbstractSchema> photo;
    /** Represents spatial relations in which two geometries (or the places they represent) are topologically equal, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM). "Two geometries are topologically equal if their interiors intersect and no part of the interior or boundary of one geometry intersects the exterior of the other" (a symmetric relationship). */
    @JsonProperty("geoEquals")
    private List<AbstractSchema> geoEquals;
    /** Indicates whether some facility (e.g. [[FoodEstablishment]], [[CovidTestingFacility]]) offers a service that can be used by driving through in a car. In the case of [[CovidTestingFacility]] such facilities could potentially help with social distancing from other potentially-infected users. */
    @JsonProperty("hasDriveThroughService")
    private Boolean hasDriveThroughService;
    /** A slogan or motto associated with the item. */
    @JsonProperty("slogan")
    private String slogan;
    /** Represents a relationship between two geometries (or the places they represent), relating a geometry to another that covers it. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM). */
    @JsonProperty("geoCoveredBy")
    private List<AbstractSchema> geoCoveredBy;
    /** A review of the item. */
    @JsonProperty("review")
    private AbstractSchema review;
    /** Keywords or tags used to describe some item. Multiple textual entries in a keywords list are typically delimited by commas, or by repeating the property. */
    @JsonProperty("keywords")
    private String keywords;
    /** The special opening hours of a certain place.\n\nUse this to explicitly override general opening hours brought in scope by [[openingHoursSpecification]] or [[openingHours]].
       */
    @JsonProperty("specialOpeningHoursSpecification")
    private AbstractSchema specialOpeningHoursSpecification;

    public Certification getHasCertification() { return hasCertification; }
    public void setHasCertification(Certification hasCertification) { this.hasCertification = hasCertification; }
    public AbstractSchema getReviews() { return reviews; }
    public void setReviews(AbstractSchema reviews) { this.reviews = reviews; }
    public AbstractSchema getAggregateRating() { return aggregateRating; }
    public void setAggregateRating(AbstractSchema aggregateRating) { this.aggregateRating = aggregateRating; }
    public String getBranchCode() { return branchCode; }
    public void setBranchCode(String branchCode) { this.branchCode = branchCode; }
    public Place getContainedIn() { return containedIn; }
    public void setContainedIn(Place containedIn) { this.containedIn = containedIn; }
    public String getLatitude() { return latitude; }
    public void setLatitude(String latitude) { this.latitude = latitude; }
    public Event getEvents() { return events; }
    public void setEvents(Event events) { this.events = events; }
    public Place getContainsPlace() { return containsPlace; }
    public void setContainsPlace(Place containsPlace) { this.containsPlace = containsPlace; }
    public PropertyValue getAdditionalProperty() { return additionalProperty; }
    public void setAdditionalProperty(PropertyValue additionalProperty) { this.additionalProperty = additionalProperty; }
    public String getTourBookingPage() { return tourBookingPage; }
    public void setTourBookingPage(String tourBookingPage) { this.tourBookingPage = tourBookingPage; }
    public List<AbstractSchema> getGeoIntersects() { return geoIntersects; }
    public void setGeoIntersects(List<AbstractSchema> geoIntersects) { this.geoIntersects = geoIntersects; }
    public Boolean getPublicAccess() { return publicAccess; }
    public void setPublicAccess(Boolean publicAccess) { this.publicAccess = publicAccess; }
    public String getIsicV4() { return isicV4; }
    public void setIsicV4(String isicV4) { this.isicV4 = isicV4; }
    public Integer getMaximumAttendeeCapacity() { return maximumAttendeeCapacity; }
    public void setMaximumAttendeeCapacity(Integer maximumAttendeeCapacity) { this.maximumAttendeeCapacity = maximumAttendeeCapacity; }
    public LocationFeatureSpecification getAmenityFeature() { return amenityFeature; }
    public void setAmenityFeature(LocationFeatureSpecification amenityFeature) { this.amenityFeature = amenityFeature; }
    public List<AbstractSchema> getPhotos() { return photos; }
    public void setPhotos(List<AbstractSchema> photos) { this.photos = photos; }
    public List<AbstractSchema> getGeoCrosses() { return geoCrosses; }
    public void setGeoCrosses(List<AbstractSchema> geoCrosses) { this.geoCrosses = geoCrosses; }
    public List<AbstractSchema> getGeoDisjoint() { return geoDisjoint; }
    public void setGeoDisjoint(List<AbstractSchema> geoDisjoint) { this.geoDisjoint = geoDisjoint; }
    public String getHasMap() { return hasMap; }
    public void setHasMap(String hasMap) { this.hasMap = hasMap; }
    public Place getContainedInPlace() { return containedInPlace; }
    public void setContainedInPlace(Place containedInPlace) { this.containedInPlace = containedInPlace; }
    public List<AbstractSchema> getGeoContains() { return geoContains; }
    public void setGeoContains(List<AbstractSchema> geoContains) { this.geoContains = geoContains; }
    public List<AbstractSchema> getGeo() { return geo; }
    public void setGeo(List<AbstractSchema> geo) { this.geo = geo; }
    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }
    public String getGlobalLocationNumber() { return globalLocationNumber; }
    public void setGlobalLocationNumber(String globalLocationNumber) { this.globalLocationNumber = globalLocationNumber; }
    public String getLongitude() { return longitude; }
    public void setLongitude(String longitude) { this.longitude = longitude; }
    public String getMaps() { return maps; }
    public void setMaps(String maps) { this.maps = maps; }
    public List<AbstractSchema> getGeoCovers() { return geoCovers; }
    public void setGeoCovers(List<AbstractSchema> geoCovers) { this.geoCovers = geoCovers; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public List<AbstractSchema> getGeoTouches() { return geoTouches; }
    public void setGeoTouches(List<AbstractSchema> geoTouches) { this.geoTouches = geoTouches; }
    public List<AbstractSchema> getGeoOverlaps() { return geoOverlaps; }
    public void setGeoOverlaps(List<AbstractSchema> geoOverlaps) { this.geoOverlaps = geoOverlaps; }
    public Boolean getSmokingAllowed() { return smokingAllowed; }
    public void setSmokingAllowed(Boolean smokingAllowed) { this.smokingAllowed = smokingAllowed; }
    public Boolean getIsAccessibleForFree() { return isAccessibleForFree; }
    public void setIsAccessibleForFree(Boolean isAccessibleForFree) { this.isAccessibleForFree = isAccessibleForFree; }
    public String getFaxNumber() { return faxNumber; }
    public void setFaxNumber(String faxNumber) { this.faxNumber = faxNumber; }
    public List<AbstractSchema> getGeoWithin() { return geoWithin; }
    public void setGeoWithin(List<AbstractSchema> geoWithin) { this.geoWithin = geoWithin; }
    public AbstractSchema getOpeningHoursSpecification() { return openingHoursSpecification; }
    public void setOpeningHoursSpecification(AbstractSchema openingHoursSpecification) { this.openingHoursSpecification = openingHoursSpecification; }
    public String getHasGS1DigitalLink() { return hasGS1DigitalLink; }
    public void setHasGS1DigitalLink(String hasGS1DigitalLink) { this.hasGS1DigitalLink = hasGS1DigitalLink; }
    public String getLogo() { return logo; }
    public void setLogo(String logo) { this.logo = logo; }
    public List<AbstractSchema> getPhoto() { return photo; }
    public void setPhoto(List<AbstractSchema> photo) { this.photo = photo; }
    public List<AbstractSchema> getGeoEquals() { return geoEquals; }
    public void setGeoEquals(List<AbstractSchema> geoEquals) { this.geoEquals = geoEquals; }
    public Boolean getHasDriveThroughService() { return hasDriveThroughService; }
    public void setHasDriveThroughService(Boolean hasDriveThroughService) { this.hasDriveThroughService = hasDriveThroughService; }
    public String getSlogan() { return slogan; }
    public void setSlogan(String slogan) { this.slogan = slogan; }
    public List<AbstractSchema> getGeoCoveredBy() { return geoCoveredBy; }
    public void setGeoCoveredBy(List<AbstractSchema> geoCoveredBy) { this.geoCoveredBy = geoCoveredBy; }
    public AbstractSchema getReview() { return review; }
    public void setReview(AbstractSchema review) { this.review = review; }
    public String getKeywords() { return keywords; }
    public void setKeywords(String keywords) { this.keywords = keywords; }
    public AbstractSchema getSpecialOpeningHoursSpecification() { return specialOpeningHoursSpecification; }
    public void setSpecialOpeningHoursSpecification(AbstractSchema specialOpeningHoursSpecification) { this.specialOpeningHoursSpecification = specialOpeningHoursSpecification; }
}
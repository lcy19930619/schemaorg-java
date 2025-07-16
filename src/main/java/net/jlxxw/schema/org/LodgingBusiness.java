package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
import net.jlxxw.schema.org.JsonLdType;
public class LodgingBusiness extends LocalBusiness {
    public LodgingBusiness() {
}
    /** An official rating for a lodging business or food establishment, e.g. from national associations or standards bodies. Use the author property to indicate the rating organization, e.g. as an Organization with name such as (e.g. HOTREC, DEHOGA, WHR, or Hotelstars). */
    @JsonProperty("starRating")
    private Rating starRating;
    /** An amenity feature (e.g. a characteristic or service) of the Accommodation. This generic property does not make a statement about whether the feature is included in an offer for the main accommodation or available at extra costs. */
    @JsonProperty("amenityFeature")
    private LocationFeatureSpecification amenityFeature;
    /** The latest someone may check out of a lodging establishment. */
    @JsonProperty("checkoutTime")
    private java.time.LocalDateTime checkoutTime;
    /** A language someone may use with or at the item, service or place. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[inLanguage]]. */
    @JsonProperty("availableLanguage")
    private String availableLanguage;
    /** The earliest someone may check into a lodging establishment. */
    @JsonProperty("checkinTime")
    private java.time.LocalDateTime checkinTime;
    /** The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue. */
    @JsonProperty("numberOfRooms")
    private Double numberOfRooms;
    /** Indicates whether pets are allowed to enter the accommodation or lodging business. More detailed information can be put in a text value. */
    @JsonProperty("petsAllowed")
    private Boolean petsAllowed;

    public Rating getStarRating() { return starRating; }
    public void setStarRating(Rating starRating) { this.starRating = starRating; }
    public LocationFeatureSpecification getAmenityFeature() { return amenityFeature; }
    public void setAmenityFeature(LocationFeatureSpecification amenityFeature) { this.amenityFeature = amenityFeature; }
    public java.time.LocalDateTime getCheckoutTime() { return checkoutTime; }
    public void setCheckoutTime(java.time.LocalDateTime checkoutTime) { this.checkoutTime = checkoutTime; }
    public String getAvailableLanguage() { return availableLanguage; }
    public void setAvailableLanguage(String availableLanguage) { this.availableLanguage = availableLanguage; }
    public java.time.LocalDateTime getCheckinTime() { return checkinTime; }
    public void setCheckinTime(java.time.LocalDateTime checkinTime) { this.checkinTime = checkinTime; }
    public Double getNumberOfRooms() { return numberOfRooms; }
    public void setNumberOfRooms(Double numberOfRooms) { this.numberOfRooms = numberOfRooms; }
    public Boolean getPetsAllowed() { return petsAllowed; }
    public void setPetsAllowed(Boolean petsAllowed) { this.petsAllowed = petsAllowed; }
}
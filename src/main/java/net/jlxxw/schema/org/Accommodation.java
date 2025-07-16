package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import net.jlxxw.schema.org.JsonLdType;
public class Accommodation extends Place {
    public Accommodation() {
}
    /** The total integer number of bathrooms in some [[Accommodation]], following real estate conventions as [documented in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsTotalInteger+Field): "The simple sum of the number of bathrooms. For example for a property with two Full Bathrooms and one Half Bathroom, the Bathrooms Total Integer will be 3.". See also [[numberOfRooms]]. */
    @JsonProperty("numberOfBathroomsTotal")
    private Integer numberOfBathroomsTotal;
    /** Category of an [[Accommodation]], following real estate conventions, e.g. RESO (see [PropertySubType](https://ddwiki.reso.org/display/DDW17/PropertySubType+Field), and [PropertyType](https://ddwiki.reso.org/display/DDW17/PropertyType+Field) fields  for suggested values). */
    @JsonProperty("accommodationCategory")
    private String accommodationCategory;
    /** The allowed total occupancy for the accommodation in persons (including infants etc). For individual accommodations, this is not necessarily the legal maximum but defines the permitted usage as per the contractual agreement (e.g. a double room used by a single person).
Typical unit code(s): C62 for person. */
    @JsonProperty("occupancy")
    private QuantitativeValue occupancy;
    /** A page providing information on how to book a tour of some [[Place]], such as an [[Accommodation]] or [[ApartmentComplex]] in a real estate setting, as well as other kinds of tours as appropriate. */
    @JsonProperty("tourBookingPage")
    private String tourBookingPage;
    /** Number of full bathrooms - The total number of full and ¾ bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsFull field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsFull+Field). */
    @JsonProperty("numberOfFullBathrooms")
    private Double numberOfFullBathrooms;
    /** An amenity feature (e.g. a characteristic or service) of the Accommodation. This generic property does not make a statement about whether the feature is included in an offer for the main accommodation or available at extra costs. */
    @JsonProperty("amenityFeature")
    private LocationFeatureSpecification amenityFeature;
    /** A floorplan of some [[Accommodation]]. */
    @JsonProperty("accommodationFloorPlan")
    private FloorPlan accommodationFloorPlan;
    /** Number of partial bathrooms - The total number of half and ¼ bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsPartial field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsPartial+Field).  */
    @JsonProperty("numberOfPartialBathrooms")
    private Double numberOfPartialBathrooms;
    /** The size of the accommodation, e.g. in square meter or squarefoot.
Typical unit code(s): MTK for square meter, FTK for square foot, or YDK for square yard. */
    @JsonProperty("floorSize")
    private QuantitativeValue floorSize;
    /** The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue. */
    @JsonProperty("numberOfRooms")
    private Double numberOfRooms;
    /** Length of the lease for some [[Accommodation]], either particular to some [[Offer]] or in some cases intrinsic to the property. */
    @JsonProperty("leaseLength")
    private List<AbstractSchema> leaseLength;
    /** The year an [[Accommodation]] was constructed. This corresponds to the [YearBuilt field in RESO](https://ddwiki.reso.org/display/DDW17/YearBuilt+Field).  */
    @JsonProperty("yearBuilt")
    private Double yearBuilt;
    /** The floor level for an [[Accommodation]] in a multi-storey building. Since counting
  systems [vary internationally](https://en.wikipedia.org/wiki/Storey#Consecutive_number_floor_designations), the local system should be used where possible. */
    @JsonProperty("floorLevel")
    private String floorLevel;
    /** The total integer number of bedrooms in a some [[Accommodation]], [[ApartmentComplex]] or [[FloorPlan]]. */
    @JsonProperty("numberOfBedrooms")
    private Double numberOfBedrooms;
    /** Indicates whether pets are allowed to enter the accommodation or lodging business. More detailed information can be put in a text value. */
    @JsonProperty("petsAllowed")
    private Boolean petsAllowed;
    /** The type of bed or beds included in the accommodation. For the single case of just one bed of a certain type, you use bed directly with a text.
      If you want to indicate the quantity of a certain kind of bed, use an instance of BedDetails. For more detailed information, use the amenityFeature property. */
    @JsonProperty("bed")
    private String bed;
    /** Indications regarding the permitted usage of the accommodation. */
    @JsonProperty("permittedUsage")
    private String permittedUsage;

    public Integer getNumberOfBathroomsTotal() { return numberOfBathroomsTotal; }
    public void setNumberOfBathroomsTotal(Integer numberOfBathroomsTotal) { this.numberOfBathroomsTotal = numberOfBathroomsTotal; }
    public String getAccommodationCategory() { return accommodationCategory; }
    public void setAccommodationCategory(String accommodationCategory) { this.accommodationCategory = accommodationCategory; }
    public QuantitativeValue getOccupancy() { return occupancy; }
    public void setOccupancy(QuantitativeValue occupancy) { this.occupancy = occupancy; }
    public String getTourBookingPage() { return tourBookingPage; }
    public void setTourBookingPage(String tourBookingPage) { this.tourBookingPage = tourBookingPage; }
    public Double getNumberOfFullBathrooms() { return numberOfFullBathrooms; }
    public void setNumberOfFullBathrooms(Double numberOfFullBathrooms) { this.numberOfFullBathrooms = numberOfFullBathrooms; }
    public LocationFeatureSpecification getAmenityFeature() { return amenityFeature; }
    public void setAmenityFeature(LocationFeatureSpecification amenityFeature) { this.amenityFeature = amenityFeature; }
    public FloorPlan getAccommodationFloorPlan() { return accommodationFloorPlan; }
    public void setAccommodationFloorPlan(FloorPlan accommodationFloorPlan) { this.accommodationFloorPlan = accommodationFloorPlan; }
    public Double getNumberOfPartialBathrooms() { return numberOfPartialBathrooms; }
    public void setNumberOfPartialBathrooms(Double numberOfPartialBathrooms) { this.numberOfPartialBathrooms = numberOfPartialBathrooms; }
    public QuantitativeValue getFloorSize() { return floorSize; }
    public void setFloorSize(QuantitativeValue floorSize) { this.floorSize = floorSize; }
    public Double getNumberOfRooms() { return numberOfRooms; }
    public void setNumberOfRooms(Double numberOfRooms) { this.numberOfRooms = numberOfRooms; }
    public List<AbstractSchema> getLeaseLength() { return leaseLength; }
    public void setLeaseLength(List<AbstractSchema> leaseLength) { this.leaseLength = leaseLength; }
    public Double getYearBuilt() { return yearBuilt; }
    public void setYearBuilt(Double yearBuilt) { this.yearBuilt = yearBuilt; }
    public String getFloorLevel() { return floorLevel; }
    public void setFloorLevel(String floorLevel) { this.floorLevel = floorLevel; }
    public Double getNumberOfBedrooms() { return numberOfBedrooms; }
    public void setNumberOfBedrooms(Double numberOfBedrooms) { this.numberOfBedrooms = numberOfBedrooms; }
    public Boolean getPetsAllowed() { return petsAllowed; }
    public void setPetsAllowed(Boolean petsAllowed) { this.petsAllowed = petsAllowed; }
    public String getBed() { return bed; }
    public void setBed(String bed) { this.bed = bed; }
    public String getPermittedUsage() { return permittedUsage; }
    public void setPermittedUsage(String permittedUsage) { this.permittedUsage = permittedUsage; }
}
package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FloorPlan extends Intangible {
    public FloorPlan() {
        setId("schema:FloorPlan");
        setType("rdfs:Class");

    }

    /**
     * The total integer number of bathrooms in some [[Accommodation]], following real estate conventions as [documented in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsTotalInteger+Field): "The simple sum of the number of bathrooms. For example for a property with two Full Bathrooms and one Half Bathroom, the Bathrooms Total Integer will be 3.". See also [[numberOfRooms]].
     */
    @JsonProperty("numberOfBathroomsTotal")
    private Integer numberOfBathroomsTotal;
    /**
     * Number of full bathrooms - The total number of full and ¾ bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsFull field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsFull+Field).
     */
    @JsonProperty("numberOfFullBathrooms")
    private Double numberOfFullBathrooms;
    /**
     * An amenity feature (e.g. a characteristic or service) of the Accommodation. This generic property does not make a statement about whether the feature is included in an offer for the main accommodation or available at extra costs.
     */
    @JsonProperty("amenityFeature")
    private LocationFeatureSpecification amenityFeature;
    /**
     * Indicates the total (available plus unavailable) number of accommodation units in an [[ApartmentComplex]], or the number of accommodation units for a specific [[FloorPlan]] (within its specific [[ApartmentComplex]]). See also [[numberOfAvailableAccommodationUnits]].
     */
    @JsonProperty("numberOfAccommodationUnits")
    private QuantitativeValue numberOfAccommodationUnits;
    /**
     * Number of partial bathrooms - The total number of half and ¼ bathrooms in an [[Accommodation]]. This corresponds to the [BathroomsPartial field in RESO](https://ddwiki.reso.org/display/DDW17/BathroomsPartial+Field).
     */
    @JsonProperty("numberOfPartialBathrooms")
    private Double numberOfPartialBathrooms;
    /**
     * Indicates the number of available accommodation units in an [[ApartmentComplex]], or the number of accommodation units for a specific [[FloorPlan]] (within its specific [[ApartmentComplex]]). See also [[numberOfAccommodationUnits]].
     */
    @JsonProperty("numberOfAvailableAccommodationUnits")
    private QuantitativeValue numberOfAvailableAccommodationUnits;
    /**
     * The size of the accommodation, e.g. in square meter or squarefoot.
     * Typical unit code(s): MTK for square meter, FTK for square foot, or YDK for square yard.
     */
    @JsonProperty("floorSize")
    private QuantitativeValue floorSize;
    /**
     * The number of rooms (excluding bathrooms and closets) of the accommodation or lodging business.
     * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
     */
    @JsonProperty("numberOfRooms")
    private Double numberOfRooms;
    /**
     * Indicates some accommodation that this floor plan describes.
     */
    @JsonProperty("isPlanForApartment")
    private Accommodation isPlanForApartment;
    /**
     * A schematic image showing the floorplan layout.
     */
    @JsonProperty("layoutImage")
    private String layoutImage;
    /**
     * The total integer number of bedrooms in a some [[Accommodation]], [[ApartmentComplex]] or [[FloorPlan]].
     */
    @JsonProperty("numberOfBedrooms")
    private Double numberOfBedrooms;
    /**
     * Indicates whether pets are allowed to enter the accommodation or lodging business. More detailed information can be put in a text value.
     */
    @JsonProperty("petsAllowed")
    private Boolean petsAllowed;

    public Integer getNumberOfBathroomsTotal() {
        return numberOfBathroomsTotal;
    }

    public void setNumberOfBathroomsTotal(Integer numberOfBathroomsTotal) {
        this.numberOfBathroomsTotal = numberOfBathroomsTotal;
    }

    public Double getNumberOfFullBathrooms() {
        return numberOfFullBathrooms;
    }

    public void setNumberOfFullBathrooms(Double numberOfFullBathrooms) {
        this.numberOfFullBathrooms = numberOfFullBathrooms;
    }

    public LocationFeatureSpecification getAmenityFeature() {
        return amenityFeature;
    }

    public void setAmenityFeature(LocationFeatureSpecification amenityFeature) {
        this.amenityFeature = amenityFeature;
    }

    public QuantitativeValue getNumberOfAccommodationUnits() {
        return numberOfAccommodationUnits;
    }

    public void setNumberOfAccommodationUnits(QuantitativeValue numberOfAccommodationUnits) {
        this.numberOfAccommodationUnits = numberOfAccommodationUnits;
    }

    public Double getNumberOfPartialBathrooms() {
        return numberOfPartialBathrooms;
    }

    public void setNumberOfPartialBathrooms(Double numberOfPartialBathrooms) {
        this.numberOfPartialBathrooms = numberOfPartialBathrooms;
    }

    public QuantitativeValue getNumberOfAvailableAccommodationUnits() {
        return numberOfAvailableAccommodationUnits;
    }

    public void setNumberOfAvailableAccommodationUnits(QuantitativeValue numberOfAvailableAccommodationUnits) {
        this.numberOfAvailableAccommodationUnits = numberOfAvailableAccommodationUnits;
    }

    public QuantitativeValue getFloorSize() {
        return floorSize;
    }

    public void setFloorSize(QuantitativeValue floorSize) {
        this.floorSize = floorSize;
    }

    public Double getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(Double numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public Accommodation getIsPlanForApartment() {
        return isPlanForApartment;
    }

    public void setIsPlanForApartment(Accommodation isPlanForApartment) {
        this.isPlanForApartment = isPlanForApartment;
    }

    public String getLayoutImage() {
        return layoutImage;
    }

    public void setLayoutImage(String layoutImage) {
        this.layoutImage = layoutImage;
    }

    public Double getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(Double numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public Boolean getPetsAllowed() {
        return petsAllowed;
    }

    public void setPetsAllowed(Boolean petsAllowed) {
        this.petsAllowed = petsAllowed;
    }
}
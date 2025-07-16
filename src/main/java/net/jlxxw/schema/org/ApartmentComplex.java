package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApartmentComplex extends Residence {
    public ApartmentComplex() {
    }

    /**
     * A page providing information on how to book a tour of some [[Place]], such as an [[Accommodation]] or [[ApartmentComplex]] in a real estate setting, as well as other kinds of tours as appropriate.
     */
    @JsonProperty("tourBookingPage")
    private String tourBookingPage;
    /**
     * Indicates the total (available plus unavailable) number of accommodation units in an [[ApartmentComplex]], or the number of accommodation units for a specific [[FloorPlan]] (within its specific [[ApartmentComplex]]). See also [[numberOfAvailableAccommodationUnits]].
     */
    @JsonProperty("numberOfAccommodationUnits")
    private QuantitativeValue numberOfAccommodationUnits;
    /**
     * Indicates the number of available accommodation units in an [[ApartmentComplex]], or the number of accommodation units for a specific [[FloorPlan]] (within its specific [[ApartmentComplex]]). See also [[numberOfAccommodationUnits]].
     */
    @JsonProperty("numberOfAvailableAccommodationUnits")
    private QuantitativeValue numberOfAvailableAccommodationUnits;
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

    public String getTourBookingPage() {
        return tourBookingPage;
    }

    public void setTourBookingPage(String tourBookingPage) {
        this.tourBookingPage = tourBookingPage;
    }

    public QuantitativeValue getNumberOfAccommodationUnits() {
        return numberOfAccommodationUnits;
    }

    public void setNumberOfAccommodationUnits(QuantitativeValue numberOfAccommodationUnits) {
        this.numberOfAccommodationUnits = numberOfAccommodationUnits;
    }

    public QuantitativeValue getNumberOfAvailableAccommodationUnits() {
        return numberOfAvailableAccommodationUnits;
    }

    public void setNumberOfAvailableAccommodationUnits(QuantitativeValue numberOfAvailableAccommodationUnits) {
        this.numberOfAvailableAccommodationUnits = numberOfAvailableAccommodationUnits;
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
package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HotelRoom extends Room {
    public HotelRoom() {
        setId("schema:HotelRoom");
        setType("rdfs:Class");

    }

    /**
     * The allowed total occupancy for the accommodation in persons (including infants etc). For individual accommodations, this is not necessarily the legal maximum but defines the permitted usage as per the contractual agreement (e.g. a double room used by a single person).
     * Typical unit code(s): C62 for person.
     */
    @JsonProperty("occupancy")
    private QuantitativeValue occupancy;
    /**
     * The type of bed or beds included in the accommodation. For the single case of just one bed of a certain type, you use bed directly with a text.
     * If you want to indicate the quantity of a certain kind of bed, use an instance of BedDetails. For more detailed information, use the amenityFeature property.
     */
    @JsonProperty("bed")
    private String bed;

    public QuantitativeValue getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(QuantitativeValue occupancy) {
        this.occupancy = occupancy;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }
}
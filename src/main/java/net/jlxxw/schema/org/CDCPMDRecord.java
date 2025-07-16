package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CDCPMDRecord extends StructuredValue {
    public CDCPMDRecord() {
        setId("schema:CDCPMDRecord");
        setType("rdfs:Class");

    }

    /**
     * numc19mechventpats - HOSPITALIZED and VENTILATED: Patients hospitalized in an NHSN inpatient care location who have suspected or confirmed COVID-19 and are on a mechanical ventilator.
     */
    @JsonProperty("cvdNumC19MechVentPats")
    private Double cvdNumC19MechVentPats;
    /**
     * numvent - MECHANICAL VENTILATORS: Total number of ventilators available.
     */
    @JsonProperty("cvdNumVent")
    private Double cvdNumVent;
    /**
     * numc19hosppats - HOSPITALIZED: Patients currently hospitalized in an inpatient care location who have suspected or confirmed COVID-19.
     */
    @JsonProperty("cvdNumC19HospPats")
    private Double cvdNumC19HospPats;
    /**
     * numc19overflowpats - ED/OVERFLOW: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed.
     */
    @JsonProperty("cvdNumC19OverflowPats")
    private Double cvdNumC19OverflowPats;
    /**
     * numtotbeds - ALL HOSPITAL BEDS: Total number of all inpatient and outpatient beds, including all staffed, ICU, licensed, and overflow (surge) beds used for inpatients or outpatients.
     */
    @JsonProperty("cvdNumTotBeds")
    private Double cvdNumTotBeds;
    /**
     * numc19ofmechventpats - ED/OVERFLOW and VENTILATED: Patients with suspected or confirmed COVID-19 who are in the ED or any overflow location awaiting an inpatient bed and on a mechanical ventilator.
     */
    @JsonProperty("cvdNumC19OFMechVentPats")
    private Double cvdNumC19OFMechVentPats;
    /**
     * Publication date of an online listing.
     */
    @JsonProperty("datePosted")
    private java.time.LocalDate datePosted;
    /**
     * numc19died - DEATHS: Patients with suspected or confirmed COVID-19 who died in the hospital, ED, or any overflow location.
     */
    @JsonProperty("cvdNumC19Died")
    private Double cvdNumC19Died;
    /**
     * numicubeds - ICU BEDS: Total number of staffed inpatient intensive care unit (ICU) beds.
     */
    @JsonProperty("cvdNumICUBeds")
    private Double cvdNumICUBeds;
    /**
     * numicubedsocc - ICU BED OCCUPANCY: Total number of staffed inpatient ICU beds that are occupied.
     */
    @JsonProperty("cvdNumICUBedsOcc")
    private Double cvdNumICUBedsOcc;
    /**
     * numbeds - HOSPITAL INPATIENT BEDS: Inpatient beds, including all staffed, licensed, and overflow (surge) beds used for inpatients.
     */
    @JsonProperty("cvdNumBeds")
    private Double cvdNumBeds;
    /**
     * collectiondate - Date for which patient counts are reported.
     */
    @JsonProperty("cvdCollectionDate")
    private String cvdCollectionDate;
    /**
     * Identifier of the NHSN facility that this data record applies to. Use [[cvdFacilityCounty]] to indicate the county. To provide other details, [[healthcareReportingData]] can be used on a [[Hospital]] entry.
     */
    @JsonProperty("cvdFacilityId")
    private String cvdFacilityId;
    /**
     * numbedsocc - HOSPITAL INPATIENT BED OCCUPANCY: Total number of staffed inpatient beds that are occupied.
     */
    @JsonProperty("cvdNumBedsOcc")
    private Double cvdNumBedsOcc;
    /**
     * numventuse - MECHANICAL VENTILATORS IN USE: Total number of ventilators in use.
     */
    @JsonProperty("cvdNumVentUse")
    private Double cvdNumVentUse;
    /**
     * Name of the County of the NHSN facility that this data record applies to. Use [[cvdFacilityId]] to identify the facility. To provide other details, [[healthcareReportingData]] can be used on a [[Hospital]] entry.
     */
    @JsonProperty("cvdFacilityCounty")
    private String cvdFacilityCounty;
    /**
     * numc19hopats - HOSPITAL ONSET: Patients hospitalized in an NHSN inpatient care location with onset of suspected or confirmed COVID-19 14 or more days after hospitalization.
     */
    @JsonProperty("cvdNumC19HOPats")
    private Double cvdNumC19HOPats;

    public Double getCvdNumC19MechVentPats() {
        return cvdNumC19MechVentPats;
    }

    public void setCvdNumC19MechVentPats(Double cvdNumC19MechVentPats) {
        this.cvdNumC19MechVentPats = cvdNumC19MechVentPats;
    }

    public Double getCvdNumVent() {
        return cvdNumVent;
    }

    public void setCvdNumVent(Double cvdNumVent) {
        this.cvdNumVent = cvdNumVent;
    }

    public Double getCvdNumC19HospPats() {
        return cvdNumC19HospPats;
    }

    public void setCvdNumC19HospPats(Double cvdNumC19HospPats) {
        this.cvdNumC19HospPats = cvdNumC19HospPats;
    }

    public Double getCvdNumC19OverflowPats() {
        return cvdNumC19OverflowPats;
    }

    public void setCvdNumC19OverflowPats(Double cvdNumC19OverflowPats) {
        this.cvdNumC19OverflowPats = cvdNumC19OverflowPats;
    }

    public Double getCvdNumTotBeds() {
        return cvdNumTotBeds;
    }

    public void setCvdNumTotBeds(Double cvdNumTotBeds) {
        this.cvdNumTotBeds = cvdNumTotBeds;
    }

    public Double getCvdNumC19OFMechVentPats() {
        return cvdNumC19OFMechVentPats;
    }

    public void setCvdNumC19OFMechVentPats(Double cvdNumC19OFMechVentPats) {
        this.cvdNumC19OFMechVentPats = cvdNumC19OFMechVentPats;
    }

    public java.time.LocalDate getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(java.time.LocalDate datePosted) {
        this.datePosted = datePosted;
    }

    public Double getCvdNumC19Died() {
        return cvdNumC19Died;
    }

    public void setCvdNumC19Died(Double cvdNumC19Died) {
        this.cvdNumC19Died = cvdNumC19Died;
    }

    public Double getCvdNumICUBeds() {
        return cvdNumICUBeds;
    }

    public void setCvdNumICUBeds(Double cvdNumICUBeds) {
        this.cvdNumICUBeds = cvdNumICUBeds;
    }

    public Double getCvdNumICUBedsOcc() {
        return cvdNumICUBedsOcc;
    }

    public void setCvdNumICUBedsOcc(Double cvdNumICUBedsOcc) {
        this.cvdNumICUBedsOcc = cvdNumICUBedsOcc;
    }

    public Double getCvdNumBeds() {
        return cvdNumBeds;
    }

    public void setCvdNumBeds(Double cvdNumBeds) {
        this.cvdNumBeds = cvdNumBeds;
    }

    public String getCvdCollectionDate() {
        return cvdCollectionDate;
    }

    public void setCvdCollectionDate(String cvdCollectionDate) {
        this.cvdCollectionDate = cvdCollectionDate;
    }

    public String getCvdFacilityId() {
        return cvdFacilityId;
    }

    public void setCvdFacilityId(String cvdFacilityId) {
        this.cvdFacilityId = cvdFacilityId;
    }

    public Double getCvdNumBedsOcc() {
        return cvdNumBedsOcc;
    }

    public void setCvdNumBedsOcc(Double cvdNumBedsOcc) {
        this.cvdNumBedsOcc = cvdNumBedsOcc;
    }

    public Double getCvdNumVentUse() {
        return cvdNumVentUse;
    }

    public void setCvdNumVentUse(Double cvdNumVentUse) {
        this.cvdNumVentUse = cvdNumVentUse;
    }

    public String getCvdFacilityCounty() {
        return cvdFacilityCounty;
    }

    public void setCvdFacilityCounty(String cvdFacilityCounty) {
        this.cvdFacilityCounty = cvdFacilityCounty;
    }

    public Double getCvdNumC19HOPats() {
        return cvdNumC19HOPats;
    }

    public void setCvdNumC19HOPats(Double cvdNumC19HOPats) {
        this.cvdNumC19HOPats = cvdNumC19HOPats;
    }
}
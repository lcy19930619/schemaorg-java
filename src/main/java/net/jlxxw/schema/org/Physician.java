package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Physician extends MedicalOrganization {
    public Physician() {
    }

    /**
     * A medical specialty of the provider.
     */
    @JsonProperty("medicalSpecialty")
    private AbstractSchema medicalSpecialty;
    /**
     * A hospital with which the physician or office is affiliated.
     */
    @JsonProperty("hospitalAffiliation")
    private Hospital hospitalAffiliation;
    /**
     * A <a href="https://en.wikipedia.org/wiki/National_Provider_Identifier">National Provider Identifier</a> (NPI)
     * is a unique 10-digit identification number issued to health care providers in the United States by the Centers for Medicare and Medicaid Services.
     */
    @JsonProperty("usNPI")
    private String usNPI;
    /**
     * A category describing the job, preferably using a term from a taxonomy such as [BLS O*NET-SOC](http://www.onetcenter.org/taxonomy.html), [ISCO-08](https://www.ilo.org/public/english/bureau/stat/isco/isco08/) or similar, with the property repeated for each applicable value. Ideally the taxonomy should be identified, and both the textual label and formal code for the category should be provided.\n
     * Note: for historical reasons, any textual label and formal code provided as a literal may be assumed to be from O*NET-SOC.
     */
    @JsonProperty("occupationalCategory")
    private String occupationalCategory;
    /**
     * A medical service available from this provider.
     */
    @JsonProperty("availableService")
    private List<AbstractSchema> availableService;

    public AbstractSchema getMedicalSpecialty() {
        return medicalSpecialty;
    }

    public void setMedicalSpecialty(AbstractSchema medicalSpecialty) {
        this.medicalSpecialty = medicalSpecialty;
    }

    public Hospital getHospitalAffiliation() {
        return hospitalAffiliation;
    }

    public void setHospitalAffiliation(Hospital hospitalAffiliation) {
        this.hospitalAffiliation = hospitalAffiliation;
    }

    public String getUsNPI() {
        return usNPI;
    }

    public void setUsNPI(String usNPI) {
        this.usNPI = usNPI;
    }

    public String getOccupationalCategory() {
        return occupationalCategory;
    }

    public void setOccupationalCategory(String occupationalCategory) {
        this.occupationalCategory = occupationalCategory;
    }

    public List<AbstractSchema> getAvailableService() {
        return availableService;
    }

    public void setAvailableService(List<AbstractSchema> availableService) {
        this.availableService = availableService;
    }
}
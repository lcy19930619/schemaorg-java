package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import net.jlxxw.schema.org.JsonLdType;
public class Hospital extends CivicStructure {
    public Hospital() {
}
    /** A medical specialty of the provider. */
    @JsonProperty("medicalSpecialty")
    private AbstractSchema medicalSpecialty;
    /** A medical service available from this provider. */
    @JsonProperty("availableService")
    private List<AbstractSchema> availableService;
    /** Indicates data describing a hospital, e.g. a CDC [[CDCPMDRecord]] or as some kind of [[Dataset]]. */
    @JsonProperty("healthcareReportingData")
    private List<AbstractSchema> healthcareReportingData;

    public AbstractSchema getMedicalSpecialty() { return medicalSpecialty; }
    public void setMedicalSpecialty(AbstractSchema medicalSpecialty) { this.medicalSpecialty = medicalSpecialty; }
    public List<AbstractSchema> getAvailableService() { return availableService; }
    public void setAvailableService(List<AbstractSchema> availableService) { this.availableService = availableService; }
    public List<AbstractSchema> getHealthcareReportingData() { return healthcareReportingData; }
    public void setHealthcareReportingData(List<AbstractSchema> healthcareReportingData) { this.healthcareReportingData = healthcareReportingData; }
}
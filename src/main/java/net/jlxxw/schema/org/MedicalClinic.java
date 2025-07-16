package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import net.jlxxw.schema.org.JsonLdType;
public class MedicalClinic extends MedicalBusiness {
    public MedicalClinic() {
}
    /** A medical specialty of the provider. */
    @JsonProperty("medicalSpecialty")
    private AbstractSchema medicalSpecialty;
    /** A medical service available from this provider. */
    @JsonProperty("availableService")
    private List<AbstractSchema> availableService;

    public AbstractSchema getMedicalSpecialty() { return medicalSpecialty; }
    public void setMedicalSpecialty(AbstractSchema medicalSpecialty) { this.medicalSpecialty = medicalSpecialty; }
    public List<AbstractSchema> getAvailableService() { return availableService; }
    public void setAvailableService(List<AbstractSchema> availableService) { this.availableService = availableService; }
}
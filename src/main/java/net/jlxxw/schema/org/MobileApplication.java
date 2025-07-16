package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class MobileApplication extends SoftwareApplication {
    public MobileApplication() {
}
    /** Specifies specific carrier(s) requirements for the application (e.g. an application may only work on a specific carrier network). */
    @JsonProperty("carrierRequirements")
    private String carrierRequirements;

    public String getCarrierRequirements() { return carrierRequirements; }
    public void setCarrierRequirements(String carrierRequirements) { this.carrierRequirements = carrierRequirements; }
}
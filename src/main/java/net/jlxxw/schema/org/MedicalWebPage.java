package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class MedicalWebPage extends WebPage {
    public MedicalWebPage() {
}
    /** An aspect of medical practice that is considered on the page, such as 'diagnosis', 'treatment', 'causes', 'prognosis', 'etiology', 'epidemiology', etc. */
    @JsonProperty("aspect")
    private String aspect;

    public String getAspect() { return aspect; }
    public void setAspect(String aspect) { this.aspect = aspect; }
}
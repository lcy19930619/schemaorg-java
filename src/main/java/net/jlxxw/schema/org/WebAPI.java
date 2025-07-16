package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class WebAPI extends Service {
    public WebAPI() {
}
    /** Further documentation describing the Web API in more detail. */
    @JsonProperty("documentation")
    private String documentation;

    public String getDocumentation() { return documentation; }
    public void setDocumentation(String documentation) { this.documentation = documentation; }
}
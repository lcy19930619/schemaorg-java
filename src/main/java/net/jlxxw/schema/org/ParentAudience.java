package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class ParentAudience extends PeopleAudience {
    public ParentAudience() {
}
    /** Minimal age of the child. */
    @JsonProperty("childMinAge")
    private Double childMinAge;
    /** Maximal age of the child. */
    @JsonProperty("childMaxAge")
    private Double childMaxAge;

    public Double getChildMinAge() { return childMinAge; }
    public void setChildMinAge(Double childMinAge) { this.childMinAge = childMinAge; }
    public Double getChildMaxAge() { return childMaxAge; }
    public void setChildMaxAge(Double childMaxAge) { this.childMaxAge = childMaxAge; }
}
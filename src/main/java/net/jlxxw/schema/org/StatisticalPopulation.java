package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class StatisticalPopulation extends Intangible {
    public StatisticalPopulation() {
}
    /** Indicates the populationType common to all members of a [[StatisticalPopulation]] or all cases within the scope of a [[StatisticalVariable]]. */
    @JsonProperty("populationType")
    private Class populationType;

    public Class getPopulationType() { return populationType; }
    public void setPopulationType(Class populationType) { this.populationType = populationType; }
}
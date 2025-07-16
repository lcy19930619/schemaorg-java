package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import net.jlxxw.schema.org.JsonLdType;
public class Property extends Intangible {
    public Property() {
}
    /** Relates a term (i.e. a property, class or enumeration) to one that supersedes it. */
    @JsonProperty("supersededBy")
    private List<AbstractSchema> supersededBy;
    /** Relates a property to a class that constitutes (one of) the expected type(s) for values of the property. */
    @JsonProperty("rangeIncludes")
    private Class rangeIncludes;
    /** Relates a property to a class that is (one of) the type(s) the property is expected to be used on. */
    @JsonProperty("domainIncludes")
    private Class domainIncludes;
    /** Relates a property to a property that is its inverse. Inverse properties relate the same pairs of items to each other, but in reversed direction. For example, the 'alumni' and 'alumniOf' properties are inverseOf each other. Some properties don't have explicit inverses; in these situations RDFa and JSON-LD syntax for reverse properties can be used. */
    @JsonProperty("inverseOf")
    private Property inverseOf;

    public List<AbstractSchema> getSupersededBy() { return supersededBy; }
    public void setSupersededBy(List<AbstractSchema> supersededBy) { this.supersededBy = supersededBy; }
    public Class getRangeIncludes() { return rangeIncludes; }
    public void setRangeIncludes(Class rangeIncludes) { this.rangeIncludes = rangeIncludes; }
    public Class getDomainIncludes() { return domainIncludes; }
    public void setDomainIncludes(Class domainIncludes) { this.domainIncludes = domainIncludes; }
    public Property getInverseOf() { return inverseOf; }
    public void setInverseOf(Property inverseOf) { this.inverseOf = inverseOf; }
}
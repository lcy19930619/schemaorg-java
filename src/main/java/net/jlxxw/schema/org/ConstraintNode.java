package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class ConstraintNode extends Intangible {
    {
        setId("schema:ConstraintNode");
        setType("rdfs:Class");

    }

    /**
     * Indicates the number of constraints property values defined for a particular [[ConstraintNode]] such as [[StatisticalVariable]]. This helps applications understand if they have access to a sufficiently complete description of a [[StatisticalVariable]] or other construct that is defined using properties on template-style nodes.
     */
    @JsonProperty("numConstraints")
    private Integer numConstraints;
    /**
     * Indicates a property used as a constraint. For example, in the definition of a [[StatisticalVariable]]. The value is a property, either from within Schema.org or from other compatible (e.g. RDF) systems such as DataCommons.org or Wikidata.org.
     */
    @JsonProperty("constraintProperty")
    private String constraintProperty;

    public Integer getNumConstraints() {
        return numConstraints;
    }

    public void setNumConstraints(Integer numConstraints) {
        this.numConstraints = numConstraints;
    }

    public String getConstraintProperty() {
        return constraintProperty;
    }

    public void setConstraintProperty(String constraintProperty) {
        this.constraintProperty = constraintProperty;
    }
}
package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class StatisticalPopulation extends Intangible {
    {
        setId("schema:StatisticalPopulation");
        setType("rdfs:Class");

    }

    /**
     * Indicates the populationType common to all members of a [[StatisticalPopulation]] or all cases within the scope of a [[StatisticalVariable]].
     */
    @JsonProperty("populationType")
    private Class populationType;

    public Class getPopulationType() {
        return populationType;
    }

    public void setPopulationType(Class populationType) {
        this.populationType = populationType;
    }
}
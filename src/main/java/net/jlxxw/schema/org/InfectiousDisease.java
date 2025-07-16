package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class InfectiousDisease extends MedicalCondition {
    {
        setId("schema:InfectiousDisease");
        setType("rdfs:Class");

    }

    /**
     * The class of infectious agent (bacteria, prion, etc.) that causes the disease.
     */
    @JsonProperty("infectiousAgentClass")
    private AbstractSchema infectiousAgentClass;
    /**
     * The actual infectious agent, such as a specific bacterium.
     */
    @JsonProperty("infectiousAgent")
    private String infectiousAgent;
    /**
     * How the disease spreads, either as a route or vector, for example 'direct contact', 'Aedes aegypti', etc.
     */
    @JsonProperty("transmissionMethod")
    private String transmissionMethod;

    public AbstractSchema getInfectiousAgentClass() {
        return infectiousAgentClass;
    }

    public void setInfectiousAgentClass(AbstractSchema infectiousAgentClass) {
        this.infectiousAgentClass = infectiousAgentClass;
    }

    public String getInfectiousAgent() {
        return infectiousAgent;
    }

    public void setInfectiousAgent(String infectiousAgent) {
        this.infectiousAgent = infectiousAgent;
    }

    public String getTransmissionMethod() {
        return transmissionMethod;
    }

    public void setTransmissionMethod(String transmissionMethod) {
        this.transmissionMethod = transmissionMethod;
    }
}
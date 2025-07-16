package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GovernmentService extends Service {
    public GovernmentService() {
    }

    /**
     * Indicates a legal jurisdiction, e.g. of some legislation, or where some government service is based.
     */
    @JsonProperty("jurisdiction")
    private String jurisdiction;
    /**
     * The operating organization, if different from the provider.  This enables the representation of services that are provided by an organization, but operated by another organization like a subcontractor.
     */
    @JsonProperty("serviceOperator")
    private Organization serviceOperator;

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public Organization getServiceOperator() {
        return serviceOperator;
    }

    public void setServiceOperator(Organization serviceOperator) {
        this.serviceOperator = serviceOperator;
    }
}
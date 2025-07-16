package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class MemberProgram extends Intangible {
    {
        setId("schema:MemberProgram");
        setType("rdfs:Class");

    }

    /**
     * The tiers of a member program.
     */
    @JsonProperty("hasTiers")
    private MemberProgramTier hasTiers;
    /**
     * The Organization (airline, travelers' club, retailer, etc.) the membership is made with or which offers the  MemberProgram.
     */
    @JsonProperty("hostingOrganization")
    private Organization hostingOrganization;

    public MemberProgramTier getHasTiers() {
        return hasTiers;
    }

    public void setHasTiers(MemberProgramTier hasTiers) {
        this.hasTiers = hasTiers;
    }

    public Organization getHostingOrganization() {
        return hostingOrganization;
    }

    public void setHostingOrganization(Organization hostingOrganization) {
        this.hostingOrganization = hostingOrganization;
    }
}
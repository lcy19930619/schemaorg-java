package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class ProgramMembership extends Intangible {
    {
        setId("schema:ProgramMembership");
        setType("rdfs:Class");

    }

    /**
     * The number of membership points earned by the member. If necessary, the unitText can be used to express the units the points are issued in. (E.g. stars, miles, etc.)
     */
    @JsonProperty("membershipPointsEarned")
    private Double membershipPointsEarned;
    /**
     * A member of this organization.
     */
    @JsonProperty("members")
    private List<AbstractSchema> members;
    /**
     * The [MemberProgram](https://schema.org/MemberProgram) associated with a [ProgramMembership](https://schema.org/ProgramMembership).
     */
    @JsonProperty("program")
    private MemberProgram program;
    /**
     * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
     */
    @JsonProperty("member")
    private List<AbstractSchema> member;
    /**
     * A unique identifier for the membership.
     */
    @JsonProperty("membershipNumber")
    private String membershipNumber;
    /**
     * The Organization (airline, travelers' club, retailer, etc.) the membership is made with or which offers the  MemberProgram.
     */
    @JsonProperty("hostingOrganization")
    private Organization hostingOrganization;
    /**
     * The program providing the membership. It is preferable to use [:program](https://schema.org/program) instead.
     */
    @JsonProperty("programName")
    private String programName;

    public Double getMembershipPointsEarned() {
        return membershipPointsEarned;
    }

    public void setMembershipPointsEarned(Double membershipPointsEarned) {
        this.membershipPointsEarned = membershipPointsEarned;
    }

    public List<AbstractSchema> getMembers() {
        return members;
    }

    public void setMembers(List<AbstractSchema> members) {
        this.members = members;
    }

    public MemberProgram getProgram() {
        return program;
    }

    public void setProgram(MemberProgram program) {
        this.program = program;
    }

    public List<AbstractSchema> getMember() {
        return member;
    }

    public void setMember(List<AbstractSchema> member) {
        this.member = member;
    }

    public String getMembershipNumber() {
        return membershipNumber;
    }

    public void setMembershipNumber(String membershipNumber) {
        this.membershipNumber = membershipNumber;
    }

    public Organization getHostingOrganization() {
        return hostingOrganization;
    }

    public void setHostingOrganization(Organization hostingOrganization) {
        this.hostingOrganization = hostingOrganization;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }
}
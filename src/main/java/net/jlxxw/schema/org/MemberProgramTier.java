package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class MemberProgramTier extends Intangible {
    {
        setId("schema:MemberProgramTier");
        setType("rdfs:Class");

    }

    /**
     * The number of membership points earned by the member. If necessary, the unitText can be used to express the units the points are issued in. (E.g. stars, miles, etc.)
     */
    @JsonProperty("membershipPointsEarned")
    private Double membershipPointsEarned;
    /**
     * A requirement for a user to join a membership tier, for example: a CreditCard if the tier requires sign up for a credit card, A UnitPriceSpecification if the user is required to pay a (periodic) fee, or a MonetaryAmount if the user needs to spend a minimum amount to join the tier. If a tier is free to join then this property does not need to be specified.
     */
    @JsonProperty("hasTierRequirement")
    private String hasTierRequirement;
    /**
     * A member benefit for a particular tier of a loyalty program.
     */
    @JsonProperty("hasTierBenefit")
    private TierBenefitEnumeration hasTierBenefit;
    /**
     * The member program this tier is a part of.
     */
    @JsonProperty("isTierOf")
    private MemberProgram isTierOf;

    public Double getMembershipPointsEarned() {
        return membershipPointsEarned;
    }

    public void setMembershipPointsEarned(Double membershipPointsEarned) {
        this.membershipPointsEarned = membershipPointsEarned;
    }

    public String getHasTierRequirement() {
        return hasTierRequirement;
    }

    public void setHasTierRequirement(String hasTierRequirement) {
        this.hasTierRequirement = hasTierRequirement;
    }

    public TierBenefitEnumeration getHasTierBenefit() {
        return hasTierBenefit;
    }

    public void setHasTierBenefit(TierBenefitEnumeration hasTierBenefit) {
        this.hasTierBenefit = hasTierBenefit;
    }

    public MemberProgram getIsTierOf() {
        return isTierOf;
    }

    public void setIsTierOf(MemberProgram isTierOf) {
        this.isTierOf = isTierOf;
    }
}
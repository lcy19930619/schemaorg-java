package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class NewsMediaOrganization extends Organization {
    public NewsMediaOrganization() {
}
    /** For an [[Organization]] (often but not necessarily a [[NewsMediaOrganization]]), a report on staffing diversity issues. In a news context this might be for example ASNE or RTDNA (US) reports, or self-reported. */
    @JsonProperty("diversityStaffingReport")
    private String diversityStaffingReport;
    /** For an [[Organization]] (typically a [[NewsMediaOrganization]]), a statement about policy on use of unnamed sources and the decision process required. */
    @JsonProperty("unnamedSourcesPolicy")
    private String unnamedSourcesPolicy;
    /** For a [[NewsMediaOrganization]], a statement on coverage priorities, including any public agenda or stance on issues. */
    @JsonProperty("missionCoveragePrioritiesPolicy")
    private String missionCoveragePrioritiesPolicy;
    /** For an [[Organization]] (e.g. [[NewsMediaOrganization]]), a statement describing (in news media, the newsroom’s) disclosure and correction policy for errors. */
    @JsonProperty("correctionsPolicy")
    private String correctionsPolicy;
    /** For a [[NewsMediaOrganization]] or other news-related [[Organization]], a statement about public engagement activities (for news media, the newsroom’s), including involving the public - digitally or otherwise -- in coverage decisions, reporting and activities after publication. */
    @JsonProperty("actionableFeedbackPolicy")
    private String actionableFeedbackPolicy;
    /** For a [[NewsMediaOrganization]], a link to the masthead page or a page listing top editorial management. */
    @JsonProperty("masthead")
    private String masthead;
    /** Statement on diversity policy by an [[Organization]] e.g. a [[NewsMediaOrganization]]. For a [[NewsMediaOrganization]], a statement describing the newsroom’s diversity policy on both staffing and sources, typically providing staffing data. */
    @JsonProperty("diversityPolicy")
    private String diversityPolicy;
    /** For an [[Organization]] (often but not necessarily a [[NewsMediaOrganization]]), a description of organizational ownership structure; funding and grants. In a news/media setting, this is with particular reference to editorial independence.   Note that the [[funder]] is also available and can be used to make basic funder information machine-readable. */
    @JsonProperty("ownershipFundingInfo")
    private String ownershipFundingInfo;
    /** Statement about ethics policy, e.g. of a [[NewsMediaOrganization]] regarding journalistic and publishing practices, or of a [[Restaurant]], a page describing food source policies. In the case of a [[NewsMediaOrganization]], an ethicsPolicy is typically a statement describing the personal, organizational, and corporate standards of behavior expected by the organization. */
    @JsonProperty("ethicsPolicy")
    private String ethicsPolicy;
    /** For a [[NewsMediaOrganization]] or other news-related [[Organization]], a statement explaining when authors of articles are not named in bylines. */
    @JsonProperty("noBylinesPolicy")
    private String noBylinesPolicy;
    /** Disclosure about verification and fact-checking processes for a [[NewsMediaOrganization]] or other fact-checking [[Organization]]. */
    @JsonProperty("verificationFactCheckingPolicy")
    private String verificationFactCheckingPolicy;

    public String getDiversityStaffingReport() { return diversityStaffingReport; }
    public void setDiversityStaffingReport(String diversityStaffingReport) { this.diversityStaffingReport = diversityStaffingReport; }
    public String getUnnamedSourcesPolicy() { return unnamedSourcesPolicy; }
    public void setUnnamedSourcesPolicy(String unnamedSourcesPolicy) { this.unnamedSourcesPolicy = unnamedSourcesPolicy; }
    public String getMissionCoveragePrioritiesPolicy() { return missionCoveragePrioritiesPolicy; }
    public void setMissionCoveragePrioritiesPolicy(String missionCoveragePrioritiesPolicy) { this.missionCoveragePrioritiesPolicy = missionCoveragePrioritiesPolicy; }
    public String getCorrectionsPolicy() { return correctionsPolicy; }
    public void setCorrectionsPolicy(String correctionsPolicy) { this.correctionsPolicy = correctionsPolicy; }
    public String getActionableFeedbackPolicy() { return actionableFeedbackPolicy; }
    public void setActionableFeedbackPolicy(String actionableFeedbackPolicy) { this.actionableFeedbackPolicy = actionableFeedbackPolicy; }
    public String getMasthead() { return masthead; }
    public void setMasthead(String masthead) { this.masthead = masthead; }
    public String getDiversityPolicy() { return diversityPolicy; }
    public void setDiversityPolicy(String diversityPolicy) { this.diversityPolicy = diversityPolicy; }
    public String getOwnershipFundingInfo() { return ownershipFundingInfo; }
    public void setOwnershipFundingInfo(String ownershipFundingInfo) { this.ownershipFundingInfo = ownershipFundingInfo; }
    public String getEthicsPolicy() { return ethicsPolicy; }
    public void setEthicsPolicy(String ethicsPolicy) { this.ethicsPolicy = ethicsPolicy; }
    public String getNoBylinesPolicy() { return noBylinesPolicy; }
    public void setNoBylinesPolicy(String noBylinesPolicy) { this.noBylinesPolicy = noBylinesPolicy; }
    public String getVerificationFactCheckingPolicy() { return verificationFactCheckingPolicy; }
    public void setVerificationFactCheckingPolicy(String verificationFactCheckingPolicy) { this.verificationFactCheckingPolicy = verificationFactCheckingPolicy; }
}
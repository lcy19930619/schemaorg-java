package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class JobPosting extends Intangible {
    {
        setId("schema:JobPosting");
        setType("rdfs:Class");

    }

    /**
     * The industry associated with the job position.
     */
    @JsonProperty("industry")
    private String industry;
    /**
     * Description of benefits associated with the job.
     */
    @JsonProperty("benefits")
    private String benefits;
    /**
     * The legal requirements such as citizenship, visa and other documentation required for an applicant to this job.
     */
    @JsonProperty("eligibilityToWorkRequirement")
    private String eligibilityToWorkRequirement;
    /**
     * Educational background needed for the position or Occupation.
     */
    @JsonProperty("educationRequirements")
    private String educationRequirements;
    /**
     * Indicates whether an [[url]] that is associated with a [[JobPosting]] enables direct application for the job, via the posting website. A job posting is considered to have directApply of [[True]] if an application process for the specified job can be directly initiated via the url(s) given (noting that e.g. multiple internet domains might nevertheless be involved at an implementation level). A value of [[False]] is appropriate if there is no clear path to applying directly online for the specified job, navigating directly from the JobPosting url(s) supplied.
     */
    @JsonProperty("directApply")
    private Boolean directApply;
    /**
     * A description of any sensory requirements and levels necessary to function on the job, including hearing and vision. Defined terms such as those in O*net may be used, but note that there is no way to specify the level of ability as well as its nature when using a defined term.
     */
    @JsonProperty("sensoryRequirement")
    private String sensoryRequirement;
    /**
     * Publication date of an online listing.
     */
    @JsonProperty("datePosted")
    private java.time.LocalDate datePosted;
    /**
     * A description of any security clearance requirements of the job.
     */
    @JsonProperty("securityClearanceRequirement")
    private String securityClearanceRequirement;
    /**
     * The Occupation for the JobPosting.
     */
    @JsonProperty("relevantOccupation")
    private Occupation relevantOccupation;
    /**
     * A description of the job location (e.g. TELECOMMUTE for telecommute jobs).
     */
    @JsonProperty("jobLocationType")
    private String jobLocationType;
    /**
     * Description of bonus and commission compensation aspects of the job.
     */
    @JsonProperty("incentiveCompensation")
    private String incentiveCompensation;
    /**
     * The number of positions open for this job posting. Use a positive integer. Do not use if the number of positions is unclear or not known.
     */
    @JsonProperty("totalJobOpenings")
    private Integer totalJobOpenings;
    /**
     * The typical working hours for this job (e.g. 1st shift, night shift, 8am-5pm).
     */
    @JsonProperty("workHours")
    private String workHours;
    /**
     * Type of employment (e.g. full-time, part-time, contract, temporary, seasonal, internship).
     */
    @JsonProperty("employmentType")
    private String employmentType;
    /**
     * Contact details for further information relevant to this job posting.
     */
    @JsonProperty("applicationContact")
    private AbstractSchema applicationContact;
    /**
     * Indicates the department, unit and/or facility where the employee reports and/or in which the job is to be performed.
     */
    @JsonProperty("employmentUnit")
    private Organization employmentUnit;
    /**
     * Any special commitments associated with this job posting. Valid entries include VeteranCommit, MilitarySpouseCommit, etc.
     */
    @JsonProperty("specialCommitments")
    private String specialCommitments;
    /**
     * An indicator as to whether a position is available for an immediate start.
     */
    @JsonProperty("jobImmediateStart")
    private Boolean jobImmediateStart;
    /**
     * The title of the job.
     */
    @JsonProperty("title")
    private String title;
    /**
     * A (typically single) geographic location associated with the job position.
     */
    @JsonProperty("jobLocation")
    private Place jobLocation;
    /**
     * Description of bonus and commission compensation aspects of the job.
     */
    @JsonProperty("incentives")
    private String incentives;
    /**
     * The date on which a successful applicant for this job would be expected to start work. Choose a specific date in the future or use the jobImmediateStart property to indicate the position is to be filled as soon as possible.
     */
    @JsonProperty("jobStartDate")
    private java.time.LocalDate jobStartDate;
    /**
     * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
     */
    @JsonProperty("estimatedSalary")
    private Double estimatedSalary;
    /**
     * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
     */
    @JsonProperty("validThrough")
    private java.time.LocalDate validThrough;
    /**
     * Description of skills and experience needed for the position or Occupation.
     */
    @JsonProperty("experienceRequirements")
    private String experienceRequirements;
    /**
     * Responsibilities associated with this role or Occupation.
     */
    @JsonProperty("responsibilities")
    private String responsibilities;
    /**
     * A description of the employer, career opportunities and work environment for this position.
     */
    @JsonProperty("employerOverview")
    private String employerOverview;
    /**
     * A category describing the job, preferably using a term from a taxonomy such as [BLS O*NET-SOC](http://www.onetcenter.org/taxonomy.html), [ISCO-08](https://www.ilo.org/public/english/bureau/stat/isco/isco08/) or similar, with the property repeated for each applicable value. Ideally the taxonomy should be identified, and both the textual label and formal code for the category should be provided.\n
     * Note: for historical reasons, any textual label and formal code provided as a literal may be assumed to be from O*NET-SOC.
     */
    @JsonProperty("occupationalCategory")
    private String occupationalCategory;
    /**
     * The base salary of the job or of an employee in an EmployeeRole.
     */
    @JsonProperty("baseSalary")
    private Double baseSalary;
    /**
     * A description of the types of physical activity associated with the job. Defined terms such as those in O*net may be used, but note that there is no way to specify the level of ability as well as its nature when using a defined term.
     */
    @JsonProperty("physicalRequirement")
    private String physicalRequirement;
    /**
     * A statement of knowledge, skill, ability, task or any other assertion expressing a competency that is either claimed by a person, an organization or desired or required to fulfill a role or to work in an occupation.
     */
    @JsonProperty("skills")
    private String skills;
    /**
     * Indicates whether a [[JobPosting]] will accept experience (as indicated by [[OccupationalExperienceRequirements]]) in place of its formal educational qualifications (as indicated by [[educationRequirements]]). If true, indicates that satisfying one of these requirements is sufficient.
     */
    @JsonProperty("experienceInPlaceOfEducation")
    private Boolean experienceInPlaceOfEducation;
    /**
     * The location(s) applicants can apply from. This is usually used for telecommuting jobs where the applicant does not need to be in a physical office. Note: This should not be used for citizenship or work visa requirements.
     */
    @JsonProperty("applicantLocationRequirements")
    private AdministrativeArea applicantLocationRequirements;
    /**
     * The currency (coded using [ISO 4217](http://en.wikipedia.org/wiki/ISO_4217)) used for the main salary information in this job posting or for this employee.
     */
    @JsonProperty("salaryCurrency")
    private String salaryCurrency;
    /**
     * Specific qualifications required for this role or Occupation.
     */
    @JsonProperty("qualifications")
    private String qualifications;
    /**
     * Description of benefits associated with the job.
     */
    @JsonProperty("jobBenefits")
    private String jobBenefits;
    /**
     * Organization or Person offering the job position.
     */
    @JsonProperty("hiringOrganization")
    private List<AbstractSchema> hiringOrganization;

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public String getEligibilityToWorkRequirement() {
        return eligibilityToWorkRequirement;
    }

    public void setEligibilityToWorkRequirement(String eligibilityToWorkRequirement) {
        this.eligibilityToWorkRequirement = eligibilityToWorkRequirement;
    }

    public String getEducationRequirements() {
        return educationRequirements;
    }

    public void setEducationRequirements(String educationRequirements) {
        this.educationRequirements = educationRequirements;
    }

    public Boolean getDirectApply() {
        return directApply;
    }

    public void setDirectApply(Boolean directApply) {
        this.directApply = directApply;
    }

    public String getSensoryRequirement() {
        return sensoryRequirement;
    }

    public void setSensoryRequirement(String sensoryRequirement) {
        this.sensoryRequirement = sensoryRequirement;
    }

    public java.time.LocalDate getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(java.time.LocalDate datePosted) {
        this.datePosted = datePosted;
    }

    public String getSecurityClearanceRequirement() {
        return securityClearanceRequirement;
    }

    public void setSecurityClearanceRequirement(String securityClearanceRequirement) {
        this.securityClearanceRequirement = securityClearanceRequirement;
    }

    public Occupation getRelevantOccupation() {
        return relevantOccupation;
    }

    public void setRelevantOccupation(Occupation relevantOccupation) {
        this.relevantOccupation = relevantOccupation;
    }

    public String getJobLocationType() {
        return jobLocationType;
    }

    public void setJobLocationType(String jobLocationType) {
        this.jobLocationType = jobLocationType;
    }

    public String getIncentiveCompensation() {
        return incentiveCompensation;
    }

    public void setIncentiveCompensation(String incentiveCompensation) {
        this.incentiveCompensation = incentiveCompensation;
    }

    public Integer getTotalJobOpenings() {
        return totalJobOpenings;
    }

    public void setTotalJobOpenings(Integer totalJobOpenings) {
        this.totalJobOpenings = totalJobOpenings;
    }

    public String getWorkHours() {
        return workHours;
    }

    public void setWorkHours(String workHours) {
        this.workHours = workHours;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public AbstractSchema getApplicationContact() {
        return applicationContact;
    }

    public void setApplicationContact(AbstractSchema applicationContact) {
        this.applicationContact = applicationContact;
    }

    public Organization getEmploymentUnit() {
        return employmentUnit;
    }

    public void setEmploymentUnit(Organization employmentUnit) {
        this.employmentUnit = employmentUnit;
    }

    public String getSpecialCommitments() {
        return specialCommitments;
    }

    public void setSpecialCommitments(String specialCommitments) {
        this.specialCommitments = specialCommitments;
    }

    public Boolean getJobImmediateStart() {
        return jobImmediateStart;
    }

    public void setJobImmediateStart(Boolean jobImmediateStart) {
        this.jobImmediateStart = jobImmediateStart;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Place getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(Place jobLocation) {
        this.jobLocation = jobLocation;
    }

    public String getIncentives() {
        return incentives;
    }

    public void setIncentives(String incentives) {
        this.incentives = incentives;
    }

    public java.time.LocalDate getJobStartDate() {
        return jobStartDate;
    }

    public void setJobStartDate(java.time.LocalDate jobStartDate) {
        this.jobStartDate = jobStartDate;
    }

    public Double getEstimatedSalary() {
        return estimatedSalary;
    }

    public void setEstimatedSalary(Double estimatedSalary) {
        this.estimatedSalary = estimatedSalary;
    }

    public java.time.LocalDate getValidThrough() {
        return validThrough;
    }

    public void setValidThrough(java.time.LocalDate validThrough) {
        this.validThrough = validThrough;
    }

    public String getExperienceRequirements() {
        return experienceRequirements;
    }

    public void setExperienceRequirements(String experienceRequirements) {
        this.experienceRequirements = experienceRequirements;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
    }

    public String getEmployerOverview() {
        return employerOverview;
    }

    public void setEmployerOverview(String employerOverview) {
        this.employerOverview = employerOverview;
    }

    public String getOccupationalCategory() {
        return occupationalCategory;
    }

    public void setOccupationalCategory(String occupationalCategory) {
        this.occupationalCategory = occupationalCategory;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getPhysicalRequirement() {
        return physicalRequirement;
    }

    public void setPhysicalRequirement(String physicalRequirement) {
        this.physicalRequirement = physicalRequirement;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public Boolean getExperienceInPlaceOfEducation() {
        return experienceInPlaceOfEducation;
    }

    public void setExperienceInPlaceOfEducation(Boolean experienceInPlaceOfEducation) {
        this.experienceInPlaceOfEducation = experienceInPlaceOfEducation;
    }

    public AdministrativeArea getApplicantLocationRequirements() {
        return applicantLocationRequirements;
    }

    public void setApplicantLocationRequirements(AdministrativeArea applicantLocationRequirements) {
        this.applicantLocationRequirements = applicantLocationRequirements;
    }

    public String getSalaryCurrency() {
        return salaryCurrency;
    }

    public void setSalaryCurrency(String salaryCurrency) {
        this.salaryCurrency = salaryCurrency;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public String getJobBenefits() {
        return jobBenefits;
    }

    public void setJobBenefits(String jobBenefits) {
        this.jobBenefits = jobBenefits;
    }

    public List<AbstractSchema> getHiringOrganization() {
        return hiringOrganization;
    }

    public void setHiringOrganization(List<AbstractSchema> hiringOrganization) {
        this.hiringOrganization = hiringOrganization;
    }
}
package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.List;
import net.jlxxw.schema.org.JsonLdType;
public class EducationalOccupationalProgram extends Intangible {
    public EducationalOccupationalProgram() {
}
    /** The maximum number of students who may be enrolled in the program. */
    @JsonProperty("maximumEnrollment")
    private Integer maximumEnrollment;
    /** The estimated salary earned while in the program. */
    @JsonProperty("trainingSalary")
    private MonetaryAmountDistribution trainingSalary;
    /** The number of credits or units a full-time student would be expected to take in 1 term however 'term' is defined by the institution. */
    @JsonProperty("typicalCreditsPerTerm")
    private Integer typicalCreditsPerTerm;
    /** An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use [[businessFunction]] to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a [[Demand]]. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
       */
    @JsonProperty("offers")
    private List<AbstractSchema> offers;
    /** The number of credits or units awarded by a Course or required to complete an EducationalOccupationalProgram. */
    @JsonProperty("numberOfCredits")
    private Integer numberOfCredits;
    /** A description of the qualification, award, certificate, diploma or other educational credential awarded as a consequence of successful completion of this course or program. */
    @JsonProperty("educationalCredentialAwarded")
    private String educationalCredentialAwarded;
    /** The type of educational or occupational program. For example, classroom, internship, alternance, etc. */
    @JsonProperty("programType")
    private String programType;
    /** The amount of time in a term as defined by the institution. A term is a length of time where students take one or more classes. Semesters and quarters are common units for term. */
    @JsonProperty("termDuration")
    private Duration termDuration;
    /** The expected salary upon completing the training. */
    @JsonProperty("salaryUponCompletion")
    private MonetaryAmountDistribution salaryUponCompletion;
    /** The time of day the program normally runs. For example, "evenings". */
    @JsonProperty("timeOfDay")
    private String timeOfDay;
    /** A financial aid type or program which students may use to pay for tuition or fees associated with the program. */
    @JsonProperty("financialAidEligible")
    private String financialAidEligible;
    /** A course or class that is one of the learning opportunities that constitute an educational / occupational program. No information is implied about whether the course is mandatory or optional; no guarantee is implied about whether the course will be available to everyone on the program. */
    @JsonProperty("hasCourse")
    private AbstractSchema hasCourse;
    /** The start date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)). */
    @JsonProperty("startDate")
    private java.time.LocalDate startDate;
    /** The date on which the program stops collecting applications for the next enrollment cycle. Flexible application deadlines (for example, a program with rolling admissions) can be described in a textual string, rather than as a DateTime. */
    @JsonProperty("applicationDeadline")
    private java.time.LocalDate applicationDeadline;
    /** The date at which the program begins collecting applications for the next enrollment cycle. */
    @JsonProperty("applicationStartDate")
    private java.time.LocalDate applicationStartDate;
    /** The number of times terms of study are offered per year. Semesters and quarters are common units for term. For example, if the student can only take 2 semesters for the program in one year, then termsPerYear should be 2. */
    @JsonProperty("termsPerYear")
    private Double termsPerYear;
    /** A category describing the job, preferably using a term from a taxonomy such as [BLS O*NET-SOC](http://www.onetcenter.org/taxonomy.html), [ISCO-08](https://www.ilo.org/public/english/bureau/stat/isco/isco08/) or similar, with the property repeated for each applicable value. Ideally the taxonomy should be identified, and both the textual label and formal code for the category should be provided.\n
Note: for historical reasons, any textual label and formal code provided as a literal may be assumed to be from O*NET-SOC. */
    @JsonProperty("occupationalCategory")
    private String occupationalCategory;
    /** The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller. */
    @JsonProperty("provider")
    private List<AbstractSchema> provider;
    /** Prerequisites for enrolling in the program. */
    @JsonProperty("programPrerequisites")
    private String programPrerequisites;
    /** A description of the qualification, award, certificate, diploma or other occupational credential awarded as a consequence of successful completion of this course or program. */
    @JsonProperty("occupationalCredentialAwarded")
    private String occupationalCredentialAwarded;
    /** The end date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)). */
    @JsonProperty("endDate")
    private java.time.LocalDate endDate;
    /** The expected length of time to complete the program if attending full-time. */
    @JsonProperty("timeToComplete")
    private Duration timeToComplete;
    /** Similar to courseMode, the medium or means of delivery of the program as a whole. The value may either be a text label (e.g. "online", "onsite" or "blended"; "synchronous" or "asynchronous"; "full-time" or "part-time") or a URL reference to a term from a controlled vocabulary (e.g. https://ceds.ed.gov/element/001311#Asynchronous ). */
    @JsonProperty("educationalProgramMode")
    private String educationalProgramMode;

    public Integer getMaximumEnrollment() { return maximumEnrollment; }
    public void setMaximumEnrollment(Integer maximumEnrollment) { this.maximumEnrollment = maximumEnrollment; }
    public MonetaryAmountDistribution getTrainingSalary() { return trainingSalary; }
    public void setTrainingSalary(MonetaryAmountDistribution trainingSalary) { this.trainingSalary = trainingSalary; }
    public Integer getTypicalCreditsPerTerm() { return typicalCreditsPerTerm; }
    public void setTypicalCreditsPerTerm(Integer typicalCreditsPerTerm) { this.typicalCreditsPerTerm = typicalCreditsPerTerm; }
    public List<AbstractSchema> getOffers() { return offers; }
    public void setOffers(List<AbstractSchema> offers) { this.offers = offers; }
    public Integer getNumberOfCredits() { return numberOfCredits; }
    public void setNumberOfCredits(Integer numberOfCredits) { this.numberOfCredits = numberOfCredits; }
    public String getEducationalCredentialAwarded() { return educationalCredentialAwarded; }
    public void setEducationalCredentialAwarded(String educationalCredentialAwarded) { this.educationalCredentialAwarded = educationalCredentialAwarded; }
    public String getProgramType() { return programType; }
    public void setProgramType(String programType) { this.programType = programType; }
    public Duration getTermDuration() { return termDuration; }
    public void setTermDuration(Duration termDuration) { this.termDuration = termDuration; }
    public MonetaryAmountDistribution getSalaryUponCompletion() { return salaryUponCompletion; }
    public void setSalaryUponCompletion(MonetaryAmountDistribution salaryUponCompletion) { this.salaryUponCompletion = salaryUponCompletion; }
    public String getTimeOfDay() { return timeOfDay; }
    public void setTimeOfDay(String timeOfDay) { this.timeOfDay = timeOfDay; }
    public String getFinancialAidEligible() { return financialAidEligible; }
    public void setFinancialAidEligible(String financialAidEligible) { this.financialAidEligible = financialAidEligible; }
    public AbstractSchema getHasCourse() { return hasCourse; }
    public void setHasCourse(AbstractSchema hasCourse) { this.hasCourse = hasCourse; }
    public java.time.LocalDate getStartDate() { return startDate; }
    public void setStartDate(java.time.LocalDate startDate) { this.startDate = startDate; }
    public java.time.LocalDate getApplicationDeadline() { return applicationDeadline; }
    public void setApplicationDeadline(java.time.LocalDate applicationDeadline) { this.applicationDeadline = applicationDeadline; }
    public java.time.LocalDate getApplicationStartDate() { return applicationStartDate; }
    public void setApplicationStartDate(java.time.LocalDate applicationStartDate) { this.applicationStartDate = applicationStartDate; }
    public Double getTermsPerYear() { return termsPerYear; }
    public void setTermsPerYear(Double termsPerYear) { this.termsPerYear = termsPerYear; }
    public String getOccupationalCategory() { return occupationalCategory; }
    public void setOccupationalCategory(String occupationalCategory) { this.occupationalCategory = occupationalCategory; }
    public List<AbstractSchema> getProvider() { return provider; }
    public void setProvider(List<AbstractSchema> provider) { this.provider = provider; }
    public String getProgramPrerequisites() { return programPrerequisites; }
    public void setProgramPrerequisites(String programPrerequisites) { this.programPrerequisites = programPrerequisites; }
    public String getOccupationalCredentialAwarded() { return occupationalCredentialAwarded; }
    public void setOccupationalCredentialAwarded(String occupationalCredentialAwarded) { this.occupationalCredentialAwarded = occupationalCredentialAwarded; }
    public java.time.LocalDate getEndDate() { return endDate; }
    public void setEndDate(java.time.LocalDate endDate) { this.endDate = endDate; }
    public Duration getTimeToComplete() { return timeToComplete; }
    public void setTimeToComplete(Duration timeToComplete) { this.timeToComplete = timeToComplete; }
    public String getEducationalProgramMode() { return educationalProgramMode; }
    public void setEducationalProgramMode(String educationalProgramMode) { this.educationalProgramMode = educationalProgramMode; }
}
package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class Organization extends AbstractSchema {
    {
        setId("schema:Organization");
        setType("rdfs:Class");

    }

    /**
     * Certification information about a product, organization, service, place, or person.
     */
    @JsonProperty("hasCertification")
    private Certification hasCertification;
    /**
     * For an [[Organization]] (often but not necessarily a [[NewsMediaOrganization]]), a report on staffing diversity issues. In a news context this might be for example ASNE or RTDNA (US) reports, or self-reported.
     */
    @JsonProperty("diversityStaffingReport")
    private String diversityStaffingReport;
    /**
     * Review of the item.
     */
    @JsonProperty("reviews")
    private AbstractSchema reviews;
    /**
     * A person or organization who founded this organization.
     */
    @JsonProperty("founder")
    private List<AbstractSchema> founder;
    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    @JsonProperty("aggregateRating")
    private AbstractSchema aggregateRating;
    /**
     * The publishingPrinciples property indicates (typically via [[URL]]) a document describing the editorial principles of an [[Organization]] (or individual, e.g. a [[Person]] writing a blog) that relate to their activities as a publisher, e.g. ethics or diversity policies. When applied to a [[CreativeWork]] (e.g. [[NewsArticle]]) the principles are those of the party primarily responsible for the creation of the [[CreativeWork]].
     * <p>
     * While such policies are most typically expressed in natural language, sometimes related information (e.g. indicating a [[funder]]) can be expressed using schema.org terminology.
     */
    @JsonProperty("publishingPrinciples")
    private String publishingPrinciples;
    /**
     * Someone working for this organization.
     */
    @JsonProperty("employee")
    private Person employee;
    /**
     * For an [[Organization]] (typically a [[NewsMediaOrganization]]), a statement about policy on use of unnamed sources and the decision process required.
     */
    @JsonProperty("unnamedSourcesPolicy")
    private String unnamedSourcesPolicy;
    /**
     * An award won by or for this item.
     */
    @JsonProperty("award")
    private String award;
    /**
     * Upcoming or past events associated with this place or organization.
     */
    @JsonProperty("events")
    private Event events;
    /**
     * The number of interactions for the CreativeWork using the WebSite or SoftwareApplication. The most specific child type of InteractionCounter should be used.
     */
    @JsonProperty("interactionStatistic")
    private InteractionCounter interactionStatistic;
    /**
     * An organization identifier that uniquely identifies a legal entity as defined in ISO 17442.
     */
    @JsonProperty("leiCode")
    private String leiCode;
    /**
     * The official registration number of a business including the organization that issued it such as Company House or Chamber of Commerce.
     */
    @JsonProperty("companyRegistration")
    private Certification companyRegistration;
    /**
     * An Organization (or ProgramMembership) to which this Person or Organization belongs.
     */
    @JsonProperty("memberOf")
    private List<AbstractSchema> memberOf;
    /**
     * A person or organization that supports a thing through a pledge, promise, or financial contribution. E.g. a sponsor of a Medical Study or a corporate sponsor of an event.
     */
    @JsonProperty("sponsor")
    private List<AbstractSchema> sponsor;
    /**
     * A [[Grant]] that directly or indirectly provide funding or sponsorship for this item. See also [[ownershipFundingInfo]].
     */
    @JsonProperty("funding")
    private Grant funding;
    /**
     * An organization identifier as defined in [ISO 6523(-1)](https://en.wikipedia.org/wiki/ISO/IEC_6523). The identifier should be in the `XXXX:YYYYYY:ZZZ` or `XXXX:YYYYYY`format. Where `XXXX` is a 4 digit _ICD_ (International Code Designator), `YYYYYY` is an _OID_ (Organization Identifier) with all formatting characters (dots, dashes, spaces) removed with a maximal length of 35 characters, and `ZZZ` is an optional OPI (Organization Part Identifier) with a maximum length of 35 characters. The various components (ICD, OID, OPI) are joined with a colon character (ASCII `0x3a`). Note that many existing organization identifiers defined as attributes like [leiCode](https://schema.org/leiCode) (`0199`), [duns](https://schema.org/duns) (`0060`) or [GLN](https://schema.org/globalLocationNumber) (`0088`) can be expressed using ISO-6523. If possible, ISO-6523 codes should be preferred to populating [vatID](https://schema.org/vatID) or [taxID](https://schema.org/taxID), as ISO identifiers are less ambiguous.
     */
    @JsonProperty("iso6523Code")
    private String iso6523Code;
    /**
     * Of a [[Person]], and less typically of an [[Organization]], to indicate a known language. We do not distinguish skill levels or reading/writing/speaking/signing here. Use language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47).
     */
    @JsonProperty("knowsLanguage")
    private String knowsLanguage;
    /**
     * Of a [[Person]], and less typically of an [[Organization]], to indicate a topic that is known about - suggesting possible expertise but not implying it. We do not distinguish skill levels here, or relate this to educational content, events, objectives or [[JobPosting]] descriptions.
     */
    @JsonProperty("knowsAbout")
    private String knowsAbout;
    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @JsonProperty("brand")
    private List<Organization> brand;
    /**
     * The location of, for example, where an event is happening, where an organization is located, or where an action takes place.
     */
    @JsonProperty("location")
    private String location;
    /**
     * The geographic area where a service or offered item is provided.
     */
    @JsonProperty("areaServed")
    private String areaServed;
    /**
     * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
     */
    @JsonProperty("isicV4")
    private String isicV4;
    /**
     * A contact point for a person or organization.
     */
    @JsonProperty("contactPoint")
    private AbstractSchema contactPoint;
    /**
     * For an [[Organization]] (e.g. [[NewsMediaOrganization]]), a statement describing (in news media, the newsroom’s) disclosure and correction policy for errors.
     */
    @JsonProperty("correctionsPolicy")
    private String correctionsPolicy;
    /**
     * A relationship between an organization and a department of that organization, also described as an organization (allowing different urls, logos, opening hours). For example: a store with a pharmacy, or a bakery with a cafe.
     */
    @JsonProperty("department")
    private Organization department;
    /**
     * The Value-added Tax ID of the organization or person.
     */
    @JsonProperty("vatID")
    private String vatID;
    /**
     * A member of this organization.
     */
    @JsonProperty("members")
    private List<AbstractSchema> members;
    /**
     * A pointer to products or services sought by the organization or person (demand).
     */
    @JsonProperty("seeks")
    private Demand seeks;
    /**
     * The geographic area where the service is provided.
     */
    @JsonProperty("serviceArea")
    private List<AbstractSchema> serviceArea;
    /**
     * For a [[NewsMediaOrganization]] or other news-related [[Organization]], a statement about public engagement activities (for news media, the newsroom’s), including involving the public - digitally or otherwise -- in coverage decisions, reporting and activities after publication.
     */
    @JsonProperty("actionableFeedbackPolicy")
    private String actionableFeedbackPolicy;
    /**
     * A pointer to products or services offered by the organization or person.
     */
    @JsonProperty("makesOffer")
    private Offer makesOffer;
    /**
     * The number of completed interactions for this entity, in a particular role (the 'agent'), in a particular action (indicated in the statistic), and in a particular context (i.e. interactionService).
     */
    @JsonProperty("agentInteractionStatistic")
    private InteractionCounter agentInteractionStatistic;
    /**
     * nonprofitStatus indicates the legal status of a non-profit organization in its primary place of business.
     */
    @JsonProperty("nonprofitStatus")
    private NonprofitType nonprofitStatus;
    /**
     * A member of an Organization or a ProgramMembership. Organizations can be members of organizations; ProgramMembership is typically for individuals.
     */
    @JsonProperty("member")
    private List<AbstractSchema> member;
    /**
     * A contact point for a person or organization.
     */
    @JsonProperty("contactPoints")
    private AbstractSchema contactPoints;
    /**
     * MemberProgram offered by an Organization, for example an eCommerce merchant or an airline.
     */
    @JsonProperty("hasMemberProgram")
    private MemberProgram hasMemberProgram;
    /**
     * A person who founded this organization.
     */
    @JsonProperty("founders")
    private Person founders;
    /**
     * One or multiple persons who represent this organization legally such as CEO or sole administrator.
     */
    @JsonProperty("legalRepresentative")
    private Person legalRepresentative;
    /**
     * The legal address of an organization which acts as the officially registered address used for legal and tax purposes. The legal address can be different from the place of operations of a business and other addresses can be part of an organization.
     */
    @JsonProperty("legalAddress")
    private PostalAddress legalAddress;
    /**
     * Specification of a shipping service offered by the organization.
     */
    @JsonProperty("hasShippingService")
    private ShippingService hasShippingService;
    /**
     * Statement on diversity policy by an [[Organization]] e.g. a [[NewsMediaOrganization]]. For a [[NewsMediaOrganization]], a statement describing the newsroom’s diversity policy on both staffing and sources, typically providing staffing data.
     */
    @JsonProperty("diversityPolicy")
    private String diversityPolicy;
    /**
     * The payment method(s) that are accepted in general by an organization, or for some specific demand or offer.
     */
    @JsonProperty("acceptedPaymentMethod")
    private String acceptedPaymentMethod;
    /**
     * The telephone number.
     */
    @JsonProperty("telephone")
    private String telephone;
    /**
     * The number of employees in an organization, e.g. business.
     */
    @JsonProperty("numberOfEmployees")
    private QuantitativeValue numberOfEmployees;
    /**
     * The place where the Organization was founded.
     */
    @JsonProperty("foundingLocation")
    private Place foundingLocation;
    /**
     * The [Global Location Number](http://www.gs1.org/gln) (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
     */
    @JsonProperty("globalLocationNumber")
    private String globalLocationNumber;
    /**
     * Awards won by or for this item.
     */
    @JsonProperty("awards")
    private String awards;
    /**
     * Points-of-Sales operated by the organization or person.
     */
    @JsonProperty("hasPOS")
    private Place hasPOS;
    /**
     * For an [[Organization]] (often but not necessarily a [[NewsMediaOrganization]]), a description of organizational ownership structure; funding and grants. In a news/media setting, this is with particular reference to editorial independence.   Note that the [[funder]] is also available and can be used to make basic funder information machine-readable.
     */
    @JsonProperty("ownershipFundingInfo")
    private String ownershipFundingInfo;
    /**
     * People working for this organization.
     */
    @JsonProperty("employees")
    private Person employees;
    /**
     * Products owned by the organization or person.
     */
    @JsonProperty("owns")
    private List<AbstractSchema> owns;
    /**
     * The official name of the organization, e.g. the registered company name.
     */
    @JsonProperty("legalName")
    private String legalName;
    /**
     * Statement about ethics policy, e.g. of a [[NewsMediaOrganization]] regarding journalistic and publishing practices, or of a [[Restaurant]], a page describing food source policies. In the case of a [[NewsMediaOrganization]], an ethicsPolicy is typically a statement describing the personal, organizational, and corporate standards of behavior expected by the organization.
     */
    @JsonProperty("ethicsPolicy")
    private String ethicsPolicy;
    /**
     * A credential awarded to the Person or Organization.
     */
    @JsonProperty("hasCredential")
    private EducationalOccupationalCredential hasCredential;
    /**
     * Physical address of the item.
     */
    @JsonProperty("address")
    private String address;
    /**
     * A person or organization that supports (sponsors) something through some kind of financial contribution.
     */
    @JsonProperty("funder")
    private List<AbstractSchema> funder;
    /**
     * The date that this organization was dissolved.
     */
    @JsonProperty("dissolutionDate")
    private java.time.LocalDate dissolutionDate;
    /**
     * The date that this organization was founded.
     */
    @JsonProperty("foundingDate")
    private java.time.LocalDate foundingDate;
    /**
     * Indicates an OfferCatalog listing for this Organization, Person, or Service.
     */
    @JsonProperty("hasOfferCatalog")
    private OfferCatalog hasOfferCatalog;
    /**
     * Alumni of an organization.
     */
    @JsonProperty("alumni")
    private Person alumni;
    /**
     * The fax number.
     */
    @JsonProperty("faxNumber")
    private String faxNumber;
    /**
     * The larger organization that this organization is a [[subOrganization]] of, if any.
     */
    @JsonProperty("parentOrganization")
    private Organization parentOrganization;
    /**
     * Specifies a MerchantReturnPolicy that may be applicable.
     */
    @JsonProperty("hasMerchantReturnPolicy")
    private MerchantReturnPolicy hasMerchantReturnPolicy;
    /**
     * A statement of knowledge, skill, ability, task or any other assertion expressing a competency that is either claimed by a person, an organization or desired or required to fulfill a role or to work in an occupation.
     */
    @JsonProperty("skills")
    private String skills;
    /**
     * The <a href="https://www.gs1.org/standards/gs1-digital-link">GS1 digital link</a> associated with the object. This URL should conform to the particular requirements of digital links. The link should only contain the Application Identifiers (AIs) that are relevant for the entity being annotated, for instance a [[Product]] or an [[Organization]], and for the correct granularity. In particular, for products:<ul><li>A Digital Link that contains a serial number (AI <code>21</code>) should only be present on instances of [[IndividualProduct]]</li><li>A Digital Link that contains a lot number (AI <code>10</code>) should be annotated as [[SomeProduct]] if only products from that lot are sold, or [[IndividualProduct]] if there is only a specific product.</li><li>A Digital Link that contains a global model number (AI <code>8013</code>)  should be attached to a [[Product]] or a [[ProductModel]].</li></ul> Other item types should be adapted similarly.
     */
    @JsonProperty("hasGS1DigitalLink")
    private String hasGS1DigitalLink;
    /**
     * An associated logo.
     */
    @JsonProperty("logo")
    private String logo;
    /**
     * A relationship between two organizations where the first includes the second, e.g., as a subsidiary. See also: the more specific 'department' property.
     */
    @JsonProperty("subOrganization")
    private Organization subOrganization;
    /**
     * The North American Industry Classification System (NAICS) code for a particular organization or business person.
     */
    @JsonProperty("naics")
    private String naics;
    /**
     * Email address.
     */
    @JsonProperty("email")
    private String email;
    /**
     * The Dun & Bradstreet DUNS number for identifying an organization or business person.
     */
    @JsonProperty("duns")
    private String duns;
    /**
     * The Tax / Fiscal ID of the organization or person, e.g. the TIN in the US or the CIF/NIF in Spain.
     */
    @JsonProperty("taxID")
    private String taxID;
    /**
     * A slogan or motto associated with the item.
     */
    @JsonProperty("slogan")
    private String slogan;
    /**
     * A review of the item.
     */
    @JsonProperty("review")
    private AbstractSchema review;
    /**
     * Keywords or tags used to describe some item. Multiple textual entries in a keywords list are typically delimited by commas, or by repeating the property.
     */
    @JsonProperty("keywords")
    private String keywords;

    public Certification getHasCertification() {
        return hasCertification;
    }

    public void setHasCertification(Certification hasCertification) {
        this.hasCertification = hasCertification;
    }

    public String getDiversityStaffingReport() {
        return diversityStaffingReport;
    }

    public void setDiversityStaffingReport(String diversityStaffingReport) {
        this.diversityStaffingReport = diversityStaffingReport;
    }

    public AbstractSchema getReviews() {
        return reviews;
    }

    public void setReviews(AbstractSchema reviews) {
        this.reviews = reviews;
    }

    public List<AbstractSchema> getFounder() {
        return founder;
    }

    public void setFounder(List<AbstractSchema> founder) {
        this.founder = founder;
    }

    public AbstractSchema getAggregateRating() {
        return aggregateRating;
    }

    public void setAggregateRating(AbstractSchema aggregateRating) {
        this.aggregateRating = aggregateRating;
    }

    public String getPublishingPrinciples() {
        return publishingPrinciples;
    }

    public void setPublishingPrinciples(String publishingPrinciples) {
        this.publishingPrinciples = publishingPrinciples;
    }

    public Person getEmployee() {
        return employee;
    }

    public void setEmployee(Person employee) {
        this.employee = employee;
    }

    public String getUnnamedSourcesPolicy() {
        return unnamedSourcesPolicy;
    }

    public void setUnnamedSourcesPolicy(String unnamedSourcesPolicy) {
        this.unnamedSourcesPolicy = unnamedSourcesPolicy;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public Event getEvents() {
        return events;
    }

    public void setEvents(Event events) {
        this.events = events;
    }

    public InteractionCounter getInteractionStatistic() {
        return interactionStatistic;
    }

    public void setInteractionStatistic(InteractionCounter interactionStatistic) {
        this.interactionStatistic = interactionStatistic;
    }

    public String getLeiCode() {
        return leiCode;
    }

    public void setLeiCode(String leiCode) {
        this.leiCode = leiCode;
    }

    public Certification getCompanyRegistration() {
        return companyRegistration;
    }

    public void setCompanyRegistration(Certification companyRegistration) {
        this.companyRegistration = companyRegistration;
    }

    public List<AbstractSchema> getMemberOf() {
        return memberOf;
    }

    public void setMemberOf(List<AbstractSchema> memberOf) {
        this.memberOf = memberOf;
    }

    public List<AbstractSchema> getSponsor() {
        return sponsor;
    }

    public void setSponsor(List<AbstractSchema> sponsor) {
        this.sponsor = sponsor;
    }

    public Grant getFunding() {
        return funding;
    }

    public void setFunding(Grant funding) {
        this.funding = funding;
    }

    public String getIso6523Code() {
        return iso6523Code;
    }

    public void setIso6523Code(String iso6523Code) {
        this.iso6523Code = iso6523Code;
    }

    public String getKnowsLanguage() {
        return knowsLanguage;
    }

    public void setKnowsLanguage(String knowsLanguage) {
        this.knowsLanguage = knowsLanguage;
    }

    public String getKnowsAbout() {
        return knowsAbout;
    }

    public void setKnowsAbout(String knowsAbout) {
        this.knowsAbout = knowsAbout;
    }

    public List<Organization> getBrand() {
        return brand;
    }

    public void setBrand(List<Organization> brand) {
        this.brand = brand;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAreaServed() {
        return areaServed;
    }

    public void setAreaServed(String areaServed) {
        this.areaServed = areaServed;
    }

    public String getIsicV4() {
        return isicV4;
    }

    public void setIsicV4(String isicV4) {
        this.isicV4 = isicV4;
    }

    public AbstractSchema getContactPoint() {
        return contactPoint;
    }

    public void setContactPoint(AbstractSchema contactPoint) {
        this.contactPoint = contactPoint;
    }

    public String getCorrectionsPolicy() {
        return correctionsPolicy;
    }

    public void setCorrectionsPolicy(String correctionsPolicy) {
        this.correctionsPolicy = correctionsPolicy;
    }

    public Organization getDepartment() {
        return department;
    }

    public void setDepartment(Organization department) {
        this.department = department;
    }

    public String getVatID() {
        return vatID;
    }

    public void setVatID(String vatID) {
        this.vatID = vatID;
    }

    public List<AbstractSchema> getMembers() {
        return members;
    }

    public void setMembers(List<AbstractSchema> members) {
        this.members = members;
    }

    public Demand getSeeks() {
        return seeks;
    }

    public void setSeeks(Demand seeks) {
        this.seeks = seeks;
    }

    public List<AbstractSchema> getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(List<AbstractSchema> serviceArea) {
        this.serviceArea = serviceArea;
    }

    public String getActionableFeedbackPolicy() {
        return actionableFeedbackPolicy;
    }

    public void setActionableFeedbackPolicy(String actionableFeedbackPolicy) {
        this.actionableFeedbackPolicy = actionableFeedbackPolicy;
    }

    public Offer getMakesOffer() {
        return makesOffer;
    }

    public void setMakesOffer(Offer makesOffer) {
        this.makesOffer = makesOffer;
    }

    public InteractionCounter getAgentInteractionStatistic() {
        return agentInteractionStatistic;
    }

    public void setAgentInteractionStatistic(InteractionCounter agentInteractionStatistic) {
        this.agentInteractionStatistic = agentInteractionStatistic;
    }

    public NonprofitType getNonprofitStatus() {
        return nonprofitStatus;
    }

    public void setNonprofitStatus(NonprofitType nonprofitStatus) {
        this.nonprofitStatus = nonprofitStatus;
    }

    public List<AbstractSchema> getMember() {
        return member;
    }

    public void setMember(List<AbstractSchema> member) {
        this.member = member;
    }

    public AbstractSchema getContactPoints() {
        return contactPoints;
    }

    public void setContactPoints(AbstractSchema contactPoints) {
        this.contactPoints = contactPoints;
    }

    public MemberProgram getHasMemberProgram() {
        return hasMemberProgram;
    }

    public void setHasMemberProgram(MemberProgram hasMemberProgram) {
        this.hasMemberProgram = hasMemberProgram;
    }

    public Person getFounders() {
        return founders;
    }

    public void setFounders(Person founders) {
        this.founders = founders;
    }

    public Person getLegalRepresentative() {
        return legalRepresentative;
    }

    public void setLegalRepresentative(Person legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
    }

    public PostalAddress getLegalAddress() {
        return legalAddress;
    }

    public void setLegalAddress(PostalAddress legalAddress) {
        this.legalAddress = legalAddress;
    }

    public ShippingService getHasShippingService() {
        return hasShippingService;
    }

    public void setHasShippingService(ShippingService hasShippingService) {
        this.hasShippingService = hasShippingService;
    }

    public String getDiversityPolicy() {
        return diversityPolicy;
    }

    public void setDiversityPolicy(String diversityPolicy) {
        this.diversityPolicy = diversityPolicy;
    }

    public String getAcceptedPaymentMethod() {
        return acceptedPaymentMethod;
    }

    public void setAcceptedPaymentMethod(String acceptedPaymentMethod) {
        this.acceptedPaymentMethod = acceptedPaymentMethod;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public QuantitativeValue getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(QuantitativeValue numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public Place getFoundingLocation() {
        return foundingLocation;
    }

    public void setFoundingLocation(Place foundingLocation) {
        this.foundingLocation = foundingLocation;
    }

    public String getGlobalLocationNumber() {
        return globalLocationNumber;
    }

    public void setGlobalLocationNumber(String globalLocationNumber) {
        this.globalLocationNumber = globalLocationNumber;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    public Place getHasPOS() {
        return hasPOS;
    }

    public void setHasPOS(Place hasPOS) {
        this.hasPOS = hasPOS;
    }

    public String getOwnershipFundingInfo() {
        return ownershipFundingInfo;
    }

    public void setOwnershipFundingInfo(String ownershipFundingInfo) {
        this.ownershipFundingInfo = ownershipFundingInfo;
    }

    public Person getEmployees() {
        return employees;
    }

    public void setEmployees(Person employees) {
        this.employees = employees;
    }

    public List<AbstractSchema> getOwns() {
        return owns;
    }

    public void setOwns(List<AbstractSchema> owns) {
        this.owns = owns;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getEthicsPolicy() {
        return ethicsPolicy;
    }

    public void setEthicsPolicy(String ethicsPolicy) {
        this.ethicsPolicy = ethicsPolicy;
    }

    public EducationalOccupationalCredential getHasCredential() {
        return hasCredential;
    }

    public void setHasCredential(EducationalOccupationalCredential hasCredential) {
        this.hasCredential = hasCredential;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<AbstractSchema> getFunder() {
        return funder;
    }

    public void setFunder(List<AbstractSchema> funder) {
        this.funder = funder;
    }

    public java.time.LocalDate getDissolutionDate() {
        return dissolutionDate;
    }

    public void setDissolutionDate(java.time.LocalDate dissolutionDate) {
        this.dissolutionDate = dissolutionDate;
    }

    public java.time.LocalDate getFoundingDate() {
        return foundingDate;
    }

    public void setFoundingDate(java.time.LocalDate foundingDate) {
        this.foundingDate = foundingDate;
    }

    public OfferCatalog getHasOfferCatalog() {
        return hasOfferCatalog;
    }

    public void setHasOfferCatalog(OfferCatalog hasOfferCatalog) {
        this.hasOfferCatalog = hasOfferCatalog;
    }

    public Person getAlumni() {
        return alumni;
    }

    public void setAlumni(Person alumni) {
        this.alumni = alumni;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public Organization getParentOrganization() {
        return parentOrganization;
    }

    public void setParentOrganization(Organization parentOrganization) {
        this.parentOrganization = parentOrganization;
    }

    public MerchantReturnPolicy getHasMerchantReturnPolicy() {
        return hasMerchantReturnPolicy;
    }

    public void setHasMerchantReturnPolicy(MerchantReturnPolicy hasMerchantReturnPolicy) {
        this.hasMerchantReturnPolicy = hasMerchantReturnPolicy;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getHasGS1DigitalLink() {
        return hasGS1DigitalLink;
    }

    public void setHasGS1DigitalLink(String hasGS1DigitalLink) {
        this.hasGS1DigitalLink = hasGS1DigitalLink;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Organization getSubOrganization() {
        return subOrganization;
    }

    public void setSubOrganization(Organization subOrganization) {
        this.subOrganization = subOrganization;
    }

    public String getNaics() {
        return naics;
    }

    public void setNaics(String naics) {
        this.naics = naics;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDuns() {
        return duns;
    }

    public void setDuns(String duns) {
        this.duns = duns;
    }

    public String getTaxID() {
        return taxID;
    }

    public void setTaxID(String taxID) {
        this.taxID = taxID;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public AbstractSchema getReview() {
        return review;
    }

    public void setReview(AbstractSchema review) {
        this.review = review;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }
}
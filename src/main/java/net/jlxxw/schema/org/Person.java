package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.List;
import net.jlxxw.schema.org.JsonLdType;
public class Person extends AbstractSchema {
    public Person() {
}
    /** Family name. In the U.S., the last name of a Person. */
    @JsonProperty("familyName")
    private String familyName;
    /** Certification information about a product, organization, service, place, or person. */
    @JsonProperty("hasCertification")
    private Certification hasCertification;
    /** A contact location for a person's place of work. */
    @JsonProperty("workLocation")
    private List<Place> workLocation;
    /** The publishingPrinciples property indicates (typically via [[URL]]) a document describing the editorial principles of an [[Organization]] (or individual, e.g. a [[Person]] writing a blog) that relate to their activities as a publisher, e.g. ethics or diversity policies. When applied to a [[CreativeWork]] (e.g. [[NewsArticle]]) the principles are those of the party primarily responsible for the creation of the [[CreativeWork]].

While such policies are most typically expressed in natural language, sometimes related information (e.g. indicating a [[funder]]) can be expressed using schema.org terminology.
 */
    @JsonProperty("publishingPrinciples")
    private String publishingPrinciples;
    /** An award won by or for this item. */
    @JsonProperty("award")
    private String award;
    /** A sibling of the person. */
    @JsonProperty("siblings")
    private Person siblings;
    /** A sibling of the person. */
    @JsonProperty("sibling")
    private Person sibling;
    /** The number of interactions for the CreativeWork using the WebSite or SoftwareApplication. The most specific child type of InteractionCounter should be used. */
    @JsonProperty("interactionStatistic")
    private InteractionCounter interactionStatistic;
    /** A colleague of the person. */
    @JsonProperty("colleagues")
    private Person colleagues;
    /** Nationality of the person. */
    @JsonProperty("nationality")
    private Country nationality;
    /** A parent of this person. */
    @JsonProperty("parent")
    private Person parent;
    /** Gender of something, typically a [[Person]], but possibly also fictional characters, animals, etc. While https://schema.org/Male and https://schema.org/Female may be used, text strings are also acceptable for people who are not a binary gender. The [[gender]] property can also be used in an extended sense to cover e.g. the gender of sports teams. As with the gender of individuals, we do not try to enumerate all possibilities. A mixed-gender [[SportsTeam]] can be indicated with a text value of "Mixed". */
    @JsonProperty("gender")
    private String gender;
    /** An Organization (or ProgramMembership) to which this Person or Organization belongs. */
    @JsonProperty("memberOf")
    private List<AbstractSchema> memberOf;
    /** A person or organization that supports a thing through a pledge, promise, or financial contribution. E.g. a sponsor of a Medical Study or a corporate sponsor of an event. */
    @JsonProperty("sponsor")
    private List<AbstractSchema> sponsor;
    /** A [[Grant]] that directly or indirectly provide funding or sponsorship for this item. See also [[ownershipFundingInfo]]. */
    @JsonProperty("funding")
    private Grant funding;
    /** A contact location for a person's residence. */
    @JsonProperty("homeLocation")
    private List<Place> homeLocation;
    /** The weight of the product or person. */
    @JsonProperty("weight")
    private List<AbstractSchema> weight;
    /** Of a [[Person]], and less typically of an [[Organization]], to indicate a known language. We do not distinguish skill levels or reading/writing/speaking/signing here. Use language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). */
    @JsonProperty("knowsLanguage")
    private String knowsLanguage;
    /** Of a [[Person]], and less typically of an [[Organization]], to indicate a topic that is known about - suggesting possible expertise but not implying it. We do not distinguish skill levels here, or relate this to educational content, events, objectives or [[JobPosting]] descriptions. */
    @JsonProperty("knowsAbout")
    private String knowsAbout;
    /** The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person. */
    @JsonProperty("brand")
    private List<Organization> brand;
    /** The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place. */
    @JsonProperty("isicV4")
    private String isicV4;
    /** A contact point for a person or organization. */
    @JsonProperty("contactPoint")
    private AbstractSchema contactPoint;
    /** The height of the item. */
    @JsonProperty("height")
    private List<AbstractSchema> height;
    /** The Person's occupation. For past professions, use Role for expressing dates. */
    @JsonProperty("hasOccupation")
    private Occupation hasOccupation;
    /** The place where the person died. */
    @JsonProperty("deathPlace")
    private Place deathPlace;
    /** The most generic uni-directional social relation. */
    @JsonProperty("follows")
    private Person follows;
    /** A [callsign](https://en.wikipedia.org/wiki/Call_sign), as used in broadcasting and radio communications to identify people, radio and TV stations, or vehicles. */
    @JsonProperty("callSign")
    private String callSign;
    /** A parents of the person. */
    @JsonProperty("parents")
    private Person parents;
    /** The Value-added Tax ID of the organization or person. */
    @JsonProperty("vatID")
    private String vatID;
    /** A pointer to products or services sought by the organization or person (demand). */
    @JsonProperty("seeks")
    private Demand seeks;
    /** Date of death. */
    @JsonProperty("deathDate")
    private java.time.LocalDate deathDate;
    /** The most generic bi-directional social/work relation. */
    @JsonProperty("knows")
    private Person knows;
    /** A pointer to products or services offered by the organization or person. */
    @JsonProperty("makesOffer")
    private Offer makesOffer;
    /** The number of completed interactions for this entity, in a particular role (the 'agent'), in a particular action (indicated in the statistic), and in a particular context (i.e. interactionService). */
    @JsonProperty("agentInteractionStatistic")
    private InteractionCounter agentInteractionStatistic;
    /** An honorific suffix following a Person's name such as M.D./PhD/MSCSW. */
    @JsonProperty("honorificSuffix")
    private String honorificSuffix;
    /** A contact point for a person or organization. */
    @JsonProperty("contactPoints")
    private AbstractSchema contactPoints;
    /** Date of birth. */
    @JsonProperty("birthDate")
    private java.time.LocalDate birthDate;
    /** Event that this person is a performer or participant in. */
    @JsonProperty("performerIn")
    private Event performerIn;
    /** A short string listing or describing pronouns for a person. Typically the person concerned is the best authority as pronouns are a critical part of personal identity and expression. Publishers and consumers of this information are reminded to treat this data responsibly, take country-specific laws related to gender expression into account, and be wary of out-of-date data and drawing unwarranted inferences about the person being described.

In English, formulations such as "they/them", "she/her", and "he/him" are commonly used online and can also be used here. We do not intend to enumerate all possible micro-syntaxes in all languages. More structured and well-defined external values for pronouns can be referenced using the [[StructuredValue]] or [[DefinedTerm]] values.
 */
    @JsonProperty("pronouns")
    private String pronouns;
    /** A colleague of the person. */
    @JsonProperty("colleague")
    private String colleague;
    /** An additional name for a Person, can be used for a middle name. */
    @JsonProperty("additionalName")
    private String additionalName;
    /** The telephone number. */
    @JsonProperty("telephone")
    private String telephone;
    /** The total financial value of the person as calculated by subtracting the total value of liabilities from the total value of assets. */
    @JsonProperty("netWorth")
    private List<MonetaryAmount> netWorth;
    /** The job title of the person (for example, Financial Manager). */
    @JsonProperty("jobTitle")
    private String jobTitle;
    /** An honorific prefix preceding a Person's name such as Dr/Mrs/Mr. */
    @JsonProperty("honorificPrefix")
    private String honorificPrefix;
    /** Given name. In the U.S., the first name of a Person. */
    @JsonProperty("givenName")
    private String givenName;
    /** The [Global Location Number](http://www.gs1.org/gln) (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations. */
    @JsonProperty("globalLocationNumber")
    private String globalLocationNumber;
    /** Awards won by or for this item. */
    @JsonProperty("awards")
    private String awards;
    /** Points-of-Sales operated by the organization or person. */
    @JsonProperty("hasPOS")
    private Place hasPOS;
    /** Products owned by the organization or person. */
    @JsonProperty("owns")
    private List<AbstractSchema> owns;
    /** A credential awarded to the Person or Organization. */
    @JsonProperty("hasCredential")
    private EducationalOccupationalCredential hasCredential;
    /** Physical address of the item. */
    @JsonProperty("address")
    private String address;
    /** A person or organization that supports (sponsors) something through some kind of financial contribution. */
    @JsonProperty("funder")
    private List<AbstractSchema> funder;
    /** Indicates an OfferCatalog listing for this Organization, Person, or Service. */
    @JsonProperty("hasOfferCatalog")
    private OfferCatalog hasOfferCatalog;
    /** An organization that the person is an alumni of. */
    @JsonProperty("alumniOf")
    private List<AbstractSchema> alumniOf;
    /** The fax number. */
    @JsonProperty("faxNumber")
    private String faxNumber;
    /** An organization that this person is affiliated with. For example, a school/university, a club, or a team. */
    @JsonProperty("affiliation")
    private Organization affiliation;
    /** A statement of knowledge, skill, ability, task or any other assertion expressing a competency that is either claimed by a person, an organization or desired or required to fulfill a role or to work in an occupation. */
    @JsonProperty("skills")
    private String skills;
    /** The most generic familial relation. */
    @JsonProperty("relatedTo")
    private Person relatedTo;
    /** The person's spouse. */
    @JsonProperty("spouse")
    private Person spouse;
    /** The North American Industry Classification System (NAICS) code for a particular organization or business person. */
    @JsonProperty("naics")
    private String naics;
    /** Email address. */
    @JsonProperty("email")
    private String email;
    /** The Dun & Bradstreet DUNS number for identifying an organization or business person. */
    @JsonProperty("duns")
    private String duns;
    /** A child of the person. */
    @JsonProperty("children")
    private Person children;
    /** The Tax / Fiscal ID of the organization or person, e.g. the TIN in the US or the CIF/NIF in Spain. */
    @JsonProperty("taxID")
    private String taxID;
    /** Organizations that the person works for. */
    @JsonProperty("worksFor")
    private Organization worksFor;
    /** The place where the person was born. */
    @JsonProperty("birthPlace")
    private Place birthPlace;

    public String getFamilyName() { return familyName; }
    public void setFamilyName(String familyName) { this.familyName = familyName; }
    public Certification getHasCertification() { return hasCertification; }
    public void setHasCertification(Certification hasCertification) { this.hasCertification = hasCertification; }
    public List<Place> getWorkLocation() { return workLocation; }
    public void setWorkLocation(List<Place> workLocation) { this.workLocation = workLocation; }
    public String getPublishingPrinciples() { return publishingPrinciples; }
    public void setPublishingPrinciples(String publishingPrinciples) { this.publishingPrinciples = publishingPrinciples; }
    public String getAward() { return award; }
    public void setAward(String award) { this.award = award; }
    public Person getSiblings() { return siblings; }
    public void setSiblings(Person siblings) { this.siblings = siblings; }
    public Person getSibling() { return sibling; }
    public void setSibling(Person sibling) { this.sibling = sibling; }
    public InteractionCounter getInteractionStatistic() { return interactionStatistic; }
    public void setInteractionStatistic(InteractionCounter interactionStatistic) { this.interactionStatistic = interactionStatistic; }
    public Person getColleagues() { return colleagues; }
    public void setColleagues(Person colleagues) { this.colleagues = colleagues; }
    public Country getNationality() { return nationality; }
    public void setNationality(Country nationality) { this.nationality = nationality; }
    public Person getParent() { return parent; }
    public void setParent(Person parent) { this.parent = parent; }
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
    public List<AbstractSchema> getMemberOf() { return memberOf; }
    public void setMemberOf(List<AbstractSchema> memberOf) { this.memberOf = memberOf; }
    public List<AbstractSchema> getSponsor() { return sponsor; }
    public void setSponsor(List<AbstractSchema> sponsor) { this.sponsor = sponsor; }
    public Grant getFunding() { return funding; }
    public void setFunding(Grant funding) { this.funding = funding; }
    public List<Place> getHomeLocation() { return homeLocation; }
    public void setHomeLocation(List<Place> homeLocation) { this.homeLocation = homeLocation; }
    public List<AbstractSchema> getWeight() { return weight; }
    public void setWeight(List<AbstractSchema> weight) { this.weight = weight; }
    public String getKnowsLanguage() { return knowsLanguage; }
    public void setKnowsLanguage(String knowsLanguage) { this.knowsLanguage = knowsLanguage; }
    public String getKnowsAbout() { return knowsAbout; }
    public void setKnowsAbout(String knowsAbout) { this.knowsAbout = knowsAbout; }
    public List<Organization> getBrand() { return brand; }
    public void setBrand(List<Organization> brand) { this.brand = brand; }
    public String getIsicV4() { return isicV4; }
    public void setIsicV4(String isicV4) { this.isicV4 = isicV4; }
    public AbstractSchema getContactPoint() { return contactPoint; }
    public void setContactPoint(AbstractSchema contactPoint) { this.contactPoint = contactPoint; }
    public List<AbstractSchema> getHeight() { return height; }
    public void setHeight(List<AbstractSchema> height) { this.height = height; }
    public Occupation getHasOccupation() { return hasOccupation; }
    public void setHasOccupation(Occupation hasOccupation) { this.hasOccupation = hasOccupation; }
    public Place getDeathPlace() { return deathPlace; }
    public void setDeathPlace(Place deathPlace) { this.deathPlace = deathPlace; }
    public Person getFollows() { return follows; }
    public void setFollows(Person follows) { this.follows = follows; }
    public String getCallSign() { return callSign; }
    public void setCallSign(String callSign) { this.callSign = callSign; }
    public Person getParents() { return parents; }
    public void setParents(Person parents) { this.parents = parents; }
    public String getVatID() { return vatID; }
    public void setVatID(String vatID) { this.vatID = vatID; }
    public Demand getSeeks() { return seeks; }
    public void setSeeks(Demand seeks) { this.seeks = seeks; }
    public java.time.LocalDate getDeathDate() { return deathDate; }
    public void setDeathDate(java.time.LocalDate deathDate) { this.deathDate = deathDate; }
    public Person getKnows() { return knows; }
    public void setKnows(Person knows) { this.knows = knows; }
    public Offer getMakesOffer() { return makesOffer; }
    public void setMakesOffer(Offer makesOffer) { this.makesOffer = makesOffer; }
    public InteractionCounter getAgentInteractionStatistic() { return agentInteractionStatistic; }
    public void setAgentInteractionStatistic(InteractionCounter agentInteractionStatistic) { this.agentInteractionStatistic = agentInteractionStatistic; }
    public String getHonorificSuffix() { return honorificSuffix; }
    public void setHonorificSuffix(String honorificSuffix) { this.honorificSuffix = honorificSuffix; }
    public AbstractSchema getContactPoints() { return contactPoints; }
    public void setContactPoints(AbstractSchema contactPoints) { this.contactPoints = contactPoints; }
    public java.time.LocalDate getBirthDate() { return birthDate; }
    public void setBirthDate(java.time.LocalDate birthDate) { this.birthDate = birthDate; }
    public Event getPerformerIn() { return performerIn; }
    public void setPerformerIn(Event performerIn) { this.performerIn = performerIn; }
    public String getPronouns() { return pronouns; }
    public void setPronouns(String pronouns) { this.pronouns = pronouns; }
    public String getColleague() { return colleague; }
    public void setColleague(String colleague) { this.colleague = colleague; }
    public String getAdditionalName() { return additionalName; }
    public void setAdditionalName(String additionalName) { this.additionalName = additionalName; }
    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }
    public List<MonetaryAmount> getNetWorth() { return netWorth; }
    public void setNetWorth(List<MonetaryAmount> netWorth) { this.netWorth = netWorth; }
    public String getJobTitle() { return jobTitle; }
    public void setJobTitle(String jobTitle) { this.jobTitle = jobTitle; }
    public String getHonorificPrefix() { return honorificPrefix; }
    public void setHonorificPrefix(String honorificPrefix) { this.honorificPrefix = honorificPrefix; }
    public String getGivenName() { return givenName; }
    public void setGivenName(String givenName) { this.givenName = givenName; }
    public String getGlobalLocationNumber() { return globalLocationNumber; }
    public void setGlobalLocationNumber(String globalLocationNumber) { this.globalLocationNumber = globalLocationNumber; }
    public String getAwards() { return awards; }
    public void setAwards(String awards) { this.awards = awards; }
    public Place getHasPOS() { return hasPOS; }
    public void setHasPOS(Place hasPOS) { this.hasPOS = hasPOS; }
    public List<AbstractSchema> getOwns() { return owns; }
    public void setOwns(List<AbstractSchema> owns) { this.owns = owns; }
    public EducationalOccupationalCredential getHasCredential() { return hasCredential; }
    public void setHasCredential(EducationalOccupationalCredential hasCredential) { this.hasCredential = hasCredential; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public List<AbstractSchema> getFunder() { return funder; }
    public void setFunder(List<AbstractSchema> funder) { this.funder = funder; }
    public OfferCatalog getHasOfferCatalog() { return hasOfferCatalog; }
    public void setHasOfferCatalog(OfferCatalog hasOfferCatalog) { this.hasOfferCatalog = hasOfferCatalog; }
    public List<AbstractSchema> getAlumniOf() { return alumniOf; }
    public void setAlumniOf(List<AbstractSchema> alumniOf) { this.alumniOf = alumniOf; }
    public String getFaxNumber() { return faxNumber; }
    public void setFaxNumber(String faxNumber) { this.faxNumber = faxNumber; }
    public Organization getAffiliation() { return affiliation; }
    public void setAffiliation(Organization affiliation) { this.affiliation = affiliation; }
    public String getSkills() { return skills; }
    public void setSkills(String skills) { this.skills = skills; }
    public Person getRelatedTo() { return relatedTo; }
    public void setRelatedTo(Person relatedTo) { this.relatedTo = relatedTo; }
    public Person getSpouse() { return spouse; }
    public void setSpouse(Person spouse) { this.spouse = spouse; }
    public String getNaics() { return naics; }
    public void setNaics(String naics) { this.naics = naics; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getDuns() { return duns; }
    public void setDuns(String duns) { this.duns = duns; }
    public Person getChildren() { return children; }
    public void setChildren(Person children) { this.children = children; }
    public String getTaxID() { return taxID; }
    public void setTaxID(String taxID) { this.taxID = taxID; }
    public Organization getWorksFor() { return worksFor; }
    public void setWorksFor(Organization worksFor) { this.worksFor = worksFor; }
    public Place getBirthPlace() { return birthPlace; }
    public void setBirthPlace(Place birthPlace) { this.birthPlace = birthPlace; }
}
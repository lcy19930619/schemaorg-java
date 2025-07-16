package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class Legislation extends CreativeWork {
    {
        setId("schema:Legislation");
        setType("rdfs:Class");

    }

    /**
     * Indicates a legal jurisdiction, e.g. of some legislation, or where some government service is based.
     */
    @JsonProperty("jurisdiction")
    private String jurisdiction;
    /**
     * Whether the legislation is currently in force, not in force, or partially in force.
     */
    @JsonProperty("legislationLegalForce")
    private LegalForceStatus legislationLegalForce;
    /**
     * An individual or organization that has some kind of responsibility for the legislation. Typically the ministry who is/was in charge of elaborating the legislation, or the adressee for potential questions about the legislation once it is published.
     */
    @JsonProperty("legislationResponsible")
    private List<AbstractSchema> legislationResponsible;
    /**
     * Another legislation that this one sets into force.
     */
    @JsonProperty("legislationCommences")
    private Legislation legislationCommences;
    /**
     * Another legislation that this legislation changes. This encompasses the notions of amendment, replacement, correction, repeal, or other types of change. This may be a direct change (textual or non-textual amendment) or a consequential or indirect change. The property is to be used to express the existence of a change relationship between two acts rather than the existence of a consolidated version of the text that shows the result of the change. For consolidation relationships, use the <a href="/legislationConsolidates">legislationConsolidates</a> property.
     */
    @JsonProperty("legislationChanges")
    private Legislation legislationChanges;
    /**
     * Another legislation that this legislation repeals (cancels, abrogates).
     */
    @JsonProperty("legislationRepeals")
    private Legislation legislationRepeals;
    /**
     * Another legislation in which this one introduces textual changes, like correction of spelling mistakes, with no legal impact (for modifications that have legal impact, use <a href="/legislationAmends">legislationAmends</a>).
     */
    @JsonProperty("legislationCorrects")
    private Legislation legislationCorrects;
    /**
     * The date at which the Legislation becomes applicable. This can sometimes be distinct from the date of entry into force : a text may come in force today, and state it will become applicable in 3 months.
     */
    @JsonProperty("legislationDateOfApplicability")
    private java.time.LocalDate legislationDateOfApplicability;
    /**
     * The jurisdiction from which the legislation originates.
     */
    @JsonProperty("legislationJurisdiction")
    private String legislationJurisdiction;
    /**
     * The type of the legislation. Examples of values are "law", "act", "directive", "decree", "regulation", "statutory instrument", "loi organique", "règlement grand-ducal", etc., depending on the country.
     */
    @JsonProperty("legislationType")
    private String legislationType;
    /**
     * Indicates that this legislation (or part of legislation) fulfills the objectives set by another legislation, by passing appropriate implementation measures. Typically, some legislations of European Union's member states or regions transpose European Directives. This indicates a legally binding link between the 2 legislations.
     */
    @JsonProperty("legislationTransposes")
    private Legislation legislationTransposes;
    /**
     * The person or organization that countersigned the legislation. Depending on the legal context, a countersignature can indicate that the signed authority undertakes to assume responsibility for texts emanating from a person who is inviolable and irresponsible, (for example a King, Grand Duc or President), or that the authority is in charge of the implementation of the text.
     */
    @JsonProperty("legislationCountersignedBy")
    private List<AbstractSchema> legislationCountersignedBy;
    /**
     * Indicates that this Legislation ensures the implementation of another Legislation, for example by modifying national legislations so that they do not contradict to an EU regulation or decision. This implies a legal meaning. Transpositions of EU Directive should be captured with <a href="/legislationTransposes">legislationTransposes</a>.
     */
    @JsonProperty("legislationEnsuresImplementationOf")
    private Legislation legislationEnsuresImplementationOf;
    /**
     * The date of adoption or signature of the legislation. This is the date at which the text is officially aknowledged to be a legislation, even though it might not even be published or in force.
     */
    @JsonProperty("legislationDate")
    private java.time.LocalDate legislationDate;
    /**
     * Indicates that this legislation (or part of a legislation) somehow transfers another legislation in a different legislative context. This is an informative link, and it has no legal value. For legally-binding links of transposition, use the <a href="/legislationTransposes">legislationTransposes</a> property. For example an informative consolidated law of a European Union's member state "applies" the consolidated version of the European Directive implemented in it.
     */
    @JsonProperty("legislationApplies")
    private Legislation legislationApplies;
    /**
     * Another legislation that this legislation amends, introducing legal changes.
     */
    @JsonProperty("legislationAmends")
    private Legislation legislationAmends;
    /**
     * The point-in-time at which the provided description of the legislation is valid (e.g.: when looking at the law on the 2016-04-07 (= dateVersion), I get the consolidation of 2015-04-12 of the "National Insurance Contributions Act 2015")
     */
    @JsonProperty("legislationDateVersion")
    private java.time.LocalDate legislationDateVersion;
    /**
     * An identifier for the legislation. This can be either a string-based identifier, like the CELEX at EU level or the NOR in France, or a web-based, URL/URI identifier, like an ELI (European Legislation Identifier) or an URN-Lex.
     */
    @JsonProperty("legislationIdentifier")
    private String legislationIdentifier;
    /**
     * Indicates another legislation taken into account in this consolidated legislation (which is usually the product of an editorial process that revises the legislation). This property should be used multiple times to refer to both the original version or the previous consolidated version, and to the legislations making the change.
     */
    @JsonProperty("legislationConsolidates")
    private Legislation legislationConsolidates;
    /**
     * The person or organization that originally passed or made the law: typically parliament (for primary legislation) or government (for secondary legislation). This indicates the "legal author" of the law, as opposed to its physical author.
     */
    @JsonProperty("legislationPassedBy")
    private List<AbstractSchema> legislationPassedBy;

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public LegalForceStatus getLegislationLegalForce() {
        return legislationLegalForce;
    }

    public void setLegislationLegalForce(LegalForceStatus legislationLegalForce) {
        this.legislationLegalForce = legislationLegalForce;
    }

    public List<AbstractSchema> getLegislationResponsible() {
        return legislationResponsible;
    }

    public void setLegislationResponsible(List<AbstractSchema> legislationResponsible) {
        this.legislationResponsible = legislationResponsible;
    }

    public Legislation getLegislationCommences() {
        return legislationCommences;
    }

    public void setLegislationCommences(Legislation legislationCommences) {
        this.legislationCommences = legislationCommences;
    }

    public Legislation getLegislationChanges() {
        return legislationChanges;
    }

    public void setLegislationChanges(Legislation legislationChanges) {
        this.legislationChanges = legislationChanges;
    }

    public Legislation getLegislationRepeals() {
        return legislationRepeals;
    }

    public void setLegislationRepeals(Legislation legislationRepeals) {
        this.legislationRepeals = legislationRepeals;
    }

    public Legislation getLegislationCorrects() {
        return legislationCorrects;
    }

    public void setLegislationCorrects(Legislation legislationCorrects) {
        this.legislationCorrects = legislationCorrects;
    }

    public java.time.LocalDate getLegislationDateOfApplicability() {
        return legislationDateOfApplicability;
    }

    public void setLegislationDateOfApplicability(java.time.LocalDate legislationDateOfApplicability) {
        this.legislationDateOfApplicability = legislationDateOfApplicability;
    }

    public String getLegislationJurisdiction() {
        return legislationJurisdiction;
    }

    public void setLegislationJurisdiction(String legislationJurisdiction) {
        this.legislationJurisdiction = legislationJurisdiction;
    }

    public String getLegislationType() {
        return legislationType;
    }

    public void setLegislationType(String legislationType) {
        this.legislationType = legislationType;
    }

    public Legislation getLegislationTransposes() {
        return legislationTransposes;
    }

    public void setLegislationTransposes(Legislation legislationTransposes) {
        this.legislationTransposes = legislationTransposes;
    }

    public List<AbstractSchema> getLegislationCountersignedBy() {
        return legislationCountersignedBy;
    }

    public void setLegislationCountersignedBy(List<AbstractSchema> legislationCountersignedBy) {
        this.legislationCountersignedBy = legislationCountersignedBy;
    }

    public Legislation getLegislationEnsuresImplementationOf() {
        return legislationEnsuresImplementationOf;
    }

    public void setLegislationEnsuresImplementationOf(Legislation legislationEnsuresImplementationOf) {
        this.legislationEnsuresImplementationOf = legislationEnsuresImplementationOf;
    }

    public java.time.LocalDate getLegislationDate() {
        return legislationDate;
    }

    public void setLegislationDate(java.time.LocalDate legislationDate) {
        this.legislationDate = legislationDate;
    }

    public Legislation getLegislationApplies() {
        return legislationApplies;
    }

    public void setLegislationApplies(Legislation legislationApplies) {
        this.legislationApplies = legislationApplies;
    }

    public Legislation getLegislationAmends() {
        return legislationAmends;
    }

    public void setLegislationAmends(Legislation legislationAmends) {
        this.legislationAmends = legislationAmends;
    }

    public java.time.LocalDate getLegislationDateVersion() {
        return legislationDateVersion;
    }

    public void setLegislationDateVersion(java.time.LocalDate legislationDateVersion) {
        this.legislationDateVersion = legislationDateVersion;
    }

    public String getLegislationIdentifier() {
        return legislationIdentifier;
    }

    public void setLegislationIdentifier(String legislationIdentifier) {
        this.legislationIdentifier = legislationIdentifier;
    }

    public Legislation getLegislationConsolidates() {
        return legislationConsolidates;
    }

    public void setLegislationConsolidates(Legislation legislationConsolidates) {
        this.legislationConsolidates = legislationConsolidates;
    }

    public List<AbstractSchema> getLegislationPassedBy() {
        return legislationPassedBy;
    }

    public void setLegislationPassedBy(List<AbstractSchema> legislationPassedBy) {
        this.legislationPassedBy = legislationPassedBy;
    }
}
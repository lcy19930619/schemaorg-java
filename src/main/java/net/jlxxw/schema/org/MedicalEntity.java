package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MedicalEntity extends AbstractSchema {
    public MedicalEntity() {
    }

    /**
     * A [[Grant]] that directly or indirectly provide funding or sponsorship for this item. See also [[ownershipFundingInfo]].
     */
    @JsonProperty("funding")
    private Grant funding;
    /**
     * If applicable, the organization that officially recognizes this entity as part of its endorsed system of medicine.
     */
    @JsonProperty("recognizingAuthority")
    private Organization recognizingAuthority;
    /**
     * A medical study or trial related to this entity.
     */
    @JsonProperty("study")
    private MedicalStudy study;
    /**
     * A medical guideline related to this entity.
     */
    @JsonProperty("guideline")
    private MedicalGuideline guideline;
    /**
     * The drug or supplement's legal status, including any controlled substance schedules that apply.
     */
    @JsonProperty("legalStatus")
    private String legalStatus;
    /**
     * If applicable, a medical specialty in which this entity is relevant.
     */
    @JsonProperty("relevantSpecialty")
    private AbstractSchema relevantSpecialty;

    public Grant getFunding() {
        return funding;
    }

    public void setFunding(Grant funding) {
        this.funding = funding;
    }

    public Organization getRecognizingAuthority() {
        return recognizingAuthority;
    }

    public void setRecognizingAuthority(Organization recognizingAuthority) {
        this.recognizingAuthority = recognizingAuthority;
    }

    public MedicalStudy getStudy() {
        return study;
    }

    public void setStudy(MedicalStudy study) {
        this.study = study;
    }

    public MedicalGuideline getGuideline() {
        return guideline;
    }

    public void setGuideline(MedicalGuideline guideline) {
        this.guideline = guideline;
    }

    public String getLegalStatus() {
        return legalStatus;
    }

    public void setLegalStatus(String legalStatus) {
        this.legalStatus = legalStatus;
    }

    public AbstractSchema getRelevantSpecialty() {
        return relevantSpecialty;
    }

    public void setRelevantSpecialty(AbstractSchema relevantSpecialty) {
        this.relevantSpecialty = relevantSpecialty;
    }
}
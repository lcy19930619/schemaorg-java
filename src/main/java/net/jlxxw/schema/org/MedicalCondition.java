package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class MedicalCondition extends MedicalEntity {
    {
        setId("schema:MedicalCondition");
        setType("rdfs:Class");

    }

    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     */
    @JsonProperty("associatedAnatomy")
    private List<AbstractSchema> associatedAnatomy;
    /**
     * The characteristics of associated patients, such as age, gender, race etc.
     */
    @JsonProperty("epidemiology")
    private String epidemiology;
    /**
     * Specifying a drug or medicine used in a medication procedure.
     */
    @JsonProperty("drug")
    private AbstractSchema drug;
    /**
     * A modifiable or non-modifiable factor that increases the risk of a patient contracting this condition, e.g. age,  coexisting condition.
     */
    @JsonProperty("riskFactor")
    private MedicalRiskFactor riskFactor;
    /**
     * A sign or symptom of this condition. Signs are objective or physically observable manifestations of the medical condition while symptoms are the subjective experience of the medical condition.
     */
    @JsonProperty("signOrSymptom")
    private MedicalSignOrSymptom signOrSymptom;
    /**
     * Changes in the normal mechanical, physical, and biochemical functions that are associated with this activity or condition.
     */
    @JsonProperty("pathophysiology")
    private String pathophysiology;
    /**
     * A possible unexpected and unfavorable evolution of a medical condition. Complications may include worsening of the signs or symptoms of the disease, extension of the condition to other organ systems, etc.
     */
    @JsonProperty("possibleComplication")
    private String possibleComplication;
    /**
     * The likely outcome in either the short term or long term of the medical condition.
     */
    @JsonProperty("expectedPrognosis")
    private String expectedPrognosis;
    /**
     * The expected progression of the condition if it is not treated and allowed to progress naturally.
     */
    @JsonProperty("naturalProgression")
    private String naturalProgression;
    /**
     * A medical test typically performed given this condition.
     */
    @JsonProperty("typicalTest")
    private MedicalTest typicalTest;
    /**
     * One of a set of differential diagnoses for the condition. Specifically, a closely-related or competing diagnosis typically considered later in the cognitive process whereby this medical condition is distinguished from others most likely responsible for a similar collection of signs and symptoms to reach the most parsimonious diagnosis or diagnoses in a patient.
     */
    @JsonProperty("differentialDiagnosis")
    private DDxElement differentialDiagnosis;
    /**
     * The status of the study (enumerated).
     */
    @JsonProperty("status")
    private String status;
    /**
     * The stage of the condition, if applicable.
     */
    @JsonProperty("stage")
    private MedicalConditionStage stage;
    /**
     * A preventative therapy used to prevent reoccurrence of the medical condition after an initial episode of the condition.
     */
    @JsonProperty("secondaryPrevention")
    private MedicalTherapy secondaryPrevention;
    /**
     * A preventative therapy used to prevent an initial occurrence of the medical condition, such as vaccination.
     */
    @JsonProperty("primaryPrevention")
    private MedicalTherapy primaryPrevention;
    /**
     * A possible treatment to address this condition, sign or symptom.
     */
    @JsonProperty("possibleTreatment")
    private MedicalTherapy possibleTreatment;

    public List<AbstractSchema> getAssociatedAnatomy() {
        return associatedAnatomy;
    }

    public void setAssociatedAnatomy(List<AbstractSchema> associatedAnatomy) {
        this.associatedAnatomy = associatedAnatomy;
    }

    public String getEpidemiology() {
        return epidemiology;
    }

    public void setEpidemiology(String epidemiology) {
        this.epidemiology = epidemiology;
    }

    public AbstractSchema getDrug() {
        return drug;
    }

    public void setDrug(AbstractSchema drug) {
        this.drug = drug;
    }

    public MedicalRiskFactor getRiskFactor() {
        return riskFactor;
    }

    public void setRiskFactor(MedicalRiskFactor riskFactor) {
        this.riskFactor = riskFactor;
    }

    public MedicalSignOrSymptom getSignOrSymptom() {
        return signOrSymptom;
    }

    public void setSignOrSymptom(MedicalSignOrSymptom signOrSymptom) {
        this.signOrSymptom = signOrSymptom;
    }

    public String getPathophysiology() {
        return pathophysiology;
    }

    public void setPathophysiology(String pathophysiology) {
        this.pathophysiology = pathophysiology;
    }

    public String getPossibleComplication() {
        return possibleComplication;
    }

    public void setPossibleComplication(String possibleComplication) {
        this.possibleComplication = possibleComplication;
    }

    public String getExpectedPrognosis() {
        return expectedPrognosis;
    }

    public void setExpectedPrognosis(String expectedPrognosis) {
        this.expectedPrognosis = expectedPrognosis;
    }

    public String getNaturalProgression() {
        return naturalProgression;
    }

    public void setNaturalProgression(String naturalProgression) {
        this.naturalProgression = naturalProgression;
    }

    public MedicalTest getTypicalTest() {
        return typicalTest;
    }

    public void setTypicalTest(MedicalTest typicalTest) {
        this.typicalTest = typicalTest;
    }

    public DDxElement getDifferentialDiagnosis() {
        return differentialDiagnosis;
    }

    public void setDifferentialDiagnosis(DDxElement differentialDiagnosis) {
        this.differentialDiagnosis = differentialDiagnosis;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public MedicalConditionStage getStage() {
        return stage;
    }

    public void setStage(MedicalConditionStage stage) {
        this.stage = stage;
    }

    public MedicalTherapy getSecondaryPrevention() {
        return secondaryPrevention;
    }

    public void setSecondaryPrevention(MedicalTherapy secondaryPrevention) {
        this.secondaryPrevention = secondaryPrevention;
    }

    public MedicalTherapy getPrimaryPrevention() {
        return primaryPrevention;
    }

    public void setPrimaryPrevention(MedicalTherapy primaryPrevention) {
        this.primaryPrevention = primaryPrevention;
    }

    public MedicalTherapy getPossibleTreatment() {
        return possibleTreatment;
    }

    public void setPossibleTreatment(MedicalTherapy possibleTreatment) {
        this.possibleTreatment = possibleTreatment;
    }
}
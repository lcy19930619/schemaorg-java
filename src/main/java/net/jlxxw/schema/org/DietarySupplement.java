package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class DietarySupplement extends Product {
    {
        setId("schema:DietarySupplement");
        setType("rdfs:Class");

    }

    /**
     * The specific biochemical interaction through which this drug or supplement produces its pharmacological effect.
     */
    @JsonProperty("mechanismOfAction")
    private String mechanismOfAction;
    /**
     * An active ingredient, typically chemical compounds and/or biologic substances.
     */
    @JsonProperty("activeIngredient")
    private String activeIngredient;
    /**
     * Proprietary name given to the diet plan, typically by its originator or creator.
     */
    @JsonProperty("proprietaryName")
    private String proprietaryName;
    /**
     * Recommended intake of this supplement for a given population as defined by a specific recommending authority.
     */
    @JsonProperty("maximumIntake")
    private MaximumDoseSchedule maximumIntake;
    /**
     * The drug or supplement's legal status, including any controlled substance schedules that apply.
     */
    @JsonProperty("legalStatus")
    private String legalStatus;
    /**
     * Any potential safety concern associated with the supplement. May include interactions with other drugs and foods, pregnancy, breastfeeding, known adverse reactions, and documented efficacy of the supplement.
     */
    @JsonProperty("safetyConsideration")
    private String safetyConsideration;
    /**
     * Characteristics of the population for which this is intended, or which typically uses it, e.g. 'adults'.
     */
    @JsonProperty("targetPopulation")
    private String targetPopulation;
    /**
     * Recommended intake of this supplement for a given population as defined by a specific recommending authority.
     */
    @JsonProperty("recommendedIntake")
    private RecommendedDoseSchedule recommendedIntake;
    /**
     * True if this item's name is a proprietary/brand name (vs. generic name).
     */
    @JsonProperty("isProprietary")
    private Boolean isProprietary;
    /**
     * The generic name of this drug or supplement.
     */
    @JsonProperty("nonProprietaryName")
    private String nonProprietaryName;

    public String getMechanismOfAction() {
        return mechanismOfAction;
    }

    public void setMechanismOfAction(String mechanismOfAction) {
        this.mechanismOfAction = mechanismOfAction;
    }

    public String getActiveIngredient() {
        return activeIngredient;
    }

    public void setActiveIngredient(String activeIngredient) {
        this.activeIngredient = activeIngredient;
    }

    public String getProprietaryName() {
        return proprietaryName;
    }

    public void setProprietaryName(String proprietaryName) {
        this.proprietaryName = proprietaryName;
    }

    public MaximumDoseSchedule getMaximumIntake() {
        return maximumIntake;
    }

    public void setMaximumIntake(MaximumDoseSchedule maximumIntake) {
        this.maximumIntake = maximumIntake;
    }

    public String getLegalStatus() {
        return legalStatus;
    }

    public void setLegalStatus(String legalStatus) {
        this.legalStatus = legalStatus;
    }

    public String getSafetyConsideration() {
        return safetyConsideration;
    }

    public void setSafetyConsideration(String safetyConsideration) {
        this.safetyConsideration = safetyConsideration;
    }

    public String getTargetPopulation() {
        return targetPopulation;
    }

    public void setTargetPopulation(String targetPopulation) {
        this.targetPopulation = targetPopulation;
    }

    public RecommendedDoseSchedule getRecommendedIntake() {
        return recommendedIntake;
    }

    public void setRecommendedIntake(RecommendedDoseSchedule recommendedIntake) {
        this.recommendedIntake = recommendedIntake;
    }

    public Boolean getIsProprietary() {
        return isProprietary;
    }

    public void setIsProprietary(Boolean isProprietary) {
        this.isProprietary = isProprietary;
    }

    public String getNonProprietaryName() {
        return nonProprietaryName;
    }

    public void setNonProprietaryName(String nonProprietaryName) {
        this.nonProprietaryName = nonProprietaryName;
    }
}
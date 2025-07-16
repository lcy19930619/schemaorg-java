package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class StatisticalVariable extends ConstraintNode {
    {
        setId("schema:StatisticalVariable");
        setType("rdfs:Class");

    }

    /**
     * Identifies the denominator variable when an observation represents a ratio or percentage.
     */
    @JsonProperty("measurementDenominator")
    private StatisticalVariable measurementDenominator;
    /**
     * Provides additional qualification to an observation. For example, a GDP observation measures the Nominal value.
     */
    @JsonProperty("measurementQualifier")
    private Enumeration measurementQualifier;
    /**
     * A subproperty of [[measurementTechnique]] that can be used for specifying specific methods, in particular via [[MeasurementMethodEnum]].
     */
    @JsonProperty("measurementMethod")
    private String measurementMethod;
    /**
     * Indicates the populationType common to all members of a [[StatisticalPopulation]] or all cases within the scope of a [[StatisticalVariable]].
     */
    @JsonProperty("populationType")
    private Class populationType;
    /**
     * A technique, method or technology used in an [[Observation]], [[StatisticalVariable]] or [[Dataset]] (or [[DataDownload]], [[DataCatalog]]), corresponding to the method used for measuring the corresponding variable(s) (for datasets, described using [[variableMeasured]]; for [[Observation]], a [[StatisticalVariable]]). Often but not necessarily each [[variableMeasured]] will have an explicit representation as (or mapping to) an property such as those defined in Schema.org, or other RDF vocabularies and "knowledge graphs". In that case the subproperty of [[variableMeasured]] called [[measuredProperty]] is applicable.
     * <p>
     * The [[measurementTechnique]] property helps when extra clarification is needed about how a [[measuredProperty]] was measured. This is oriented towards scientific and scholarly dataset publication but may have broader applicability; it is not intended as a full representation of measurement, but can often serve as a high level summary for dataset discovery.
     * <p>
     * For example, if [[variableMeasured]] is: molecule concentration, [[measurementTechnique]] could be: "mass spectrometry" or "nmr spectroscopy" or "colorimetry" or "immunofluorescence". If the [[variableMeasured]] is "depression rating", the [[measurementTechnique]] could be "Zung Scale" or "HAM-D" or "Beck Depression Inventory".
     * <p>
     * If there are several [[variableMeasured]] properties recorded for some given data object, use a [[PropertyValue]] for each [[variableMeasured]] and attach the corresponding [[measurementTechnique]]. The value can also be from an enumeration, organized as a [[MeasurementMetholdEnumeration]].
     */
    @JsonProperty("measurementTechnique")
    private String measurementTechnique;
    /**
     * The measuredProperty of an [[Observation]], typically via its [[StatisticalVariable]]. There are various kinds of applicable [[Property]]: a schema.org property, a property from other RDF-compatible systems, e.g. W3C RDF Data Cube, Data Commons, Wikidata, or schema.org extensions such as [GS1's](https://www.gs1.org/voc/?show=properties).
     */
    @JsonProperty("measuredProperty")
    private Property measuredProperty;
    /**
     * Indicates the kind of statistic represented by a [[StatisticalVariable]], e.g. mean, count etc. The value of statType is a property, either from within Schema.org (e.g. [[median]], [[marginOfError]], [[maxValue]], [[minValue]]) or from other compatible (e.g. RDF) systems such as DataCommons.org or Wikidata.org.
     */
    @JsonProperty("statType")
    private String statType;

    public StatisticalVariable getMeasurementDenominator() {
        return measurementDenominator;
    }

    public void setMeasurementDenominator(StatisticalVariable measurementDenominator) {
        this.measurementDenominator = measurementDenominator;
    }

    public Enumeration getMeasurementQualifier() {
        return measurementQualifier;
    }

    public void setMeasurementQualifier(Enumeration measurementQualifier) {
        this.measurementQualifier = measurementQualifier;
    }

    public String getMeasurementMethod() {
        return measurementMethod;
    }

    public void setMeasurementMethod(String measurementMethod) {
        this.measurementMethod = measurementMethod;
    }

    public Class getPopulationType() {
        return populationType;
    }

    public void setPopulationType(Class populationType) {
        this.populationType = populationType;
    }

    public String getMeasurementTechnique() {
        return measurementTechnique;
    }

    public void setMeasurementTechnique(String measurementTechnique) {
        this.measurementTechnique = measurementTechnique;
    }

    public Property getMeasuredProperty() {
        return measuredProperty;
    }

    public void setMeasuredProperty(Property measuredProperty) {
        this.measuredProperty = measuredProperty;
    }

    public String getStatType() {
        return statType;
    }

    public void setStatType(String statType) {
        this.statType = statType;
    }
}
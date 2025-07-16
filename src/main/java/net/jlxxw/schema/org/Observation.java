package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Observation extends QuantitativeValue {
    public Observation() {
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
     * The length of time an Observation took place over. The format follows `P[0-9]*[Y|M|D|h|m|s]`. For example, P1Y is Period 1 Year, P3M is Period 3 Months, P3h is Period 3 hours.
     */
    @JsonProperty("observationPeriod")
    private String observationPeriod;
    /**
     * A subproperty of [[measurementTechnique]] that can be used for specifying specific methods, in particular via [[MeasurementMethodEnum]].
     */
    @JsonProperty("measurementMethod")
    private String measurementMethod;
    /**
     * A [[marginOfError]] for an [[Observation]].
     */
    @JsonProperty("marginOfError")
    private QuantitativeValue marginOfError;
    /**
     * The variableMeasured property can indicate (repeated as necessary) the  variables that are measured in some dataset, either described as text or as pairs of identifier and description using PropertyValue, or more explicitly as a [[StatisticalVariable]].
     */
    @JsonProperty("variableMeasured")
    private String variableMeasured;
    /**
     * The observationDate of an [[Observation]].
     */
    @JsonProperty("observationDate")
    private java.time.LocalDateTime observationDate;
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
     * The [[observationAbout]] property identifies an entity, often a [[Place]], associated with an [[Observation]].
     */
    @JsonProperty("observationAbout")
    private List<AbstractSchema> observationAbout;

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

    public String getObservationPeriod() {
        return observationPeriod;
    }

    public void setObservationPeriod(String observationPeriod) {
        this.observationPeriod = observationPeriod;
    }

    public String getMeasurementMethod() {
        return measurementMethod;
    }

    public void setMeasurementMethod(String measurementMethod) {
        this.measurementMethod = measurementMethod;
    }

    public QuantitativeValue getMarginOfError() {
        return marginOfError;
    }

    public void setMarginOfError(QuantitativeValue marginOfError) {
        this.marginOfError = marginOfError;
    }

    public String getVariableMeasured() {
        return variableMeasured;
    }

    public void setVariableMeasured(String variableMeasured) {
        this.variableMeasured = variableMeasured;
    }

    public java.time.LocalDateTime getObservationDate() {
        return observationDate;
    }

    public void setObservationDate(java.time.LocalDateTime observationDate) {
        this.observationDate = observationDate;
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

    public List<AbstractSchema> getObservationAbout() {
        return observationAbout;
    }

    public void setObservationAbout(List<AbstractSchema> observationAbout) {
        this.observationAbout = observationAbout;
    }
}
package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class Dataset extends CreativeWork {
    {
        setId("schema:Dataset");
        setType("rdfs:Class");
    }

    /**
     * A data catalog which contains this dataset (this property was previously 'catalog', preferred name is now 'includedInDataCatalog').
     */
    @JsonProperty("includedDataCatalog")
    private DataCatalog includedDataCatalog;
    /**
     * A subproperty of [[measurementTechnique]] that can be used for specifying specific methods, in particular via [[MeasurementMethodEnum]].
     */
    @JsonProperty("measurementMethod")
    private String measurementMethod;
    /**
     * A data catalog which contains this dataset.
     */
    @JsonProperty("includedInDataCatalog")
    private DataCatalog includedInDataCatalog;
    /**
     * The range of temporal applicability of a dataset, e.g. for a 2011 census dataset, the year 2011 (in ISO 8601 time interval format).
     */
    @JsonProperty("datasetTimeInterval")
    private java.time.LocalDateTime datasetTimeInterval;
    /**
     * The variableMeasured property can indicate (repeated as necessary) the  variables that are measured in some dataset, either described as text or as pairs of identifier and description using PropertyValue, or more explicitly as a [[StatisticalVariable]].
     */
    @JsonProperty("variableMeasured")
    private String variableMeasured;
    /**
     * A downloadable form of this dataset, at a specific location, in a specific format. This property can be repeated if different variations are available. There is no expectation that different downloadable distributions must contain exactly equivalent information (see also [DCAT](https://www.w3.org/TR/vocab-dcat-3/#Class:Distribution) on this point). Different distributions might include or exclude different subsets of the entire dataset, for example.
     */
    @JsonProperty("distribution")
    private DataDownload distribution;
    /**
     * The International Standard Serial Number (ISSN) that identifies this serial publication. You can repeat this property to identify different formats of, or the linking ISSN (ISSN-L) for, this serial publication.
     */
    @JsonProperty("issn")
    private String issn;
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
     * A data catalog which contains this dataset.
     */
    @JsonProperty("catalog")
    private DataCatalog catalog;

    public DataCatalog getIncludedDataCatalog() {
        return includedDataCatalog;
    }

    public void setIncludedDataCatalog(DataCatalog includedDataCatalog) {
        this.includedDataCatalog = includedDataCatalog;
    }

    public String getMeasurementMethod() {
        return measurementMethod;
    }

    public void setMeasurementMethod(String measurementMethod) {
        this.measurementMethod = measurementMethod;
    }

    public DataCatalog getIncludedInDataCatalog() {
        return includedInDataCatalog;
    }

    public void setIncludedInDataCatalog(DataCatalog includedInDataCatalog) {
        this.includedInDataCatalog = includedInDataCatalog;
    }

    public java.time.LocalDateTime getDatasetTimeInterval() {
        return datasetTimeInterval;
    }

    public void setDatasetTimeInterval(java.time.LocalDateTime datasetTimeInterval) {
        this.datasetTimeInterval = datasetTimeInterval;
    }

    public String getVariableMeasured() {
        return variableMeasured;
    }

    public void setVariableMeasured(String variableMeasured) {
        this.variableMeasured = variableMeasured;
    }

    public DataDownload getDistribution() {
        return distribution;
    }

    public void setDistribution(DataDownload distribution) {
        this.distribution = distribution;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getMeasurementTechnique() {
        return measurementTechnique;
    }

    public void setMeasurementTechnique(String measurementTechnique) {
        this.measurementTechnique = measurementTechnique;
    }

    public DataCatalog getCatalog() {
        return catalog;
    }

    public void setCatalog(DataCatalog catalog) {
        this.catalog = catalog;
    }
}
package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Report extends Article {
    public Report() {
        setId("schema:Report");
        setType("rdfs:Class");

    }

    /**
     * The number or other unique designator assigned to a Report by the publishing organization.
     */
    @JsonProperty("reportNumber")
    private String reportNumber;

    public String getReportNumber() {
        return reportNumber;
    }

    public void setReportNumber(String reportNumber) {
        this.reportNumber = reportNumber;
    }
}
package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class Report extends Article {
    public Report() {
}
    /** The number or other unique designator assigned to a Report by the publishing organization. */
    @JsonProperty("reportNumber")
    private String reportNumber;

    public String getReportNumber() { return reportNumber; }
    public void setReportNumber(String reportNumber) { this.reportNumber = reportNumber; }
}
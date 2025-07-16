package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import net.jlxxw.schema.org.JsonLdType;
public class CreativeWorkSeries extends Series {
    public CreativeWorkSeries() {
}
    /** The start date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)). */
    @JsonProperty("startDate")
    private java.time.LocalDate startDate;
    /** The International Standard Serial Number (ISSN) that identifies this serial publication. You can repeat this property to identify different formats of, or the linking ISSN (ISSN-L) for, this serial publication. */
    @JsonProperty("issn")
    private String issn;
    /** The end date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)). */
    @JsonProperty("endDate")
    private java.time.LocalDate endDate;

    public java.time.LocalDate getStartDate() { return startDate; }
    public void setStartDate(java.time.LocalDate startDate) { this.startDate = startDate; }
    public String getIssn() { return issn; }
    public void setIssn(String issn) { this.issn = issn; }
    public java.time.LocalDate getEndDate() { return endDate; }
    public void setEndDate(java.time.LocalDate endDate) { this.endDate = endDate; }
}
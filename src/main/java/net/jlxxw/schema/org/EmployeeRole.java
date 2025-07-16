package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class EmployeeRole extends OrganizationRole {
    public EmployeeRole() {
}
    /** The base salary of the job or of an employee in an EmployeeRole. */
    @JsonProperty("baseSalary")
    private Double baseSalary;
    /** The currency (coded using [ISO 4217](http://en.wikipedia.org/wiki/ISO_4217)) used for the main salary information in this job posting or for this employee. */
    @JsonProperty("salaryCurrency")
    private String salaryCurrency;

    public Double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(Double baseSalary) { this.baseSalary = baseSalary; }
    public String getSalaryCurrency() { return salaryCurrency; }
    public void setSalaryCurrency(String salaryCurrency) { this.salaryCurrency = salaryCurrency; }
}
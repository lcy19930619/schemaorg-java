package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Occupation extends Intangible {
    public Occupation() {
        setId("schema:Occupation");
        setType("rdfs:Class");

    }

    /**
     * Educational background needed for the position or Occupation.
     */
    @JsonProperty("educationRequirements")
    private String educationRequirements;
    /**
     * The region/country for which this occupational description is appropriate. Note that educational requirements and qualifications can vary between jurisdictions.
     */
    @JsonProperty("occupationLocation")
    private AdministrativeArea occupationLocation;
    /**
     * An estimated salary for a job posting or occupation, based on a variety of variables including, but not limited to industry, job title, and location. Estimated salaries  are often computed by outside organizations rather than the hiring organization, who may not have committed to the estimated value.
     */
    @JsonProperty("estimatedSalary")
    private Double estimatedSalary;
    /**
     * Description of skills and experience needed for the position or Occupation.
     */
    @JsonProperty("experienceRequirements")
    private String experienceRequirements;
    /**
     * Responsibilities associated with this role or Occupation.
     */
    @JsonProperty("responsibilities")
    private String responsibilities;
    /**
     * A category describing the job, preferably using a term from a taxonomy such as [BLS O*NET-SOC](http://www.onetcenter.org/taxonomy.html), [ISCO-08](https://www.ilo.org/public/english/bureau/stat/isco/isco08/) or similar, with the property repeated for each applicable value. Ideally the taxonomy should be identified, and both the textual label and formal code for the category should be provided.\n
     * Note: for historical reasons, any textual label and formal code provided as a literal may be assumed to be from O*NET-SOC.
     */
    @JsonProperty("occupationalCategory")
    private String occupationalCategory;
    /**
     * A statement of knowledge, skill, ability, task or any other assertion expressing a competency that is either claimed by a person, an organization or desired or required to fulfill a role or to work in an occupation.
     */
    @JsonProperty("skills")
    private String skills;
    /**
     * Specific qualifications required for this role or Occupation.
     */
    @JsonProperty("qualifications")
    private String qualifications;

    public String getEducationRequirements() {
        return educationRequirements;
    }

    public void setEducationRequirements(String educationRequirements) {
        this.educationRequirements = educationRequirements;
    }

    public AdministrativeArea getOccupationLocation() {
        return occupationLocation;
    }

    public void setOccupationLocation(AdministrativeArea occupationLocation) {
        this.occupationLocation = occupationLocation;
    }

    public Double getEstimatedSalary() {
        return estimatedSalary;
    }

    public void setEstimatedSalary(Double estimatedSalary) {
        this.estimatedSalary = estimatedSalary;
    }

    public String getExperienceRequirements() {
        return experienceRequirements;
    }

    public void setExperienceRequirements(String experienceRequirements) {
        this.experienceRequirements = experienceRequirements;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
    }

    public String getOccupationalCategory() {
        return occupationalCategory;
    }

    public void setOccupationalCategory(String occupationalCategory) {
        this.occupationalCategory = occupationalCategory;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }
}
package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WorkBasedProgram extends EducationalOccupationalProgram {
    public WorkBasedProgram() {
    }

    /**
     * The estimated salary earned while in the program.
     */
    @JsonProperty("trainingSalary")
    private MonetaryAmountDistribution trainingSalary;
    /**
     * A category describing the job, preferably using a term from a taxonomy such as [BLS O*NET-SOC](http://www.onetcenter.org/taxonomy.html), [ISCO-08](https://www.ilo.org/public/english/bureau/stat/isco/isco08/) or similar, with the property repeated for each applicable value. Ideally the taxonomy should be identified, and both the textual label and formal code for the category should be provided.\n
     * Note: for historical reasons, any textual label and formal code provided as a literal may be assumed to be from O*NET-SOC.
     */
    @JsonProperty("occupationalCategory")
    private String occupationalCategory;

    public MonetaryAmountDistribution getTrainingSalary() {
        return trainingSalary;
    }

    public void setTrainingSalary(MonetaryAmountDistribution trainingSalary) {
        this.trainingSalary = trainingSalary;
    }

    public String getOccupationalCategory() {
        return occupationalCategory;
    }

    public void setOccupationalCategory(String occupationalCategory) {
        this.occupationalCategory = occupationalCategory;
    }
}
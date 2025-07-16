package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PhysicalActivity extends LifestyleModification {
    public PhysicalActivity() {
        setId("schema:PhysicalActivity");
        setType("rdfs:Class");

    }

    /**
     * The anatomy of the underlying organ system or structures associated with this entity.
     */
    @JsonProperty("associatedAnatomy")
    private List<AbstractSchema> associatedAnatomy;
    /**
     * The characteristics of associated patients, such as age, gender, race etc.
     */
    @JsonProperty("epidemiology")
    private String epidemiology;
    /**
     * Changes in the normal mechanical, physical, and biochemical functions that are associated with this activity or condition.
     */
    @JsonProperty("pathophysiology")
    private String pathophysiology;
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @JsonProperty("category")
    private String category;

    public List<AbstractSchema> getAssociatedAnatomy() {
        return associatedAnatomy;
    }

    public void setAssociatedAnatomy(List<AbstractSchema> associatedAnatomy) {
        this.associatedAnatomy = associatedAnatomy;
    }

    public String getEpidemiology() {
        return epidemiology;
    }

    public void setEpidemiology(String epidemiology) {
        this.epidemiology = epidemiology;
    }

    public String getPathophysiology() {
        return pathophysiology;
    }

    public void setPathophysiology(String pathophysiology) {
        this.pathophysiology = pathophysiology;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
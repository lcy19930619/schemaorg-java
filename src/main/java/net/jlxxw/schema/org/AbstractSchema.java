package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class AbstractSchema {
    @JsonProperty("@id")
    private String id;
    @JsonProperty("@type")
    private String type;
    @JsonProperty("rdfs:label")
    private String label;
    @JsonProperty("rdfs:comment")
    private String comment;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * Ensure meta fields are set for strict round-trip compliance.
     * Subclasses should call this in their constructors or after deserialization.
     */


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return name != null ? name : super.toString();
    }
}
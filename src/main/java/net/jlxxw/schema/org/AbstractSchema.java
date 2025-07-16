package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import net.jlxxw.schema.org.JsonLdType;
import net.jlxxw.schema.org.LangString;
public abstract class AbstractSchema {
    @JsonProperty("@id")
    private String id;
    @JsonProperty("@type")
    @JsonDeserialize(using = JsonLdTypeDeserializer.class)
    private JsonLdType type;
    @JsonProperty("rdfs:label")
    @JsonDeserialize(using = LangStringDeserializer.class)
    private LangString label;
    @JsonProperty("rdfs:comment")
    @JsonDeserialize(using = LangStringDeserializer.class)
    private LangString comment;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;

    /**
     * Ensure meta fields are set for strict round-trip compliance.
     * Subclasses should call this in their constructors or after deserialization.
     */
    protected void ensureMetaFields(String className, String labelText, String commentText) {
        if (type == null) {
            // Use schema:ClassName as default type
            this.type = new JsonLdType("schema:" + className);
        }
        if (label == null && labelText != null) {
            this.label = new LangString(labelText);
        }
        if (comment == null && commentText != null) {
            this.comment = new LangString(commentText);
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public JsonLdType getType() {
        if (type == null) {
            // 默认补齐
            this.type = new JsonLdType("schema:" + this.getClass().getSimpleName());
        }
        return type;
    }

    public void setType(JsonLdType type) {
        if (type == null) {
            this.type = new JsonLdType("schema:" + this.getClass().getSimpleName());
        } else {
            this.type = type;
        }
    }

    public LangString getLabel() {
        if (label == null) {
            this.label = new LangString(this.getClass().getSimpleName());
        }
        return label;
    }

    public void setLabel(LangString label) {
        if (label == null) {
            this.label = new LangString(this.getClass().getSimpleName());
        } else {
            this.label = label;
        }
    }

    public LangString getComment() {
        if (comment == null) {
            this.comment = new LangString("");
        }
        return comment;
    }

    public void setComment(LangString comment) {
        if (comment == null) {
            this.comment = new LangString("");
        } else {
            this.comment = comment;
        }
    }

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
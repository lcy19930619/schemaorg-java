package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public abstract class AbstractSchema {

    private static ObjectMapper mapper = new ObjectMapper();
    static {
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS, true);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }
    @JsonProperty("@context")
    private String context = "https://schema.org";
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

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public static void setMapper(ObjectMapper mapper) {
        AbstractSchema.mapper = mapper;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
    /**
     * parse to java class
     * @param jsonld jsonld data
     * @param clazz java class
     * @return java class
     * @param <T> entry
     * @throws JsonProcessingException jackson error
     */
    public <T extends AbstractSchema> T parseToObject(String jsonld,java.lang.Class<T> clazz) throws JsonProcessingException {
        return  mapper.<T>readValue(jsonld, clazz);
    }

    /**
     * to jsonld string
     * @return jsonld string
     * @throws JsonProcessingException jackson error
     */
    public String toJsonLdString() throws JsonProcessingException {
        return mapper.writeValueAsString(this);
    }
}
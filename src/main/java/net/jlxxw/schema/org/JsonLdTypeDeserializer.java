package net.jlxxw.schema.org;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonLdTypeDeserializer extends JsonDeserializer<JsonLdType> {
    @Override
    public JsonLdType deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        JsonNode node = p.getCodec().readTree(p);
        if (node.isTextual()) {
            return new JsonLdType(node.asText());
        } else if (node.isArray()) {
            List<String> types = new ArrayList<>();
            for (JsonNode n : node) {
                types.add(n.asText());
            }
            return new JsonLdType(types);
        }
        return null;
    }
}
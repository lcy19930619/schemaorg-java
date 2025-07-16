package net.jlxxw.schema.org;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;
import net.jlxxw.schema.org.LangString;
public class LangStringDeserializer extends JsonDeserializer<LangString> {
    @Override
    public LangString deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        JsonNode node = p.getCodec().readTree(p);
        if (node.isTextual()) {
            return new LangString(node.asText());
        } else if (node.isObject()) {
            String value = node.has("@value") ? node.get("@value").asText() : null;
            String lang = node.has("@language") ? node.get("@language").asText() : null;
            return new LangString(value, lang);
        }
        return null;
    }
}
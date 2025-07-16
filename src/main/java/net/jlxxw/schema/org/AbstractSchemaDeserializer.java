package net.jlxxw.schema.org;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class AbstractSchemaDeserializer extends StdDeserializer<AbstractSchema> {
    public AbstractSchemaDeserializer() {
        super(AbstractSchema.class);
    }

    @Override
    public AbstractSchema deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        // 先用默认反序列化
        JsonNode node = p.getCodec().readTree(p);
        // 反序列化为实际类型
        AbstractSchema obj = ctxt.readValue(node.traverse(p.getCodec()), AbstractSchema.class);
        String className = obj.getClass().getSimpleName();
        String label = null;
        String comment = null;
        if (node.has("rdfs:label")) {
            JsonNode labelNode = node.get("rdfs:label");
            label = labelNode.isTextual() ? labelNode.asText() : labelNode.toString();
        }
        if (node.has("rdfs:comment")) {
            JsonNode commentNode = node.get("rdfs:comment");
            comment = commentNode.isTextual() ? commentNode.asText() : commentNode.toString();
        }
//        obj.ensureMetaFields(className, label, comment);
        return obj;
    }
}
package net.jlxxw.schema.org;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class PropertyJsonldTest {
    @Test
    public void testJsonldRoundTrip() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS, true);

        // Load canonical JSON-LD
        InputStream is = getClass().getClassLoader().getResourceAsStream("Property.jsonld");
        assertNotNull(is, "Property.jsonld resource not found");
        String jsonld = new Scanner(is, StandardCharsets.UTF_8.name()).useDelimiter("\\A").next();

        // Deserialize to Java object
        Property acc = mapper.readValue(jsonld, Property.class);
        assertNotNull(acc);

        // Serialize back to JSON-LD
        String serialized = mapper.writeValueAsString(acc);
        JsonNode original = mapper.readTree(jsonld);
        JsonNode roundTrip = mapper.readTree(serialized);

        // Compare @id
        assertEquals(original.get("@id").asText(), roundTrip.get("@id").asText());

        // Compare @type (string or array)
        JsonNode origType = original.get("@type");
        JsonNode roundType = roundTrip.get("@type");
        if (origType.isArray()) {
            assertTrue(roundType.isArray());
            for (int i = 0; i < origType.size(); i++) {
                assertEquals(origType.get(i).asText(), roundType.get(i).asText());
            }
        } else {
            assertEquals(origType.asText(), roundType.asText());
        }

        // Compare rdfs:label (string or object)
        JsonNode origLabel = original.get("rdfs:label");
        JsonNode roundLabel = roundTrip.get("rdfs:label");
        if (origLabel != null && roundLabel != null) {
            if (origLabel.isObject()) {
                assertTrue(roundLabel.isObject());
                assertEquals(origLabel.get("@value").asText(), roundLabel.get("@value").asText());
                if (origLabel.has("@language")) {
                    assertEquals(origLabel.get("@language").asText(), roundLabel.get("@language").asText());
                }
            } else {
                assertEquals(origLabel.asText(), roundLabel.asText());
            }
        }
    }

    @Test
    public void testDefaultIdAndType() {
        Property obj = new Property();
        assertEquals("schema:Property", obj.getId());
        assertEquals("rdfs:Class", obj.getType());
    }

}
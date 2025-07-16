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

public class CompoundPriceSpecificationJsonldTest {
    @Test
    public void testJsonldRoundTrip() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS, true);

        // Load canonical JSON-LD
        InputStream is = getClass().getClassLoader().getResourceAsStream("CompoundPriceSpecification.jsonld");
        assertNotNull(is, "CompoundPriceSpecification.jsonld resource not found");
        String jsonld = new Scanner(is, StandardCharsets.UTF_8.name()).useDelimiter("\\A").next();

        // Deserialize to Java object
        CompoundPriceSpecification acc = mapper.readValue(jsonld, CompoundPriceSpecification.class);
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
        CompoundPriceSpecification obj = new CompoundPriceSpecification();
        assertEquals("schema:CompoundPriceSpecification", obj.getId());
        assertEquals("rdfs:Class", obj.getType());
    }

}
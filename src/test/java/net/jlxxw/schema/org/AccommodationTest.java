package net.jlxxw.schema.org;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccommodationTest {
    @Test
    public void testJacksonSerialization() throws Exception {
        Accommodation acc = new Accommodation();
        acc.setName("Test Hotel");
        acc.setDescription("A test hotel");
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(acc);
        assertTrue(json.contains("Test Hotel"));
        Accommodation acc2 = mapper.readValue(json, Accommodation.class);
        assertEquals("Test Hotel", acc2.getName());
        assertEquals("A test hotel", acc2.getDescription());
    }

    @Test
    public void testGetterSetter() {
        Accommodation acc = new Accommodation();
        acc.setName("Test");
        assertEquals("Test", acc.getName());
    }

    @Test
    public void testDefaultIdAndType() {
        Accommodation obj = new Accommodation();
        assertEquals("schema:Accommodation", obj.getId());
        assertEquals("rdfs:Class", obj.getType());
    }

}
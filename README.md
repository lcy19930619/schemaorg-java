# Use Cursor AI to automatically generate relevant code
# The project was inspired by https://github.com/google/schemaorg-java

# How to use

```java
import net.jlxxw.schema.org.AbstractSchema;
import net.jlxxw.schema.org.Accommodation;

public class Demo() {
    public static void main(String[] args) throws JsonProcessingException {

        Accommodation accommodation = new Accommodation();
        accommodation.setAccommodationCategory("test");
        accommodation.setBed("test");
        String jsonLdString = accommodation.toJsonLdString();

        Accommodation accommodation2 = new Accommodation();
        AbstractSchema abstractSchema = accommodation2.parseToObject(jsonLdString);

    }
}

```


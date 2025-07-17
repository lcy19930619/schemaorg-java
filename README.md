# Use Cursor AI to automatically generate relevant code
# The project was inspired by https://github.com/google/schemaorg-java

# How to use

# pom.xml
```xml
<groupId>net.jlxxw</groupId>
<artifactId>schema-org-java</artifactId>
<version>1.0.1.cursor</version>
```

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


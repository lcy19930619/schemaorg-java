package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class Collection extends CreativeWork {
    public Collection() {
}
    /** {'@language': 'en', '@value': 'The number of items in the [[Collection]].'} */
    @JsonProperty("collectionSize")
    private Integer collectionSize;

    public Integer getCollectionSize() { return collectionSize; }
    public void setCollectionSize(Integer collectionSize) { this.collectionSize = collectionSize; }
}
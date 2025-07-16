package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class Map extends CreativeWork {
    public Map() {
}
    /** Indicates the kind of Map, from the MapCategoryType Enumeration. */
    @JsonProperty("mapType")
    private MapCategoryType mapType;

    public MapCategoryType getMapType() { return mapType; }
    public void setMapType(MapCategoryType mapType) { this.mapType = mapType; }
}
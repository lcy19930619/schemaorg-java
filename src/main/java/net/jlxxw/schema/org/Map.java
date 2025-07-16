package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Map extends CreativeWork {
    public Map() {
        setId("schema:Map");
        setType("rdfs:Class");
    }

    /**
     * Indicates the kind of Map, from the MapCategoryType Enumeration.
     */
    @JsonProperty("mapType")
    private MapCategoryType mapType;

    public MapCategoryType getMapType() {
        return mapType;
    }

    public void setMapType(MapCategoryType mapType) {
        this.mapType = mapType;
    }
}
package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GeospatialGeometry extends Intangible {
    public GeospatialGeometry() {
    }

    /**
     * Represents spatial relations in which two geometries (or the places they represent) have at least one point in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     */
    @JsonProperty("geoIntersects")
    private List<AbstractSchema> geoIntersects;
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that crosses it: "a crosses b: they have some but not all interior points in common, and the dimension of the intersection is less than that of at least one of them". As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     */
    @JsonProperty("geoCrosses")
    private List<AbstractSchema> geoCrosses;
    /**
     * Represents spatial relations in which two geometries (or the places they represent) are topologically disjoint: "they have no point in common. They form a set of disconnected geometries." (A symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).)
     */
    @JsonProperty("geoDisjoint")
    private List<AbstractSchema> geoDisjoint;
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a containing geometry to a contained geometry. "a contains b iff no points of b lie in the exterior of a, and at least one point of the interior of b lies in the interior of a". As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     */
    @JsonProperty("geoContains")
    private List<AbstractSchema> geoContains;
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a covering geometry to a covered geometry. "Every point of b is a point of (the interior or boundary of) a". As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     */
    @JsonProperty("geoCovers")
    private List<AbstractSchema> geoCovers;
    /**
     * Represents spatial relations in which two geometries (or the places they represent) touch: "they have at least one boundary point in common, but no interior points." (A symmetric relationship, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).)
     */
    @JsonProperty("geoTouches")
    private List<AbstractSchema> geoTouches;
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that geospatially overlaps it, i.e. they have some but not all points in common. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     */
    @JsonProperty("geoOverlaps")
    private List<AbstractSchema> geoOverlaps;
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to one that contains it, i.e. it is inside (i.e. within) its interior. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     */
    @JsonProperty("geoWithin")
    private List<AbstractSchema> geoWithin;
    /**
     * Represents spatial relations in which two geometries (or the places they represent) are topologically equal, as defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM). "Two geometries are topologically equal if their interiors intersect and no part of the interior or boundary of one geometry intersects the exterior of the other" (a symmetric relationship).
     */
    @JsonProperty("geoEquals")
    private List<AbstractSchema> geoEquals;
    /**
     * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that covers it. As defined in [DE-9IM](https://en.wikipedia.org/wiki/DE-9IM).
     */
    @JsonProperty("geoCoveredBy")
    private List<AbstractSchema> geoCoveredBy;

    public List<AbstractSchema> getGeoIntersects() {
        return geoIntersects;
    }

    public void setGeoIntersects(List<AbstractSchema> geoIntersects) {
        this.geoIntersects = geoIntersects;
    }

    public List<AbstractSchema> getGeoCrosses() {
        return geoCrosses;
    }

    public void setGeoCrosses(List<AbstractSchema> geoCrosses) {
        this.geoCrosses = geoCrosses;
    }

    public List<AbstractSchema> getGeoDisjoint() {
        return geoDisjoint;
    }

    public void setGeoDisjoint(List<AbstractSchema> geoDisjoint) {
        this.geoDisjoint = geoDisjoint;
    }

    public List<AbstractSchema> getGeoContains() {
        return geoContains;
    }

    public void setGeoContains(List<AbstractSchema> geoContains) {
        this.geoContains = geoContains;
    }

    public List<AbstractSchema> getGeoCovers() {
        return geoCovers;
    }

    public void setGeoCovers(List<AbstractSchema> geoCovers) {
        this.geoCovers = geoCovers;
    }

    public List<AbstractSchema> getGeoTouches() {
        return geoTouches;
    }

    public void setGeoTouches(List<AbstractSchema> geoTouches) {
        this.geoTouches = geoTouches;
    }

    public List<AbstractSchema> getGeoOverlaps() {
        return geoOverlaps;
    }

    public void setGeoOverlaps(List<AbstractSchema> geoOverlaps) {
        this.geoOverlaps = geoOverlaps;
    }

    public List<AbstractSchema> getGeoWithin() {
        return geoWithin;
    }

    public void setGeoWithin(List<AbstractSchema> geoWithin) {
        this.geoWithin = geoWithin;
    }

    public List<AbstractSchema> getGeoEquals() {
        return geoEquals;
    }

    public void setGeoEquals(List<AbstractSchema> geoEquals) {
        this.geoEquals = geoEquals;
    }

    public List<AbstractSchema> getGeoCoveredBy() {
        return geoCoveredBy;
    }

    public void setGeoCoveredBy(List<AbstractSchema> geoCoveredBy) {
        this.geoCoveredBy = geoCoveredBy;
    }
}
package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GeoShape extends StructuredValue {
    public GeoShape() {
        setId("schema:GeoShape");
        setType("rdfs:Class");

    }

    /**
     * The elevation of a location ([WGS 84](https://en.wikipedia.org/wiki/World_Geodetic_System)). Values may be of the form 'NUMBER UNIT\_OF\_MEASUREMENT' (e.g., '1,000 m', '3,200 ft') while numbers alone should be assumed to be a value in meters.
     */
    @JsonProperty("elevation")
    private String elevation;
    /**
     * A circle is the circular region of a specified radius centered at a specified latitude and longitude. A circle is expressed as a pair followed by a radius in meters.
     */
    @JsonProperty("circle")
    private String circle;
    /**
     * A line is a point-to-point path consisting of two or more points. A line is expressed as a series of two or more point objects separated by space.
     */
    @JsonProperty("line")
    private String line;
    /**
     * The country. Recommended to be in 2-letter [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1) format, for example "US". For backward compatibility, a 3-letter [ISO 3166-1 alpha-3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) country code such as "SGP" or a full country name such as "Singapore" can also be used.
     */
    @JsonProperty("addressCountry")
    private String addressCountry;
    /**
     * The postal code. For example, 94043.
     */
    @JsonProperty("postalCode")
    private String postalCode;
    /**
     * A box is the area enclosed by the rectangle formed by two points. The first point is the lower corner, the second point is the upper corner. A box is expressed as two points separated by a space character.
     */
    @JsonProperty("box")
    private String box;
    /**
     * Physical address of the item.
     */
    @JsonProperty("address")
    private String address;
    /**
     * A polygon is the area enclosed by a point-to-point path for which the starting and ending points are the same. A polygon is expressed as a series of four or more space delimited points where the first and final points are identical.
     */
    @JsonProperty("polygon")
    private String polygon;

    public String getElevation() {
        return elevation;
    }

    public void setElevation(String elevation) {
        this.elevation = elevation;
    }

    public String getCircle() {
        return circle;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getBox() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPolygon() {
        return polygon;
    }

    public void setPolygon(String polygon) {
        this.polygon = polygon;
    }
}
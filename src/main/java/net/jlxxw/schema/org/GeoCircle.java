package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GeoCircle extends GeoShape {
    public GeoCircle() {
    }

    /**
     * Indicates the GeoCoordinates at the centre of a GeoShape, e.g. GeoCircle.
     */
    @JsonProperty("geoMidpoint")
    private GeoCoordinates geoMidpoint;
    /**
     * Indicates the approximate radius of a GeoCircle (metres unless indicated otherwise via Distance notation).
     */
    @JsonProperty("geoRadius")
    private String geoRadius;

    public GeoCoordinates getGeoMidpoint() {
        return geoMidpoint;
    }

    public void setGeoMidpoint(GeoCoordinates geoMidpoint) {
        this.geoMidpoint = geoMidpoint;
    }

    public String getGeoRadius() {
        return geoRadius;
    }

    public void setGeoRadius(String geoRadius) {
        this.geoRadius = geoRadius;
    }
}
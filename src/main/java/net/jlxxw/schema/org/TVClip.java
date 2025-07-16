package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TVClip extends Clip {
    public TVClip() {
    }

    /**
     * The TV series to which this episode or season belongs.
     */
    @JsonProperty("partOfTVSeries")
    private TVSeries partOfTVSeries;

    public TVSeries getPartOfTVSeries() {
        return partOfTVSeries;
    }

    public void setPartOfTVSeries(TVSeries partOfTVSeries) {
        this.partOfTVSeries = partOfTVSeries;
    }
}
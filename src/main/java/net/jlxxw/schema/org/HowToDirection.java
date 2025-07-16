package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class HowToDirection extends CreativeWork {
    {
        setId("schema:HowToDirection");
        setType("rdfs:Class");

    }

    /**
     * The total time required to perform instructions or a direction (including time to prepare the supplies), in [ISO 8601 duration format](http://en.wikipedia.org/wiki/ISO_8601).
     */
    @JsonProperty("totalTime")
    private Duration totalTime;
    /**
     * A sub property of instrument. An object used (but not consumed) when performing instructions or a direction.
     */
    @JsonProperty("tool")
    private String tool;
    /**
     * A sub-property of instrument. A supply consumed when performing instructions or a direction.
     */
    @JsonProperty("supply")
    private String supply;
    /**
     * A media object representing the circumstances before performing this direction.
     */
    @JsonProperty("beforeMedia")
    private String beforeMedia;
    /**
     * The length of time it takes to perform instructions or a direction (not including time to prepare the supplies), in [ISO 8601 duration format](http://en.wikipedia.org/wiki/ISO_8601).
     */
    @JsonProperty("performTime")
    private Duration performTime;
    /**
     * A media object representing the circumstances while performing this direction.
     */
    @JsonProperty("duringMedia")
    private String duringMedia;
    /**
     * The length of time it takes to prepare the items to be used in instructions or a direction, in [ISO 8601 duration format](http://en.wikipedia.org/wiki/ISO_8601).
     */
    @JsonProperty("prepTime")
    private Duration prepTime;
    /**
     * A media object representing the circumstances after performing this direction.
     */
    @JsonProperty("afterMedia")
    private String afterMedia;

    public Duration getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Duration totalTime) {
        this.totalTime = totalTime;
    }

    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }

    public String getSupply() {
        return supply;
    }

    public void setSupply(String supply) {
        this.supply = supply;
    }

    public String getBeforeMedia() {
        return beforeMedia;
    }

    public void setBeforeMedia(String beforeMedia) {
        this.beforeMedia = beforeMedia;
    }

    public Duration getPerformTime() {
        return performTime;
    }

    public void setPerformTime(Duration performTime) {
        this.performTime = performTime;
    }

    public String getDuringMedia() {
        return duringMedia;
    }

    public void setDuringMedia(String duringMedia) {
        this.duringMedia = duringMedia;
    }

    public Duration getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(Duration prepTime) {
        this.prepTime = prepTime;
    }

    public String getAfterMedia() {
        return afterMedia;
    }

    public void setAfterMedia(String afterMedia) {
        this.afterMedia = afterMedia;
    }
}
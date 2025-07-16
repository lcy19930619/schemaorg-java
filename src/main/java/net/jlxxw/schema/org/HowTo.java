package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HowTo extends CreativeWork {
    public HowTo() {
    }

    /**
     * The total time required to perform instructions or a direction (including time to prepare the supplies), in [ISO 8601 duration format](http://en.wikipedia.org/wiki/ISO_8601).
     */
    @JsonProperty("totalTime")
    private Duration totalTime;
    /**
     * The quantity that results by performing instructions. For example, a paper airplane, 10 personalized candles.
     */
    @JsonProperty("yield")
    private String yield;
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
     * The length of time it takes to perform instructions or a direction (not including time to prepare the supplies), in [ISO 8601 duration format](http://en.wikipedia.org/wiki/ISO_8601).
     */
    @JsonProperty("performTime")
    private Duration performTime;
    /**
     * A single step item (as HowToStep, text, document, video, etc.) or a HowToSection.
     */
    @JsonProperty("step")
    private String step;
    /**
     * The length of time it takes to prepare the items to be used in instructions or a direction, in [ISO 8601 duration format](http://en.wikipedia.org/wiki/ISO_8601).
     */
    @JsonProperty("prepTime")
    private Duration prepTime;
    /**
     * A single step item (as HowToStep, text, document, video, etc.) or a HowToSection (originally misnamed 'steps'; 'step' is preferred).
     */
    @JsonProperty("steps")
    private String steps;
    /**
     * The estimated cost of the supply or supplies consumed when performing instructions.
     */
    @JsonProperty("estimatedCost")
    private String estimatedCost;

    public Duration getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Duration totalTime) {
        this.totalTime = totalTime;
    }

    public String getYield() {
        return yield;
    }

    public void setYield(String yield) {
        this.yield = yield;
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

    public Duration getPerformTime() {
        return performTime;
    }

    public void setPerformTime(Duration performTime) {
        this.performTime = performTime;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public Duration getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(Duration prepTime) {
        this.prepTime = prepTime;
    }

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    public String getEstimatedCost() {
        return estimatedCost;
    }

    public void setEstimatedCost(String estimatedCost) {
        this.estimatedCost = estimatedCost;
    }
}
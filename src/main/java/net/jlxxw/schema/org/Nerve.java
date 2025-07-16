package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Nerve extends AnatomicalStructure {
    public Nerve() {
    }

    /**
     * The neurological pathway extension that involves muscle control.
     */
    @JsonProperty("nerveMotor")
    private Muscle nerveMotor;
    /**
     * The branches that delineate from the nerve bundle. Not to be confused with [[branchOf]].
     */
    @JsonProperty("branch")
    private AnatomicalStructure branch;
    /**
     * The neurological pathway that originates the neurons.
     */
    @JsonProperty("sourcedFrom")
    private BrainStructure sourcedFrom;
    /**
     * The neurological pathway extension that inputs and sends information to the brain or spinal cord.
     */
    @JsonProperty("sensoryUnit")
    private List<AbstractSchema> sensoryUnit;

    public Muscle getNerveMotor() {
        return nerveMotor;
    }

    public void setNerveMotor(Muscle nerveMotor) {
        this.nerveMotor = nerveMotor;
    }

    public AnatomicalStructure getBranch() {
        return branch;
    }

    public void setBranch(AnatomicalStructure branch) {
        this.branch = branch;
    }

    public BrainStructure getSourcedFrom() {
        return sourcedFrom;
    }

    public void setSourcedFrom(BrainStructure sourcedFrom) {
        this.sourcedFrom = sourcedFrom;
    }

    public List<AbstractSchema> getSensoryUnit() {
        return sensoryUnit;
    }

    public void setSensoryUnit(List<AbstractSchema> sensoryUnit) {
        this.sensoryUnit = sensoryUnit;
    }
}
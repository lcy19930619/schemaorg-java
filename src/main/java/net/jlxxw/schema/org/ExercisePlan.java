package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ExercisePlan extends CreativeWork {
    public ExercisePlan() {
    }

    /**
     * Quantitative measure of the physiologic output of the exercise; also referred to as energy expenditure.
     */
    @JsonProperty("workload")
    private List<AbstractSchema> workload;
    /**
     * Quantitative measure gauging the degree of force involved in the exercise, for example, heartbeats per minute. May include the velocity of the movement.
     */
    @JsonProperty("intensity")
    private String intensity;
    /**
     * Any additional component of the exercise prescription that may need to be articulated to the patient. This may include the order of exercises, the number of repetitions of movement, quantitative distance, progressions over time, etc.
     */
    @JsonProperty("additionalVariable")
    private String additionalVariable;
    /**
     * How often one should engage in the activity.
     */
    @JsonProperty("activityFrequency")
    private String activityFrequency;
    /**
     * Length of time to engage in the activity.
     */
    @JsonProperty("activityDuration")
    private List<AbstractSchema> activityDuration;
    /**
     * How often one should break from the activity.
     */
    @JsonProperty("restPeriods")
    private String restPeriods;
    /**
     * Number of times one should repeat the activity.
     */
    @JsonProperty("repetitions")
    private Double repetitions;
    /**
     * Type(s) of exercise or activity, such as strength training, flexibility training, aerobics, cardiac rehabilitation, etc.
     */
    @JsonProperty("exerciseType")
    private String exerciseType;

    public List<AbstractSchema> getWorkload() {
        return workload;
    }

    public void setWorkload(List<AbstractSchema> workload) {
        this.workload = workload;
    }

    public String getIntensity() {
        return intensity;
    }

    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }

    public String getAdditionalVariable() {
        return additionalVariable;
    }

    public void setAdditionalVariable(String additionalVariable) {
        this.additionalVariable = additionalVariable;
    }

    public String getActivityFrequency() {
        return activityFrequency;
    }

    public void setActivityFrequency(String activityFrequency) {
        this.activityFrequency = activityFrequency;
    }

    public List<AbstractSchema> getActivityDuration() {
        return activityDuration;
    }

    public void setActivityDuration(List<AbstractSchema> activityDuration) {
        this.activityDuration = activityDuration;
    }

    public String getRestPeriods() {
        return restPeriods;
    }

    public void setRestPeriods(String restPeriods) {
        this.restPeriods = restPeriods;
    }

    public Double getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(Double repetitions) {
        this.repetitions = repetitions;
    }

    public String getExerciseType() {
        return exerciseType;
    }

    public void setExerciseType(String exerciseType) {
        this.exerciseType = exerciseType;
    }
}
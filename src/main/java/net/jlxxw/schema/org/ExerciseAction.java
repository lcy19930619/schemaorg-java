package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class ExerciseAction extends PlayAction {
    public ExerciseAction() {
}
    /** A sub property of instrument. The diet used in this action. */
    @JsonProperty("exerciseRelatedDiet")
    private AbstractSchema exerciseRelatedDiet;
    /** A sub property of instrument. The diet used in this action. */
    @JsonProperty("diet")
    private AbstractSchema diet;
    /** A sub property of location. The course where this action was taken. */
    @JsonProperty("course")
    private Place course;
    /** A sub property of participant. The opponent on this action. */
    @JsonProperty("opponent")
    private Person opponent;
    /** A sub property of location. The final location of the object or the agent after the action. */
    @JsonProperty("toLocation")
    private Place toLocation;
    /** A sub property of location. The course where this action was taken. */
    @JsonProperty("exerciseCourse")
    private Place exerciseCourse;
    /** A sub property of location. The original location of the object or the agent before the action. */
    @JsonProperty("fromLocation")
    private Place fromLocation;
    /** A sub property of participant. The sports team that participated on this action. */
    @JsonProperty("sportsTeam")
    private AbstractSchema sportsTeam;
    /** Type(s) of exercise or activity, such as strength training, flexibility training, aerobics, cardiac rehabilitation, etc. */
    @JsonProperty("exerciseType")
    private String exerciseType;

    public AbstractSchema getExerciseRelatedDiet() { return exerciseRelatedDiet; }
    public void setExerciseRelatedDiet(AbstractSchema exerciseRelatedDiet) { this.exerciseRelatedDiet = exerciseRelatedDiet; }
    public AbstractSchema getDiet() { return diet; }
    public void setDiet(AbstractSchema diet) { this.diet = diet; }
    public Place getCourse() { return course; }
    public void setCourse(Place course) { this.course = course; }
    public Person getOpponent() { return opponent; }
    public void setOpponent(Person opponent) { this.opponent = opponent; }
    public Place getToLocation() { return toLocation; }
    public void setToLocation(Place toLocation) { this.toLocation = toLocation; }
    public Place getExerciseCourse() { return exerciseCourse; }
    public void setExerciseCourse(Place exerciseCourse) { this.exerciseCourse = exerciseCourse; }
    public Place getFromLocation() { return fromLocation; }
    public void setFromLocation(Place fromLocation) { this.fromLocation = fromLocation; }
    public AbstractSchema getSportsTeam() { return sportsTeam; }
    public void setSportsTeam(AbstractSchema sportsTeam) { this.sportsTeam = sportsTeam; }
    public String getExerciseType() { return exerciseType; }
    public void setExerciseType(String exerciseType) { this.exerciseType = exerciseType; }
}
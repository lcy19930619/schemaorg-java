package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CourseInstance extends Event {
    public CourseInstance() {
        setId("schema:CourseInstance");
        setType("rdfs:Class");

    }

    /**
     * The amount of work expected of students taking the course, often provided as a figure per week or per month, and may be broken down by type. For example, "2 hours of lectures, 1 hour of lab work and 3 hours of independent study per week".
     */
    @JsonProperty("courseWorkload")
    private String courseWorkload;
    /**
     * A person assigned to instruct or provide instructional assistance for the [[CourseInstance]].
     */
    @JsonProperty("instructor")
    private Person instructor;
    /**
     * The medium or means of delivery of the course instance or the mode of study, either as a text label (e.g. "online", "onsite" or "blended"; "synchronous" or "asynchronous"; "full-time" or "part-time") or as a URL reference to a term from a controlled vocabulary (e.g. https://ceds.ed.gov/element/001311#Asynchronous).
     */
    @JsonProperty("courseMode")
    private String courseMode;
    /**
     * Represents the length and pace of a course, expressed as a [[Schedule]].
     */
    @JsonProperty("courseSchedule")
    private Schedule courseSchedule;

    public String getCourseWorkload() {
        return courseWorkload;
    }

    public void setCourseWorkload(String courseWorkload) {
        this.courseWorkload = courseWorkload;
    }

    public Person getInstructor() {
        return instructor;
    }

    public void setInstructor(Person instructor) {
        this.instructor = instructor;
    }

    public String getCourseMode() {
        return courseMode;
    }

    public void setCourseMode(String courseMode) {
        this.courseMode = courseMode;
    }

    public Schedule getCourseSchedule() {
        return courseSchedule;
    }

    public void setCourseSchedule(Schedule courseSchedule) {
        this.courseSchedule = courseSchedule;
    }
}
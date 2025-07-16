package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.time.LocalDateTime;
import net.jlxxw.schema.org.JsonLdType;
public class Schedule extends Intangible {
    public Schedule() {
}
    /** Defines the frequency at which [[Event]]s will occur according to a schedule [[Schedule]]. The intervals between
      events should be defined as a [[Duration]] of time. */
    @JsonProperty("repeatFrequency")
    private String repeatFrequency;
    /** Defines the day(s) of the month on which a recurring [[Event]] takes place. Specified as an [[Integer]] between 1-31. */
    @JsonProperty("byMonthDay")
    private Integer byMonthDay;
    /** The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. E.g. John wrote a book from *January* to December. For media, including audio and video, it's the time offset of the start of a clip within a larger file.\n\nNote that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions. */
    @JsonProperty("startTime")
    private java.time.LocalDateTime startTime;
    /** Indicates the timezone for which the time(s) indicated in the [[Schedule]] are given. The value provided should be among those listed in the IANA Time Zone Database. */
    @JsonProperty("scheduleTimezone")
    private String scheduleTimezone;
    /** Defines the month(s) of the year on which a recurring [[Event]] takes place. Specified as an [[Integer]] between 1-12. January is 1. */
    @JsonProperty("byMonth")
    private Integer byMonth;
    /** The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. E.g. John wrote a book from January to *December*. For media, including audio and video, it's the time offset of the end of a clip within a larger file.\n\nNote that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions. */
    @JsonProperty("endTime")
    private java.time.LocalDateTime endTime;
    /** Defines the day(s) of the week on which a recurring [[Event]] takes place. May be specified using either [[DayOfWeek]], or alternatively [[Text]] conforming to iCal's syntax for byDay recurrence rules. */
    @JsonProperty("byDay")
    private String byDay;
    /** Defines the number of times a recurring [[Event]] will take place. */
    @JsonProperty("repeatCount")
    private Integer repeatCount;
    /** The start date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)). */
    @JsonProperty("startDate")
    private java.time.LocalDate startDate;
    /** Defines the week(s) of the month on which a recurring Event takes place. Specified as an Integer between 1-5. For clarity, byMonthWeek is best used in conjunction with byDay to indicate concepts like the first and third Mondays of a month. */
    @JsonProperty("byMonthWeek")
    private Integer byMonthWeek;
    /** Defines a [[Date]] or [[DateTime]] during which a scheduled [[Event]] will not take place. The property allows exceptions to
      a [[Schedule]] to be specified. If an exception is specified as a [[DateTime]] then only the event that would have started at that specific date and time
      should be excluded from the schedule. If an exception is specified as a [[Date]] then any event that is scheduled for that 24 hour period should be
      excluded from the schedule. This allows a whole day to be excluded from the schedule without having to itemise every scheduled event. */
    @JsonProperty("exceptDate")
    private java.time.LocalDate exceptDate;
    /** The end date and time of the item (in [ISO 8601 date format](http://en.wikipedia.org/wiki/ISO_8601)). */
    @JsonProperty("endDate")
    private java.time.LocalDate endDate;

    public String getRepeatFrequency() { return repeatFrequency; }
    public void setRepeatFrequency(String repeatFrequency) { this.repeatFrequency = repeatFrequency; }
    public Integer getByMonthDay() { return byMonthDay; }
    public void setByMonthDay(Integer byMonthDay) { this.byMonthDay = byMonthDay; }
    public java.time.LocalDateTime getStartTime() { return startTime; }
    public void setStartTime(java.time.LocalDateTime startTime) { this.startTime = startTime; }
    public String getScheduleTimezone() { return scheduleTimezone; }
    public void setScheduleTimezone(String scheduleTimezone) { this.scheduleTimezone = scheduleTimezone; }
    public Integer getByMonth() { return byMonth; }
    public void setByMonth(Integer byMonth) { this.byMonth = byMonth; }
    public java.time.LocalDateTime getEndTime() { return endTime; }
    public void setEndTime(java.time.LocalDateTime endTime) { this.endTime = endTime; }
    public String getByDay() { return byDay; }
    public void setByDay(String byDay) { this.byDay = byDay; }
    public Integer getRepeatCount() { return repeatCount; }
    public void setRepeatCount(Integer repeatCount) { this.repeatCount = repeatCount; }
    public java.time.LocalDate getStartDate() { return startDate; }
    public void setStartDate(java.time.LocalDate startDate) { this.startDate = startDate; }
    public Integer getByMonthWeek() { return byMonthWeek; }
    public void setByMonthWeek(Integer byMonthWeek) { this.byMonthWeek = byMonthWeek; }
    public java.time.LocalDate getExceptDate() { return exceptDate; }
    public void setExceptDate(java.time.LocalDate exceptDate) { this.exceptDate = exceptDate; }
    public java.time.LocalDate getEndDate() { return endDate; }
    public void setEndDate(java.time.LocalDate endDate) { this.endDate = endDate; }
}
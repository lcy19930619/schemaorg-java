package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class InteractionCounter extends StructuredValue {
    public InteractionCounter() {
    }

    /**
     * The number of interactions for the CreativeWork using the WebSite or SoftwareApplication.
     */
    @JsonProperty("userInteractionCount")
    private Integer userInteractionCount;
    /**
     * The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. E.g. John wrote a book from *January* to December. For media, including audio and video, it's the time offset of the start of a clip within a larger file.\n\nNote that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     */
    @JsonProperty("startTime")
    private java.time.LocalDateTime startTime;
    /**
     * The location of, for example, where an event is happening, where an organization is located, or where an action takes place.
     */
    @JsonProperty("location")
    private String location;
    /**
     * The Action representing the type of interaction. For up votes, +1s, etc. use [[LikeAction]]. For down votes use [[DislikeAction]]. Otherwise, use the most specific Action.
     */
    @JsonProperty("interactionType")
    private Action interactionType;
    /**
     * The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. E.g. John wrote a book from January to *December*. For media, including audio and video, it's the time offset of the end of a clip within a larger file.\n\nNote that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     */
    @JsonProperty("endTime")
    private java.time.LocalDateTime endTime;
    /**
     * The WebSite or SoftwareApplication where the interactions took place.
     */
    @JsonProperty("interactionService")
    private List<AbstractSchema> interactionService;

    public Integer getUserInteractionCount() {
        return userInteractionCount;
    }

    public void setUserInteractionCount(Integer userInteractionCount) {
        this.userInteractionCount = userInteractionCount;
    }

    public java.time.LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(java.time.LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Action getInteractionType() {
        return interactionType;
    }

    public void setInteractionType(Action interactionType) {
        this.interactionType = interactionType;
    }

    public java.time.LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(java.time.LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public List<AbstractSchema> getInteractionService() {
        return interactionService;
    }

    public void setInteractionService(List<AbstractSchema> interactionService) {
        this.interactionService = interactionService;
    }
}
package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlanAction extends OrganizeAction {
    public PlanAction() {
    }

    /**
     * The time the object is scheduled to.
     */
    @JsonProperty("scheduledTime")
    private java.time.LocalDate scheduledTime;

    public java.time.LocalDate getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(java.time.LocalDate scheduledTime) {
        this.scheduledTime = scheduledTime;
    }
}
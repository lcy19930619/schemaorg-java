package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class FollowAction extends InteractAction {
    public FollowAction() {
    }

    /**
     * A sub property of object. The person or organization being followed.
     */
    @JsonProperty("followee")
    private List<AbstractSchema> followee;

    public List<AbstractSchema> getFollowee() {
        return followee;
    }

    public void setFollowee(List<AbstractSchema> followee) {
        this.followee = followee;
    }
}
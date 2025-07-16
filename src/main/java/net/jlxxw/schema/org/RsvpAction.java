package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RsvpAction extends InformAction {
    public RsvpAction() {
    }

    /**
     * The response (yes, no, maybe) to the RSVP.
     */
    @JsonProperty("rsvpResponse")
    private RsvpResponseType rsvpResponse;
    /**
     * If responding yes, the number of guests who will attend in addition to the invitee.
     */
    @JsonProperty("additionalNumberOfGuests")
    private Double additionalNumberOfGuests;

    public RsvpResponseType getRsvpResponse() {
        return rsvpResponse;
    }

    public void setRsvpResponse(RsvpResponseType rsvpResponse) {
        this.rsvpResponse = rsvpResponse;
    }

    public Double getAdditionalNumberOfGuests() {
        return additionalNumberOfGuests;
    }

    public void setAdditionalNumberOfGuests(Double additionalNumberOfGuests) {
        this.additionalNumberOfGuests = additionalNumberOfGuests;
    }
}
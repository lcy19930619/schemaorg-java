package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MediaSubscription extends Intangible {
    public MediaSubscription() {
    }

    /**
     * An Offer which must be accepted before the user can perform the Action. For example, the user may need to buy a movie before being able to watch it.
     */
    @JsonProperty("expectsAcceptanceOf")
    private Offer expectsAcceptanceOf;
    /**
     * The Organization responsible for authenticating the user's subscription. For example, many media apps require a cable/satellite provider to authenticate your subscription before playing media.
     */
    @JsonProperty("authenticator")
    private Organization authenticator;

    public Offer getExpectsAcceptanceOf() {
        return expectsAcceptanceOf;
    }

    public void setExpectsAcceptanceOf(Offer expectsAcceptanceOf) {
        this.expectsAcceptanceOf = expectsAcceptanceOf;
    }

    public Organization getAuthenticator() {
        return authenticator;
    }

    public void setAuthenticator(Organization authenticator) {
        this.authenticator = authenticator;
    }
}
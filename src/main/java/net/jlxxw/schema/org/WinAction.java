package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WinAction extends AchieveAction {
    public WinAction() {
    }

    /**
     * A sub property of participant. The loser of the action.
     */
    @JsonProperty("loser")
    private Person loser;

    public Person getLoser() {
        return loser;
    }

    public void setLoser(Person loser) {
        this.loser = loser;
    }
}
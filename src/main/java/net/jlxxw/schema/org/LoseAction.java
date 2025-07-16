package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoseAction extends AchieveAction {
    public LoseAction() {
    }

    /**
     * A sub property of participant. The winner of the action.
     */
    @JsonProperty("winner")
    private Person winner;

    public Person getWinner() {
        return winner;
    }

    public void setWinner(Person winner) {
        this.winner = winner;
    }
}
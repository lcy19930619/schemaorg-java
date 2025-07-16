package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class LoseAction extends AchieveAction {
    {
        setId("schema:LoseAction");
        setType("rdfs:Class");

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
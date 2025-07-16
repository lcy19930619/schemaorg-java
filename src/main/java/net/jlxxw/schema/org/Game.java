package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Game extends CreativeWork {
    public Game() {
    }

    /**
     * Real or fictional location of the game (or part of game).
     */
    @JsonProperty("gameLocation")
    private String gameLocation;
    /**
     * The task that a player-controlled character, or group of characters may complete in order to gain a reward.
     */
    @JsonProperty("quest")
    private Thing quest;
    /**
     * A piece of data that represents a particular aspect of a fictional character (skill, power, character points, advantage, disadvantage).
     */
    @JsonProperty("characterAttribute")
    private Thing characterAttribute;
    /**
     * An item is an object within the game world that can be collected by a player or, occasionally, a non-player character.
     */
    @JsonProperty("gameItem")
    private Thing gameItem;
    /**
     * Indicate how many people can play this game (minimum, maximum, or range).
     */
    @JsonProperty("numberOfPlayers")
    private QuantitativeValue numberOfPlayers;

    public String getGameLocation() {
        return gameLocation;
    }

    public void setGameLocation(String gameLocation) {
        this.gameLocation = gameLocation;
    }

    public Thing getQuest() {
        return quest;
    }

    public void setQuest(Thing quest) {
        this.quest = quest;
    }

    public Thing getCharacterAttribute() {
        return characterAttribute;
    }

    public void setCharacterAttribute(Thing characterAttribute) {
        this.characterAttribute = characterAttribute;
    }

    public Thing getGameItem() {
        return gameItem;
    }

    public void setGameItem(Thing gameItem) {
        this.gameItem = gameItem;
    }

    public QuantitativeValue getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(QuantitativeValue numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }
}
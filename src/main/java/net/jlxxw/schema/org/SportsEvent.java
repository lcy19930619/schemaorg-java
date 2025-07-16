package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SportsEvent extends Event {
    public SportsEvent() {
        setId("schema:SportsEvent");
        setType("rdfs:Class");
    }

    /**
     * A competitor in a sports event.
     */
    @JsonProperty("competitor")
    private List<Person> competitor;
    /**
     * A type of sport (e.g. Baseball).
     */
    @JsonProperty("sport")
    private String sport;
    /**
     * The away team in a sports event.
     */
    @JsonProperty("awayTeam")
    private List<Person> awayTeam;
    /**
     * The home team in a sports event.
     */
    @JsonProperty("homeTeam")
    private List<Person> homeTeam;
    /**
     * An official who watches a game or match closely to enforce the rules and arbitrate on matters arising from the play such as referees, umpires or judges. The name of the effective function can vary according to the sport.
     */
    @JsonProperty("referee")
    private Person referee;

    public List<Person> getCompetitor() {
        return competitor;
    }

    public void setCompetitor(List<Person> competitor) {
        this.competitor = competitor;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public List<Person> getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(List<Person> awayTeam) {
        this.awayTeam = awayTeam;
    }

    public List<Person> getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(List<Person> homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Person getReferee() {
        return referee;
    }

    public void setReferee(Person referee) {
        this.referee = referee;
    }
}
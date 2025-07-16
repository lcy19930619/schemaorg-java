package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class PodcastSeries extends CreativeWorkSeries {
    {
        setId("schema:PodcastSeries");
        setType("rdfs:Class");

    }

    /**
     * An actor (individual or a group), e.g. in TV, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip.
     */
    @JsonProperty("actor")
    private List<AbstractSchema> actor;
    /**
     * The URL for a feed, e.g. associated with a podcast series, blog, or series of date-stamped updates. This is usually RSS or Atom.
     */
    @JsonProperty("webFeed")
    private String webFeed;

    public List<AbstractSchema> getActor() {
        return actor;
    }

    public void setActor(List<AbstractSchema> actor) {
        this.actor = actor;
    }

    public String getWebFeed() {
        return webFeed;
    }

    public void setWebFeed(String webFeed) {
        this.webFeed = webFeed;
    }
}
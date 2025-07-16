package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class Grant extends Intangible {
    {
        setId("schema:Grant");
        setType("rdfs:Class");

    }

    /**
     * A person or organization that supports a thing through a pledge, promise, or financial contribution. E.g. a sponsor of a Medical Study or a corporate sponsor of an event.
     */
    @JsonProperty("sponsor")
    private List<AbstractSchema> sponsor;
    /**
     * Indicates something directly or indirectly funded or sponsored through a [[Grant]]. See also [[ownershipFundingInfo]].
     */
    @JsonProperty("fundedItem")
    private List<AbstractSchema> fundedItem;
    /**
     * A person or organization that supports (sponsors) something through some kind of financial contribution.
     */
    @JsonProperty("funder")
    private List<AbstractSchema> funder;

    public List<AbstractSchema> getSponsor() {
        return sponsor;
    }

    public void setSponsor(List<AbstractSchema> sponsor) {
        this.sponsor = sponsor;
    }

    public List<AbstractSchema> getFundedItem() {
        return fundedItem;
    }

    public void setFundedItem(List<AbstractSchema> fundedItem) {
        this.fundedItem = fundedItem;
    }

    public List<AbstractSchema> getFunder() {
        return funder;
    }

    public void setFunder(List<AbstractSchema> funder) {
        this.funder = funder;
    }
}
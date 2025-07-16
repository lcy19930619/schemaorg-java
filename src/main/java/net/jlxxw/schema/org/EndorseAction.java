package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class EndorseAction extends ReactAction {
    {
        setId("schema:EndorseAction");
        setType("rdfs:Class");

    }

    /**
     * A sub property of participant. The person/organization being supported.
     */
    @JsonProperty("endorsee")
    private List<AbstractSchema> endorsee;

    public List<AbstractSchema> getEndorsee() {
        return endorsee;
    }

    public void setEndorsee(List<AbstractSchema> endorsee) {
        this.endorsee = endorsee;
    }
}
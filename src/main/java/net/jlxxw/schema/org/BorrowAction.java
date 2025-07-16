package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class BorrowAction extends TransferAction {
    public BorrowAction() {
    }

    /**
     * A sub property of participant. The person that lends the object being borrowed.
     */
    @JsonProperty("lender")
    private List<AbstractSchema> lender;

    public List<AbstractSchema> getLender() {
        return lender;
    }

    public void setLender(List<AbstractSchema> lender) {
        this.lender = lender;
    }
}
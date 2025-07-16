package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class BuyAction extends TradeAction {
    public BuyAction() {
        setId("schema:BuyAction");
        setType("rdfs:Class");

    }

    /**
     * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
     */
    @JsonProperty("seller")
    private List<AbstractSchema> seller;
    /**
     * 'vendor' is an earlier term for 'seller'.
     */
    @JsonProperty("vendor")
    private List<AbstractSchema> vendor;

    public List<AbstractSchema> getSeller() {
        return seller;
    }

    public void setSeller(List<AbstractSchema> seller) {
        this.seller = seller;
    }

    public List<AbstractSchema> getVendor() {
        return vendor;
    }

    public void setVendor(List<AbstractSchema> vendor) {
        this.vendor = vendor;
    }
}
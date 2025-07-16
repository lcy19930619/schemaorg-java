package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class WarrantyPromise extends StructuredValue {
    {
        setId("schema:WarrantyPromise");
        setType("rdfs:Class");
    }

    /**
     * The scope of the warranty promise.
     */
    @JsonProperty("warrantyScope")
    private AbstractSchema warrantyScope;
    /**
     * The duration of the warranty promise. Common unitCode values are ANN for year, MON for months, or DAY for days.
     */
    @JsonProperty("durationOfWarranty")
    private QuantitativeValue durationOfWarranty;

    public AbstractSchema getWarrantyScope() {
        return warrantyScope;
    }

    public void setWarrantyScope(AbstractSchema warrantyScope) {
        this.warrantyScope = warrantyScope;
    }

    public QuantitativeValue getDurationOfWarranty() {
        return durationOfWarranty;
    }

    public void setDurationOfWarranty(QuantitativeValue durationOfWarranty) {
        this.durationOfWarranty = durationOfWarranty;
    }
}
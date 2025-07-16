package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TypeAndQuantityNode extends StructuredValue {
    public TypeAndQuantityNode() {
    }

    /**
     * The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon.
     */
    @JsonProperty("unitCode")
    private String unitCode;
    /**
     * The quantity of the goods included in the offer.
     */
    @JsonProperty("amountOfThisGood")
    private Double amountOfThisGood;
    /**
     * The product that this structured value is referring to.
     */
    @JsonProperty("typeOfGood")
    private List<AbstractSchema> typeOfGood;
    /**
     * A string or text indicating the unit of measurement. Useful if you cannot provide a standard unit code for
     * <a href='unitCode'>unitCode</a>.
     */
    @JsonProperty("unitText")
    private String unitText;

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public Double getAmountOfThisGood() {
        return amountOfThisGood;
    }

    public void setAmountOfThisGood(Double amountOfThisGood) {
        this.amountOfThisGood = amountOfThisGood;
    }

    public List<AbstractSchema> getTypeOfGood() {
        return typeOfGood;
    }

    public void setTypeOfGood(List<AbstractSchema> typeOfGood) {
        this.typeOfGood = typeOfGood;
    }

    public String getUnitText() {
        return unitText;
    }

    public void setUnitText(String unitText) {
        this.unitText = unitText;
    }
}
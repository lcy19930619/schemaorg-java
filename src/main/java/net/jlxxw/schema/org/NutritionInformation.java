package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class NutritionInformation extends StructuredValue {
    {
        setId("schema:NutritionInformation");
        setType("rdfs:Class");

    }

    /**
     * The number of grams of protein.
     */
    @JsonProperty("proteinContent")
    private Mass proteinContent;
    /**
     * The number of grams of sugar.
     */
    @JsonProperty("sugarContent")
    private Mass sugarContent;
    /**
     * The number of milligrams of sodium.
     */
    @JsonProperty("sodiumContent")
    private Mass sodiumContent;
    /**
     * The number of milligrams of cholesterol.
     */
    @JsonProperty("cholesterolContent")
    private Mass cholesterolContent;
    /**
     * The number of calories.
     */
    @JsonProperty("calories")
    private Energy calories;
    /**
     * The number of grams of trans fat.
     */
    @JsonProperty("transFatContent")
    private Mass transFatContent;
    /**
     * The serving size, in terms of the number of volume or mass.
     */
    @JsonProperty("servingSize")
    private String servingSize;
    /**
     * The number of grams of carbohydrates.
     */
    @JsonProperty("carbohydrateContent")
    private Mass carbohydrateContent;
    /**
     * The number of grams of fat.
     */
    @JsonProperty("fatContent")
    private Mass fatContent;
    /**
     * The number of grams of unsaturated fat.
     */
    @JsonProperty("unsaturatedFatContent")
    private Mass unsaturatedFatContent;
    /**
     * The number of grams of saturated fat.
     */
    @JsonProperty("saturatedFatContent")
    private Mass saturatedFatContent;
    /**
     * The number of grams of fiber.
     */
    @JsonProperty("fiberContent")
    private Mass fiberContent;

    public Mass getProteinContent() {
        return proteinContent;
    }

    public void setProteinContent(Mass proteinContent) {
        this.proteinContent = proteinContent;
    }

    public Mass getSugarContent() {
        return sugarContent;
    }

    public void setSugarContent(Mass sugarContent) {
        this.sugarContent = sugarContent;
    }

    public Mass getSodiumContent() {
        return sodiumContent;
    }

    public void setSodiumContent(Mass sodiumContent) {
        this.sodiumContent = sodiumContent;
    }

    public Mass getCholesterolContent() {
        return cholesterolContent;
    }

    public void setCholesterolContent(Mass cholesterolContent) {
        this.cholesterolContent = cholesterolContent;
    }

    public Energy getCalories() {
        return calories;
    }

    public void setCalories(Energy calories) {
        this.calories = calories;
    }

    public Mass getTransFatContent() {
        return transFatContent;
    }

    public void setTransFatContent(Mass transFatContent) {
        this.transFatContent = transFatContent;
    }

    public String getServingSize() {
        return servingSize;
    }

    public void setServingSize(String servingSize) {
        this.servingSize = servingSize;
    }

    public Mass getCarbohydrateContent() {
        return carbohydrateContent;
    }

    public void setCarbohydrateContent(Mass carbohydrateContent) {
        this.carbohydrateContent = carbohydrateContent;
    }

    public Mass getFatContent() {
        return fatContent;
    }

    public void setFatContent(Mass fatContent) {
        this.fatContent = fatContent;
    }

    public Mass getUnsaturatedFatContent() {
        return unsaturatedFatContent;
    }

    public void setUnsaturatedFatContent(Mass unsaturatedFatContent) {
        this.unsaturatedFatContent = unsaturatedFatContent;
    }

    public Mass getSaturatedFatContent() {
        return saturatedFatContent;
    }

    public void setSaturatedFatContent(Mass saturatedFatContent) {
        this.saturatedFatContent = saturatedFatContent;
    }

    public Mass getFiberContent() {
        return fiberContent;
    }

    public void setFiberContent(Mass fiberContent) {
        this.fiberContent = fiberContent;
    }
}
package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class MathSolver extends CreativeWork {
    {
        setId("schema:MathSolver");
        setType("rdfs:Class");

    }

    /**
     * A mathematical expression (e.g. 'x^2-3x=0') that may be solved for a specific variable, simplified, or transformed. This can take many formats, e.g. LaTeX, Ascii-Math, or math as you would write with a keyboard.
     */
    @JsonProperty("mathExpression")
    private String mathExpression;

    public String getMathExpression() {
        return mathExpression;
    }

    public void setMathExpression(String mathExpression) {
        this.mathExpression = mathExpression;
    }
}
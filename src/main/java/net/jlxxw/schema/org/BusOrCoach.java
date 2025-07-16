package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class BusOrCoach extends Vehicle {
    public BusOrCoach() {
}
    /** The ACRISS Car Classification Code is a code used by many car rental companies, for classifying vehicles. ACRISS stands for Association of Car Rental Industry Systems and Standards. */
    @JsonProperty("acrissCode")
    private String acrissCode;
    /** The permitted total weight of cargo and installations (e.g. a roof rack) on top of the vehicle.\n\nTypical unit code(s): KGM for kilogram, LBR for pound\n\n* Note 1: You can indicate additional information in the [[name]] of the [[QuantitativeValue]] node.\n* Note 2: You may also link to a [[QualitativeValue]] node that provides additional information using [[valueReference]]\n* Note 3: Note that you can use [[minValue]] and [[maxValue]] to indicate ranges. */
    @JsonProperty("roofLoad")
    private QuantitativeValue roofLoad;

    public String getAcrissCode() { return acrissCode; }
    public void setAcrissCode(String acrissCode) { this.acrissCode = acrissCode; }
    public QuantitativeValue getRoofLoad() { return roofLoad; }
    public void setRoofLoad(QuantitativeValue roofLoad) { this.roofLoad = roofLoad; }
}
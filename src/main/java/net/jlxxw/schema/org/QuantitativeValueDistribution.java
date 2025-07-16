package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class QuantitativeValueDistribution extends StructuredValue {
    public QuantitativeValueDistribution() {
}
    /** The median value. */
    @JsonProperty("median")
    private Double median;
    /** The 10th percentile value. */
    @JsonProperty("percentile10")
    private Double percentile10;
    /** The 25th percentile value. */
    @JsonProperty("percentile25")
    private Double percentile25;
    /** The 90th percentile value. */
    @JsonProperty("percentile90")
    private Double percentile90;
    /** The 75th percentile value. */
    @JsonProperty("percentile75")
    private Double percentile75;

    public Double getMedian() { return median; }
    public void setMedian(Double median) { this.median = median; }
    public Double getPercentile10() { return percentile10; }
    public void setPercentile10(Double percentile10) { this.percentile10 = percentile10; }
    public Double getPercentile25() { return percentile25; }
    public void setPercentile25(Double percentile25) { this.percentile25 = percentile25; }
    public Double getPercentile90() { return percentile90; }
    public void setPercentile90(Double percentile90) { this.percentile90 = percentile90; }
    public Double getPercentile75() { return percentile75; }
    public void setPercentile75(Double percentile75) { this.percentile75 = percentile75; }
}
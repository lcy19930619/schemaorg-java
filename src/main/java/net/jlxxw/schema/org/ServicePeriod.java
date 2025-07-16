package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ServicePeriod extends StructuredValue {
    public ServicePeriod() {
        setId("schema:ServicePeriod");
        setType("rdfs:Class");

    }

    /**
     * Days of the week when the merchant typically operates, indicated via opening hours markup.
     */
    @JsonProperty("businessDays")
    private List<DayOfWeek> businessDays;
    /**
     * Order cutoff time allows merchants to describe the time after which they will no longer process orders received on that day. For orders processed after cutoff time, one day gets added to the delivery time estimate. This property is expected to be most typically used via the [[ShippingRateSettings]] publication pattern. The time is indicated using the ISO-8601 Time format, e.g. "23:30:00-05:00" would represent 6:30 pm Eastern Standard Time (EST) which is 5 hours behind Coordinated Universal Time (UTC).
     */
    @JsonProperty("cutoffTime")
    private AbstractSchema cutoffTime;

    public List<DayOfWeek> getBusinessDays() {
        return businessDays;
    }

    public void setBusinessDays(List<DayOfWeek> businessDays) {
        this.businessDays = businessDays;
    }

    public AbstractSchema getCutoffTime() {
        return cutoffTime;
    }

    public void setCutoffTime(AbstractSchema cutoffTime) {
        this.cutoffTime = cutoffTime;
    }
}
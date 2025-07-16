package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EngineSpecification extends StructuredValue {
    public EngineSpecification() {
        setId("schema:EngineSpecification");
        setType("rdfs:Class");

    }

    /**
     * The volume swept by all of the pistons inside the cylinders of an internal combustion engine in a single movement. \n\nTypical unit code(s): CMQ for cubic centimeter, LTR for liters, INQ for cubic inches\n* Note 1: You can link to information about how the given value has been determined using the [[valueReference]] property.\n* Note 2: You can use [[minValue]] and [[maxValue]] to indicate ranges.
     */
    @JsonProperty("engineDisplacement")
    private QuantitativeValue engineDisplacement;
    /**
     * The power of the vehicle's engine.
     * Typical unit code(s): KWT for kilowatt, BHP for brake horsepower, N12 for metric horsepower (PS, with 1 PS = 735,49875 W)\n\n* Note 1: There are many different ways of measuring an engine's power. For an overview, see  [http://en.wikipedia.org/wiki/Horsepower#Engine\_power\_test\_codes](http://en.wikipedia.org/wiki/Horsepower#Engine_power_test_codes).\n* Note 2: You can link to information about how the given value has been determined using the [[valueReference]] property.\n* Note 3: You can use [[minValue]] and [[maxValue]] to indicate ranges.
     */
    @JsonProperty("enginePower")
    private QuantitativeValue enginePower;
    /**
     * The type of engine or engines powering the vehicle.
     */
    @JsonProperty("engineType")
    private String engineType;
    /**
     * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle.
     */
    @JsonProperty("fuelType")
    private String fuelType;
    /**
     * The torque (turning force) of the vehicle's engine.\n\nTypical unit code(s): NU for newton metre (N m), F17 for pound-force per foot, or F48 for pound-force per inch\n\n* Note 1: You can link to information about how the given value has been determined (e.g. reference RPM) using the [[valueReference]] property.\n* Note 2: You can use [[minValue]] and [[maxValue]] to indicate ranges.
     */
    @JsonProperty("torque")
    private QuantitativeValue torque;

    public QuantitativeValue getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(QuantitativeValue engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public QuantitativeValue getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(QuantitativeValue enginePower) {
        this.enginePower = enginePower;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public QuantitativeValue getTorque() {
        return torque;
    }

    public void setTorque(QuantitativeValue torque) {
        this.torque = torque;
    }
}
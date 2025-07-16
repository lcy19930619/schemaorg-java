package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Vehicle extends Product {
    public Vehicle() {
        setId("schema:Vehicle");
        setType("rdfs:Class");

    }

    /**
     * Indicates that the vehicle meets the respective emission standard.
     */
    @JsonProperty("meetsEmissionStandard")
    private String meetsEmissionStandard;
    /**
     * The number of owners of the vehicle, including the current one.\n\nTypical unit code(s): C62.
     */
    @JsonProperty("numberOfPreviousOwners")
    private Double numberOfPreviousOwners;
    /**
     * The permitted total weight of the loaded vehicle, including passengers and cargo and the weight of the empty vehicle.\n\nTypical unit code(s): KGM for kilogram, LBR for pound\n\n* Note 1: You can indicate additional information in the [[name]] of the [[QuantitativeValue]] node.\n* Note 2: You may also link to a [[QualitativeValue]] node that provides additional information using [[valueReference]].\n* Note 3: Note that you can use [[minValue]] and [[maxValue]] to indicate ranges.
     */
    @JsonProperty("weightTotal")
    private QuantitativeValue weightTotal;
    /**
     * The amount of fuel consumed for traveling a particular distance or temporal duration with the given vehicle (e.g. liters per 100 km).\n\n* Note 1: There are unfortunately no standard unit codes for liters per 100 km.  Use [[unitText]] to indicate the unit of measurement, e.g. L/100 km.\n* Note 2: There are two ways of indicating the fuel consumption, [[fuelConsumption]] (e.g. 8 liters per 100 km) and [[fuelEfficiency]] (e.g. 30 miles per gallon). They are reciprocal.\n* Note 3: Often, the absolute value is useful only when related to driving speed ("at 80 km/h") or usage pattern ("city traffic"). You can use [[valueReference]] to link the value for the fuel consumption to another value.
     */
    @JsonProperty("fuelConsumption")
    private QuantitativeValue fuelConsumption;
    /**
     * The drive wheel configuration, i.e. which roadwheels will receive torque from the vehicle's engine via the drivetrain.
     */
    @JsonProperty("driveWheelConfiguration")
    private String driveWheelConfiguration;
    /**
     * The Vehicle Identification Number (VIN) is a unique serial number used by the automotive industry to identify individual motor vehicles.
     */
    @JsonProperty("vehicleIdentificationNumber")
    private String vehicleIdentificationNumber;
    /**
     * The date of production of the item, e.g. vehicle.
     */
    @JsonProperty("productionDate")
    private java.time.LocalDate productionDate;
    /**
     * The number or type of airbags in the vehicle.
     */
    @JsonProperty("numberOfAirbags")
    private String numberOfAirbags;
    /**
     * The number of persons that can be seated (e.g. in a vehicle), both in terms of the physical space available, and in terms of limitations set by law.\n\nTypical unit code(s): C62 for persons.
     */
    @JsonProperty("seatingCapacity")
    private Double seatingCapacity;
    /**
     * The release date of a vehicle model (often used to differentiate versions of the same make and model).
     */
    @JsonProperty("vehicleModelDate")
    private java.time.LocalDate vehicleModelDate;
    /**
     * A textual description of known damages, both repaired and unrepaired.
     */
    @JsonProperty("knownVehicleDamages")
    private String knownVehicleDamages;
    /**
     * Indicates whether the vehicle has been used for special purposes, like commercial rental, driving school, or as a taxi. The legislation in many countries requires this information to be revealed when offering a car for sale.
     */
    @JsonProperty("vehicleSpecialUsage")
    private String vehicleSpecialUsage;
    /**
     * The speed range of the vehicle. If the vehicle is powered by an engine, the upper limit of the speed range (indicated by [[maxValue]]) should be the maximum speed achievable under regular conditions.\n\nTypical unit code(s): KMH for km/h, HM for mile per hour (0.447 04 m/s), KNT for knot\n\n*Note 1: Use [[minValue]] and [[maxValue]] to indicate the range. Typically, the minimal value is zero.\n* Note 2: There are many different ways of measuring the speed range. You can link to information about how the given value has been determined using the [[valueReference]] property.
     */
    @JsonProperty("speed")
    private QuantitativeValue speed;
    /**
     * The date of the first registration of the vehicle with the respective public authorities.
     */
    @JsonProperty("dateVehicleFirstRegistered")
    private java.time.LocalDate dateVehicleFirstRegistered;
    /**
     * Information about the engine or engines of the vehicle.
     */
    @JsonProperty("vehicleEngine")
    private EngineSpecification vehicleEngine;
    /**
     * The permitted weight of a trailer attached to the vehicle.\n\nTypical unit code(s): KGM for kilogram, LBR for pound\n* Note 1: You can indicate additional information in the [[name]] of the [[QuantitativeValue]] node.\n* Note 2: You may also link to a [[QualitativeValue]] node that provides additional information using [[valueReference]].\n* Note 3: Note that you can use [[minValue]] and [[maxValue]] to indicate ranges.
     */
    @JsonProperty("trailerWeight")
    private QuantitativeValue trailerWeight;
    /**
     * A [callsign](https://en.wikipedia.org/wiki/Call_sign), as used in broadcasting and radio communications to identify people, radio and TV stations, or vehicles.
     */
    @JsonProperty("callSign")
    private String callSign;
    /**
     * The time needed to accelerate the vehicle from a given start velocity to a given target velocity.\n\nTypical unit code(s): SEC for seconds\n\n* Note: There are unfortunately no standard unit codes for seconds/0..100 km/h or seconds/0..60 mph. Simply use "SEC" for seconds and indicate the velocities in the [[name]] of the [[QuantitativeValue]], or use [[valueReference]] with a [[QuantitativeValue]] of 0..60 mph or 0..100 km/h to specify the reference speeds.
     */
    @JsonProperty("accelerationTime")
    private QuantitativeValue accelerationTime;
    /**
     * The number of doors.\n\nTypical unit code(s): C62.
     */
    @JsonProperty("numberOfDoors")
    private Double numberOfDoors;
    /**
     * The position of the steering wheel or similar device (mostly for cars).
     */
    @JsonProperty("steeringPosition")
    private SteeringPositionValue steeringPosition;
    /**
     * The total number of forward gears available for the transmission system of the vehicle.\n\nTypical unit code(s): C62.
     */
    @JsonProperty("numberOfForwardGears")
    private Double numberOfForwardGears;
    /**
     * The type or material of the interior of the vehicle (e.g. synthetic fabric, leather, wood, etc.). While most interior types are characterized by the material used, an interior type can also be based on vehicle usage or target audience.
     */
    @JsonProperty("vehicleInteriorType")
    private String vehicleInteriorType;
    /**
     * The distance between the centers of the front and rear wheels.\n\nTypical unit code(s): CMT for centimeters, MTR for meters, INH for inches, FOT for foot/feet.
     */
    @JsonProperty("wheelbase")
    private QuantitativeValue wheelbase;
    /**
     * The number of axles.\n\nTypical unit code(s): C62.
     */
    @JsonProperty("numberOfAxles")
    private Double numberOfAxles;
    /**
     * The number of passengers that can be seated in the vehicle, both in terms of the physical space available, and in terms of limitations set by law.\n\nTypical unit code(s): C62 for persons.
     */
    @JsonProperty("vehicleSeatingCapacity")
    private Double vehicleSeatingCapacity;
    /**
     * The permitted vertical load (TWR) of a trailer attached to the vehicle. Also referred to as Tongue Load Rating (TLR) or Vertical Load Rating (VLR).\n\nTypical unit code(s): KGM for kilogram, LBR for pound\n\n* Note 1: You can indicate additional information in the [[name]] of the [[QuantitativeValue]] node.\n* Note 2: You may also link to a [[QualitativeValue]] node that provides additional information using [[valueReference]].\n* Note 3: Note that you can use [[minValue]] and [[maxValue]] to indicate ranges.
     */
    @JsonProperty("tongueWeight")
    private QuantitativeValue tongueWeight;
    /**
     * The distance traveled per unit of fuel used; most commonly miles per gallon (mpg) or kilometers per liter (km/L).\n\n* Note 1: There are unfortunately no standard unit codes for miles per gallon or kilometers per liter. Use [[unitText]] to indicate the unit of measurement, e.g. mpg or km/L.\n* Note 2: There are two ways of indicating the fuel consumption, [[fuelConsumption]] (e.g. 8 liters per 100 km) and [[fuelEfficiency]] (e.g. 30 miles per gallon). They are reciprocal.\n* Note 3: Often, the absolute value is useful only when related to driving speed ("at 80 km/h") or usage pattern ("city traffic"). You can use [[valueReference]] to link the value for the fuel economy to another value.
     */
    @JsonProperty("fuelEfficiency")
    private QuantitativeValue fuelEfficiency;
    /**
     * The type of component used for transmitting the power from a rotating power source to the wheels or other relevant component(s) ("gearbox" for cars).
     */
    @JsonProperty("vehicleTransmission")
    private String vehicleTransmission;
    /**
     * The available volume for cargo or luggage. For automobiles, this is usually the trunk volume.\n\nTypical unit code(s): LTR for liters, FTQ for cubic foot/feet\n\nNote: You can use [[minValue]] and [[maxValue]] to indicate ranges.
     */
    @JsonProperty("cargoVolume")
    private QuantitativeValue cargoVolume;
    /**
     * The capacity of the fuel tank or in the case of electric cars, the battery. If there are multiple components for storage, this should indicate the total of all storage of the same type.\n\nTypical unit code(s): LTR for liters, GLL of US gallons, GLI for UK / imperial gallons, AMH for ampere-hours (for electrical vehicles).
     */
    @JsonProperty("fuelCapacity")
    private QuantitativeValue fuelCapacity;
    /**
     * Indicates the design and body style of the vehicle (e.g. station wagon, hatchback, etc.).
     */
    @JsonProperty("bodyType")
    private String bodyType;
    /**
     * A short text indicating the configuration of the vehicle, e.g. '5dr hatchback ST 2.5 MT 225 hp' or 'limited edition'.
     */
    @JsonProperty("vehicleConfiguration")
    private String vehicleConfiguration;
    /**
     * The color or color combination of the interior of the vehicle.
     */
    @JsonProperty("vehicleInteriorColor")
    private String vehicleInteriorColor;
    /**
     * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle.
     */
    @JsonProperty("fuelType")
    private String fuelType;
    /**
     * The date the item, e.g. vehicle, was purchased by the current owner.
     */
    @JsonProperty("purchaseDate")
    private java.time.LocalDate purchaseDate;
    /**
     * The CO2 emissions in g/km. When used in combination with a QuantitativeValue, put "g/km" into the unitText property of that value, since there is no UN/CEFACT Common Code for "g/km".
     */
    @JsonProperty("emissionsCO2")
    private Double emissionsCO2;
    /**
     * The permitted weight of passengers and cargo, EXCLUDING the weight of the empty vehicle.\n\nTypical unit code(s): KGM for kilogram, LBR for pound\n\n* Note 1: Many databases specify the permitted TOTAL weight instead, which is the sum of [[weight]] and [[payload]]\n* Note 2: You can indicate additional information in the [[name]] of the [[QuantitativeValue]] node.\n* Note 3: You may also link to a [[QualitativeValue]] node that provides additional information using [[valueReference]].\n* Note 4: Note that you can use [[minValue]] and [[maxValue]] to indicate ranges.
     */
    @JsonProperty("payload")
    private QuantitativeValue payload;
    /**
     * The total distance travelled by the particular vehicle since its initial production, as read from its odometer.\n\nTypical unit code(s): KMT for kilometers, SMI for statute miles.
     */
    @JsonProperty("mileageFromOdometer")
    private QuantitativeValue mileageFromOdometer;
    /**
     * The release date of a vehicle model (often used to differentiate versions of the same make and model).
     */
    @JsonProperty("modelDate")
    private java.time.LocalDate modelDate;

    public String getMeetsEmissionStandard() {
        return meetsEmissionStandard;
    }

    public void setMeetsEmissionStandard(String meetsEmissionStandard) {
        this.meetsEmissionStandard = meetsEmissionStandard;
    }

    public Double getNumberOfPreviousOwners() {
        return numberOfPreviousOwners;
    }

    public void setNumberOfPreviousOwners(Double numberOfPreviousOwners) {
        this.numberOfPreviousOwners = numberOfPreviousOwners;
    }

    public QuantitativeValue getWeightTotal() {
        return weightTotal;
    }

    public void setWeightTotal(QuantitativeValue weightTotal) {
        this.weightTotal = weightTotal;
    }

    public QuantitativeValue getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(QuantitativeValue fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String getDriveWheelConfiguration() {
        return driveWheelConfiguration;
    }

    public void setDriveWheelConfiguration(String driveWheelConfiguration) {
        this.driveWheelConfiguration = driveWheelConfiguration;
    }

    public String getVehicleIdentificationNumber() {
        return vehicleIdentificationNumber;
    }

    public void setVehicleIdentificationNumber(String vehicleIdentificationNumber) {
        this.vehicleIdentificationNumber = vehicleIdentificationNumber;
    }

    public java.time.LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(java.time.LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public String getNumberOfAirbags() {
        return numberOfAirbags;
    }

    public void setNumberOfAirbags(String numberOfAirbags) {
        this.numberOfAirbags = numberOfAirbags;
    }

    public Double getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(Double seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public java.time.LocalDate getVehicleModelDate() {
        return vehicleModelDate;
    }

    public void setVehicleModelDate(java.time.LocalDate vehicleModelDate) {
        this.vehicleModelDate = vehicleModelDate;
    }

    public String getKnownVehicleDamages() {
        return knownVehicleDamages;
    }

    public void setKnownVehicleDamages(String knownVehicleDamages) {
        this.knownVehicleDamages = knownVehicleDamages;
    }

    public String getVehicleSpecialUsage() {
        return vehicleSpecialUsage;
    }

    public void setVehicleSpecialUsage(String vehicleSpecialUsage) {
        this.vehicleSpecialUsage = vehicleSpecialUsage;
    }

    public QuantitativeValue getSpeed() {
        return speed;
    }

    public void setSpeed(QuantitativeValue speed) {
        this.speed = speed;
    }

    public java.time.LocalDate getDateVehicleFirstRegistered() {
        return dateVehicleFirstRegistered;
    }

    public void setDateVehicleFirstRegistered(java.time.LocalDate dateVehicleFirstRegistered) {
        this.dateVehicleFirstRegistered = dateVehicleFirstRegistered;
    }

    public EngineSpecification getVehicleEngine() {
        return vehicleEngine;
    }

    public void setVehicleEngine(EngineSpecification vehicleEngine) {
        this.vehicleEngine = vehicleEngine;
    }

    public QuantitativeValue getTrailerWeight() {
        return trailerWeight;
    }

    public void setTrailerWeight(QuantitativeValue trailerWeight) {
        this.trailerWeight = trailerWeight;
    }

    public String getCallSign() {
        return callSign;
    }

    public void setCallSign(String callSign) {
        this.callSign = callSign;
    }

    public QuantitativeValue getAccelerationTime() {
        return accelerationTime;
    }

    public void setAccelerationTime(QuantitativeValue accelerationTime) {
        this.accelerationTime = accelerationTime;
    }

    public Double getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(Double numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public SteeringPositionValue getSteeringPosition() {
        return steeringPosition;
    }

    public void setSteeringPosition(SteeringPositionValue steeringPosition) {
        this.steeringPosition = steeringPosition;
    }

    public Double getNumberOfForwardGears() {
        return numberOfForwardGears;
    }

    public void setNumberOfForwardGears(Double numberOfForwardGears) {
        this.numberOfForwardGears = numberOfForwardGears;
    }

    public String getVehicleInteriorType() {
        return vehicleInteriorType;
    }

    public void setVehicleInteriorType(String vehicleInteriorType) {
        this.vehicleInteriorType = vehicleInteriorType;
    }

    public QuantitativeValue getWheelbase() {
        return wheelbase;
    }

    public void setWheelbase(QuantitativeValue wheelbase) {
        this.wheelbase = wheelbase;
    }

    public Double getNumberOfAxles() {
        return numberOfAxles;
    }

    public void setNumberOfAxles(Double numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    public Double getVehicleSeatingCapacity() {
        return vehicleSeatingCapacity;
    }

    public void setVehicleSeatingCapacity(Double vehicleSeatingCapacity) {
        this.vehicleSeatingCapacity = vehicleSeatingCapacity;
    }

    public QuantitativeValue getTongueWeight() {
        return tongueWeight;
    }

    public void setTongueWeight(QuantitativeValue tongueWeight) {
        this.tongueWeight = tongueWeight;
    }

    public QuantitativeValue getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(QuantitativeValue fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public String getVehicleTransmission() {
        return vehicleTransmission;
    }

    public void setVehicleTransmission(String vehicleTransmission) {
        this.vehicleTransmission = vehicleTransmission;
    }

    public QuantitativeValue getCargoVolume() {
        return cargoVolume;
    }

    public void setCargoVolume(QuantitativeValue cargoVolume) {
        this.cargoVolume = cargoVolume;
    }

    public QuantitativeValue getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(QuantitativeValue fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getVehicleConfiguration() {
        return vehicleConfiguration;
    }

    public void setVehicleConfiguration(String vehicleConfiguration) {
        this.vehicleConfiguration = vehicleConfiguration;
    }

    public String getVehicleInteriorColor() {
        return vehicleInteriorColor;
    }

    public void setVehicleInteriorColor(String vehicleInteriorColor) {
        this.vehicleInteriorColor = vehicleInteriorColor;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public java.time.LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(java.time.LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Double getEmissionsCO2() {
        return emissionsCO2;
    }

    public void setEmissionsCO2(Double emissionsCO2) {
        this.emissionsCO2 = emissionsCO2;
    }

    public QuantitativeValue getPayload() {
        return payload;
    }

    public void setPayload(QuantitativeValue payload) {
        this.payload = payload;
    }

    public QuantitativeValue getMileageFromOdometer() {
        return mileageFromOdometer;
    }

    public void setMileageFromOdometer(QuantitativeValue mileageFromOdometer) {
        this.mileageFromOdometer = mileageFromOdometer;
    }

    public java.time.LocalDate getModelDate() {
        return modelDate;
    }

    public void setModelDate(java.time.LocalDate modelDate) {
        this.modelDate = modelDate;
    }
}
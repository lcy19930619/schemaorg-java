package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ServiceChannel extends Intangible {
    public ServiceChannel() {
    }

    /**
     * The service provided by this channel.
     */
    @JsonProperty("providesService")
    private Service providesService;
    /**
     * The phone number to use to access the service.
     */
    @JsonProperty("servicePhone")
    private AbstractSchema servicePhone;
    /**
     * The address for accessing the service by mail.
     */
    @JsonProperty("servicePostalAddress")
    private PostalAddress servicePostalAddress;
    /**
     * The number to access the service by text message.
     */
    @JsonProperty("serviceSmsNumber")
    private AbstractSchema serviceSmsNumber;
    /**
     * The website to access the service.
     */
    @JsonProperty("serviceUrl")
    private String serviceUrl;
    /**
     * The location (e.g. civic structure, local business, etc.) where a person can go to access the service.
     */
    @JsonProperty("serviceLocation")
    private Place serviceLocation;
    /**
     * A language someone may use with or at the item, service or place. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[inLanguage]].
     */
    @JsonProperty("availableLanguage")
    private String availableLanguage;
    /**
     * Estimated processing time for the service using this channel.
     */
    @JsonProperty("processingTime")
    private Duration processingTime;

    public Service getProvidesService() {
        return providesService;
    }

    public void setProvidesService(Service providesService) {
        this.providesService = providesService;
    }

    public AbstractSchema getServicePhone() {
        return servicePhone;
    }

    public void setServicePhone(AbstractSchema servicePhone) {
        this.servicePhone = servicePhone;
    }

    public PostalAddress getServicePostalAddress() {
        return servicePostalAddress;
    }

    public void setServicePostalAddress(PostalAddress servicePostalAddress) {
        this.servicePostalAddress = servicePostalAddress;
    }

    public AbstractSchema getServiceSmsNumber() {
        return serviceSmsNumber;
    }

    public void setServiceSmsNumber(AbstractSchema serviceSmsNumber) {
        this.serviceSmsNumber = serviceSmsNumber;
    }

    public String getServiceUrl() {
        return serviceUrl;
    }

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    public Place getServiceLocation() {
        return serviceLocation;
    }

    public void setServiceLocation(Place serviceLocation) {
        this.serviceLocation = serviceLocation;
    }

    public String getAvailableLanguage() {
        return availableLanguage;
    }

    public void setAvailableLanguage(String availableLanguage) {
        this.availableLanguage = availableLanguage;
    }

    public Duration getProcessingTime() {
        return processingTime;
    }

    public void setProcessingTime(Duration processingTime) {
        this.processingTime = processingTime;
    }
}
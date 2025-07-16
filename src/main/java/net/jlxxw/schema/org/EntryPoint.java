package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class EntryPoint extends Intangible {
    {
        setId("schema:EntryPoint");
        setType("rdfs:Class");

    }

    /**
     * An application that can complete the request.
     */
    @JsonProperty("application")
    private SoftwareApplication application;
    /**
     * The high level platform(s) where the Action can be performed for the given URL. To specify a specific application or operating system instance, use actionApplication.
     */
    @JsonProperty("actionPlatform")
    private String actionPlatform;
    /**
     * The supported content type(s) for an EntryPoint response.
     */
    @JsonProperty("contentType")
    private String contentType;
    /**
     * An application that can complete the request.
     */
    @JsonProperty("actionApplication")
    private SoftwareApplication actionApplication;
    /**
     * An url template (RFC6570) that will be used to construct the target of the execution of the action.
     */
    @JsonProperty("urlTemplate")
    private String urlTemplate;
    /**
     * An HTTP method that specifies the appropriate HTTP method for a request to an HTTP EntryPoint. Values are capitalized strings as used in HTTP.
     */
    @JsonProperty("httpMethod")
    private String httpMethod;
    /**
     * The supported encoding type(s) for an EntryPoint request.
     */
    @JsonProperty("encodingType")
    private String encodingType;

    public SoftwareApplication getApplication() {
        return application;
    }

    public void setApplication(SoftwareApplication application) {
        this.application = application;
    }

    public String getActionPlatform() {
        return actionPlatform;
    }

    public void setActionPlatform(String actionPlatform) {
        this.actionPlatform = actionPlatform;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public SoftwareApplication getActionApplication() {
        return actionApplication;
    }

    public void setActionApplication(SoftwareApplication actionApplication) {
        this.actionApplication = actionApplication;
    }

    public String getUrlTemplate() {
        return urlTemplate;
    }

    public void setUrlTemplate(String urlTemplate) {
        this.urlTemplate = urlTemplate;
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public String getEncodingType() {
        return encodingType;
    }

    public void setEncodingType(String encodingType) {
        this.encodingType = encodingType;
    }
}
package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SoftwareApplication extends CreativeWork {
    public SoftwareApplication() {
    }

    /**
     * Processor architecture required to run the application (e.g. IA64).
     */
    @JsonProperty("processorRequirements")
    private String processorRequirements;
    /**
     * Component dependency requirements for application. This includes runtime environments and shared libraries that are not included in the application distribution package, but required to run the application (examples: DirectX, Java or .NET runtime).
     */
    @JsonProperty("softwareRequirements")
    private String softwareRequirements;
    /**
     * Features or modules provided by this application (and possibly required by other applications).
     */
    @JsonProperty("featureList")
    private String featureList;
    /**
     * Type of software application, e.g. 'Game, Multimedia'.
     */
    @JsonProperty("applicationCategory")
    private String applicationCategory;
    /**
     * Additional content for a software application.
     */
    @JsonProperty("softwareAddOn")
    private SoftwareApplication softwareAddOn;
    /**
     * The name of the application suite to which the application belongs (e.g. Excel belongs to Office).
     */
    @JsonProperty("applicationSuite")
    private String applicationSuite;
    /**
     * A link to a screenshot image of the app.
     */
    @JsonProperty("screenshot")
    private String screenshot;
    /**
     * Device required to run the application. Used in cases where a specific make/model is required to run the application.
     */
    @JsonProperty("availableOnDevice")
    private String availableOnDevice;
    /**
     * Software application help.
     */
    @JsonProperty("softwareHelp")
    private CreativeWork softwareHelp;
    /**
     * Storage requirements (free space required).
     */
    @JsonProperty("storageRequirements")
    private String storageRequirements;
    /**
     * Countries for which the application is not supported. You can also provide the two-letter ISO 3166-1 alpha-2 country code.
     */
    @JsonProperty("countriesNotSupported")
    private String countriesNotSupported;
    /**
     * Minimum memory requirements.
     */
    @JsonProperty("memoryRequirements")
    private String memoryRequirements;
    /**
     * Device required to run the application. Used in cases where a specific make/model is required to run the application.
     */
    @JsonProperty("device")
    private String device;
    /**
     * Subcategory of the application, e.g. 'Arcade Game'.
     */
    @JsonProperty("applicationSubCategory")
    private String applicationSubCategory;
    /**
     * Component dependency requirements for application. This includes runtime environments and shared libraries that are not included in the application distribution package, but required to run the application (examples: DirectX, Java or .NET runtime).
     */
    @JsonProperty("requirements")
    private String requirements;
    /**
     * Version of the software instance.
     */
    @JsonProperty("softwareVersion")
    private String softwareVersion;
    /**
     * Countries for which the application is supported. You can also provide the two-letter ISO 3166-1 alpha-2 country code.
     */
    @JsonProperty("countriesSupported")
    private String countriesSupported;
    /**
     * URL at which the app may be installed, if different from the URL of the item.
     */
    @JsonProperty("installUrl")
    private String installUrl;
    /**
     * Operating systems supported (Windows 7, OS X 10.6, Android 1.6).
     */
    @JsonProperty("operatingSystem")
    private String operatingSystem;
    /**
     * Description of what changed in this version.
     */
    @JsonProperty("releaseNotes")
    private String releaseNotes;
    /**
     * Size of the application / package (e.g. 18MB). In the absence of a unit (MB, KB etc.), KB will be assumed.
     */
    @JsonProperty("fileSize")
    private String fileSize;
    /**
     * If the file can be downloaded, URL to download the binary.
     */
    @JsonProperty("downloadUrl")
    private String downloadUrl;
    /**
     * Supporting data for a SoftwareApplication.
     */
    @JsonProperty("supportingData")
    private DataFeed supportingData;
    /**
     * Permission(s) required to run the app (for example, a mobile app may require full internet access or may run only on wifi).
     */
    @JsonProperty("permissions")
    private String permissions;

    public String getProcessorRequirements() {
        return processorRequirements;
    }

    public void setProcessorRequirements(String processorRequirements) {
        this.processorRequirements = processorRequirements;
    }

    public String getSoftwareRequirements() {
        return softwareRequirements;
    }

    public void setSoftwareRequirements(String softwareRequirements) {
        this.softwareRequirements = softwareRequirements;
    }

    public String getFeatureList() {
        return featureList;
    }

    public void setFeatureList(String featureList) {
        this.featureList = featureList;
    }

    public String getApplicationCategory() {
        return applicationCategory;
    }

    public void setApplicationCategory(String applicationCategory) {
        this.applicationCategory = applicationCategory;
    }

    public SoftwareApplication getSoftwareAddOn() {
        return softwareAddOn;
    }

    public void setSoftwareAddOn(SoftwareApplication softwareAddOn) {
        this.softwareAddOn = softwareAddOn;
    }

    public String getApplicationSuite() {
        return applicationSuite;
    }

    public void setApplicationSuite(String applicationSuite) {
        this.applicationSuite = applicationSuite;
    }

    public String getScreenshot() {
        return screenshot;
    }

    public void setScreenshot(String screenshot) {
        this.screenshot = screenshot;
    }

    public String getAvailableOnDevice() {
        return availableOnDevice;
    }

    public void setAvailableOnDevice(String availableOnDevice) {
        this.availableOnDevice = availableOnDevice;
    }

    public CreativeWork getSoftwareHelp() {
        return softwareHelp;
    }

    public void setSoftwareHelp(CreativeWork softwareHelp) {
        this.softwareHelp = softwareHelp;
    }

    public String getStorageRequirements() {
        return storageRequirements;
    }

    public void setStorageRequirements(String storageRequirements) {
        this.storageRequirements = storageRequirements;
    }

    public String getCountriesNotSupported() {
        return countriesNotSupported;
    }

    public void setCountriesNotSupported(String countriesNotSupported) {
        this.countriesNotSupported = countriesNotSupported;
    }

    public String getMemoryRequirements() {
        return memoryRequirements;
    }

    public void setMemoryRequirements(String memoryRequirements) {
        this.memoryRequirements = memoryRequirements;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getApplicationSubCategory() {
        return applicationSubCategory;
    }

    public void setApplicationSubCategory(String applicationSubCategory) {
        this.applicationSubCategory = applicationSubCategory;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public String getCountriesSupported() {
        return countriesSupported;
    }

    public void setCountriesSupported(String countriesSupported) {
        this.countriesSupported = countriesSupported;
    }

    public String getInstallUrl() {
        return installUrl;
    }

    public void setInstallUrl(String installUrl) {
        this.installUrl = installUrl;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getReleaseNotes() {
        return releaseNotes;
    }

    public void setReleaseNotes(String releaseNotes) {
        this.releaseNotes = releaseNotes;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public DataFeed getSupportingData() {
        return supportingData;
    }

    public void setSupportingData(DataFeed supportingData) {
        this.supportingData = supportingData;
    }

    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }
}
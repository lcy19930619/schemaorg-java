package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class APIReference extends TechArticle {
    public APIReference() {
    }

    /**
     * Library file name, e.g., mscorlib.dll, system.web.dll.
     */
    @JsonProperty("assembly")
    private String assembly;
    /**
     * Indicates whether API is managed or unmanaged.
     */
    @JsonProperty("programmingModel")
    private String programmingModel;
    /**
     * Library file name, e.g., mscorlib.dll, system.web.dll.
     */
    @JsonProperty("executableLibraryName")
    private String executableLibraryName;
    /**
     * Type of app development: phone, Metro style, desktop, XBox, etc.
     */
    @JsonProperty("targetPlatform")
    private String targetPlatform;
    /**
     * Associated product/technology version. E.g., .NET Framework 4.5.
     */
    @JsonProperty("assemblyVersion")
    private String assemblyVersion;

    public String getAssembly() {
        return assembly;
    }

    public void setAssembly(String assembly) {
        this.assembly = assembly;
    }

    public String getProgrammingModel() {
        return programmingModel;
    }

    public void setProgrammingModel(String programmingModel) {
        this.programmingModel = programmingModel;
    }

    public String getExecutableLibraryName() {
        return executableLibraryName;
    }

    public void setExecutableLibraryName(String executableLibraryName) {
        this.executableLibraryName = executableLibraryName;
    }

    public String getTargetPlatform() {
        return targetPlatform;
    }

    public void setTargetPlatform(String targetPlatform) {
        this.targetPlatform = targetPlatform;
    }

    public String getAssemblyVersion() {
        return assemblyVersion;
    }

    public void setAssemblyVersion(String assemblyVersion) {
        this.assemblyVersion = assemblyVersion;
    }
}
package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SoftwareSourceCode extends CreativeWork {
    public SoftwareSourceCode() {
    }

    /**
     * Link to the repository where the un-compiled, human readable code and related code is located (SVN, GitHub, CodePlex).
     */
    @JsonProperty("codeRepository")
    private String codeRepository;
    /**
     * Runtime platform or script interpreter dependencies (example: Java v1, Python 2.3, .NET Framework 3.0).
     */
    @JsonProperty("runtime")
    private String runtime;
    /**
     * Target Operating System / Product to which the code applies.  If applies to several versions, just the product name can be used.
     */
    @JsonProperty("targetProduct")
    private SoftwareApplication targetProduct;
    /**
     * What type of code sample: full (compile ready) solution, code snippet, inline code, scripts, template.
     */
    @JsonProperty("sampleType")
    private String sampleType;
    /**
     * Runtime platform or script interpreter dependencies (example: Java v1, Python 2.3, .NET Framework 3.0).
     */
    @JsonProperty("runtimePlatform")
    private String runtimePlatform;
    /**
     * What type of code sample: full (compile ready) solution, code snippet, inline code, scripts, template.
     */
    @JsonProperty("codeSampleType")
    private String codeSampleType;
    /**
     * The computer programming language.
     */
    @JsonProperty("programmingLanguage")
    private String programmingLanguage;

    public String getCodeRepository() {
        return codeRepository;
    }

    public void setCodeRepository(String codeRepository) {
        this.codeRepository = codeRepository;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public SoftwareApplication getTargetProduct() {
        return targetProduct;
    }

    public void setTargetProduct(SoftwareApplication targetProduct) {
        this.targetProduct = targetProduct;
    }

    public String getSampleType() {
        return sampleType;
    }

    public void setSampleType(String sampleType) {
        this.sampleType = sampleType;
    }

    public String getRuntimePlatform() {
        return runtimePlatform;
    }

    public void setRuntimePlatform(String runtimePlatform) {
        this.runtimePlatform = runtimePlatform;
    }

    public String getCodeSampleType() {
        return codeSampleType;
    }

    public void setCodeSampleType(String codeSampleType) {
        this.codeSampleType = codeSampleType;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}
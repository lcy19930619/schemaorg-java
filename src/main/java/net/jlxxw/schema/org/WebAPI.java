package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class WebAPI extends Service {
    {
        setId("schema:WebAPI");
        setType("rdfs:Class");

    }

    /**
     * Further documentation describing the Web API in more detail.
     */
    @JsonProperty("documentation")
    private String documentation;

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }
}
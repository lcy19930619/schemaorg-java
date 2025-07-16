package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class Chapter extends CreativeWork {
    {
        setId("schema:Chapter");
        setType("rdfs:Class");

    }

    /**
     * Any description of pages that is not separated into pageStart and pageEnd; for example, "1-6, 9, 55" or "10-12, 46-49".
     */
    @JsonProperty("pagination")
    private String pagination;
    /**
     * The page on which the work ends; for example "138" or "xvi".
     */
    @JsonProperty("pageEnd")
    private String pageEnd;
    /**
     * The page on which the work starts; for example "135" or "xiii".
     */
    @JsonProperty("pageStart")
    private String pageStart;

    public String getPagination() {
        return pagination;
    }

    public void setPagination(String pagination) {
        this.pagination = pagination;
    }

    public String getPageEnd() {
        return pageEnd;
    }

    public void setPageEnd(String pageEnd) {
        this.pageEnd = pageEnd;
    }

    public String getPageStart() {
        return pageStart;
    }

    public void setPageStart(String pageStart) {
        this.pageStart = pageStart;
    }
}
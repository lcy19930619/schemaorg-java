package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NewsArticle extends Article {
    public NewsArticle() {
    }

    /**
     * The number of the column in which the NewsArticle appears in the print edition.
     */
    @JsonProperty("printColumn")
    private String printColumn;
    /**
     * The edition of the print product in which the NewsArticle appears.
     */
    @JsonProperty("printEdition")
    private String printEdition;
    /**
     * If this NewsArticle appears in print, this field indicates the name of the page on which the article is found. Please note that this field is intended for the exact page name (e.g. A5, B18).
     */
    @JsonProperty("printPage")
    private String printPage;
    /**
     * If this NewsArticle appears in print, this field indicates the print section in which the article appeared.
     */
    @JsonProperty("printSection")
    private String printSection;
    /**
     * A [dateline](https://en.wikipedia.org/wiki/Dateline) is a brief piece of text included in news articles that describes where and when the story was written or filed though the date is often omitted. Sometimes only a placename is provided.
     * <p>
     * Structured representations of dateline-related information can also be expressed more explicitly using [[locationCreated]] (which represents where a work was created, e.g. where a news report was written).  For location depicted or described in the content, use [[contentLocation]].
     * <p>
     * Dateline summaries are oriented more towards human readers than towards automated processing, and can vary substantially. Some examples: "BEIRUT, Lebanon, June 2.", "Paris, France", "December 19, 2017 11:43AM Reporting from Washington", "Beijing/Moscow", "QUEZON CITY, Philippines".
     */
    @JsonProperty("dateline")
    private String dateline;

    public String getPrintColumn() {
        return printColumn;
    }

    public void setPrintColumn(String printColumn) {
        this.printColumn = printColumn;
    }

    public String getPrintEdition() {
        return printEdition;
    }

    public void setPrintEdition(String printEdition) {
        this.printEdition = printEdition;
    }

    public String getPrintPage() {
        return printPage;
    }

    public void setPrintPage(String printPage) {
        this.printPage = printPage;
    }

    public String getPrintSection() {
        return printSection;
    }

    public void setPrintSection(String printSection) {
        this.printSection = printSection;
    }

    public String getDateline() {
        return dateline;
    }

    public void setDateline(String dateline) {
        this.dateline = dateline;
    }
}
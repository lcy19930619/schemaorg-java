package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class Article extends CreativeWork {
    public Article() {
}
    /** The number of words in the text of the CreativeWork such as an Article, Book, etc. */
    @JsonProperty("wordCount")
    private Integer wordCount;
    /** Any description of pages that is not separated into pageStart and pageEnd; for example, "1-6, 9, 55" or "10-12, 46-49". */
    @JsonProperty("pagination")
    private String pagination;
    /** The page on which the work ends; for example "138" or "xvi". */
    @JsonProperty("pageEnd")
    private String pageEnd;
    /** For an [[Article]], typically a [[NewsArticle]], the backstory property provides a textual summary giving a brief explanation of why and how an article was created. In a journalistic setting this could include information about reporting process, methods, interviews, data sources, etc. */
    @JsonProperty("backstory")
    private String backstory;
    /** The actual body of the article. */
    @JsonProperty("articleBody")
    private String articleBody;
    /** The page on which the work starts; for example "135" or "xiii". */
    @JsonProperty("pageStart")
    private String pageStart;
    /** Articles may belong to one or more 'sections' in a magazine or newspaper, such as Sports, Lifestyle, etc. */
    @JsonProperty("articleSection")
    private String articleSection;
    /** Indicates sections of a Web page that are particularly 'speakable' in the sense of being highlighted as being especially appropriate for text-to-speech conversion. Other sections of a page may also be usefully spoken in particular circumstances; the 'speakable' property serves to indicate the parts most likely to be generally useful for speech.

The *speakable* property can be repeated an arbitrary number of times, with three kinds of possible 'content-locator' values:

1.) *id-value* URL references - uses *id-value* of an element in the page being annotated. The simplest use of *speakable* has (potentially relative) URL values, referencing identified sections of the document concerned.

2.) CSS Selectors - addresses content in the annotated page, e.g. via class attribute. Use the [[cssSelector]] property.

3.)  XPaths - addresses content via XPaths (assuming an XML view of the content). Use the [[xpath]] property.

For more sophisticated markup of speakable sections beyond simple ID references, either CSS selectors or XPath expressions to pick out document section(s) as speakable. For this
we define a supporting type, [[SpeakableSpecification]]  which is defined to be a possible value of the *speakable* property.
          */
    @JsonProperty("speakable")
    private String speakable;

    public Integer getWordCount() { return wordCount; }
    public void setWordCount(Integer wordCount) { this.wordCount = wordCount; }
    public String getPagination() { return pagination; }
    public void setPagination(String pagination) { this.pagination = pagination; }
    public String getPageEnd() { return pageEnd; }
    public void setPageEnd(String pageEnd) { this.pageEnd = pageEnd; }
    public String getBackstory() { return backstory; }
    public void setBackstory(String backstory) { this.backstory = backstory; }
    public String getArticleBody() { return articleBody; }
    public void setArticleBody(String articleBody) { this.articleBody = articleBody; }
    public String getPageStart() { return pageStart; }
    public void setPageStart(String pageStart) { this.pageStart = pageStart; }
    public String getArticleSection() { return articleSection; }
    public void setArticleSection(String articleSection) { this.articleSection = articleSection; }
    public String getSpeakable() { return speakable; }
    public void setSpeakable(String speakable) { this.speakable = speakable; }
}
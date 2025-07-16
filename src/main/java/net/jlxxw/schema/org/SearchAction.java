package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class SearchAction extends Action {
    public SearchAction() {
}
    /** A sub property of instrument. The query used on this action. */
    @JsonProperty("query")
    private String query;

    public String getQuery() { return query; }
    public void setQuery(String query) { this.query = query; }
}
package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import net.jlxxw.schema.org.JsonLdType;
public class Answer extends Comment {
    public Answer() {
}
    /** The parent of a question, answer or item in general. Typically used for Q/A discussion threads e.g. a chain of comments with the first comment being an [[Article]] or other [[CreativeWork]]. See also [[comment]] which points from something to a comment about it. */
    @JsonProperty("parentItem")
    private List<AbstractSchema> parentItem;
    /** A step-by-step or full explanation about Answer. Can outline how this Answer was achieved or contain more broad clarification or statement about it.  */
    @JsonProperty("answerExplanation")
    private List<AbstractSchema> answerExplanation;

    public List<AbstractSchema> getParentItem() { return parentItem; }
    public void setParentItem(List<AbstractSchema> parentItem) { this.parentItem = parentItem; }
    public List<AbstractSchema> getAnswerExplanation() { return answerExplanation; }
    public void setAnswerExplanation(List<AbstractSchema> answerExplanation) { this.answerExplanation = answerExplanation; }
}
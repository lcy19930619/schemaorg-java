package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import net.jlxxw.schema.org.JsonLdType;
public class Question extends Comment {
    public Question() {
}
    /** The number of answers this question has received. */
    @JsonProperty("answerCount")
    private Integer answerCount;
    /** The parent of a question, answer or item in general. Typically used for Q/A discussion threads e.g. a chain of comments with the first comment being an [[Article]] or other [[CreativeWork]]. See also [[comment]] which points from something to a comment about it. */
    @JsonProperty("parentItem")
    private List<AbstractSchema> parentItem;
    /** The answer(s) that has been accepted as best, typically on a Question/Answer site. Sites vary in their selection mechanisms, e.g. drawing on community opinion and/or the view of the Question author. */
    @JsonProperty("acceptedAnswer")
    private List<AbstractSchema> acceptedAnswer;
    /** For questions that are part of learning resources (e.g. Quiz), eduQuestionType indicates the format of question being given. Example: "Multiple choice", "Open ended", "Flashcard". */
    @JsonProperty("eduQuestionType")
    private String eduQuestionType;
    /** An answer (possibly one of several, possibly incorrect) to a Question, e.g. on a Question/Answer site. */
    @JsonProperty("suggestedAnswer")
    private List<AbstractSchema> suggestedAnswer;

    public Integer getAnswerCount() { return answerCount; }
    public void setAnswerCount(Integer answerCount) { this.answerCount = answerCount; }
    public List<AbstractSchema> getParentItem() { return parentItem; }
    public void setParentItem(List<AbstractSchema> parentItem) { this.parentItem = parentItem; }
    public List<AbstractSchema> getAcceptedAnswer() { return acceptedAnswer; }
    public void setAcceptedAnswer(List<AbstractSchema> acceptedAnswer) { this.acceptedAnswer = acceptedAnswer; }
    public String getEduQuestionType() { return eduQuestionType; }
    public void setEduQuestionType(String eduQuestionType) { this.eduQuestionType = eduQuestionType; }
    public List<AbstractSchema> getSuggestedAnswer() { return suggestedAnswer; }
    public void setSuggestedAnswer(List<AbstractSchema> suggestedAnswer) { this.suggestedAnswer = suggestedAnswer; }
}
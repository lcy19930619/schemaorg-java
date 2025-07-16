package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class SolveMathAction extends Action {
    public SolveMathAction() {
}
    /** For questions that are part of learning resources (e.g. Quiz), eduQuestionType indicates the format of question being given. Example: "Multiple choice", "Open ended", "Flashcard". */
    @JsonProperty("eduQuestionType")
    private String eduQuestionType;

    public String getEduQuestionType() { return eduQuestionType; }
    public void setEduQuestionType(String eduQuestionType) { this.eduQuestionType = eduQuestionType; }
}
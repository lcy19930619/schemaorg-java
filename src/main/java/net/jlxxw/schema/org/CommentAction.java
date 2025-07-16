package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class CommentAction extends CommunicateAction {
    public CommentAction() {
}
    /** A sub property of result. The Comment created or sent as a result of this action. */
    @JsonProperty("resultComment")
    private Comment resultComment;

    public Comment getResultComment() { return resultComment; }
    public void setResultComment(Comment resultComment) { this.resultComment = resultComment; }
}
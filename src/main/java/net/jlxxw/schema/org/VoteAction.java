package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class VoteAction extends ChooseAction {
    public VoteAction() {
}
    /** A sub property of object. The candidate subject of this action. */
    @JsonProperty("candidate")
    private Person candidate;

    public Person getCandidate() { return candidate; }
    public void setCandidate(Person candidate) { this.candidate = candidate; }
}
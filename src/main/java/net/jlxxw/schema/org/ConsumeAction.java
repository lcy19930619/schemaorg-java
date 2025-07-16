package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class ConsumeAction extends Action {
    public ConsumeAction() {
}
    /** An Offer which must be accepted before the user can perform the Action. For example, the user may need to buy a movie before being able to watch it. */
    @JsonProperty("expectsAcceptanceOf")
    private Offer expectsAcceptanceOf;
    /** A set of requirements that must be fulfilled in order to perform an Action. If more than one value is specified, fulfilling one set of requirements will allow the Action to be performed. */
    @JsonProperty("actionAccessibilityRequirement")
    private ActionAccessSpecification actionAccessibilityRequirement;

    public Offer getExpectsAcceptanceOf() { return expectsAcceptanceOf; }
    public void setExpectsAcceptanceOf(Offer expectsAcceptanceOf) { this.expectsAcceptanceOf = expectsAcceptanceOf; }
    public ActionAccessSpecification getActionAccessibilityRequirement() { return actionAccessibilityRequirement; }
    public void setActionAccessibilityRequirement(ActionAccessSpecification actionAccessibilityRequirement) { this.actionAccessibilityRequirement = actionAccessibilityRequirement; }
}
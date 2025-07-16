package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChooseAction extends AssessAction {
    public ChooseAction() {
    }

    /**
     * A sub property of object. The options subject to this action.
     */
    @JsonProperty("option")
    private String option;
    /**
     * A sub property of object. The options subject to this action.
     */
    @JsonProperty("actionOption")
    private String actionOption;

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getActionOption() {
        return actionOption;
    }

    public void setActionOption(String actionOption) {
        this.actionOption = actionOption;
    }
}
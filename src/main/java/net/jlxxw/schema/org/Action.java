package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Action extends AbstractSchema {
    public Action() {
    }

    /**
     * Indicates a target EntryPoint, or url, for an Action.
     */
    @JsonProperty("target")
    private String target;
    /**
     * The result produced in the action. E.g. John wrote *a book*.
     */
    @JsonProperty("result")
    private Thing result;
    /**
     * Other co-agents that participated in the action indirectly. E.g. John wrote a book with *Steve*.
     */
    @JsonProperty("participant")
    private List<AbstractSchema> participant;
    /**
     * The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. E.g. John wrote a book from *January* to December. For media, including audio and video, it's the time offset of the start of a clip within a larger file.\n\nNote that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     */
    @JsonProperty("startTime")
    private java.time.LocalDateTime startTime;
    /**
     * For failed actions, more information on the cause of the failure.
     */
    @JsonProperty("error")
    private Thing error;
    /**
     * The location of, for example, where an event is happening, where an organization is located, or where an action takes place.
     */
    @JsonProperty("location")
    private String location;
    /**
     * The direct performer or driver of the action (animate or inanimate). E.g. *John* wrote a book.
     */
    @JsonProperty("agent")
    private List<AbstractSchema> agent;
    /**
     * The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. E.g. John wrote a book from January to *December*. For media, including audio and video, it's the time offset of the end of a clip within a larger file.\n\nNote that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     */
    @JsonProperty("endTime")
    private java.time.LocalDateTime endTime;
    /**
     * The object upon which the action is carried out, whose state is kept intact or changed. Also known as the semantic roles patient, affected or undergoer (which change their state) or theme (which doesn't). E.g. John read *a book*.
     */
    @JsonProperty("object")
    private Thing object;
    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @JsonProperty("provider")
    private List<AbstractSchema> provider;
    /**
     * Indicates the current disposition of the Action.
     */
    @JsonProperty("actionStatus")
    private ActionStatusType actionStatus;
    /**
     * The object that helped the agent perform the action. E.g. John wrote a book with *a pen*.
     */
    @JsonProperty("instrument")
    private Thing instrument;
    /**
     * Description of the process by which the action was performed.
     */
    @JsonProperty("actionProcess")
    private HowTo actionProcess;

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Thing getResult() {
        return result;
    }

    public void setResult(Thing result) {
        this.result = result;
    }

    public List<AbstractSchema> getParticipant() {
        return participant;
    }

    public void setParticipant(List<AbstractSchema> participant) {
        this.participant = participant;
    }

    public java.time.LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(java.time.LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public Thing getError() {
        return error;
    }

    public void setError(Thing error) {
        this.error = error;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<AbstractSchema> getAgent() {
        return agent;
    }

    public void setAgent(List<AbstractSchema> agent) {
        this.agent = agent;
    }

    public java.time.LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(java.time.LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Thing getObject() {
        return object;
    }

    public void setObject(Thing object) {
        this.object = object;
    }

    public List<AbstractSchema> getProvider() {
        return provider;
    }

    public void setProvider(List<AbstractSchema> provider) {
        this.provider = provider;
    }

    public ActionStatusType getActionStatus() {
        return actionStatus;
    }

    public void setActionStatus(ActionStatusType actionStatus) {
        this.actionStatus = actionStatus;
    }

    public Thing getInstrument() {
        return instrument;
    }

    public void setInstrument(Thing instrument) {
        this.instrument = instrument;
    }

    public HowTo getActionProcess() {
        return actionProcess;
    }

    public void setActionProcess(HowTo actionProcess) {
        this.actionProcess = actionProcess;
    }
}
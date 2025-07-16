package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import net.jlxxw.schema.org.JsonLdType;
public class MedicalStudy extends MedicalEntity {
    public MedicalStudy() {
}
    /** A person or organization that supports a thing through a pledge, promise, or financial contribution. E.g. a sponsor of a Medical Study or a corporate sponsor of an event. */
    @JsonProperty("sponsor")
    private List<AbstractSchema> sponsor;
    /** The status of the study (enumerated). */
    @JsonProperty("status")
    private String status;
    /** The location in which the study is taking/took place. */
    @JsonProperty("studyLocation")
    private AdministrativeArea studyLocation;
    /** Specifying the health condition(s) of a patient, medical study, or other target audience. */
    @JsonProperty("healthCondition")
    private MedicalCondition healthCondition;
    /** A subject of the study, i.e. one of the medical conditions, therapies, devices, drugs, etc. investigated by the study. */
    @JsonProperty("studySubject")
    private MedicalEntity studySubject;

    public List<AbstractSchema> getSponsor() { return sponsor; }
    public void setSponsor(List<AbstractSchema> sponsor) { this.sponsor = sponsor; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public AdministrativeArea getStudyLocation() { return studyLocation; }
    public void setStudyLocation(AdministrativeArea studyLocation) { this.studyLocation = studyLocation; }
    public MedicalCondition getHealthCondition() { return healthCondition; }
    public void setHealthCondition(MedicalCondition healthCondition) { this.healthCondition = healthCondition; }
    public MedicalEntity getStudySubject() { return studySubject; }
    public void setStudySubject(MedicalEntity studySubject) { this.studySubject = studySubject; }
}
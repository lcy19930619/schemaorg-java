package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;


public class MedicalProcedure extends MedicalEntity {
    {
        setId("schema:MedicalProcedure");
        setType("rdfs:Class");

    }

    /**
     * The type of procedure, for example Surgical, Noninvasive, or Percutaneous.
     */
    @JsonProperty("procedureType")
    private MedicalProcedureType procedureType;
    /**
     * Typical or recommended followup care after the procedure is performed.
     */
    @JsonProperty("followup")
    private String followup;
    /**
     * Location in the body of the anatomical structure.
     */
    @JsonProperty("bodyLocation")
    private String bodyLocation;
    /**
     * How the procedure is performed.
     */
    @JsonProperty("howPerformed")
    private String howPerformed;
    /**
     * The status of the study (enumerated).
     */
    @JsonProperty("status")
    private String status;
    /**
     * Typical preparation that a patient must undergo before having the procedure performed.
     */
    @JsonProperty("preparation")
    private String preparation;

    public MedicalProcedureType getProcedureType() {
        return procedureType;
    }

    public void setProcedureType(MedicalProcedureType procedureType) {
        this.procedureType = procedureType;
    }

    public String getFollowup() {
        return followup;
    }

    public void setFollowup(String followup) {
        this.followup = followup;
    }

    public String getBodyLocation() {
        return bodyLocation;
    }

    public void setBodyLocation(String bodyLocation) {
        this.bodyLocation = bodyLocation;
    }

    public String getHowPerformed() {
        return howPerformed;
    }

    public void setHowPerformed(String howPerformed) {
        this.howPerformed = howPerformed;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }
}
package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class Muscle extends AnatomicalStructure {
    public Muscle() {
}
    /** The blood vessel that carries blood from the heart to the muscle. */
    @JsonProperty("bloodSupply")
    private Vessel bloodSupply;
    /** The place of attachment of a muscle, or what the muscle moves. */
    @JsonProperty("insertion")
    private AnatomicalStructure insertion;
    /** The movement the muscle generates. */
    @JsonProperty("muscleAction")
    private String muscleAction;
    /** The muscle whose action counteracts the specified muscle. */
    @JsonProperty("antagonist")
    private Muscle antagonist;

    public Vessel getBloodSupply() { return bloodSupply; }
    public void setBloodSupply(Vessel bloodSupply) { this.bloodSupply = bloodSupply; }
    public AnatomicalStructure getInsertion() { return insertion; }
    public void setInsertion(AnatomicalStructure insertion) { this.insertion = insertion; }
    public String getMuscleAction() { return muscleAction; }
    public void setMuscleAction(String muscleAction) { this.muscleAction = muscleAction; }
    public Muscle getAntagonist() { return antagonist; }
    public void setAntagonist(Muscle antagonist) { this.antagonist = antagonist; }
}
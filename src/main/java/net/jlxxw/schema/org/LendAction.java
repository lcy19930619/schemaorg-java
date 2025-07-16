package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class LendAction extends TransferAction {
    public LendAction() {
}
    /** A sub property of participant. The person that borrows the object being lent. */
    @JsonProperty("borrower")
    private Person borrower;

    public Person getBorrower() { return borrower; }
    public void setBorrower(Person borrower) { this.borrower = borrower; }
}
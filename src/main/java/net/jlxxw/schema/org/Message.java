package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
import java.util.List;
import net.jlxxw.schema.org.JsonLdType;
public class Message extends CreativeWork {
    public Message() {
}
    /** A sub property of recipient. The recipient copied on a message. */
    @JsonProperty("ccRecipient")
    private List<AbstractSchema> ccRecipient;
    /** A sub property of recipient. The recipient who was directly sent the message. */
    @JsonProperty("toRecipient")
    private List<AbstractSchema> toRecipient;
    /** The date/time at which the message has been read by the recipient if a single recipient exists. */
    @JsonProperty("dateRead")
    private java.time.LocalDateTime dateRead;
    /** A sub property of participant. The participant who is at the sending end of the action. */
    @JsonProperty("sender")
    private List<AbstractSchema> sender;
    /** A sub property of participant. The participant who is at the receiving end of the action. */
    @JsonProperty("recipient")
    private List<AbstractSchema> recipient;
    /** The date/time at which the message was sent. */
    @JsonProperty("dateSent")
    private java.time.LocalDateTime dateSent;
    /** The date/time the message was received if a single recipient exists. */
    @JsonProperty("dateReceived")
    private java.time.LocalDateTime dateReceived;
    /** A CreativeWork attached to the message. */
    @JsonProperty("messageAttachment")
    private CreativeWork messageAttachment;
    /** A sub property of recipient. The recipient blind copied on a message. */
    @JsonProperty("bccRecipient")
    private List<AbstractSchema> bccRecipient;

    public List<AbstractSchema> getCcRecipient() { return ccRecipient; }
    public void setCcRecipient(List<AbstractSchema> ccRecipient) { this.ccRecipient = ccRecipient; }
    public List<AbstractSchema> getToRecipient() { return toRecipient; }
    public void setToRecipient(List<AbstractSchema> toRecipient) { this.toRecipient = toRecipient; }
    public java.time.LocalDateTime getDateRead() { return dateRead; }
    public void setDateRead(java.time.LocalDateTime dateRead) { this.dateRead = dateRead; }
    public List<AbstractSchema> getSender() { return sender; }
    public void setSender(List<AbstractSchema> sender) { this.sender = sender; }
    public List<AbstractSchema> getRecipient() { return recipient; }
    public void setRecipient(List<AbstractSchema> recipient) { this.recipient = recipient; }
    public java.time.LocalDateTime getDateSent() { return dateSent; }
    public void setDateSent(java.time.LocalDateTime dateSent) { this.dateSent = dateSent; }
    public java.time.LocalDateTime getDateReceived() { return dateReceived; }
    public void setDateReceived(java.time.LocalDateTime dateReceived) { this.dateReceived = dateReceived; }
    public CreativeWork getMessageAttachment() { return messageAttachment; }
    public void setMessageAttachment(CreativeWork messageAttachment) { this.messageAttachment = messageAttachment; }
    public List<AbstractSchema> getBccRecipient() { return bccRecipient; }
    public void setBccRecipient(List<AbstractSchema> bccRecipient) { this.bccRecipient = bccRecipient; }
}
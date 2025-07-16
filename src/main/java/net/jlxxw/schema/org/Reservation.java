package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
import java.util.List;
import net.jlxxw.schema.org.JsonLdType;
public class Reservation extends Intangible {
    public Reservation() {
}
    /** The current status of the reservation. */
    @JsonProperty("reservationStatus")
    private ReservationStatusType reservationStatus;
    /** The person or organization the reservation or ticket is for. */
    @JsonProperty("underName")
    private List<AbstractSchema> underName;
    /** A unique identifier for the reservation. */
    @JsonProperty("reservationId")
    private String reservationId;
    /** The currency of the price, or a price component when attached to [[PriceSpecification]] and its subtypes.\n\nUse standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217), e.g. "USD"; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies, e.g. "BTC"; well known names for [Local Exchange Trading Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types, e.g. "Ithaca HOUR". */
    @JsonProperty("priceCurrency")
    private String priceCurrency;
    /** A ticket associated with the reservation. */
    @JsonProperty("reservedTicket")
    private Ticket reservedTicket;
    /** The thing -- flight, event, restaurant, etc. being reserved. */
    @JsonProperty("reservationFor")
    private Thing reservationFor;
    /** 'bookingAgent' is an out-dated term indicating a 'broker' that serves as a booking agent. */
    @JsonProperty("bookingAgent")
    private List<AbstractSchema> bookingAgent;
    /** The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller. */
    @JsonProperty("provider")
    private List<AbstractSchema> provider;
    /** The total price for the reservation or ticket, including applicable taxes, shipping, etc.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator. */
    @JsonProperty("totalPrice")
    private String totalPrice;
    /** Any membership in a frequent flyer, hotel loyalty program, etc. being applied to the reservation. */
    @JsonProperty("programMembershipUsed")
    private ProgramMembership programMembershipUsed;
    /** The date and time the reservation was booked. */
    @JsonProperty("bookingTime")
    private java.time.LocalDateTime bookingTime;
    /** The date and time the reservation was modified. */
    @JsonProperty("modifiedTime")
    private java.time.LocalDateTime modifiedTime;
    /** An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred. */
    @JsonProperty("broker")
    private List<AbstractSchema> broker;

    public ReservationStatusType getReservationStatus() { return reservationStatus; }
    public void setReservationStatus(ReservationStatusType reservationStatus) { this.reservationStatus = reservationStatus; }
    public List<AbstractSchema> getUnderName() { return underName; }
    public void setUnderName(List<AbstractSchema> underName) { this.underName = underName; }
    public String getReservationId() { return reservationId; }
    public void setReservationId(String reservationId) { this.reservationId = reservationId; }
    public String getPriceCurrency() { return priceCurrency; }
    public void setPriceCurrency(String priceCurrency) { this.priceCurrency = priceCurrency; }
    public Ticket getReservedTicket() { return reservedTicket; }
    public void setReservedTicket(Ticket reservedTicket) { this.reservedTicket = reservedTicket; }
    public Thing getReservationFor() { return reservationFor; }
    public void setReservationFor(Thing reservationFor) { this.reservationFor = reservationFor; }
    public List<AbstractSchema> getBookingAgent() { return bookingAgent; }
    public void setBookingAgent(List<AbstractSchema> bookingAgent) { this.bookingAgent = bookingAgent; }
    public List<AbstractSchema> getProvider() { return provider; }
    public void setProvider(List<AbstractSchema> provider) { this.provider = provider; }
    public String getTotalPrice() { return totalPrice; }
    public void setTotalPrice(String totalPrice) { this.totalPrice = totalPrice; }
    public ProgramMembership getProgramMembershipUsed() { return programMembershipUsed; }
    public void setProgramMembershipUsed(ProgramMembership programMembershipUsed) { this.programMembershipUsed = programMembershipUsed; }
    public java.time.LocalDateTime getBookingTime() { return bookingTime; }
    public void setBookingTime(java.time.LocalDateTime bookingTime) { this.bookingTime = bookingTime; }
    public java.time.LocalDateTime getModifiedTime() { return modifiedTime; }
    public void setModifiedTime(java.time.LocalDateTime modifiedTime) { this.modifiedTime = modifiedTime; }
    public List<AbstractSchema> getBroker() { return broker; }
    public void setBroker(List<AbstractSchema> broker) { this.broker = broker; }
}
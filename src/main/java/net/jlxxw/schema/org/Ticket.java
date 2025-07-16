package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class Ticket extends Intangible {
    {
        setId("schema:Ticket");
        setType("rdfs:Class");

    }

    /**
     * The date the ticket was issued.
     */
    @JsonProperty("dateIssued")
    private java.time.LocalDateTime dateIssued;
    /**
     * The person or organization the reservation or ticket is for.
     */
    @JsonProperty("underName")
    private List<AbstractSchema> underName;
    /**
     * The currency of the price, or a price component when attached to [[PriceSpecification]] and its subtypes.\n\nUse standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217), e.g. "USD"; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies, e.g. "BTC"; well known names for [Local Exchange Trading Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types, e.g. "Ithaca HOUR".
     */
    @JsonProperty("priceCurrency")
    private String priceCurrency;
    /**
     * Reference to an asset (e.g., Barcode, QR code image or PDF) usable for entrance.
     */
    @JsonProperty("ticketToken")
    private String ticketToken;
    /**
     * The organization issuing the item, for example a [[Permit]], [[Ticket]], or [[Certification]].
     */
    @JsonProperty("issuedBy")
    private Organization issuedBy;
    /**
     * The total price for the reservation or ticket, including applicable taxes, shipping, etc.\n\nUsage guidelines:\n\n* Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similar Unicode symbols.\n* Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.
     */
    @JsonProperty("totalPrice")
    private String totalPrice;
    /**
     * The unique identifier for the ticket.
     */
    @JsonProperty("ticketNumber")
    private String ticketNumber;
    /**
     * The seat associated with the ticket.
     */
    @JsonProperty("ticketedSeat")
    private Seat ticketedSeat;

    public java.time.LocalDateTime getDateIssued() {
        return dateIssued;
    }

    public void setDateIssued(java.time.LocalDateTime dateIssued) {
        this.dateIssued = dateIssued;
    }

    public List<AbstractSchema> getUnderName() {
        return underName;
    }

    public void setUnderName(List<AbstractSchema> underName) {
        this.underName = underName;
    }

    public String getPriceCurrency() {
        return priceCurrency;
    }

    public void setPriceCurrency(String priceCurrency) {
        this.priceCurrency = priceCurrency;
    }

    public String getTicketToken() {
        return ticketToken;
    }

    public void setTicketToken(String ticketToken) {
        this.ticketToken = ticketToken;
    }

    public Organization getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(Organization issuedBy) {
        this.issuedBy = issuedBy;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Seat getTicketedSeat() {
        return ticketedSeat;
    }

    public void setTicketedSeat(Seat ticketedSeat) {
        this.ticketedSeat = ticketedSeat;
    }
}
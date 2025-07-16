package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Order extends Intangible {
    public Order() {
        setId("schema:Order");
        setType("rdfs:Class");

    }

    /**
     * The offer(s) -- e.g., product, quantity and price combinations -- included in the order.
     */
    @JsonProperty("acceptedOffer")
    private Offer acceptedOffer;
    /**
     * The currency of the discount.\n\nUse standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217), e.g. "USD"; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies, e.g. "BTC"; well known names for [Local Exchange Trading Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types, e.g. "Ithaca HOUR".
     */
    @JsonProperty("discountCurrency")
    private String discountCurrency;
    /**
     * The delivery of the parcel related to this order or order item.
     */
    @JsonProperty("orderDelivery")
    private ParcelDelivery orderDelivery;
    /**
     * Code used to redeem a discount.
     */
    @JsonProperty("discountCode")
    private String discountCode;
    /**
     * Any discount applied (to an Order).
     */
    @JsonProperty("discount")
    private String discount;
    /**
     * The date that payment is due.
     */
    @JsonProperty("paymentDueDate")
    private java.time.LocalDate paymentDueDate;
    /**
     * 'merchant' is an out-dated term for 'seller'.
     */
    @JsonProperty("merchant")
    private List<AbstractSchema> merchant;
    /**
     * The date that payment is due.
     */
    @JsonProperty("paymentDue")
    private java.time.LocalDateTime paymentDue;
    /**
     * The current status of the order.
     */
    @JsonProperty("orderStatus")
    private AbstractSchema orderStatus;
    /**
     * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider.
     */
    @JsonProperty("seller")
    private List<AbstractSchema> seller;
    /**
     * The URL for sending a payment.
     */
    @JsonProperty("paymentUrl")
    private String paymentUrl;
    /**
     * The order is being paid as part of the referenced Invoice.
     */
    @JsonProperty("partOfInvoice")
    private Invoice partOfInvoice;
    /**
     * A number that confirms the given order or payment has been received.
     */
    @JsonProperty("confirmationNumber")
    private String confirmationNumber;
    /**
     * The item ordered.
     */
    @JsonProperty("orderedItem")
    private List<AbstractSchema> orderedItem;
    /**
     * Party placing the order or paying the invoice.
     */
    @JsonProperty("customer")
    private List<AbstractSchema> customer;
    /**
     * An identifier for the method of payment used (e.g. the last 4 digits of the credit card).
     */
    @JsonProperty("paymentMethodId")
    private String paymentMethodId;
    /**
     * Indicates whether the offer was accepted as a gift for someone other than the buyer.
     */
    @JsonProperty("isGift")
    private Boolean isGift;
    /**
     * The identifier of the transaction.
     */
    @JsonProperty("orderNumber")
    private String orderNumber;
    /**
     * Date order was placed.
     */
    @JsonProperty("orderDate")
    private java.time.LocalDateTime orderDate;
    /**
     * The name of the credit card or other method of payment for the order.
     */
    @JsonProperty("paymentMethod")
    private String paymentMethod;
    /**
     * The billing address for the order.
     */
    @JsonProperty("billingAddress")
    private PostalAddress billingAddress;
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     */
    @JsonProperty("broker")
    private List<AbstractSchema> broker;

    public Offer getAcceptedOffer() {
        return acceptedOffer;
    }

    public void setAcceptedOffer(Offer acceptedOffer) {
        this.acceptedOffer = acceptedOffer;
    }

    public String getDiscountCurrency() {
        return discountCurrency;
    }

    public void setDiscountCurrency(String discountCurrency) {
        this.discountCurrency = discountCurrency;
    }

    public ParcelDelivery getOrderDelivery() {
        return orderDelivery;
    }

    public void setOrderDelivery(ParcelDelivery orderDelivery) {
        this.orderDelivery = orderDelivery;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public java.time.LocalDate getPaymentDueDate() {
        return paymentDueDate;
    }

    public void setPaymentDueDate(java.time.LocalDate paymentDueDate) {
        this.paymentDueDate = paymentDueDate;
    }

    public List<AbstractSchema> getMerchant() {
        return merchant;
    }

    public void setMerchant(List<AbstractSchema> merchant) {
        this.merchant = merchant;
    }

    public java.time.LocalDateTime getPaymentDue() {
        return paymentDue;
    }

    public void setPaymentDue(java.time.LocalDateTime paymentDue) {
        this.paymentDue = paymentDue;
    }

    public AbstractSchema getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(AbstractSchema orderStatus) {
        this.orderStatus = orderStatus;
    }

    public List<AbstractSchema> getSeller() {
        return seller;
    }

    public void setSeller(List<AbstractSchema> seller) {
        this.seller = seller;
    }

    public String getPaymentUrl() {
        return paymentUrl;
    }

    public void setPaymentUrl(String paymentUrl) {
        this.paymentUrl = paymentUrl;
    }

    public Invoice getPartOfInvoice() {
        return partOfInvoice;
    }

    public void setPartOfInvoice(Invoice partOfInvoice) {
        this.partOfInvoice = partOfInvoice;
    }

    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    public void setConfirmationNumber(String confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    public List<AbstractSchema> getOrderedItem() {
        return orderedItem;
    }

    public void setOrderedItem(List<AbstractSchema> orderedItem) {
        this.orderedItem = orderedItem;
    }

    public List<AbstractSchema> getCustomer() {
        return customer;
    }

    public void setCustomer(List<AbstractSchema> customer) {
        this.customer = customer;
    }

    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public Boolean getIsGift() {
        return isGift;
    }

    public void setIsGift(Boolean isGift) {
        this.isGift = isGift;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public java.time.LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(java.time.LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public PostalAddress getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(PostalAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    public List<AbstractSchema> getBroker() {
        return broker;
    }

    public void setBroker(List<AbstractSchema> broker) {
        this.broker = broker;
    }
}
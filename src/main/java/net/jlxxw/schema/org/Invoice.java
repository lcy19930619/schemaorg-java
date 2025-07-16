package net.jlxxw.schema.org;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class Invoice extends Intangible {
    {
        setId("schema:Invoice");
        setType("rdfs:Class");

    }

    /**
     * The Order(s) related to this Invoice. One or more Orders may be combined into a single Invoice.
     */
    @JsonProperty("referencesOrder")
    private Order referencesOrder;
    /**
     * The identifier for the account the payment will be applied to.
     */
    @JsonProperty("accountId")
    private String accountId;
    /**
     * The date that payment is due.
     */
    @JsonProperty("paymentDueDate")
    private java.time.LocalDate paymentDueDate;
    /**
     * The minimum payment required at this time.
     */
    @JsonProperty("minimumPaymentDue")
    private List<MonetaryAmount> minimumPaymentDue;
    /**
     * The date that payment is due.
     */
    @JsonProperty("paymentDue")
    private java.time.LocalDateTime paymentDue;
    /**
     * A number that confirms the given order or payment has been received.
     */
    @JsonProperty("confirmationNumber")
    private String confirmationNumber;
    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @JsonProperty("category")
    private String category;
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
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @JsonProperty("provider")
    private List<AbstractSchema> provider;
    /**
     * The time interval used to compute the invoice.
     */
    @JsonProperty("billingPeriod")
    private Duration billingPeriod;
    /**
     * The status of payment; whether the invoice has been paid or not.
     */
    @JsonProperty("paymentStatus")
    private String paymentStatus;
    /**
     * The date the invoice is scheduled to be paid.
     */
    @JsonProperty("scheduledPaymentDate")
    private java.time.LocalDate scheduledPaymentDate;
    /**
     * The total amount due.
     */
    @JsonProperty("totalPaymentDue")
    private List<MonetaryAmount> totalPaymentDue;
    /**
     * The name of the credit card or other method of payment for the order.
     */
    @JsonProperty("paymentMethod")
    private String paymentMethod;
    /**
     * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred.
     */
    @JsonProperty("broker")
    private List<AbstractSchema> broker;

    public Order getReferencesOrder() {
        return referencesOrder;
    }

    public void setReferencesOrder(Order referencesOrder) {
        this.referencesOrder = referencesOrder;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public java.time.LocalDate getPaymentDueDate() {
        return paymentDueDate;
    }

    public void setPaymentDueDate(java.time.LocalDate paymentDueDate) {
        this.paymentDueDate = paymentDueDate;
    }

    public List<MonetaryAmount> getMinimumPaymentDue() {
        return minimumPaymentDue;
    }

    public void setMinimumPaymentDue(List<MonetaryAmount> minimumPaymentDue) {
        this.minimumPaymentDue = minimumPaymentDue;
    }

    public java.time.LocalDateTime getPaymentDue() {
        return paymentDue;
    }

    public void setPaymentDue(java.time.LocalDateTime paymentDue) {
        this.paymentDue = paymentDue;
    }

    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    public void setConfirmationNumber(String confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public List<AbstractSchema> getProvider() {
        return provider;
    }

    public void setProvider(List<AbstractSchema> provider) {
        this.provider = provider;
    }

    public Duration getBillingPeriod() {
        return billingPeriod;
    }

    public void setBillingPeriod(Duration billingPeriod) {
        this.billingPeriod = billingPeriod;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public java.time.LocalDate getScheduledPaymentDate() {
        return scheduledPaymentDate;
    }

    public void setScheduledPaymentDate(java.time.LocalDate scheduledPaymentDate) {
        this.scheduledPaymentDate = scheduledPaymentDate;
    }

    public List<MonetaryAmount> getTotalPaymentDue() {
        return totalPaymentDue;
    }

    public void setTotalPaymentDue(List<MonetaryAmount> totalPaymentDue) {
        this.totalPaymentDue = totalPaymentDue;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public List<AbstractSchema> getBroker() {
        return broker;
    }

    public void setBroker(List<AbstractSchema> broker) {
        this.broker = broker;
    }
}
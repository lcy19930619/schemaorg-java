package net.jlxxw.schema.org;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LocalBusiness extends Place {
    public LocalBusiness() {
    }

    /**
     * Cash, Credit Card, Cryptocurrency, Local Exchange Tradings System, etc.
     */
    @JsonProperty("paymentAccepted")
    private String paymentAccepted;
    /**
     * The larger organization that this local business is a branch of, if any. Not to be confused with (anatomical) [[branch]].
     */
    @JsonProperty("branchOf")
    private Organization branchOf;
    /**
     * The general opening hours for a business. Opening hours can be specified as a weekly time range, starting with days, then times per day. Multiple days can be listed with commas ',' separating each day. Day or time ranges are specified using a hyphen '-'.\n\n* Days are specified using the following two-letter combinations: ```Mo```, ```Tu```, ```We```, ```Th```, ```Fr```, ```Sa```, ```Su```.\n* Times are specified using 24:00 format. For example, 3pm is specified as ```15:00```, 10am as ```10:00```. \n* Here is an example: <code>&lt;time itemprop="openingHours" datetime=&quot;Tu,Th 16:00-20:00&quot;&gt;Tuesdays and Thursdays 4-8pm&lt;/time&gt;</code>.\n* If a business is open 7 days a week, then it can be specified as <code>&lt;time itemprop=&quot;openingHours&quot; datetime=&quot;Mo-Su&quot;&gt;Monday through Sunday, all day&lt;/time&gt;</code>.
     */
    @JsonProperty("openingHours")
    private String openingHours;
    /**
     * The price range of the business, for example ```$$$```.
     */
    @JsonProperty("priceRange")
    private String priceRange;
    /**
     * The currency accepted.\n\nUse standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217), e.g. "USD"; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies, e.g. "BTC"; well known names for [Local Exchange Trading Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types, e.g. "Ithaca HOUR".
     */
    @JsonProperty("currenciesAccepted")
    private String currenciesAccepted;

    public String getPaymentAccepted() {
        return paymentAccepted;
    }

    public void setPaymentAccepted(String paymentAccepted) {
        this.paymentAccepted = paymentAccepted;
    }

    public Organization getBranchOf() {
        return branchOf;
    }

    public void setBranchOf(Organization branchOf) {
        this.branchOf = branchOf;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public String getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange;
    }

    public String getCurrenciesAccepted() {
        return currenciesAccepted;
    }

    public void setCurrenciesAccepted(String currenciesAccepted) {
        this.currenciesAccepted = currenciesAccepted;
    }
}
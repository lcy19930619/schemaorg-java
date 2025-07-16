package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class ExchangeRateSpecification extends StructuredValue {
    public ExchangeRateSpecification() {
}
    /** The currency in which the monetary amount is expressed.\n\nUse standard formats: [ISO 4217 currency format](http://en.wikipedia.org/wiki/ISO_4217), e.g. "USD"; [Ticker symbol](https://en.wikipedia.org/wiki/List_of_cryptocurrencies) for cryptocurrencies, e.g. "BTC"; well known names for [Local Exchange Trading Systems](https://en.wikipedia.org/wiki/Local_exchange_trading_system) (LETS) and other currency types, e.g. "Ithaca HOUR". */
    @JsonProperty("currency")
    private String currency;
    /** The current price of a currency. */
    @JsonProperty("currentExchangeRate")
    private UnitPriceSpecification currentExchangeRate;
    /** The difference between the price at which a broker or other intermediary buys and sells foreign currency. */
    @JsonProperty("exchangeRateSpread")
    private Double exchangeRateSpread;

    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }
    public UnitPriceSpecification getCurrentExchangeRate() { return currentExchangeRate; }
    public void setCurrentExchangeRate(UnitPriceSpecification currentExchangeRate) { this.currentExchangeRate = currentExchangeRate; }
    public Double getExchangeRateSpread() { return exchangeRateSpread; }
    public void setExchangeRateSpread(Double exchangeRateSpread) { this.exchangeRateSpread = exchangeRateSpread; }
}
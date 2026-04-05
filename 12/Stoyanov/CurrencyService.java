package com.example;

/**
 * External service that provides currency exchange rates.
 * This will be MOCKED in unit tests.
 */
public interface CurrencyService {
    /**
     * Returns the exchange rate from the given currency to BGN.
     * e.g. getCurrencyRate("USD") -> 1.78
     */
    double getCurrencyRate(String currencyCode);
}

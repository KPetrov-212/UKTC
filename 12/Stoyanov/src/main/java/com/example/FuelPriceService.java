package com.example;

/**
 * External service that provides fuel prices.
 * This will be MOCKED in unit tests.
 */
public interface FuelPriceService {
    /**
     * Returns the fuel price per liter for the given fuel type.
     * e.g. getFuelPrice("petrol") -> 2.50
     */
    double getFuelPrice(String fuelType);
}

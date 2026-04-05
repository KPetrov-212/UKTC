package com.example;

/**
 * Service that calculates the total fuel cost for a motorcycle trip.
 *
 * Formula:
 *   fuelNeeded = (distanceKm / 100) * fuelEfficiency
 *   totalCost  = fuelNeeded * fuelPrice
 */
public class MotorcycleTripCalculator {

    private final FuelPriceService fuelPriceService;

    public MotorcycleTripCalculator(FuelPriceService fuelPriceService) {
        if (fuelPriceService == null) {
            throw new IllegalArgumentException("FuelPriceService не може да е null");
        }
        this.fuelPriceService = fuelPriceService;
    }

    /**
     * Изчислява общата цена на горивото за пътуването.
     *
     * @param trip пътуването, за което се изчислява цената
     * @return обща цена на горивото в BGN, закръглена до 2 десетични знака
     * @throws IllegalArgumentException при невалидно пътуване
     */
    public double calculateFuelCost(MotorcycleTrip trip) {
        validateTrip(trip);

        double fuelNeeded = (trip.getDistanceKm() / 100.0) * trip.getFuelEfficiency();
        double fuelPrice = fuelPriceService.getFuelPrice(trip.getFuelType());

        if (fuelPrice <= 0) {
            throw new IllegalStateException(
                "Невалидна цена на гориво за тип: " + trip.getFuelType());
        }

        double totalCost = fuelNeeded * fuelPrice;

        // Закръгляме до 2 знака след десетичната запетая
        return Math.round(totalCost * 100.0) / 100.0;
    }

    // -------------------------------------------------------------------------

    private void validateTrip(MotorcycleTrip trip) {
        if (trip == null) {
            throw new IllegalArgumentException("Пътуването не може да е null");
        }
        if (trip.getDistanceKm() <= 0) {
            throw new IllegalArgumentException("Разстоянието трябва да е положително");
        }
        if (trip.getFuelEfficiency() <= 0) {
            throw new IllegalArgumentException("Разходът на гориво трябва да е положителен");
        }
        if (trip.getFuelType() == null || trip.getFuelType().isBlank()) {
            throw new IllegalArgumentException("Типът гориво не може да е празен");
        }
    }
}

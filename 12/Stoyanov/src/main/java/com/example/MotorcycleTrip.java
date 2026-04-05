package com.example;

public class MotorcycleTrip {
    private final String destination;
    private final int distanceKm;
    private final String fuelType; // e.g. "petrol", "diesel"
    private final double fuelEfficiency; // liters per 100km

    public MotorcycleTrip(String destination, int distanceKm, String fuelType, double fuelEfficiency) {
        this.destination = destination;
        this.distanceKm = distanceKm;
        this.fuelType = fuelType;
        this.fuelEfficiency = fuelEfficiency;
    }

    public String getDestination()    { return destination; }
    public int getDistanceKm()        { return distanceKm; }
    public String getFuelType()       { return fuelType; }
    public double getFuelEfficiency() { return fuelEfficiency; }
}

package com.example;

public class Truck extends Vehicle implements Rentable {
    private double baseRate = 100.0; // Base rental rate per day
    private boolean available = true;
    private double loadCapacity; // Load capacity in tons

    public Truck(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        // Additional fee based on load capacity
        double capacityFee = loadCapacity * 10; 
        return (days * baseRate) + capacityFee;
    }

    @Override
    public boolean isAvailableForRental() {
        return available;
    }

    @Override
    public boolean rent(Customer customer, int days) {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean returnVehicle() {
        if(!isAvailable) {
            isAvailable = true;
            return true;
        }
        return false;
    }
    
}
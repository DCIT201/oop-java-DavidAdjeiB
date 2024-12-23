package com.example;

public class Motorcycle extends Vehicle implements Rentable{

    private double baseRate = 30.0; // Base rental rate per day
    private boolean available = true;

    @Override
    public double calculateRentalCost(int days) {
        double extraFee = (days > 5) ? 20.0 : 0.0; // Flat extra fee for rentals over 5 days
        return (days * baseRate) + extraFee;
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

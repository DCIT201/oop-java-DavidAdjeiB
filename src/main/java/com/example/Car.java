package com.example;

public class Car extends Vehicle implements Rentable {

    @Override
    public double calculateRentalCost(int days) {
        double extraFee = (days > 5) ? 20.0 : 0.0; // Flat extra fee for rentals over 5 days
        return (days * baseRentalRate) + extraFee;
    }

    @Override
    public boolean isAvailableForRental() {
      return isAvailable;
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

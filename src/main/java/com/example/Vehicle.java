package com.example;

public abstract class Vehicle {
    protected String vehicleId;
    protected String model;
    protected double baseRentalRate;
    protected boolean isAvailable;
     /**
     * Calculate the rental cost based on the number of rental days.
     * 
     * @param days Number of days the vehicle is rented for
     * @return Total rental cost as a double
     */
    public abstract double calculateRentalCost(int days);

     /**
     * Check if the vehicle is available for rental.
     * 
     * @return true if available, false otherwise
     */
    public abstract boolean isAvailableForRental();
}

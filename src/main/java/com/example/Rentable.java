package com.example;

public interface Rentable {
     /**
     * Rent the vehicle to a customer for a specified number of days.
     *
     * @param customer The customer renting the vehicle
     * @param days The number of rental days
     * @return The rental cost
     */
    abstract boolean rent(Customer customer, int days);

    /**
     * Return the rented vehicle.
     */
    abstract boolean returnVehicle();
}

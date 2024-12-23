package com.example;

import java.util.ArrayList;

public class RentalAgency {
    ArrayList<Vehicle> allVehicles = new ArrayList<>();

    public RentalAgency() {

    }

    public void addVehicle(Vehicle vehicle) {
        allVehicles.add(vehicle);
    }
    
    public RentalTransaction rentVehicleNo(Customer customer, int days, int index, double amount) {
        Vehicle vh = allVehicles.get(index);
        double vc = vh.calculateRentalCost(days);
        if (amount < vc) {
            return null;
        }
        RentalTransaction receipt = new RentalTransaction(days, vc, customer, vh);
        return receipt;
    }
}

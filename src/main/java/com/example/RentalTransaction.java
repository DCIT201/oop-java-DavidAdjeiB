package com.example;

public class RentalTransaction {
    int days;
    Customer customer;
    double amount;
    Vehicle vehicle;

    public RentalTransaction(int days, double amount, Customer customer, Vehicle vehicle) {
        this.days = days;
        this.customer = customer;
        this.amount = amount;
        this.vehicle = vehicle;
    }
}

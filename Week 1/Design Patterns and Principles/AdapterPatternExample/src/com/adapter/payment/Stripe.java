package com.adapter.payment;

public class Stripe {
    public void makePayment(double amount) {
        System.out.println("Paid ₹" + amount + " using Stripe.");
    }
}

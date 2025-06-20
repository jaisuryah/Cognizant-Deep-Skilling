package com.strategy.payment;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Using Credit Card strategy
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        context.makePayment(1500.00);

        System.out.println();

        // Using PayPal strategy
        context.setPaymentStrategy(new PayPalPayment("user@example.com"));
        context.makePayment(850.00);
    }
}

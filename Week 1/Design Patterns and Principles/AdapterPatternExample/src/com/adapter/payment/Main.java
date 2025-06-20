package com.adapter.payment;

public class Main {
    public static void main(String[] args) {
        // Using PayPal
        PaymentProcessor paypal = new PayPalAdapter(new PayPal());
        paypal.processPayment(500.0);

        // Using Stripe
        PaymentProcessor stripe = new StripeAdapter(new Stripe());
        stripe.processPayment(750.0);

        // Using Razorpay
        PaymentProcessor razorpay = new RazorpayAdapter(new Razorpay());
        razorpay.processPayment(1000.0);
    }
}

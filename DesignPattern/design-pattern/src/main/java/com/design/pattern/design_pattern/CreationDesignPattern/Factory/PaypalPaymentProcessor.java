package com.design.pattern.design_pattern.Factory;

public class PaypalPaymentProcessor implements PaymentProcess {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of amount: " + amount);
    }
    
}

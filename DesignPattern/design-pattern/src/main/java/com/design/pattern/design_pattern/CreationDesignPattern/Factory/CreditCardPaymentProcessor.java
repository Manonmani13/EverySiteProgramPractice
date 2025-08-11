package com.design.pattern.design_pattern.Factory;

public class CreditCardPaymentProcessor implements PaymentProcess {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of amount: " + amount);
    }
    
}

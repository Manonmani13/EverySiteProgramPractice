package com.design.pattern.design_pattern.Factory;

public class PaymentProcessFactory {
    private final CreditCardPaymentProcessor creditCardProcessor;
    private final PaypalPaymentProcessor paypalProcessor;   

    public PaymentProcessFactory() {
        this.creditCardProcessor = new CreditCardPaymentProcessor();
        this.paypalProcessor = new PaypalPaymentProcessor();
    }   

    public PaymentProcess getPaymentProcessor(String type) {
        if ("CREDIT_CARD".equalsIgnoreCase(type)) {
            return creditCardProcessor;
        } else if ("PAYPAL".equalsIgnoreCase(type)) {
            return paypalProcessor;
        }
        throw new IllegalArgumentException("Unknown payment type: " + type);
    }
}

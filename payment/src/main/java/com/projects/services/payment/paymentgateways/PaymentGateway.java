package com.projects.services.payment.paymentgateways;

public interface PaymentGateway {
    public String generatePaymentLink(String email, String phoneNumber, Long amount, String orderId);
}

package com.projects.services.payment.services;

import com.projects.services.payment.paymentgateways.PaymentGateway;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
   private PaymentGateway paymentGateway;

    public PaymentService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public String initiatePayment(String email, String phoneNumber, Long amount, String orderId) {
        /**
         * 1] Call order service
         * 2] Get Order Details
         * 3] Verify Amount
         * 4] Payment Gateway to generate payment Link.
         * 5] Return payment link.
         */
        return paymentGateway.generatePaymentLink(email,phoneNumber,amount,orderId);

    }
}

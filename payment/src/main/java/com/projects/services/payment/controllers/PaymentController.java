package com.projects.services.payment.controllers;

import com.projects.services.payment.dtos.InitiatePaymentDto;
import com.projects.services.payment.services.PaymentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    public String initiatePayment(@RequestBody InitiatePaymentDto initiatePaymentDto) {
        return paymentService.initiatePayment(initiatePaymentDto.getEmail(), initiatePaymentDto.getPhoneNumber(), initiatePaymentDto.getAmount(), initiatePaymentDto.getOrderId());
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @PostMapping("/webhooks")
    public String listenToWebhook(@RequestBody String webhookEvent) {
        System.out.println(webhookEvent);
        return "Ok";
    }
}

package com.projects.services.payment.dtos;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
public class InitiatePaymentDto {
    private String email;
    private String phoneNumber;
    private String orderId;
    private Long amount;
}

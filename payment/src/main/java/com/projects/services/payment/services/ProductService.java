package com.projects.services.payment.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductService {
    RestTemplate restTemplate;

    public ProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getProductDetails(String id){
        System.out.println(id);
        return restTemplate.getForObject("http://CAPSTONE/products/" + id, String.class);
    }
}

package com.niranjana.price.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.niranjana.price.dto.PriceResponse;
import com.niranjana.price.service.PriceService;

@RestController
@RequestMapping("/api")
public class PriceController {

    private final PriceService priceService;

    public PriceController(PriceService priceService) {
        this.priceService = priceService;
    }

    @GetMapping("/price")
    public PriceResponse getPrice(@RequestParam double amount,@RequestParam String country) {
        return priceService.calculatePrice(amount, country);
    }
}
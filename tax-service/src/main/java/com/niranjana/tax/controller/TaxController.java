package com.niranjana.tax.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.niranjana.tax.dto.TaxResponse;
import com.niranjana.tax.service.TaxService;

@RestController
@RequestMapping("/api")
public class TaxController {

    private final TaxService taxService;

    public TaxController(TaxService taxService) {
        this.taxService = taxService;
    }

    @GetMapping("/tax")
    public TaxResponse getTax(@RequestParam String country) {
        return taxService.calculateTax(country);
    }
}
package com.niranjana.price.service;

import java.net.InetAddress;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.niranjana.price.dto.PriceResponse;
import com.niranjana.price.dto.TaxResponse;

@Service
public class PriceService {

    private final RestTemplate restTemplate;

    @Value("${tax.service.url:http://tax-service:4000}")
    private String taxServiceUrl;

    public PriceService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public PriceResponse calculatePrice(double amount, String country) {

        TaxResponse taxResponse = restTemplate.getForObject(taxServiceUrl + "/api/tax?country=" + country,TaxResponse.class);
        System.out.println("API taxResponse: "+taxResponse);

        double taxPercent = taxResponse.getTax();
        System.out.println("taxPercent: "+taxPercent);

        // Correct calculation
        double taxAmount = (amount * taxPercent) / 100;
        double total = amount + taxAmount;

        PriceResponse priceResponse = new PriceResponse("Price-Service",amount,taxPercent,taxAmount,total,getHostname(),taxResponse.getContainer());
        System.out.println("price response: "+priceResponse);
        return priceResponse;
    }

    private String getHostname() {
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (Exception e) {
            return "unknown";
        }
    }
}
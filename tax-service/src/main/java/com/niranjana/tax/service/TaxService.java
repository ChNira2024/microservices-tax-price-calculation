package com.niranjana.tax.service;

import java.net.InetAddress;

import org.springframework.stereotype.Service;

import com.niranjana.tax.dto.TaxResponse;

@Service
public class TaxService {

    public TaxResponse calculateTax(String country) {
    	
    	System.out.println("Country id is: "+country);

        if (country == null || country.isBlank()) {
            throw new IllegalArgumentException("Country code is required");
        }

        int tax = switch (country.toUpperCase()) {
            case "IN" -> 18;
            case "US" -> 8;
            case "EU" -> 20;
            default -> 10;
        };

        String hostname = getHostname();

       TaxResponse taxResponse =  new TaxResponse("Tax-Service", country.toUpperCase(), tax, hostname);
       System.out.println("taxResponse: "+taxResponse);
       return taxResponse;
    }

    private String getHostname() {
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (Exception e) {
            return "unknown";
        }
    }
}
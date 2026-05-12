package com.niranjana.price.dto;


public class PriceResponse {

    private String service;
    private double amount;
    private double taxPercent;
    private double taxAmount;
    private double total;
    private String container;
    private String taxServiceContainer;

    public PriceResponse(String service, double amount, double taxPercent,
                         double taxAmount, double total,
                         String container, String taxServiceContainer) {
        this.service = service;
        this.amount = amount;
        this.taxPercent = taxPercent;
        this.taxAmount = taxAmount;
        this.total = total;
        this.container = container;
        this.taxServiceContainer = taxServiceContainer;
    }

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getTaxPercent() {
		return taxPercent;
	}

	public void setTaxPercent(double taxPercent) {
		this.taxPercent = taxPercent;
	}

	public double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getContainer() {
		return container;
	}

	public void setContainer(String container) {
		this.container = container;
	}

	public String getTaxServiceContainer() {
		return taxServiceContainer;
	}

	public void setTaxServiceContainer(String taxServiceContainer) {
		this.taxServiceContainer = taxServiceContainer;
	}

	public PriceResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PriceResponse [service=" + service + ", amount=" + amount + ", taxPercent=" + taxPercent
				+ ", taxAmount=" + taxAmount + ", total=" + total + ", container=" + container
				+ ", taxServiceContainer=" + taxServiceContainer + "]";
	}

    
}
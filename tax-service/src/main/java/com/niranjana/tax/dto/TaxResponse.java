package com.niranjana.tax.dto;


public class TaxResponse {

    private String service;
    private String country;
    private int tax;
    private String container;

    public TaxResponse(String service, String country, int tax, String container) {
        this.service = service;
        this.country = country;
        this.tax = tax;
        this.container = container;
    }

    

	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public String getContainer() {
		return container;
	}
	public void setContainer(String container) {
		this.container = container;
	}
	@Override
	public String toString() {
		return "TaxResponse [service=" + service + ", country=" + country + ", tax=" + tax + ", container=" + container
				+ "]";
	}

	public TaxResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
}
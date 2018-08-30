package com.capgemini.day6;

public class CellPhone {
	
	private String company;
	private String model;
	private String operatingSystem;
	private double price;
	public CellPhone() {
		super();
	}
	public CellPhone(String company, String model, String operatingSystem, double price) {
		super();
		this.company = company;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}

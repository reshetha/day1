package com.capgemini.day6;

import java.util.Objects;

public class Car
{
	private String make;
	private String model;
	private long year;
	private double price;
	public Car() {
		super();
		
	}
	public Car(String make, String model, long year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Long getYear() {
		return year;
	}
	public void setYear(Long year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		
		Car c = (Car) obj;
		return this.make == c.make && this.model == c.model ;
					
	}	

	@Override
	public int hashCode() {
		return Objects.hash(make, model);
	}

	public int compareTo(Car c) {
		//int result = Double.compare(this.price, c2.price);
		int result = this.make.compareTo(c.make);
		if(result == 0)
			return this.model.compareTo(c.model);
		return result;
	

}}

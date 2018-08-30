package com.capgemini.day6;

public class Car1 implements Comparable<Car1>
{

	private String make;
	private String model;
	private long year;
	private double price;
	public Car1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car1(String make, String model, long year, double price) {
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
	public long getYear() {
		return year;
	}
	public void setYear(long year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car1 [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}
	public int compareTo(Car1 cars)
	{
		return this.make.compareTo(cars.make);
		
}}

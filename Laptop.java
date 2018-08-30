package com.capgemini.day6;

import java.util.ArrayList;
import java.util.Objects;

public class Laptop
{
	private String model; 
	private String company;
	private String operatingSystem;
	private String processor;
	
    
	
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Laptop(String model, String company, String operatingSystem, String processor) {
		super();
		this.model = model;
		this.company = company;
		this.operatingSystem = operatingSystem;
		this.processor = processor;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public String getCompany() {
		return company;
	}



	public void setCompany(String company) {
		this.company = company;
	}



	public String getOperatingSystem() {
		return operatingSystem;
	}



	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}



	public String getProcessor() {
		return processor;
	}



	public void setProcessor(String processor) {
		this.processor = processor;
	}

@Override
public boolean equals(Object obj) {
	if(this == obj)
		return true;
	if(obj == null)
		return false;
	if(this.getClass() != obj.getClass())
		return false;
	
	Laptop l = (Laptop) obj;
	return this.company == l.company && this.model == l.model ;
				
}	

@Override
public int hashCode() {
	return Objects.hash(company, model);
}

public int compareTo(Laptop l) {
	//int result = Double.compare(this.price, c2.price);
	int result = this.company.compareTo(l.company);
	if(result == 0)
		return this.model.compareTo(l.model);
	return result;
}

}

	
package com.capgemini.day6;

import java.util.Objects;

public class School {
	private String name;
	private String city;
	private String district;
	private int rank;
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	public School(String name, String city, String district, int rank) {
		super();
		this.name = name;
		this.city = city;
		this.district = district;
		this.rank = rank;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		
		School s = (School) obj;
		return this.name == s.name && this.city == s.city && this.district ==s.district ;
					
	}	

	@Override
	public int hashCode() {
		return Objects.hash(name,city,district);
	}

	public int compareTo(School s) {
		//int result = Double.compare(this.price, c2.price);
		int result = this.name.compareTo(s.name);
		int result1 = this.city.compareTo(s.city);
		if(result == 0)
			return this.district.compareTo(s.district);
		return result;
	

}}




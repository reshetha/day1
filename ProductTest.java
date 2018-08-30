package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.Car;
import com.capgemini.day6.CellPhone;
import com.capgemini.day6.Laptop;
import com.capgemini.day6.School;
import com.capgemini.day6.Television;

class ProductTest {

	@Test
	void testLaptoproducts() {
		ArrayList<Laptop>laptops=new ArrayList<>();
		
		assertEquals(true, laptops.add(new Laptop("Dell","Inspiron5558","Windows 8","i5")));
		laptops.add(new Laptop("HP","HP234","Windows 10","i3"));
		laptops.add(new Laptop("HP","HP677","Windows 10","i7"));
		
		assertEquals(3,laptops.size());
		
		
		
	}
	@Test
	void testCarProducts() {
		ArrayList<Car>cars=new ArrayList<>();
		
		assertEquals(true, cars.add(new Car("MARUTHI","DESIRE",900000,2014)));
		cars.add(new Car("HYUNDAI","VERNA",1100000,2013));
		cars.add(new Car("FORD","FIGO",600000,2015));
		
		assertEquals(3,cars.size());
		
}
@Test
void testTelevisionproducts() {
	ArrayList<Television>televisions=new ArrayList<>();
	
	assertEquals(true, televisions.add(new Television("SAMSUNG","PLASMA","YES",55000)));
	televisions.add(new Television("SONY","LCD","NO",58000));
	televisions.add(new Television("LG","LED","YES",65000));
	
	assertEquals(3,televisions.size());
}
@Test
void testCellPhoneproducts() {
	ArrayList<CellPhone>cellphones=new ArrayList<>();
	
	assertEquals(true, cellphones.add(new CellPhone("SAM","DEE","OS",15000.0)));
	cellphones.add(new CellPhone("SON","HDR","OF",18000.0));
	cellphones.add(new CellPhone("LPG","FD","OT",13000.03));
	
	assertEquals(3,cellphones.size());
	}
@Test
void testSchool() {
	ArrayList<School>schools=new ArrayList<>();
	
	assertEquals(true, schools.add(new School("DAV","MUMBAI","KOTLA",5)));
	schools.add(new School("SRDIGI","CHENNAI","PORA",8));
	schools.add(new School("BRILLIANT","HYDERABD","SOTA",6));
	
	assertEquals(3,schools.size());
}}
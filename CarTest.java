package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.Car;

class CarTest {

	
		@Test
		void testCarProducts() {
			ArrayList<Car>cars=new ArrayList<>();
			
			assertEquals(true, cars.add(new Car("MARUTHI","DESIRE",900000,2014)));
			assertEquals(true, cars.add(new Car("HYUNDAI","VERNA",1100000,2013)));
			assertEquals(true, cars.add(new Car("FORD","FIGO",600000,2015)));
			assertEquals(true, cars.add(new Car("FORD","FIGO",60000,2012)));
			
			assertEquals(4,cars.size());
			
	}

}

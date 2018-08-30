package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.Car;
import com.capgemini.day6.Car1;
import com.capgemini.day6.Student1;

class Car1Test {

	@Test
	void test()
	{
		TreeSet<Car1>cars=new TreeSet<>();
		cars.add(new Car1("MARUTHI","DESIRE",900000,2014));
		cars.add(new Car1("HYUNDAI","VERNA",1100000,2013));
		cars.add(new Car1("FORD","FIGO",600000,2015));
		
		
		
	}

}

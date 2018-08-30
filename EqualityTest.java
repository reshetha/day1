package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.Laptop;

class EqualityTest {

	
		@Test
		void testLaptoproducts() {
			HashSet<Laptop>laptops=new HashSet<>();
			
			assertEquals(true, laptops.add(new Laptop("Dell","Inspiron5558","Windows 6","i6")));
			assertEquals(true, laptops.add(new Laptop("ACER","Inspiron5568","Windows 12","i4")));
			assertEquals(true, laptops.add(new Laptop("LENOVO","Inspiron2258","Windows 10","i3")));
			assertEquals(false, laptops.add(new Laptop("LENOVO","Inspiron2258","Windows 7","i5")));
			
			assertEquals(3,laptops.size());
	}
		
	

}

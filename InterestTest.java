package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InterestTest {

	@Test
	void test() {
		assertEquals(5000.0,Interest.simpleInterest(10000,2,25));
		assertEquals(-5000.0,Interest.simpleInterest(-10000,2,25));
		assertEquals(0.0,Interest.simpleInterest(0,0,0));
		assertEquals(97000.0,Interest.simpleInterest(100000,1,'a'));
		assertEquals(5625.0,Interest.CompoundInterest(10000,2,25));
		assertEquals(-5625.0,Interest.CompoundInterest(-10000,2,25));
		assertEquals(0.0,Interest.CompoundInterest(0,0,0));
		assertEquals(97000.0,Interest.CompoundInterest(100000,1,'a'));
		assertEquals(3842.3124850590175,Interest.CompoundInterest(25000.45,1.5,10));
		
	}

}

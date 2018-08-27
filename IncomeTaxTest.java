package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IncomeTaxTest {

	@Test
	void test() 
	{
		assertEquals(40000,IncomeTaxes.incometax(400000));
		assertEquals(2,IncomeTaxes.incometax(-400000));
		assertEquals(80000.025,IncomeTaxes.incometax(400000.125),0.02);
		assertEquals(1,IncomeTaxes.incometax(1200000000));
		assertEquals(0,IncomeTaxes.incometax('a'));
	}

}

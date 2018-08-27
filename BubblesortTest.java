package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BubblesortTest {

	@Test
	void test() {

		assertArrayEquals(new int[] {2,4,8,9,45,52,56},Bubblesort.check( new int[] {45,52,56,8,9,2,4}));
		
	}

}

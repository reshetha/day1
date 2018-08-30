package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.School;

class SchoolTest {

		
		@Test
		void testSchool() {
			ArrayList<School>schools=new ArrayList<>();
			
			assertEquals(true, schools.add(new School("DAV","MUMBAI","KOTLA",5)));
			assertEquals(true,schools.add(new School("SRDIGI","CHENNAI","PORA",8)));
			assertEquals(true,schools.add(new School("BRILLIANT","HYDERABD","SOTA",6)));
			assertEquals(true,schools.add(new School("BRILLIANT","HYDERABD","SOTA",7)));
			
			
			assertEquals(4,schools.size());
	}

}

package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.Student;

class StudentTest {

	@Test
	void test() {
		ArrayList<Student>students=new ArrayList<>();
		
		students.add(new Student("rani"));
		students.add(new Student("pallavi"));
		students.add(new Student("rita"));
		students.add(new Student("tina"));
	}

}

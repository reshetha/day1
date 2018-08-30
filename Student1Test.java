package com.capgemini.day6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.capgemini.day6.Student;
import com.capgemini.day6.Student1;

class Student1Test {

	@Test
	void test() 
	{
TreeSet<Student1>students1=new TreeSet<>();
		
		students1.add(new Student1("rani",1));
		students1.add(new Student1("pallavi",2));
		students1.add(new Student1("rita",3));
		students1.add(new Student1("tina",4));
	}
		
	}



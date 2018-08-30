package com.capgemini.day6;

public class Student1 implements Comparable<Student1>
{
	private String name;
	private int rollNo;
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student1(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", rollNo=" + rollNo + "]";
	}
	public int compareTo(Student1 students1)
	{
		return Integer.compare(this.rollNo, students1.rollNo);
		
	}}
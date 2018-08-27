package com.capgemini.day2.tests;

public class Interest {

	public static Object simpleInterest(double amount, double years, double Roi) 
	{
	double simpleInterest;
	return simpleInterest=(amount * years * Roi)/100;
	}
	public static Object CompoundInterest(double amount, double years, double Roi) 
	{
		double compoundInterest;
		return compoundInterest=amount * Math.pow(1.0+Roi/100.0,years) - amount;
	}

}

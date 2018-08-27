package com.capgemini.day2.tests;

import java.util.Scanner;

public class Armstrong 
{

	public static boolean checkArmstrongNumber(int num) 
	{
		int digit,number=num;
		int sum=0;
		 
//		System.out.println("Enter 3 digit number");
		while(num!=0)
		{
		digit=num %10;
		sum = sum + digit*digit*digit;
		num = num/10;
		}
		if(sum==number)
		{
		      return true;
		}
		else
		{
		return false;
		}
	}
}


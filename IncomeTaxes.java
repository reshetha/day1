package com.capgemini.day2.tests;

public class IncomeTaxes
{
  @SuppressWarnings("null")

public static double incometax(double salary)
{
	// TODO Auto-generated method stub
double tax;
if(salary >= 0 && salary<= 180000)
{
	return tax=0;
}
else if(salary >= 181001 && salary<= 300000)
{
	return tax =(salary*10/100);
}
else if(salary >= 300001 && salary<= 500000)
{
	return tax = (salary*20)/100;
}
else if(salary >=500001 && salary<= 1000000)
{
	return tax = (salary*30)/100;
	
}
else if (salary > 1000000)
{
	return tax = 1;
	
}
else if(salary < 0)
{
	return tax=2;
}
return (Double) null;
}
}

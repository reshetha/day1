package celius;
import java.util.Scanner;
public class tax 
{
public static void main(String[] args)
{
	double income;
	double tax=0;
	System.out.println("Enter the income amount");;
	Scanner s=new Scanner(System.in);
	income=s.nextDouble();
	if(income<0)
	{
		System.out.println("Income should be greater than 0");
	}
	else
	{
		if(income>=0&&income<=180000)
		{
			tax=0;
		}
		else if(income>=180001&&income<=300000)
		{
			tax=(income*10)/100;
		}
		else if(income>=300001&&income<=00000)
		{
			tax=(income*20)/100;
		}
		else if(income>=500001&&income<=1000000)
		{
			tax=(income*30)/100;
		}
		System.out.println(+tax);
		double ctc=income-tax;
		System.out.println("The ctc would be"+ctc);
	}
}
}

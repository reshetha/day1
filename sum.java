package celius;
import java.util.Scanner;

public class sum 
{
	public static void main(String args[])
	{
		float a,b,c,avg,tot;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a marks : ");
		a = s.nextFloat();
		System.out.print("Enter b marks : ");
		b = s.nextFloat();
		System.out.print("Enter c marks : ");
		c = s.nextFloat();
		tot = a + b + c;
		avg = tot/3;
		System.out.print("the tot is : " + tot +"the avg is: " +avg);
	}

}

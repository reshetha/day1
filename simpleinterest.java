package celius;
import java.util.Scanner;
public class simpleinterest 
{	
	public static void main(String args[])
	{
    float p,t,r,si,ci;
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the Principal : ");
	p = s.nextFloat();
	System.out.print("Enter the time : ");
	t= s.nextFloat();
	System.out.print("Enter the rate : ");
	r = s.nextFloat();
	si = (p * t * r) / 100;
	ci = (p*(1+r)/100);
	System.out.print("The si is : " + si +"The ci is : " +ci);
	
	
	}
}

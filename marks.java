package celius;
import java.util.Scanner;	
public class marks 
{	
	public static void main(String args[])
	{
     int a,b,c;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the marks of sub a ");
	a = sc.nextInt();
	System.out.print("Enter the marks of sub b ");
	b = sc.nextInt();
	System.out.print("Enter the marks of sub c ");
	c = sc.nextInt();
	if(a>=60&&b>=60&&c>60)
	{
		System.out.println("passed");
	}
	else if((a>=60&&b>=60)||(b>=60&&c>=60)||(a>60&&c>=60))
{
	System.out.println("promoted");
}
	else if((a>=60)||(b>60||c>=60)&&(a>60&&c>=60))
{
	System.out.println("failed");
}
else
{
	System.out.println("wrong");
}
}
}
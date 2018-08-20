package celius;
import java.util.Scanner;
public class cui 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String user="reshetha";
		String pass="8332012965";
		int count=0;
		while(count<3)
		{
			System.out.println("Enter username");
			String username=sc.nextLine();
			System.out.println("Enter password");
			String password=sc.nextLine();
			if(user.equals(username)&&pass.equals(password))
			{
				System.out.println("Welcome"+username);
				return;
			}
			else
			{
				count++;
				if(count!=3)
					System.out.println("Wrong username or password. Enter again");
			}
			
			
		}
		if(count==3)
			System.out.println("Contact Admin");
		
	}

}

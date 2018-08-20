package celius;

import java.util.Scanner;

public class Integer 
{
	public static void main(String[] args)
	{
		int x=0,y=0;
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Enter how many numbers do you want: ");
		int n = Integer.parseInt(inp.nextLine());
		
		int array[] = new int[n];
		for (int i=0; i< array.length; i++)
		{
			System.out.print("Enter the number");
			array[i] = inp.nextInt();
			
		}
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					x=Math.abs(i-j);
					y=j;
				}
			}
		}
		System.out.println("Give k value");
		Scanner in = new Scanner(System.in);
		int k=Integer.parseInt(in.nextLine());
		if(x>=k)
		{
			System.out.println("yes it is less than k");
		}
		else
		{
			System.out.println("no");
			
		}
		in.close();
		inp.close();
	}

	static int parseInt(String nextLine) {
		// TODO Auto-generated method stub
		return 0;
	}

}

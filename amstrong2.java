package celius;

public class amstrong2 
{
	public static void main(String args[])
	{
		for(int k=100;k<=1000;k++)
		{
			int temp = k;
			int sum = 0;
			while(temp > 0)
			{
				int d = temp%10;
				sum = sum +(d*d*d);
				temp = temp/10;
			}
			if(sum==k)
				System.out.println(k);
		}
	}

}

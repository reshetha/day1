package celius;
import java.util.Scanner;
public class name 
{
	public static void main(String[] args)
	{
		int flag=0;
		String[] names= {"Dave","Ann","George","Sam","Ted","Gag","Saj","Agati","Mary","Sam","Ayan","Dev","kity","Merry",
"Davis","Miller","Wilson","Moore","Taylor","Anderson","Thomas","jackson"};
  Scanner in = new Scanner(System.in);
		System.out.println("give the input name");
		String s=in.nextLine();
				for(int i=0;i<22;i++)
				{
					String x=names[i];
					if(s.equals(x))
					{
						flag++;
					}
				}
		if(flag!=0)
		{
			System.out.println("yes matched "+flag+ "times");
		}
		else
			System.out.println("not matched");	

}
}
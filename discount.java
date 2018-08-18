package celius;
import java.util.Scanner;
public class discount 
{
	public static void main(String[] args)
	{
		int newItem,discount,newItemPrice;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the new item price: ");
		newItem=Integer.parseInt(in.next());
		discount=(newItem*35)/100;
		System.out.println("the discount amount is"+discount);
		newItemPrice=newItem-discount;
		System.out.println("the new amount is"+newItemPrice);
	}
}

package celius;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c, n, search, array[];
		 
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter number of elements");
	    n = s.nextInt(); 
	    array = new int[n];
	 
	    System.out.println("Enter " + n + " integers");
	 
	    for (c = 0; c < n; c++)
	      array[c] = s.nextInt();
	 
	    System.out.println("Enter value to find");
	    search = s.nextInt();
	 
	    for (c = 0; c < n; c++)
	    {
	      if (array[c] == search)     /* Searching element is present */
	      {
	         System.out.println(search + " is present at location " + (c + 1) + ".");
	          break;
	      }
	   }
	   if (c == n)  /* Element to search isn't present */
	      System.out.println(search + " not present in array.");
	}

}
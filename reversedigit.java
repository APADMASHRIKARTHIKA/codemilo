package compare;

import java.util.Scanner;

public class reversedigit {
	public static void main(String[] args)
	{
		int n,reverse = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to be reversed");
		n = s.nextInt();
		 while( n != 0 )
	      {
	          reverse = reverse * 10;
	          reverse = reverse + n%10;
	          n = n/10;
	      }
	 
	      System.out.println("Reverse of entered number is "+reverse);
	   }
		
		
		
		
	}


package compare;

import java.util.Scanner;

public class fact {
	public static void main(String[] args)
	{
		 int i,fact=1;  
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter the number");
		 int number = s.nextInt();//It is the number to calculate factorial    
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }  
	}

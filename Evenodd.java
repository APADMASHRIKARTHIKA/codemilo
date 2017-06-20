package evenodd;

import java.util.Scanner;

public class evenodd {
	public static void main(String[] args)
	{
		  	int number;
	        Scanner s = new Scanner(System.in);
	        System.out.print("ENTER THE NUMBER TO CHECK:");
	        number = s.nextInt();
	        if(number % 2 == 0)
	        {
	            System.out.println("The given number "+number+" is Even");
	        }
	        
	        else
	        {
	            System.out.println("The given number "+number+" is odd ");
	        }	
	}


      
    }

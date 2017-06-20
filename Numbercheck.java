package numbercheck;

import java.util.Scanner;

public class numbercheck {
	public static void main(String[] args)
	{
		  	int number;
	        Scanner s = new Scanner(System.in);
	        System.out.print("ENTER THE NUMBER TO CHECK:");
	        number = s.nextInt();
	        if(number > 0)
	        {
	            System.out.println("The given number "+number+" is Positive");
	        }
	        else if(number < 0)
	        {
	            System.out.println("The given number "+number+" is Negative");
	        }
	        else
	        {
	            System.out.println("The given number "+number+" is neither Positive nor Negative ");
	        }	
	}


      
    }

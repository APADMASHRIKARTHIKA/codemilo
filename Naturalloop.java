import java.util.Scanner;
public class numbers {
	public static void main(String[] args)
	{
	     { 
	        int n,i=1,sum=0; 
	        Scanner input=new Scanner(System.in); 
	        System.out.print("Enter Number count:"); 
	        n=input.nextInt(); 
	        System.out.print("Enter Number one by one :"); 
	        int num;
			for(i=1;i<=n;i++)
			{
	        	num = input.nextInt();
			sum =sum+num;
	     }
	       System.out.println("sum of the natural number is"+sum); 
	               
	     } 
	      
	} 
}

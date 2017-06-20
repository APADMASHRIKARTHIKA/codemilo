import java.util.Scanner;
public class digit {
	public static void main(String[] args)
	{
	     { 
	        int n,i=0;  
	        Scanner input=new Scanner(System.in); 
	        System.out.print("Enter Number count:"); 
	        n=input.nextInt(); 
	        while(n>0)
	        {
	        	n=n/10;
	        i++;
	     }
	        System.out.println("the number of digits" +i);
}
}
}

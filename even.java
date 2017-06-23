package set;

import java.util.Scanner;

public class even {
	public static void main(String[] args)
	{
		int n,m,i = 0;
		System.out.println("Enter the number m");
		Scanner s1=new Scanner(System.in);
		m= s1.nextInt();
		System.out.println("ENter the number n");
		Scanner s2=new Scanner(System.in);
		n= s2.nextInt();
		for(i=m;i<=n;i++)
		{
		if(i%2==0)
			System.out.println(i);
		}
		
		
	}

}

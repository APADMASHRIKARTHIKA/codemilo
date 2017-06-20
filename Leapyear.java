import java.util.Scanner;
public class leapyear {
	public static void main(String[] args)
	{
		int i=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year to check");
		i = s.nextInt();
		if(i%4==0)
			System.out.println("The given year is Leap Year");
		
		else
			System.out.println("The given year is not Leap Year");
	}

}

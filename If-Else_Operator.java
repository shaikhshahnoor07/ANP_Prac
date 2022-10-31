// WAP to accept a no from the user and check is positive or negative.
import java.util.Scanner;

public class If_Else_Demo {

	public static void main(String[] args)
	{
		int num1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Numbers");
		num1=sc.nextInt();
		
		if(num1>0) //Condition for checking the no is positive or not
		{
			System.out.println("The number is positive"+ num1);
		}
		else
		{
			System.out.println("The number is negative"+ num1);
		}
		
	}

}

import java.util.Scanner;

public class If_Else_Operator {

	public static void main(String[] args)
	{
		int num1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		num1=sc.nextInt();
		
		if(num1>0) //Condition for checking the no is positive or not
		{
			System.out.println("The number " +num1+" is positive");
		}
		else
		{
			System.out.println("The number "+ num1 +" is negative");
		}
		
	}

}

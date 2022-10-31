// WAP to accept a no from the user and if no is even than find out the square

import java.util.Scanner;
public class If_Operator{
    public static void main(String[] args){
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number : ");
        n = sc.nextInt();
        if(n%2==0){
            System.out.println("The square is : "+n*n);
        }
    }
}

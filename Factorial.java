import java.util.*;
import java.util.Scanner;

public class Factorial{
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int i=sc.nextInt();
		int fact=1;
		for(int c=1;c<=i;c++)
		{
			fact=fact*c;
		}
		System.out.println("Factorial of "+i+"is : " +fact);
    }	
}
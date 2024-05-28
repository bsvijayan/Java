import java.util.*;


import java.util.Scanner;
public class PrimeNo{
    
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int i=sc.nextInt();
		for(int c=2;c<i/2;c++)
		{
			if(i%c==0)
			{
				System.out.println("Not a prime no");
				return;
			}
		}
		System.out.println("Prime no");
	}
}
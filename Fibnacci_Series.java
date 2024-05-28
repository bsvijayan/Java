import java.util.*;


import java.util.Scanner;

public class Fibnacci_Series
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int fib=sc.nextInt();
        int next=1,first=0,val=0;
        for(int i=0;i<fib-1;i++)
        {
        	System.out.println(first);
        	val=first+next;
        	first=next;
        	next=val;
        }
        System.out.println("Fibnacci : "+val);
	}
}
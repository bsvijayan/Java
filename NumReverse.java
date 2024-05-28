import java.util.*;


import java.util.Scanner;
public class NumReverse{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int input=sc.nextInt();
		int mod=0,value=input,reverse=0;
		while(value>0)
		{
			mod=value%10;
			reverse=reverse*10+mod;
			value=value/10;
			
		}
		System.out.println("Reverse of No : "+reverse);
    }
}
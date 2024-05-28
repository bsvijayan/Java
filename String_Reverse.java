import java.util.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        String str="VIKIKIV";
		StringBuilder sb=new StringBuilder(str);
		int j=0;
		for(int i=str.length()-1;i>(str.length())/2;i--)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				System.out.println("Not a palindrome");
				return;
			}
			j++;
		}
		System.out.println("String is palindrome : "+sb);
    }
}

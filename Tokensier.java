import java.util.*;
import java.util.Scanner;

public class Tokeniser
{
	public static String FormatToken(String str,int k)
	{
		str=str.replaceAll("-", "").toUpperCase();
		StringBuilder out=new StringBuilder();
		int length=str.length();
		int firstVal=str.length()%k;
		
		if(firstVal > 0)
		{
			out.append(str.substring(0,firstVal));
			if(length>k) out.append("-");
		}
		for(int i=firstVal;i<length;i+=k)
		{
			out.append(str.substring(i,Math.min(i+k, length)));
			if(i+k< length) out.append("-");
		}
		
		return out.toString();
	}
	public static void main(String args[])
	{
		String str="THIS-IS--1";
		String formattedKey=FormatToken(str,5);
		System.out.println(formattedKey);
	}
}
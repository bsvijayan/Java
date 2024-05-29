package com.singleExampe;
import java.util.Scanner;
import java.util.*;

/*String and Char Utils */
//1.Count no of words
//2.String to Char array conversion.
//3.Character Utils
public class StringUtils {

	public static void main(String args[])
	{
	   String str="New Sample String for example1 Java2 Program";
	   int    count=str.split("\\s").length;
	   System.out.println("Count of words : "+count);
	   
	   //String to Character array
	   char[] charArray=str.toCharArray();
	   for(int i=0;i<charArray.length;i++)
	      System.out.println(charArray[i]);
	   
	   //Find whitespace and numerics in a array
	   int spaceCount=0,digitCount=0;
	   for(int i=0;i<charArray.length;i++)
	   {
		   if(Character.isWhitespace(charArray[i]))
			   spaceCount++;
		   if(Character.isDigit(charArray[i]))
			   digitCount++;
	   }
	   System.out.println("Space Count   :   "+spaceCount);
	   System.out.println("Numeric Count :   "+digitCount);
		   
		   
    }
}

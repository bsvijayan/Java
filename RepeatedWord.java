package com.singleExampe;
import java.util.Scanner;
import java.util.*;
/* This program find the most Repeated word in a String and prints the word and it's occurrence */
public class RepeatedWord {

	public static void main(String args[])
	{
		String str="This is Sample program for repeated is word is";
		HashMap<String,Integer>strHashMap=new HashMap<String,Integer>();
		String word=null;
		int count=0;
		Scanner sc=new Scanner(str);
		while(sc.hasNext())
		{
			word=sc.next();
			count=strHashMap.getOrDefault(word,0);
			strHashMap.put(word,++count);
			
		}
	    int maxCount=0;
	    String maxOccuredString=null;
		for(Map.Entry<String,Integer> entry: strHashMap.entrySet())
		{
			if(entry.getValue() >maxCount)
			{
				maxCount=entry.getValue();
				maxOccuredString=entry.getKey();
			}
			
		}
		sc.close();
		System.out.println("Highest Repeated String :  "+maxOccuredString+": Count  "+maxCount);
   }
}

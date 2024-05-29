
package com.singleExampe;
import java.util.HashMap;
import java.util.Map.Entry;
/**
 * This program returns the top repeating character in a String
 */
public class TopRepeatingCharacter {
	public static void main(String[] args) {
		 String str="Test string to idenfify repeated characters";
		   HashMap<Character,Integer>chMap=new HashMap<Character,Integer>();
		   int count=0;
		   int topCount=-1;
		   char ch=' ';
		   for(int i=0;i<str.length();i++)
		   {
	;		   count = chMap.getOrDefault(str.charAt(i),0);
			   chMap.put(str.charAt(i),++count);
			   if(topCount < count)
			   {
				   topCount=count;
				   ch=str.charAt(i);
			   }
		   }
			   
		   for(Entry<Character,Integer>entry:chMap.entrySet())
			   System.out.println("Char : "+entry.getKey()+" Count : "+entry.getValue());
		   
		   System.out.println("Top Repeating Character : "+ch+" Count : "+topCount);

	}

}

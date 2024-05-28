import java.util.*;


import java.util.Scanner;

public class StringUtil {

	public static void main(String args[])
	{
		String str="This is for test";
		str=str.replace("T","-");
		str=str.concat("TEET");
		if(str.contains("T"))
			System.out.println("CONTAINS T");
		System.out.println("String Replace     :"+str.replace("test","S"));
		System.out.println("String Replace All :"+str.replaceAll("test","S"));
		System.out.println(str.charAt(10));
		System.out.println(str);
	}
}
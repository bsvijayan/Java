package com.java.test.programs;

import java.util.*;
 class StringBase
{    
	 public int val1;
	 public int val2;
	 public StringBase()
	 {
		 System.out.println("Default Base constructor");
	 }
	 public StringBase(int i,int j)
	 {
		 System.out.println("Called");
	     val1=i;
	     val2=j;
	     System.out.println("Value is :"+val1+" "+val2);
	 }
	
}
 class StringDerived extends StringBase
 {
	 public StringDerived()
	 {
		 System.out.println("Default Derived constr");
	 }
	 
	 
	 public void printValues()
	 {
		 System.out.println("Testing this");
	 }
 }
public class stringFunc extends StringBase
{
	public static void main(String[] args) {
        StringDerived SD=new StringDerived();
        SD.printValues();
		System.out.println("INside");
	}
}

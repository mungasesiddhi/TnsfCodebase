package com.DAY8.Stringss;

public class SampleStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[]= {'I','N','D','I','A'};
		
		//string declaration using object Format
		String s1=new String(c);
		System.out.println(s1);
		
		String s2=new String(s1);
		System.out.println(s2);
		
		String longstr="This is the "+"Conacatination of "+"strings";
		System.out.println(longstr);
		

	}

}

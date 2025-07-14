package com.DAY8.Stringss;

public class StringOperationsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1=new String(" Indian ");
		System.out.println(s1);
		
		String s2=s1.toUpperCase();
		System.out.println(s2);
		
		System.out.println(s1.length());
		
		String s3=s1.substring(2);
		System.out.println(s3);
		
		String s4=s1.substring(1, 3);
		System.out.println(s4);
		
		System.out.println(s1.trim());  //used to remove spaces
		System.out.println(s1.stripTrailing());
		
		//string comparison
		s2=new String(s1);  //new instance is created for s2(new memory created for s2)
		
		//==  -->object reference (check whether memory is same or not)
		
		//equals -->check data
		
		System.out.println("case 1:"+s1.equals(s2));
		
		System.out.println("case 2:"+s1==s2);
		
	}

}

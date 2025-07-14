package com.DAY8.Stringss;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating string----pool memory
		
		String s1="TNSIF";
		String s2="TNSIF";
		
		//creating new String-----heap memory
		
		String s3=new String("TNSIF");  //here always new memory is created
		
		//s3 and s4 have different memory
		
		String s4=new String("TNSIF");//new memory  created because new is there
		
		
		//== checks memory   equals will check only data
		System.out.println("case 1:"+(s1==s2)); //true
		System.out.println("case 2:"+(s1==s3)); //false
		System.out.println("case 1:"+(s2.equals(s1))); //true
		System.out.println("case 1:"+(s2.equals(s4))); //true
		System.out.println("case 1:"+(s3==s4)); //false
		System.out.println("case 1:"+(s3.equals(s4))); //true
		
		
		//use of hashcode
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		//compare by using compareto
		
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareToIgnoreCase(s4));
		
		
		

	}

}

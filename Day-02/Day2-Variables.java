package com.TNSIF.D1;

public class Variables {
	public static void main(String[] args) {
		//variables
		int a=12;
		System.out.println(a);
		
		float f=12f/5f;
		System.out.println(f);
		
		double val=123d/6d;
		System.out.println(val);
		
		int radius=10;
		float Area=3.14f*radius*radius;
		System.out.println(Area);
		
		//Character
		char ch=65;
		System.out.println(ch);
		
		char c='V' ;
		System.out.println(c);
		
		//Assigninng unicode to char
		 char val1='\u00A7';
		 System.out.println(val1);
		 
		 //Byte-8bit.. from -128 to 127
		 byte v1=127;
		 byte v2=-128;
		 
		 //short ----2 byte 
		 short max=32767;
		 short min =-32768;
		 
		 //int ---4 byte
		 
		 boolean flag1=true;
		 boolean flag2=false;
		 
		 //widening or implicit type casting
		 //byte->short->int->long->float->double
		 
		 byte b=10;
		 int i=b;
		 System.out.println(i);
		 
		 //narrowing or explicit type casting
		 float f1=103.4f;
		 int i1=(int)f1;
		 System.out.println(i1);		 			
	}
}

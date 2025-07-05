package com.TNSIF.D1;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * operators:
		 * pre-increment:
		 * post-increment:
		 */
		int a=10;
		int b=20;
		int x=10;
		System.out.println("value of a before operation:"+a+" "+"and the value of b is:"+b);
		a++;  
		//10 if use further then +1
		// 12     20    11    11   12
		int c= (++a)+(b++)-(--a)+(a++)+(a);
		System.out.println(c);
	}

}

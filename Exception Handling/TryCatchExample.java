package com.DAY9.Exceptionhandling;

public class TryCatchExample {
	public static void performDivision(int x,int y) {
		System.out.println("i am in method:");
		try {
			System.out.println("i am in try block");
			int z=x/y;
			System.out.println("Result of z is:"+z);
		
		}
		catch(ArithmeticException a) {
			
			//System.out.println("Arithmetic Exception....");
			System.err.println("I am in catch block:"+a.getMessage());
		}
	
		
		
	}

}

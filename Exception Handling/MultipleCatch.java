package com.DAY9.Exceptionhandling;
import java.util.*;


public class MultipleCatch {
	
	public static void Divide(){
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		try {
			a=sc.nextInt();
			b=sc.nextInt();
			
			c=a/b;
			System.out.println("Division is: "+c);
		}
		/*catch(InputMismatchException e) {
			System.err.println(e.getMessage());
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}*/
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
		finally {
			sc.close();
			System.out.println("Finally block");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		MultipleCatch.Divide();
		

	}

}

package com.Day7.Polymorphism2.overriding;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//dynamic binding
		RBI r;
		r=new SBI();
		System.out.println(r.getRateofInterest());
		
		
		r=new ICICI();
		System.out.println(r.getRateofInterest());
		
	}
}
		
		
		

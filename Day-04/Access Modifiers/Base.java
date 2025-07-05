package com.tns.oop;

public class Base {
	
	//Access Modifiers
	
	int a=10;
	public int b=20;
	private int c=40;
	protected int d=15;
	
	//methods
	void def() {
		System.out.println("default access....");
		System.out.println("default variable:"+a);
	}
	
	public void b1() {
		System.out.println("public access....");
		System.out.println("public variable:"+b);
	}
	
	private void b2() {
		System.out.println("private access....");
		System.out.println("private variable:"+c);
	}
	protected void b3() {
		System.out.println("protected access....");
		System.out.println("protected variable:"+d);
	}

}

package com.Day7.Abstractraction;

public  abstract class Shape {
	
	protected float area;
	
	//abstract method
	public abstract void calArea();
	
	//solid method
	public void show() {
		System.out.println("Area of shape is: "+area);
	}

}

package com.Day7.Abstractraction;

public class Rectangle extends Shape {
	
	float width;
	float height;
	
	
	public Rectangle() {
		width=3.4f;
		height=5.6f;
	}
	public Rectangle(float width, float height) {
		super();
		this.width = width;
		this.height = height;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	@Override
	public void calArea() 
	{
		this.area=width*height;
		
	}
	

}

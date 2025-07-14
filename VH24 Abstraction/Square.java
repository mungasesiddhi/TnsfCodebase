package com.Day7.Abstractraction;

public class Square extends Shape {
	float side;
	
	 public Square(){
		side=20f;
	}
	
	public Square(float side) {
		super();
		this.side = side;
	}

	@Override
	public void calArea() {
		this.area=side*side;   ///this area from parent
		
	}
	

}

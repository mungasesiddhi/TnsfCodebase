package com.Day7.Abstractraction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//we cannot create the object of abstract class
		//Shape sh;
		//sh=new Shape();
		
		Shape s;
		
		s=new Rectangle();
		s.calArea();
		s.show();
		
		s=new Square(25.5f);
		s.calArea();
		s.show();
		

	}

}

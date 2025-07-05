package com.Day6.SandF;

public class Main {

	public static void main(String[] args) {
		
		//To called static method
		Staticclasss.display();
		
		//creating object
		Staticclasss sc=new Staticclasss();
		System.out.println(sc);
		
		//this will update the value of srno in static so it will provide the output
		Staticclasss.display();
		
		//only srno is updated section is binded with object so new memory allocation everytime so it always starts from initial value
		//but for srno binded with class no new memory allocation
		Staticclasss sc1=new Staticclasss();
		System.out.println(sc1);

	}

}

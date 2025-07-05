package com.Day6.SandF;

public class Staticclasss {
	
	private int section;
	private static int srNo;
	
	
	//static block
	//automatically called at runtime without creating object or calling it
	static 
	{
		System.out.println("within static block.....");
		//cannot assigned value to section because it is non static ...so we cannot assigned values tot he non static in static
		srNo=10000;
	}
	
	//default constructor
	Staticclasss()
	{
		System.out.println("This is my default constructor.....");
		srNo++;
		section++;
	}

	@Override
	public String toString() {
		//to string only print the value which have object so only non static can access so manually access static
		return "Staticclasss [ Serial no= "+srNo+",section=" + section + "]";
	}
	
	//display static method
	static void display() {
		//cannot display non static because method is static
		System.out.println("Serial no:"+srNo);
	}
	
	

}



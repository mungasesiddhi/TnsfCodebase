package com.Day6.SandF;

public class FinalVariables {
	
	//final int x;//final variable must be initialized
	//nonstatic var
	final int x=30;
	
	final  static int z;
	
	//static var
	final static int y=20;

	@Override
	public String toString() {
		return "FinalVariables [x=" + x +","+"y="+y+"]";
	}
	
	static {
		z=10;
		
	}
	
	
}

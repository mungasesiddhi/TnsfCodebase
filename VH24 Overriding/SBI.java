package com.Day7.Polymorphism2.overriding;

public class SBI extends RBI{
	
	@Override
	public float getRateofInterest() 
	{
		System.out.println("base rate of interest for home loan");
		return 4.5f;
		
	}

}

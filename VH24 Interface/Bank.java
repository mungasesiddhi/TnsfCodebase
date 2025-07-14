package com.Day7.Abstraction.Interface;

public interface Bank {
	
	 final static float MINBAL=2000;//you can write it as float minbal 
	final static float Deposit_limit=25000;
	
	public void deposit(float amount);
	public void withdraw(float amount);
	

}

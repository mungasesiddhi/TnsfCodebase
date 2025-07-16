package com.DAY11.ThreadSynchronization;

//this is user defined exception which we need to implement in the class
public class DepositLImitException extends Exception {
	
	public DepositLImitException() {
		super("Daily limit of deposit exceed.....");
	}
	public DepositLImitException(String str) {
		super(str);
	}
	
	

}

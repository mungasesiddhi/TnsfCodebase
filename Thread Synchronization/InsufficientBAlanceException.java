package com.DAY11.ThreadSynchronization;

public class InsufficientBAlanceException extends Exception {
	public  InsufficientBAlanceException() {
		super("insufficient balance...");
	}
	public  InsufficientBAlanceException(String msg) {
		super(msg);
	}

}

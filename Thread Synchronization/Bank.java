package com.DAY11.ThreadSynchronization;

public interface Bank {
	
	static final int MINBAL=5000;
	static final int DAILY_LIMIT=25000;
	void deposit(int amt)throws DepositLImitException;
	void withdraw(int amt)throws InsufficientBAlanceException;
	

}

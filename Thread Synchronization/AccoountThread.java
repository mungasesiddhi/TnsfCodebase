package com.DAY11.ThreadSynchronization;

public class AccoountThread extends Thread{
	
	private Account acc;
	private int amt;
	
	//para const
	public AccoountThread(Account acc, int amt) {
		super();
		this.acc = acc;
		this.amt = amt;
		start();
	}
	@Override
	public void run() {
		try {
			acc.withdraw(amt);
		}
		catch(InsufficientBAlanceException e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	

}

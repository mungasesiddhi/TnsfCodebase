package com.DAY11.ThreadSynchronization;

public class Account implements Bank{

	private int acno;
	private String name;
	private double balance;
	
	//getter setter
	public int getAcno() {
		return acno;
	}

	public void setAcno(int acno) {
		this.acno = acno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	//d const
	
	public Account() {
		System.out.println("Default const");
	}
	//para const

	public Account(int acno, String name, double balance) {
		super();
		this.acno = acno;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [acno=" + acno + ", name=" + name + ", balance=" + balance + "]";
	}

	@Override
	public void deposit(int amt) throws DepositLImitException {
		// TODO Auto-generated method stub
		if(amt>25000)
			throw new DepositLImitException("DAilt limit exceed");
		
		else {
			balance+=amt;
			System.out.println("Amount deposited: "+amt);
		}
	}

	@Override
	public synchronized void withdraw(int amt) throws InsufficientBAlanceException {
		// TODO Auto-generated method stub
		if(balance - amt < MINBAL)
			throw new InsufficientBAlanceException();
		else {
			balance=balance-amt;
			System.out.println("After withdrawing rs: "+amt+"Current balance is rs: "+balance);
		}
		
	}
	

}

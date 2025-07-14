package com.Day7.Abstraction.Interface;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount sa=new SavingAccount("Zeel","Pune",12345688,36000);
		
		sa.deposit(40000);
		System.out.println(sa);
		
		sa.withdraw(3500);
		System.out.println(sa);

	}

}

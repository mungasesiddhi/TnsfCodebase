package com.DAY11.ThreadSynchronization;

public class Main {

	public static void main(String[] args) throws InsufficientBAlanceException {
		// TODO Auto-generated method stub
		
		Account heti=new Account(1001,"Heti",56000);
		System.out.println(heti);

		
		//heti.withdraw(7000);
		//instead of this use synchronized 
		
		 AccoountThread t[]=new  AccoountThread[10];
		 for(int i=0;i<10;i++) {
			 t[i]=new  AccoountThread(heti,1000*(i+1));
		 }
		 try {
			 for(int i=0;i<10;i++) {
				 t[i].join();
			 }
		 }
		 catch(InterruptedException e) {
			 System.err.println(e.getMessage());
		 }
		 
		 System.out.println("---------------------------------------------");
		 System.out.println(heti);
	}

}

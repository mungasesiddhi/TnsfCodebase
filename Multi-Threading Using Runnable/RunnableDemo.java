package com.DAY11.MultithreadingUSingRunnable;

public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r=new UsingRunnable (10,1,"hii");
		Thread t1=new Thread(r);
		t1.start();
		
		

	}

}

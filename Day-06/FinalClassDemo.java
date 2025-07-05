package com.Day6.SandF;

final class Demo{
	
	void show() {
		System.out.println("Final parent class.....");
	}
}
//class demochild extends demo{}cannot do it because it is final class so we cannot extend it

public class FinalClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1=new Demo();
		d1.show();

	}

}

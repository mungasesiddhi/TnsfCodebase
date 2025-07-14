package com.DAY8.NestedDemo;

public class NestedDemo implements OuterInterface,OuterInterface.InnerInterface{

	@Override
	public void CalArea() {
		// TODO Auto-generated method stub
		System.out.println("This is an outer interface");
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("this is an inner interface having variable id :"+id);
		
	}
	

}

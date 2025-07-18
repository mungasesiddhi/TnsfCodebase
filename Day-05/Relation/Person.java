package com.D5.HasaRelation;

public class Person {
	
	private String name;
	private Address address;
	
	
	public Person(String name, Address address) {
		
		this.name = name;
		this.address = address;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	
	//method to display person info
	public void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Address:"+address.getStreet()+","+address.getState()+","+address.getPostalcode()+","+address.getCity());
		
	}


	//to string method
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	
	
	
		
	
	
	
	

}

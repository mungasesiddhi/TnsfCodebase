package com.D5.HasaRelation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating address object
		Address ad=new Address("Laxmi Road","Pune","Maharashtra","432140");
		
		//Accessing person
		Person p=new Person("Vriti",ad);
		
		//displaying output (whole output)
		p.display();
		
		//displaying output using tostring.. it only display name and memory address of address class that's why we created display method so we can access content from address class
		System.out.println(p);

	}

}

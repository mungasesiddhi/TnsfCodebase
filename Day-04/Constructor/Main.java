package com.tns.D4;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String name,city;
		int id;
		System.out.println("Enter your id: ");
		id=sc.nextInt();
		System.out.println("Enter your name: ");
		name=sc.next();
		
		System.out.println("Enter city:");
		city=sc.next();
		
		
		Customer c1=new Customer();
		c1.setCusid(id);
		c1.setCustcity(city);
		c1.setCustomername(name);
		
		//System.out.println(c1.getCusid());
		
		System.out.println(c1);
		
		Customer c2=new Customer(name,id,city);
		System.out.println(c2);
		

	}

}

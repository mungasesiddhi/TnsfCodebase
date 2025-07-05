package com.Tax.project;
import java.util.*;
public class PersonDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String name;
		System.out.println("Enter the person name:");
		name=sc.next();
		System.out.println("Enter Age:");
		int age=sc.nextInt();
		System.out.println("Enter Gender:");
		String gender=sc.next();
		System.out.println("Enter the mobile number:");
		long mobileNumber=sc.nextLong();
		System.out.println("Enter income:");
		int income=sc.nextInt();
		
		Person p1=new Person();
		p1.setName(name);
		p1.setAge(age);
		p1.setGender(gender);
		p1.setMobileNumber(mobileNumber);
		p1.setIncome(income);
		
		//display using getter
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1.getGender());
		System.out.println(p1.getMobileNumber());
		System.out.println(p1.getIncome());
		System.out.println(p1.getTax());
		
		//display using tostring
		System.out.println(p1);
		
		TaxCalculation t1=new TaxCalculation();
		t1.calculateTax(p1);
		System.out.println("After calculation of tax:");
		
		System.out.println(p1);
	}

}

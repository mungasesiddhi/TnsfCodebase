package com.Dayy5.Hierarchical;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		
		System.out.println("------person detail------");
		System.out.println(p);
		
		//Student s=new Student();
		System.out.println("-----------------------------------------------------------------");
		//dynamic binding
		//instead of creating multiple objects we created reference of parent class
		
		Person p1;
		p1=new Person("hrutu","pune");
		System.out.println("person details"+p1);
		
		p1=new Student("sakshi","mumbai","sy",67.85f);
		System.out.println("student details:"+p1);
		
		p1=new Employee("isha","nagar",1002,4500000,"It");
		System.out.println("employee details:"+p1);
		
		

	}

}

package com.DAY9.SingleDimentionalDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Student s=new Student();
		Student[] arr;
		
		//declaring memory for 5 object or type students
		arr=new Student[5];
		
		arr[0]=new Student(101,"revati");
		arr[1]=new Student(102,"Stira");
		arr[2]=new Student(103,"tira");
		arr[3]=new Student(104,"ira");
		arr[4]=new Student(105,"Rira");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Elements in array:"+i+":"+arr[i].getRollno()+"\t"+arr[i].getName());

	}
	}
}



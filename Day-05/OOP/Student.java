package com.Day5.OOP;

//derived class
public class Student extends Citizen {
	
	//accessing this three from parent
	//private String sname;
	//private String address;
	//private long sphone;
	private int rollno;
	private String collegename;
	
	//non para
	public Student() {
		super();
	}
	
	//para const
	public Student(String name, String adharno, String address, long phone,int rollno, String collegename) {
		super(name,adharno,address,phone);
		this.rollno = rollno;
		this.collegename = collegename;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	
	//in this we have to access members of parent and student so select inherited methods and check them

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegename=" + collegename + ", getName()=" + getName()
				+ ", getAdharno()=" + getAdharno() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone()
				+ "]";
	}
	
	
	
}

package com.tns.oop;

public class Encapsulation {
	private int Serialnum;
	private String num;
	private int age;
	
	public int getSerialnum() {
		return Serialnum;
	}
	public void setSerialnum(int serialnum) {
		Serialnum = serialnum;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Encapsulation [Serialnum=" + Serialnum + ", num=" + num + ", age=" + age + "]";
	}
	
	

}

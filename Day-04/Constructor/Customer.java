package com.tns.D4;

public class Customer {
	
	private String customername;
	private int cusid;
	private String custcity;
	
	//default constructor
	Customer(){
		System.out.println("Default constructor........");
	}
	
	//parameterized const
	
	public Customer(String customername, int cusid, String custcity) {
		
		System.out.println("This is prameterized constructor.....");
		this.customername = customername;
		this.cusid = cusid;
		this.custcity = custcity;
	}
	
	//getter/setter

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public int getCusid() {
		return cusid;
	}

	public void setCusid(int cusid) {
		this.cusid = cusid;
	}

	public String getCustcity() {
		return custcity;
	}

	public void setCustcity(String custcity) {
		this.custcity = custcity;
	}

	
	//toStrinf
	@Override
	public String toString() {
		return "Customer [customername=" + customername + ", cusid=" + cusid + ", custcity=" + custcity + "]";
	}
	
	
	
	
	
	
	

}

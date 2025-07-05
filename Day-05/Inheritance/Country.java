package com.Da5.Multiinh;

public class Country {
	
	private String countryname;
	private String capital;
	
	
	//getter-setter
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	//To string
	@Override
	public String toString() {
		return "Country [countryname=" + countryname + ", capital=" + capital + "]";
	}
	
	

}

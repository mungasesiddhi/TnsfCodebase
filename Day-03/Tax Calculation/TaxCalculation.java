package com.Tax.project;


public class TaxCalculation {
	
	//Function to calculate tax
	public void calculateTax(Person p) {
		
		if(p.getAge()>65 || p.getGender().equalsIgnoreCase("female"))
		{
			p.setTax(0);
			System.out.println("Tax is not applicable....");
		}
		else
		{
			if(p.getIncome()<=160000)
			{
				p.setTax(0);
				System.out.println("Tax is not applicable");
			}
			else if(p.getIncome()>160000 && p.getIncome()<=500000) {
				p.setTax((p.getIncome()-160000)*10/100);
			}
			else if(p.getIncome()>500000 && p.getIncome()<=800000) {
				p.setTax((p.getIncome()-500000)*20/100+34000);
			}
			else
			{
				p.setTax((p.getIncome()-800000)*30/100+94000);
			}
		}
	}

}

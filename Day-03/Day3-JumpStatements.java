package com.TNSIF.D1;
import java.util.*;
public class JumpStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//continue
	
		for(int k=5;k<15;k++) {
			//to skip odd number
			//continue----skip
			if(k%2!=0) {
				continue;
				}
			System.out.println(k+" ");
		}
		
		//break----stop
		for(int i=1;i<10;i++) {
			System.out.println("helooooo devisha.....");
			break;
		}
		
		//switch case
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice from 1 to 7: ");
		int day=sc.nextInt();
		switch(day) {
		case 1:
			System.out.println("Mon");
			break;
		
		case 2:
			System.out.println("Tue");
			break;
			
		case 3:
			System.out.println("Wed");
			break;
			
		case 4:
			System.out.println("Thu");
			break;
			
		case 5:
			System.out.println("Fri");
			break;
			
		case 6:
			System.out.println("sat");
			break;
			
		case 7:
			System.out.println("Sun");
			break;
			
		default:
			System.out.println("Invalid input");
		}

	}

}

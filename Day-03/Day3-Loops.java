package com.TNSIF.D1;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100;
		//for loop-when you know the starting and ending point
		for(int i=1;i<=n;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		//while loop-starting and ending points are not known
		int j=1;
		
		
		while(j<=n) {
			System.out.print(j+" ");
			
			j++;
		}
		System.out.println();
		//do while loop
		int k=10;
		do {
			System.out.print(k+" ");
			k++;
		}while(k<n);
		
		System.out.println();
		//for each loop
		int []a= {20,30,40,50};
		for(int n1:a) {
			System.out.print(n1+" ");
		}
	}

}

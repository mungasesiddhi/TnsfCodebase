package com.DAY8.Arrays;

class arrayop{
	
	static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			System.out.println();
		}
		
	}
	//to get sum of number
	public static int getSum(int... n) {
		int sum=0;
		for(int no:n) 
			sum+=no;
		return sum;
		
	}
	//count odd number
	public static int getOddCount(int b[]) {
		int count=0;
		for(int i=0;i<b.length;i++) {
			if(b[i]%2!=0)
				count++;
		}
		return count;
	}
}

public class ArrayOperations
{
	public static void main(String[] args)
	{
			int n=10;
			int a[];  //declaration
			a=new int[n];  //instantiation
			
			//displaying the array
			arrayop.printArray(a);
			
			System.out.println();
			//Assigning the values
			for(int i=0;i<a.length;i++) {
				a[i]=5*i;
				arrayop.printArray(a);
				
			}
			System.out.println();
			int b[]= {10,20,30,40,50};
			arrayop.printArray(b);
			
			System.out.println("sum of elements in arary a:"+arrayop.getSum(a));
			System.out.println("sum of elements in arary a:"+arrayop.getSum(b));
			
			
	}
	
}
	

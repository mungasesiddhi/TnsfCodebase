package com.DAY8.Arrays;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//get the array
		int arr[]= {69,20,45,66,21,23};
		
		//print
		System.out.println(Arrays.toString(arr));
		
		//print using for each loop
		for(int a:arr) {
			System.out.println(a);
		}
		
		//print using for loop
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//sort
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//binary search
		System.out.println(Arrays.binarySearch(arr, 23));
		
		System.out.println(Arrays.binarySearch(arr, 50));//if not present it returning the index postion where you can add data
		
		//----comparison
		System.out.println(Arrays.toString(arr));
		
		//get the second array
		int arr2[]= {69,21,66,45,20,23};
		
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		if(Arrays.compare(arr, arr2)==0) {
			System.out.println("Both arrays are same");
		}
		else {
			System.out.println("Arrays are not same");
		}
		//copy array
		int arr1[]=Arrays.copyOf(arr, 2);
		System.out.println(Arrays.toString(arr1));
		
		int aar3[]=Arrays.copyOfRange(arr, 2, 4);
		System.out.println(Arrays.toString(aar3));
		
		//fill method
		Arrays.fill(aar3, 7);
		System.out.println(Arrays.toString(aar3));
		
		
	}

}

package com.DAY9.JaggedArray;


class JA{
	
	public static void printarray(int c[][]) {
		System.out.println("Array of elements are as follows:");
		for(int i=0;i<c.length;i++) {
			for (int j=0;j<c[i].length;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
public class Jaggedarrdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c[][]= {{10,20},{10,30,40},{1},{2,4,6,8}};
		JA.printarray(c);
	}

}

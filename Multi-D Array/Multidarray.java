package com.DAY9.Multidimentional;


class ML{
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
public class Multidarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c[][]= {{10,20},{20,14},{34,67}};
		ML.printarray(c);

	}

}

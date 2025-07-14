package com.DAY9.Exceptionhandling;

public class UncheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x[];
		try {
			x=new int[] {1,2,3,4,5};
			System.out.println(x[2]);
			System.out.println(x[9]);
			System.out.println(x[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Specified index not exist:"+e.getMessage());
		}
	}

}

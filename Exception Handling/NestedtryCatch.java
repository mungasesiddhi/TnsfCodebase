package com.DAY9.Exceptionhandling;

public class NestedtryCatch {
	
	public static void check() {
		String str="TNS";
		int slength=str.length();
		System.out.println("String Length:"+slength);
		
		String anotherstring=null;
		int y=6;
		try {
			//inner try catch
			try {
				System.out.println(str.charAt(y));
			}
			catch(Exception e) {
				System.err.println(e.getMessage());
			
			}
			
			System.out.println("String length:"+anotherstring.length());
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			
		}
		finally {
			System.out.println("finallyyy done!!");
		}
	}

}

package com.DAY14.JDBCCRUDOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
			
			//step 1:load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded Successfully");
			
			//step 2:create a connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tnsif", "root", "root");
			System.out.println("Connection created Succesfully");
			
			//step 3:create a statement(it is like a folder which holds requirements)
			Statement stmt=con.createStatement();
			System.out.println("Statement created successfully...");
			
			//step 4:write a query
			String q="insert into student_details values (101,'abc','English','10'),(102,'you','HTML','20')";
			
			boolean s=stmt.execute(q);
			System.out.println("Values inserted succesfully.....");
			
		}
		catch(Exception e) {
			System.err.println(e);
			
		}

	}

}

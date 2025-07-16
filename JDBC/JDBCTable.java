package com.DAY13.JDBC_operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class JDBCTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			//step 1:load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded Successfully");
			
			//step 2:create a connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tnsif", "root", "root");
			System.out.println("Connection created Succesfully");
			
			//step 3:create a statement
			Statement stmt=con.createStatement();
			System.out.println("Statement created successfully...");
			
			//step 4:write a query
			String q="create table student_details(stdid int,name varchar(20),subject varchar(20),duration varchar(20))";
			
			boolean s=stmt.execute(q);
			System.out.println("Table created succesfully....."+s);
			
		}
		catch(Exception e) {
			
		}

	}

}

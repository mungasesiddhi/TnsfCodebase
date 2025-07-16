package com.DAY14.JDBCCRUDOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ResultSet {

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
			
			//to get data from db 
			java.sql.ResultSet rs=stmt.executeQuery("select * from student_details");
			System.out.println("stdid\t name \t subject \t duration");
			
			//int s=stmt.executeUpdate(q);
			//execute is not here because it is already written in rs
			
			//this is for converting db(sql) datatypes to java datatypes to get data
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
			}
			
		}
		catch(Exception e) {
			System.err.println(e);
			
		}

	}

}

package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {
	
	//connection object is the bridge between java and database
	public static Connection createConnection() {
		
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/d2",
					"root",
					"root123");
			
			System.out.println("Database connected successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;	
	}
	
	//Prepared statement is pre-compiles sql statement used to execute parameterized
	//queries efficiently and securely
	
	//Result set is a table of data that holds the results
	//returned by a database after executing sql query
	public static void closeConnection(PreparedStatement pst,Connection con) {
		try {
			pst.close();
			con.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void closeConnection(ResultSet rs, PreparedStatement pst,Connection con) {
		
		try {
			rs.close();
			pst.close();
			con.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}

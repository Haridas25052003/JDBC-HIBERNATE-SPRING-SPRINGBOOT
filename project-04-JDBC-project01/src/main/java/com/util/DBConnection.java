package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {
	
	public static Connection createConnection() {
		
		Connection con=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/d3",
					"root"
					,"root123");
			
			System.out.println("Database connected successfully");
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		return con;
	}
	
	public static void closeConnection(PreparedStatement pst,Connection con) {
		
		try {
			pst.close();
			con.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void closeConnection(ResultSet rs,PreparedStatement pst,Connection con) {
		
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


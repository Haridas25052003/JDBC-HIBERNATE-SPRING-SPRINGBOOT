package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	public static Connection createConnection() {
		
		Connection con=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/d3",
					"root"
					,"root123");
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		
		return con;
	}

}

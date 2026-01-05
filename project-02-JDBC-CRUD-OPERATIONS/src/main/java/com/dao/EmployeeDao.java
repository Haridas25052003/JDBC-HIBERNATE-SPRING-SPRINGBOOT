package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Employee;

//EmployeeDao class is for performing CRUD opertaions

public class EmployeeDao {
	
//  <--  inserting the data  -->
	public int inertEmployee(Employee e) {
		int check=0;
		Connection con=DBConnection.createConnection();
		
		String sql="insert into employee (name,designation,company,salary) values(?,?,?,?)";
		
		PreparedStatement pst=null;
		
		try {
			pst=con.prepareStatement(sql);
			pst.setString(1, e.getName());
			pst.setString(2, e.getCompany());
			pst.setString(3, e.getDesignation());
			pst.setDouble(4, e.getSalary());
			
			check=pst.executeUpdate();
		}
		catch(SQLException e1) {
			e1.printStackTrace();
		}
		finally {
			DBConnection.closeConnection(pst,con);
		}
		
		return check;
	}

}

package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	

//   <--- delete employee from the database --->
	public int deleteEmployeeById(int id) {
		int check=0;
		
		Connection con=DBConnection.createConnection();
	    
		String sql="delete from employee where id=?";
		PreparedStatement pst=null;
		try {
			pst=con.prepareStatement(sql);
			pst.setInt(1, id);
			check=pst.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			DBConnection.closeConnection(pst,con);
		}
		
		return check;
	}
	
	
//   <--- fetching the employee --->
	public void fetchEmployee() {
		
		Connection con=DBConnection.createConnection();
		String sql="select * from employee";
		
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			pst=con.prepareStatement(sql);
			rs=pst.executeQuery();
			
			while(rs.next()) {
				System.out.println(
				rs.getInt("id")+" | "+
			    rs.getString("name")+" | "+
			    rs.getString("company")+" | "+
			    rs.getString("Designation")+" | "+
			    rs.getDouble("salary"));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
				DBConnection.closeConnection(rs, pst, con);
		}
		
	}

}
